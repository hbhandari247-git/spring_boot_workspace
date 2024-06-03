package net.javaguides.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import net.javaguides.spring.boot.service.impl.UserServiceImpl;

@SpringBootApplication
public class AspectSpringBootApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(AspectSpringBootApplication.class, args);

		// Get the UserService bean
		UserServiceImpl userServiceImpl = context.getBean(UserServiceImpl.class);

		// Call the createUser method
		userServiceImpl.createUser("john.doe");
	}
}
