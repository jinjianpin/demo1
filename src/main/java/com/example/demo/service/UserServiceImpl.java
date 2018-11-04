package com.example.demo.service;

import com.example.demo.bean.User;
import com.example.demo.bean.definition.UserService;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService{
	
@Override
public void printUser(User user)
{
	if(user ==null)
	{
		throw new RuntimeException("请检查用户参数是否为空");
	}
	System.out.println(user.getId().toString()+","+user.getName());
}
}
