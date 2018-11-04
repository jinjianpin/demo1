package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Profile;

import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.bean.DatabaseProperties;
import com.example.demo.bean.User;
import com.example.demo.bean.definition.UserService;

@Component
@ComponentScan("com.example.demo")
@Controller
//@Profile("dev1")
//@ActiveProfiles("dev1")
public class IndexController {
//	@Resource(name="config1")
	@Autowired
	private DatabaseProperties dp;
	private String url;
	@Autowired
	private User user;
	@Autowired
	private UserService userService;

	@RequestMapping("/index")
	public String index()
	{
		url=dp.getUrl();
		
	
		System.out.println("debug jjp 2"+url);
		userService.printUser(user);
		return "index";
	}
	
}
