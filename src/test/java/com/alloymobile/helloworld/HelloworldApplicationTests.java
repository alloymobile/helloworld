package com.alloymobile.helloworld;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.util.Assert;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class HelloworldApplicationTests {

    @Autowired
    HelloWorldService helloWorldService;

//    @Test
//    public void evenodd_even() {
//        String expected = "Even";
//        String actual = helloWorldService.evenOdd(6);
//        Assertions.assertEquals(expected,actual);
//    }
//
//    @Test
//    public void evenodd_odd() {
//        String expected = "Odd";
//        String actual = helloWorldService.evenOdd(11);
//        Assertions.assertEquals(expected,actual);
//    }
//
//    @Test
//    public void findMax_a() {
//        int expected = 40;
//        int actual = helloWorldService.findMax(40,20,10);
//        Assertions.assertEquals(expected,actual);
//    }
//
//    @Test
//    public void findMax_b() {
//        int expected = 20;
//        int actual = helloWorldService.findMax(10,20,5);
//        Assertions.assertEquals(expected,actual);
//    }
//
//    @Test
//    public void findMax_c() {
//        int expected = 60;
//        int actual = helloWorldService.findMax(40,20,60);
//        Assertions.assertEquals(expected,actual);
//    }
//
//    @Test
//    public void findMax_c2() {
//        int expected = 30;
//        int actual = helloWorldService.findMax(10,20,30);
//        Assertions.assertEquals(expected,actual);
//    }

    @Test
    public void grade_a() {
        String expected = "Grade A";
        String actual = helloWorldService.grade(95);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void grade_b() {
        String expected = "Grade B";
        String actual = helloWorldService.grade(85);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void grade_c() {
        String expected = "Grade C";
        String actual = helloWorldService.grade(75);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void grade_d() {
        String expected = "Grade D";
        String actual = helloWorldService.grade(65);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void grade_f() {
        String expected = "Grade F";
        String actual = helloWorldService.grade(50);
        Assertions.assertEquals(expected,actual);
    }
}
