package com.example.demo.config;

import org.springframework.context.annotation.Configuration;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSourceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@Configuration
@ComponentScan(basePackages= {"com.example.demo.bean"})
public class AppConfig {
	/*@Bean(name="user")
   public User initUser()
   {
	   User user=new User();
	   user.setId(1L);
	   user.setName("testUserName");
	   user.setAddress("address wenzhou");
	   user.setAge(22);
	   return user;
   }*/
	@Bean(name="dataSource")
	public DataSource getDataSource()
	{
		Properties props=new Properties();
		props.setProperty("driver", "com.mysql.jdbc.Driver");
		props.setProperty("url", "jdbc:mysql://localhost:3306/db1");
		props.setProperty("username", "root");
		props.setProperty("password", "Iamroot88");
		
		DataSource ds=null;
		try {
			ds=BasicDataSourceFactory.createDataSource(props);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return ds;
	}
	
}
