package com.sb.crud.service;

import org.springframework.stereotype.Component;

@Component
public class MyDependency {

    public String getDependency() {
        return "MyDependency";
    }

}
