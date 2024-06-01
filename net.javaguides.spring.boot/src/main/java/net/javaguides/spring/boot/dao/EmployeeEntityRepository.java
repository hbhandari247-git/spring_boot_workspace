package net.javaguides.spring.boot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.spring.boot.entity.EmployeeEntityNew;

public interface EmployeeEntityRepository extends JpaRepository<EmployeeEntityNew, Integer> {

}