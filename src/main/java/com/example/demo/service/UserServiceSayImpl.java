package com.example.demo.service;

import org.springframework.stereotype.Component;

import com.example.demo.bean.User;
import com.example.demo.bean.definition.UserServiceSay;

@Component
public class UserServiceSayImpl implements UserServiceSay {

	@Override
	public void sayUser(User user) {
		// TODO Auto-generated method stub
		System.out.println("Say:" + user.getName());
	}

}
