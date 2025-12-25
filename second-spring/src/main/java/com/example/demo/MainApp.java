package com.example.demo;

import com.example.loose.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
//        ApplicationContext context
//                = new AnnotationConfigApplicationContext(AppConfig.class);
        ApplicationContext context
                = new AnnotationConfigApplicationContext(AppConfig.class);
        GreetingService greetingService
                = (GreetingService) context.getBean("myBean");
        greetingService.sayHello();
//
//        UserService userService
//                = (UserService) context.getBean("UserServiceSMS");
//        userService.notifyUser("What`s up!");
//
//        UserService userServiceEmail
//                = (UserService) context.getBean("UserServiceEmail");
//        userService.notifyUser("What`s up!");
    }
}
