package com.spring.annotationTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Engine {
    private String nameEngine;

    @Autowired
    public Engine(@Value("${honda:some value}") String nameEngine) {       //как тернарный оператор. если в .properties
        //если нет такого ключа в пропертях, то передает по умолчанию
        this.nameEngine = nameEngine;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "nameEngine='" + nameEngine + '\'' +
                '}';
    }
}
