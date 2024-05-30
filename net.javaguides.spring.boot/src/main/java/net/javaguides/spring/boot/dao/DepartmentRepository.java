package net.javaguides.spring.boot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.spring.boot.entity.DepartmentEntity;

//Annotation
@Repository
public interface DepartmentRepository extends JpaRepository<DepartmentEntity, Long> {

}
