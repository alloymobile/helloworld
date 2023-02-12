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

    @GetMapping(value="/evenodd")
    public String evenOdd(@RequestParam(name="num")int num){
        return helloWorldService.evenOdd(num);
    }

//    @GetMapping(value="/findMax")
//    public int findMax(@RequestParam(name="a")int a,@RequestParam(name="b")int b,@RequestParam(name="c")int c){
//        return helloWorldService.findMax(a,b,c);
//    }
//    @GetMapping(value="/grade")
//    public String grade(@RequestParam(name="num")int num){
//        return helloWorldService.grade(num);
//    }
//
//    @GetMapping(value="/month")
//    public String grade(@RequestParam(name="num")int num){
//        return helloWorldService.month(num);
//    }

//    @GetMapping(value="/hello")
//    public String greet(@RequestParam(name="num")String name){
//        return helloWorldService.greet(name);
//    }
}
