package com.mercadolivre.integrationtest;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Primary;

@TestConfiguration
@Primary
public class WorldServiceImplStub implements WorldService {

    @Override
    public String getWorld(){
        return "Stub";
    }

}
