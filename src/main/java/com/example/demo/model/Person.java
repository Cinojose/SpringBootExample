package com.example.demo.model;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Person {

    private String name;
    private int age;
    private UUID uuid;
    private double height;
    private double weight;

    public Person(@JsonProperty("name")String name, 
            @JsonProperty("age")int age){
        this.name = name;
        this.age = age;
    }


    public int getAge(){
        return this.age;
    }

    public String getName(){
        return this.name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

}