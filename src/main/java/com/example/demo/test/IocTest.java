package com.example.demo.test;

import org.jboss.logging.Logger;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.AbstractApplicationContext;

import com.example.demo.bean.BusinessPerson;
import com.example.demo.bean.DatabaseProperties;
import com.example.demo.bean.User;
import com.example.demo.bean.definition.Person;
import com.example.demo.config.AppConfig;

//@ComponentScan(basePackages= "com.example.demo.bean")
//@EnableConfigurationProperties({DatabaseProperties.class})
@SpringBootApplication
public class IocTest {
private static Logger log=Logger.getLogger(IocTest.class);
public static void main(String[] args)
{
ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
User user=ctx.getBean(User.class);
log.info(user.getAddress());
log.info(user.getAge());

Person businessPerson=ctx.getBean(BusinessPerson.class);
businessPerson.service();

//DatabaseProperty dp=ctx.getBean(DatabaseProperty.class);
//log.info(dp.getUsername());

((AbstractApplicationContext) ctx).close();

}
}
