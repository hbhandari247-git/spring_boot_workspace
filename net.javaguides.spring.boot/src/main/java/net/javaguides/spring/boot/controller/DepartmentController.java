package net.javaguides.spring.boot.controller;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import net.javaguides.spring.boot.entity.DepartmentEntity;
import net.javaguides.spring.boot.service.DepartmentService;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

	// Annotation
	@Autowired
	private DepartmentService departmentService;

	// Save operation
	@PostMapping("/create")
	public DepartmentEntity saveDepartment(@Valid @RequestBody DepartmentEntity department) {
		return departmentService.saveDepartment(department);
	}

	// Read operation
	@GetMapping("/getAllDepartments")
	public List<DepartmentEntity> fetchDepartmentList() {
		return departmentService.fetchDepartmentList();
	}

	// Update operation
	@PutMapping("/departments/{id}")
	public DepartmentEntity updateDepartment(@RequestBody DepartmentEntity department,
			@PathVariable("id") Long departmentId) {
		return departmentService.updateDepartment(department, departmentId);
	}

	// Delete operation
	@DeleteMapping("/departments/{id}")
	public String deleteDepartmentById(@PathVariable("id") Long departmentId) {
		departmentService.deleteDepartmentById(departmentId);
		return "Deleted Successfully";
	}
}
