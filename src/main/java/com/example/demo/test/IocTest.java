package com.example.demo.test;

import org.jboss.logging.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.demo.bean.User;
import com.example.demo.config.AppConfig;

public class IocTest {
private static Logger log=Logger.getLogger(IocTest.class);
public static void main(String[] args)
{
ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
User user=ctx.getBean(User.class);
log.info(user.getAddress());
log.info(user.getAge());

}
}
