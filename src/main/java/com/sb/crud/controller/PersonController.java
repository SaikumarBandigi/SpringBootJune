package com.sb.crud.controller;


import com.sb.crud.model.Person;
import com.sb.crud.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Function;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/person")
public class PersonController {

    @Autowired
    private PersonService personService;


    @GetMapping("/getPersonById/{id}")
    public Person getPersonById(@PathVariable Integer id) {
        return personService.getPersonById(id).orElse(null);
    }


    @GetMapping("/getAllPersons")
    public List<Person> getPersonList() {
        return personService.findAllPersons();
    }


//    @GetMapping("/getPersonByIds")
//    public Iterable<Person> personList(@RequestParam("intValues") String[] intValues) {
//
//
//        Function<String, Integer> function = new Function<String, Integer>() {
//            @Override
//            public Integer apply(String s) {
//                return Integer.parseInt(s);
//            }
//        };
//
//        List<Integer> intList = Arrays.stream(intValues).map(function).collect(Collectors.toList());
//        return personService.getMultiplePersons(intList);
//
//    }
//
//
//
//    @GetMapping("/getPersonsByAgeLessThanEqual/{age}")
//    public List<Person> findByAgeLessThanEqual(@PathVariable Integer age) {
//        return personService.findByAgeLessThanEqual(age);
//    }
//
    @GetMapping("/getPersonsByFirstNameAndAge/{firstName}/{age}")
    public List<Person> findByFirstNameAndAge(@PathVariable String firstName,@PathVariable Integer age) {
        return personService.findByFirstNameAndAge(firstName, age);
    }

}

