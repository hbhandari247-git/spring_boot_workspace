package net.javaguides.spring.boot.spring.mvc.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.spring.boot.spring.mvc.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

}
