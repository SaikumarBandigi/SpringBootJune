package com.sb.crud.controller;

import com.sb.crud.service.MyDependency;
import com.sb.crud.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/di")
public class MyController {

    // normal

//    @Autowired
//    @Qualifier(value = "PrimaryService")
//    private MyService myService;
//
//    @GetMapping("/myService")
//    public String string() {
//        return myService.getMessage();
//    }

    ////////////////////////////////

    // setter injection

//    private MyService myService;
//
//    @Autowired
//    public void setMyService(@Qualifier("PrimaryService") MyService myService) {
//        this.myService = myService;
//    }
//
//    @GetMapping("/setterInjection")
//    public String string() {
//        return myService.getMessage();
//    }

    //////////////////////////////

    // method injection

//    @GetMapping("/methodInjection")
//    public String getString(MyDependency myDependency) {
//        return myDependency.getDependency();
//    }

    ////////////////////////////////////


    // constructor injection

//    private final MyDependency myDependency;
//
//    public MyController(MyDependency myDependency) {
//        this.myDependency = myDependency;
//    }
//
//    @GetMapping("/constructorInjection")
//    public String getString() {
//        return myDependency.getDependency();
//    }
//
    ///////////////////////////////


    private MyService myService;

    @Autowired
    public void setMyService(@Qualifier("PrimaryService") MyService myService) {
        this.myService = myService;
    }

    @GetMapping("/setterInjection")
    public String getSetterInjection() {
        return myService.getMessage();
    }





}
