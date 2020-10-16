package com.anthony.hello;

import com.anthony.hello.controller.HelloController;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class HelloApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void testSayHello() {
        assertEquals("Hello,World!!!",new HelloController().hello());
    }
}
