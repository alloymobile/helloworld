package com.alloymobile.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
public class HelloWorld {

    @Autowired
    HelloWorldService helloWorldService;
    @GetMapping(value="/greetme")
    public String greetMe(@RequestParam(name="name", required = false)String name){
        return helloWorldService.greetMe(name);
    }

    @GetMapping(value="/evenodd")
    public String evenOdd(@RequestParam(name="num")int num){
        return helloWorldService.evenOdd(num);
    }

    @GetMapping(value="/grade")
    public String grade(@RequestParam(name="num")int num){
        return helloWorldService.grade(num);
    }
}
