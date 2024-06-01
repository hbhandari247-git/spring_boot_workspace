package net.javaguides.spring.boot;

import net.javaguides.spring.boot.dao.AddressDAO;
import net.javaguides.spring.boot.dao.EmployeeDAO;
import net.javaguides.spring.boot.entity.AddressEntity;
import net.javaguides.spring.boot.entity.EmployeeEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MappingProjectApplication implements CommandLineRunner {

	@Autowired
	AddressDAO addessRepo;
	@Autowired
	EmployeeDAO empRepo;

	public static void main(String[] args) {
		SpringApplication.run(MappingProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		AddressEntity addr = new AddressEntity(1, "Bangloor");
		addessRepo.save(addr);

		EmployeeEntity emp1 = new EmployeeEntity(1, "Alpha", addr);
		EmployeeEntity emp2 = new EmployeeEntity(2, "Beeta", addr);

		empRepo.save(emp1);
		empRepo.save(emp2);
	}
}
