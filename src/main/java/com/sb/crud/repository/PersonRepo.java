package com.sb.crud.repository;


import java.util.Date;
import java.util.List;

import com.sb.crud.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonRepo extends JpaRepository<Person, Integer> {

    /*
     *
     * We are going to write abstract methods in this layer and implementation to be given by framework
     */


    public Iterable<Person> findByLastNameOrFirstName(String lastName,String firstName);

    //select * from tbl_person where last_name=lastName or first_name=firstName

    public Person findByLastNameAndFirstName(String lastName,String firstName);

    //select * from tbl_person where last_name=lastName and  first_name=firstName


    public List<Person> findByLastNameOrderByCreatedDateDesc(String lastName);

    //select * from tbl_person where last_name=lastName order by created_date desc


    public List<Person> readByAgeLessThanEqual(Integer age);

    //select * from tbl_person where age<=age;


    public List<Person> findByFirstNameLike(String firstName);

    //select * from tbl_person where first_name like '%firstName%'

    public List<Person> findByLastNameAndAgeLessThanEqual(String lastName,int age);

    //select * from tbl_person where last_name=lastName and age<=age


    public List<Person> findByCreatedDateBetween(Date startdate,Date endDate);

    //select * from tbl_person where created_date>=startdate and created_date<=endDate


    List<Person> findByFirstNameAndAge(String firstName, Integer age);
}
