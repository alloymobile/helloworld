package com.alloymobile.helloworld;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Objects;

@Service
public class HelloWorldService {

    public String greetMe(String name){
        if(Objects.nonNull(name)){
            return "Hello "+name;
        }else{
            return "Hello World";
        }
    }
}
