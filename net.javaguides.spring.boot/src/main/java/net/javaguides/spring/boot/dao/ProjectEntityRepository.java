package net.javaguides.spring.boot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.spring.boot.entity.ProjectEntity;

public interface ProjectEntityRepository extends JpaRepository<ProjectEntity, Integer> {

}