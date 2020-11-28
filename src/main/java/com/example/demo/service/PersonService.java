package com.example.demo.service;

import com.example.demo.dao.Dao;
import com.example.demo.model.Person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    public final Dao personDao;

    @Autowired
    public PersonService(@Qualifier("PersonDao") Dao personDao){
        this.personDao = personDao;
    }

    public int insertPerson(Person person){
        return personDao.save(person);
    }
    
}