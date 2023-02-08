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

    @Test
    public void evenodd_even() {
        String expected = "Even";
        String actual = helloWorldService.evenOdd(6);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void evenodd_odd() {
        String expected = "Odd";
        String actual = helloWorldService.evenOdd(11);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void findMax_a() {
        int expected = 45;
        int actual = helloWorldService.findMax(45,23,7);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void findMax_b() {
        int expected = 72;
        int actual = helloWorldService.findMax(45,72,7);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void findMax_c() {
        int expected = 34;
        int actual = helloWorldService.findMax(45,23,34);
        Assertions.assertEquals(expected,actual);
    }

}
