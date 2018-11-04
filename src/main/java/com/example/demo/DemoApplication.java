package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import com.example.demo.aspect.MyAspect;
//@ComponentScan(basePackages= {"com.example.demo.bean"})
//@SpringBootApplication(scanBasePackages= {"com.example.demo.aspect","com.example.demo.bean","com.example.demo.service","com.example.demo.controller"})
@SpringBootApplication  //(scanBasePackages= {"com.example.demo.controller"})
public class DemoApplication {

	/*@Bean(name="myAspect")
	public MyAspect getMyAspect()
	{
		return new MyAspect();
	}*/
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
