package net.javaguides.spring.boot.spring.mvc.service;

import org.springframework.transaction.annotation.Transactional;

import java.util.Calendar;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;

import net.javaguides.spring.boot.spring.mvc.dao.UserRepository;
import net.javaguides.spring.boot.spring.mvc.entity.UserEntity;
import net.javaguides.spring.boot.spring.mvc.exception.UserNotFoundException;
import net.javaguides.spring.boot.spring.mvc.model.User;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	@Transactional(propagation = Propagation.REQUIRED)
	public User findById(Long id) {
		UserEntity userEntity = userRepository.findById(id).orElseThrow(() -> new UserNotFoundException(id));
		User user = new User();
		user.setCreateDate(userEntity.getCreateDate());
		user.setFirstName(userEntity.getFirstName());
		user.setLastName(userEntity.getLastName());
		user.setLocation(userEntity.getLocation());
		user.setUserId(userEntity.getUserId());
		user.setUserName(userEntity.getUserName());
		return user;
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public User addUser(User user) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		Date currentDate = calendar.getTime();
		UserEntity userEntity = new UserEntity();
		userEntity.setCreateDate(currentDate);
		userEntity.setFirstName(user.getFirstName());
		userEntity.setLastName(user.getLastName());
		userEntity.setLocation(user.getLocation());
		userEntity.setUserName(user.getUserName());
		userEntity = userRepository.save(userEntity);
		user.setUserId(userEntity.getUserId());
		user.setCreateDate(userEntity.getCreateDate());
		return user;
	}
}
