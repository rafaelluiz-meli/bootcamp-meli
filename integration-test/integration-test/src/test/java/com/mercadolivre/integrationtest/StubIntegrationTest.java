package com.mercadolivre.integrationtest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = {WorldServiceImplStub.class})
public class StubIntegrationTest {

    @Autowired
    private HelloService helloService;

    @Test
    public void otherTest(){
        String result = helloService.getHelloWorld();
        Assertions.assertTrue(result.equals("Hello Stub"));
    }
}
