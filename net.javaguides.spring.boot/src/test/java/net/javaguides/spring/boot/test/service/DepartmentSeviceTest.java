package net.javaguides.spring.boot.test.service;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import net.javaguides.spring.boot.dao.DepartmentRepository;
import net.javaguides.spring.boot.entity.DepartmentEntity;
import net.javaguides.spring.boot.service.DepartmentService;

@SpringBootTest
public class DepartmentSeviceTest {

	@Autowired
	private DepartmentService departmentService;

	@MockBean
	private DepartmentRepository departmentRepository;

	@Test
	public void fetchDepartmentList() {
		DepartmentEntity departmentEntity = new DepartmentEntity();
		departmentEntity.setDepartmentId(1L);
		departmentEntity.setDepartmentCode("BI-01");
		departmentEntity.setDepartmentName("BIO");
		departmentEntity.setDepartmentAddress("A-Block");

		when(departmentRepository.findById(1L)).thenReturn(Optional.of(departmentEntity));

		Optional<DepartmentEntity> departmentEntity2 = departmentService.fetchDepartmentById(1L);
		assertEquals(1L, departmentEntity2.get().getDepartmentId());
		assertEquals("BIO", departmentEntity2.get().getDepartmentName());
	}
}
