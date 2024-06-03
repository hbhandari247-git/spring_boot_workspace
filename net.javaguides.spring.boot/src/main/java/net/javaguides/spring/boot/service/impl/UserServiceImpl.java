package net.javaguides.spring.boot.service.impl;

import org.springframework.stereotype.Service;

import net.javaguides.spring.boot.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Override
	public void createUser(String username) {
		// Simulating some processing time
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("User created: " + username);
	}
}
