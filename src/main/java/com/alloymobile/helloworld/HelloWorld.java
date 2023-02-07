package com.alloymobile.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
public class HelloWorld {
    @GetMapping(value="/greetme")
    public String greetMe(@RequestParam(name="name", required = false)String name){
        if(Objects.nonNull(name)){
            return "Hello "+name;
        }else{
            return "Hello World";
        }
    }

    @GetMapping(value="/hello")
    public String hello(@RequestParam(name="name", required = false)String name){
        if(Objects.nonNull(name)){
            return "Hello "+name;
        }else{
            return "Hello World";
        }
    }
}
