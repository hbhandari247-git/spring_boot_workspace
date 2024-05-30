package net.javaguides.spring.boot.service.impl;

//Importing required classes
import java.util.List;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.javaguides.spring.boot.dao.DepartmentRepository;
import net.javaguides.spring.boot.entity.DepartmentEntity;
import net.javaguides.spring.boot.service.DepartmentService;

//Annotation
@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;

	// Save operation
	@Override
	public DepartmentEntity saveDepartment(DepartmentEntity department) {
		return departmentRepository.save(department);
	}

	// Read operation
	@Override
	public List<DepartmentEntity> fetchDepartmentList() {
		return (List<DepartmentEntity>) departmentRepository.findAll();
	}

	// Update operation
	@Override
	public DepartmentEntity updateDepartment(DepartmentEntity department, Long departmentId) {
		DepartmentEntity depDB = departmentRepository.findById(departmentId).get();

		if (Objects.nonNull(department.getDepartmentName()) && !"".equalsIgnoreCase(department.getDepartmentName())) {
			depDB.setDepartmentName(department.getDepartmentName());
		}

		if (Objects.nonNull(department.getDepartmentAddress())
				&& !"".equalsIgnoreCase(department.getDepartmentAddress())) {
			depDB.setDepartmentAddress(department.getDepartmentAddress());
		}

		if (Objects.nonNull(department.getDepartmentCode()) && !"".equalsIgnoreCase(department.getDepartmentCode())) {
			depDB.setDepartmentCode(department.getDepartmentCode());
		}

		return departmentRepository.save(depDB);
	}

	// Delete operation
	@Override
	public void deleteDepartmentById(Long departmentId) {
		departmentRepository.deleteById(departmentId);
	}
}
