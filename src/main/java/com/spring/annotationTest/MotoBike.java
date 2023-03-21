package com.spring.annotationTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("bike")
@PropertySource("classpath:testAnnotation.properties")
public class MotoBike {
    private Engine engine;

    @Autowired
    //тут мы обязываем джаву к автозаполнению - поэтому само найдет и подставит
    public MotoBike(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "MotoBike{" +
                "engine=" + engine +
//                ", transmission=" + transmission +
//                ", name='" + name + '\'' +
                '}';
    }
}
