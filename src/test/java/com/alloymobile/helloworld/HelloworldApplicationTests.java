package com.alloymobile.helloworld;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class HelloworldApplicationTests {

    @Test
    public void testName(){
        Assert.isTrue(true,"True");
    }
}
