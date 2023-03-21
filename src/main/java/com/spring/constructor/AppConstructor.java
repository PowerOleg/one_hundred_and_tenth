package com.spring.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppConstructor {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/constructor.xml");
        MotoBike motoBike = context.getBean("bike", MotoBike.class);   //можно так, а можно и без указания bean id
        System.out.println(motoBike.toString());

    }
}
