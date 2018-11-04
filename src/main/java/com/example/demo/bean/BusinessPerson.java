package com.example.demo.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.example.demo.bean.definition.Animal;
import com.example.demo.bean.definition.Person;

@Component
public class BusinessPerson implements Person {

	@Autowired
	private DatabaseProperties dcp;
	private Animal animal=null;
	public BusinessPerson(@Autowired @Qualifier("cat") Animal animal)
	{
		this.animal=animal;
		
	}
	
	@Override
	public void service()
	{
		this.animal.use();
		 System.out.println(this.dcp.getUrl());
		 System.out.println(this.dcp.getUsername());
		 System.out.println(this.dcp.getPassword());
	}
	@Override
	//@Autowired
	//@Qualifier("cat")
	public void setAnimal(Animal cat2)
	{
		this.animal=cat2;
	}
	
}
