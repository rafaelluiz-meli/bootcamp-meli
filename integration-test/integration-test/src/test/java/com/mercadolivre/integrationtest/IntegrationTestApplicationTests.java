package com.mercadolivre.integrationtest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.fail;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {TextService.class})
class IntegrationTestApplicationTests {

    @Autowired
    private TextService textService;

    @Test
    void contextLoads() {
        textService.someMethod();
    }

}
