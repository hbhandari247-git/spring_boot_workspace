package net.javaguides.spring.boot.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Project")
public class ProjectEntity {

    @ManyToMany(mappedBy = "projects")
    private Set<EmployeeEntity> employees = new HashSet<>();

}
