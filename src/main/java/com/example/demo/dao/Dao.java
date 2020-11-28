package com.example.demo.dao;

import java.util.Collection;
import java.util.Optional;
import java.util.UUID;

public interface Dao<T> {
    int save(T t); // Save a new entry
    void update(T t); // Update a new entry
    void delete(T t); // Delete a new entry
    Collection getAll(); // Retrieve all the entries
    Optional getOne(UUID id); // Retrive a single entry
}
