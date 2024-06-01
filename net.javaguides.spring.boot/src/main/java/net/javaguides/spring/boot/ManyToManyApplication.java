package net.javaguides.spring.boot;

import java.util.HashSet;
import java.util.Set;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javaguides.spring.boot.dao.EmployeeEntityRepository;
import net.javaguides.spring.boot.entity.EmployeeEntityNew;
import net.javaguides.spring.boot.entity.ProjectEntity;

@SpringBootApplication
public class ManyToManyApplication implements CommandLineRunner {

	@Autowired
	private EmployeeEntityRepository employeeEntityRepository;


	public static void main(String[] args) {
		SpringApplication.run(ManyToManyApplication.class, args);
	}

	@Override
	@Transactional
	public void run(String... args) throws Exception {
		String[] employeeData = { "Peter Oven", "Allan Norman" };
	    String[] projectData = { "IT Project", "Networking Project" };
	    Set<ProjectEntity> projects = new HashSet<ProjectEntity>();

	    for (String proj : projectData) {
	    	ProjectEntity projectEntity = new ProjectEntity();
	    	projectEntity.setTitle(proj);
	    	projects.add(projectEntity);
	    }

	    for (String emp : employeeData) {
	    	EmployeeEntityNew employeeEntityNew = new EmployeeEntityNew();
	    	employeeEntityNew.setFirst_name(emp.split(" ")[0]);
	    	employeeEntityNew.setLast_name(emp.split(" ")[1]);
	    	employeeEntityNew.setProjects(projects);
	    	for (ProjectEntity projectEntity : projects) {
	    		projectEntity.getEmployees().add(employeeEntityNew);
	    	}
	    	employeeEntityRepository.save(employeeEntityNew);
	    }

	}
}
