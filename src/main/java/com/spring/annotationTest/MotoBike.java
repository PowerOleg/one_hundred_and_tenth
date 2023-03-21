package com.spring.annotationTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

//@Component("bike")
//@Component
//@PropertySource("classpath:testAnnotation.properties")
public class MotoBike {
//    @Autowired                                    //называется автозаполнение - обязывает найти и чем-нибудь заполнить
    private Engine engine;
//@Autowired                                   //тут прогу мы обязываем к автозаполнению - поэтому само найдет и подставит
    public MotoBike(Engine engine) {
        this.engine = engine;
    }


//    private Transmission transmission;
//    private String name;

//    public MotoBike(Engine engine, Transmission transmission, String name) {
//        this.engine = engine;
//        this.transmission = transmission;
//        this.name = name;
//    }

    @Override
    public String toString() {
        return "MotoBike{" +
                "engine=" + engine +
//                ", transmission=" + transmission +
//                ", name='" + name + '\'' +
                '}';
    }
}
