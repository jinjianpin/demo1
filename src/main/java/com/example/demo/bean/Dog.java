package com.example.demo.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.example.demo.bean.definition.Animal;

@Component
@Primary
public class Dog implements Animal {

	@Override
	public void use()
	{
		System.out.println("狗【"+Dog.class.getSimpleName()+"】是看门用的");
	}
}
