package com.mercadolivre.integrationtest;

import com.mercadolivre.integrationtest.config.EnvironmentConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test1")
public class ProfileIntegrationTest {

    @Autowired
    private EnvironmentConfig environmentConfig;

    @Test
    void test(){
        environmentConfig.someMethod();
    }
}
