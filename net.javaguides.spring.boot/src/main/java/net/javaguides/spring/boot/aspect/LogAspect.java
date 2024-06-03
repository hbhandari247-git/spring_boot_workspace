package net.javaguides.spring.boot.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {

	@Pointcut("execution(* net.javaguides.spring.boot.service.impl.UserServiceImpl.createUser(..))")
	public void createUserPointcut() {
	}

	@Before("createUserPointcut()")
	public void beforeCreateUser(JoinPoint joinPoint) {
		System.out.println("Before creating user...");
	}

	@After("createUserPointcut()")
	public void afterCreateUser(JoinPoint joinPoint) {
		System.out.println("After creating user...");
	}

}
