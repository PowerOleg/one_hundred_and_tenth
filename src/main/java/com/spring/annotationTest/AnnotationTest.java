package com.spring.annotationTest;

import com.spring.annotationTest.Engine;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/constructorAnnotationTest.xml");
        MotoBike motoBike = context.getBean(MotoBike.class);
//        Engine engine = (Engine) context.getBean("engine");// с маленькой буквы!
        System.out.println(motoBike.toString());


    }


}
