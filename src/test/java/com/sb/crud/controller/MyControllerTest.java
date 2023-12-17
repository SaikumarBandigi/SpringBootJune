package com.sb.crud.controller;

import com.sb.crud.service.MyService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MyControllerTest {

    private MyService myService;

    @Autowired
    public void setMyService(@Qualifier("PrimaryService") MyService myService) {
        this.myService = myService;
    }

    @Test
    void setMyService() {
    }

    @Test
    void getSetterInjection() {
        String msg = myService.getMessage();
        Assertions.assertThat(msg).isEqualTo("primary service...");
    }
}