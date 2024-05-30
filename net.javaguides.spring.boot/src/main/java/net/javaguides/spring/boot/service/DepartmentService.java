package net.javaguides.spring.boot.service;

//Importing required classes
import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;

import net.javaguides.spring.boot.entity.DepartmentEntity;

//Interface
public interface DepartmentService {

	// Save operation
	DepartmentEntity saveDepartment(DepartmentEntity department);

	// Read operation
	List<DepartmentEntity> fetchDepartmentList();

	// Update operation
	DepartmentEntity updateDepartment(DepartmentEntity department, Long departmentId);

	// Delete operation
	void deleteDepartmentById(Long departmentId);

	Optional<DepartmentEntity> fetchDepartmentById(Long departmentId);
}
