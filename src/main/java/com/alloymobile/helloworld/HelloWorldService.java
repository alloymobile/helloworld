package com.alloymobile.helloworld;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Objects;

@Service
public class HelloWorldService {


//    public String evenOdd(int num){
//        if(num % 2 == 0){
//            return "Even";
//        }else{
//            return "Odd";
//        }
//    }

//    public int findMax(int a, int b,int c){
//        if(a > b){
//            if(a > c){
//                return a;
//            }else{
//                return c;
//            }
//        }else{
//            if(b > c){
//                return b;
//            }else{
//                return c;
//            }
//        }
//    }
//
//    public String grade(int num){
//        if(num >= 90 && num <= 100){
//            return "Grade A";
//        }else if(num >= 80 && num < 90){
//            return "Grade B";
//        }else if(num >= 70 && num < 80){
//            return "Grade C";
//        }else if(num >= 55 && num < 70){
//            return "Grade D";
//        }else if(num >= 0 && num < 55){
//            return "Grade F";
//        }else{
//            return "Invalid Marks";
//        }
//    }

//        public String month(int num){
//        switch (num){
//            case 1:
//                return "January";
//            case 2:
//                return "February";
//            default:
//                return "Hello";
//        }
//    }

    public String greet(String name){
        String user = "";
        for(int i=0;i<3;i++){
            user = user +name+" ";
        }
        return user;
    }
}
