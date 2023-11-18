package com.sb.crud.controller;


import com.sb.crud.model.Person;
import com.sb.crud.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/product")
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping("/getPersonByIds")
    public Iterable<Person> personList(@RequestParam("intValues") String[] intValues) {


        Function<String,Integer> function= new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s);
            }
        };

        List<Integer> intList = Arrays.stream(intValues).map(function).collect(Collectors.toList());
        return personService.getMultiplePersons(intList);

    }


    /*
     @GetMapping("/getPersonByIds")
    public Iterable<Person> personList(@RequestParam("intValues") String[] intValues) {
        List<Integer> intList = Arrays.stream(intValues)
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        return personService.getMultiplePersons(intList);
    }
     */

}

