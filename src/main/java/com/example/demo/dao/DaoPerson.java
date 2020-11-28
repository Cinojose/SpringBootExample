package com.example.demo.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.example.demo.model.Person;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository("PersonDao")
public class DaoPerson implements Dao<Person> {

    
    private static List<Person> DB = new ArrayList<>();
    
    public Logger logger = LoggerFactory.getLogger(DaoPerson.class);

    @Override
    public int save(Person t) {
        // TODO Auto-generated method stub
        logger.info("Saving a person "+ t.toString());
        DB.add(t);
        return 0;
    }

    @Override
    public void update(Person t) {
        // TODO Auto-generated method stub
        logger.info("Updating a person : "+ t.toString());
        

    }

    @Override
    public void delete(Person t) {
        // TODO Auto-generated method stub
        logger.info("Deleting a person "+ t.toString());

    }

    @Override
    public Collection getAll() {
        // TODO Auto-generated method stub
        logger.info("Retrieving all person");
        return null;
    }

    @Override
    public Optional getOne(UUID id) {
        // TODO Auto-generated method stub
        logger.info("Retrieving a single person "+ id);
        return null;
    }
    
}