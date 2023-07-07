package com.sb.cricketapplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
public class CricketController {

    @Autowired
    private CricketService service;

    @GetMapping(value = "/getCricketer/{cid}")
    public Cricketer get(@PathVariable Integer cid)
    {
        return service.get(cid);
    }


    @ExceptionHandler
    public ResponseEntity<ErrorObject> g(CricketerNotFoundException ex)
    {
        ErrorObject errorObject= new ErrorObject(HttpStatus.NOT_FOUND.value(),ex.getMessage(), LocalDate.now());
        return new ResponseEntity<>(errorObject,HttpStatus.NOT_FOUND);
    }

}