package com.sb.crud.service;


import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.sb.crud.model.Person;
import com.sb.crud.repository.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PersonService {

    @Autowired
    private PersonRepo personRepo;


    public Iterable<Person> saveAllPersons(Iterable<Person> personsList) {
        return personRepo.saveAll(personsList);
    }


    public Iterable<Person> getMultiplePersons(Iterable<Integer> personIds) {
        return personRepo.findAllById(personIds);
    }

    //Implementation of Derived Queries


    public Iterable<Person> findByLastNameOrFirstName(String lastName, String firstName) {
        return personRepo.findByLastNameOrFirstName(lastName, firstName);
    }


    public Person findByLastNameAndFirstName(String lastName, String firstName) {
        return personRepo.findByLastNameAndFirstName(lastName, firstName);
    }


    public List<Person> findByLastNameOrderByCreatedDateDesc(String lastName) {
        return personRepo.findByLastNameOrderByCreatedDateDesc(lastName);
    }


    public List<Person> findByAgeLessThanEqual(Integer age) {
        return personRepo.readByAgeLessThanEqual(age);
    }

    public List<Person> findByFirstNameLike(String firstName) {
        return personRepo.findByFirstNameLike(firstName);
    }

    public List<Person> findByLastNameAndAgeLessThanEqual(String lastName, int age) {
        return personRepo.findByLastNameAndAgeLessThanEqual(lastName, age);
    }

    public List<Person> findByCreatedDateBetween(Date startdate, Date endDate) {
        return personRepo.findByCreatedDateBetween(startdate, endDate);
    }

    public List<Person> findByFirstNameAndAge(String firstName, Integer age) {
        return personRepo.findByFirstNameAndAge(firstName, age);
    }

    public List<Person> findAllPersons() {
        return personRepo.findAll();
    }

    public Optional<Person> getPersonById(Integer id) {
        return personRepo.findById(id);
    }


}
