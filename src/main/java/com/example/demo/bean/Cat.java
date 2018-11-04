package com.example.demo.bean;

import org.springframework.stereotype.Component;

import com.example.demo.bean.definition.Animal;

@Component
public class Cat implements Animal {
	@Override
	public void use() {
		System.out.println("猫【" + this.getClass().getSimpleName() + "】是用来抓老鼠的");
	}
}
