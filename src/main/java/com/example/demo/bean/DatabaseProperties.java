package com.example.demo.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@EnableConfigurationProperties(DataBaseProperty.class)
@Component
//@PropertySource(value= {"classpath:application.properties"})
//@PropertySource("application.properties")
//@PropertySource("database.properties")
//@ConfigurationProperties("database")
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
@Service("config1")
//@Profile("test1")
public class DatabaseProperties {
 private String driverName;
 
 @Value("${database.url}")
 private String url;
 private String username;
 private String password;
public String getDriverName() {
	return driverName;
}
public void setDriverName(String driverName) {
	this.driverName = driverName;
}
public String getUrl() {
	return url;
}
public void setUrl(String url) {
	this.url = url;
	System.out.println(url);

}
public String getUsername() {
	return username;
}
@Value("${database.username}")
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
 
}
