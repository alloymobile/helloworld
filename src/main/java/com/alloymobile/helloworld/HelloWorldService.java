package com.alloymobile.helloworld;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Objects;

@Service
public class HelloWorldService {


    public String evenOdd(int num){
        if(num % 2 == 0){
            return "Even";
        }else{
            return "Odd";
        }
    }

    public String grade(int num){
        if(num >= 90){
            return "Grade A";
        }else if(num >= 80){
            return "Grade B";
        }else if(num >= 70){
            return "Grade C";
        }else if(num >= 55){
            return "Grade D";
        }else{
            return "Grade F";
        }
    }
}
