package net.javaguides.spring.boot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.spring.boot.entity.EmployeeEntity;

public interface EmployeeDAO extends JpaRepository<EmployeeEntity, Integer> {

}