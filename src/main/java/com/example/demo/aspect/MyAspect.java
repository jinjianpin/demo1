package com.example.demo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.DeclareParents;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import com.example.demo.bean.User;
import com.example.demo.bean.definition.UserServiceSay;
import com.example.demo.service.UserServiceSayImpl;

@Aspect
@Component
@ComponentScan(basePackages = "com.example.demo")
public class MyAspect {
	@DeclareParents(value = "com.example.demo.service.UserServiceImpl", defaultImpl = com.example.demo.service.UserServiceSayImpl.class)
	public UserServiceSay userServiceSay;

	@Pointcut("execution(* com.example.demo.service.UserServiceImpl.printUser(..))")
	public void pointCut() {

	}

	@Before("pointCut() && args(user)")
	public void before(JoinPoint jp,User user) {
		System.out.println(user.getName());
		System.out.println("Before ...");

	}

	@After("pointCut()")
	public void after() {
		System.out.println("After ...");
	}

	@AfterReturning("pointCut()")
	public void afterReturning() {
		System.out.println("AfterReturning");
	}

	@AfterThrowing("pointCut()")
	public void afterThrowing() {
		System.out.println("AfterThorwing");

	}

	@Around("pointCut()")
	public void around(ProceedingJoinPoint jp) throws Throwable {
		System.out.println("Before around ...");
		jp.proceed();
		System.out.println("After around ...");

	}

}
