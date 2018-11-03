package com.example.demo.bean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("user")
public class User {
	@Value("2")
	private Long id;
	
	@Value("testName2")
	private String name;
	
	@Value("wenzhou addr2")
	private String address;
	
	@Value("25")
	private int age;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

}
