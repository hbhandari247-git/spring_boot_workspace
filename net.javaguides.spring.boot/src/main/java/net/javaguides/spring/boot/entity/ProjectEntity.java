package net.javaguides.spring.boot.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Project")
public class ProjectEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int project_id;
	private String title;

	@ManyToMany(mappedBy = "projects")
	private Set<EmployeeEntityNew> employees = new HashSet<>();

	public int getProject_id() {
		return project_id;
	}

	public void setProject_id(int project_id) {
		this.project_id = project_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Set<EmployeeEntityNew> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<EmployeeEntityNew> employees) {
		this.employees = employees;
	}

}
