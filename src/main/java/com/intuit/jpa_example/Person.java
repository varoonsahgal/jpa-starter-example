package com.intuit.jpa_example;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

// this annotation tells JPA/Hibernate to create a table
// called Person and rows of that table will be individual
// objects of Person…Id is the primary key for the table
@Entity
public class Person {

    private String name;

    @Id
    @GeneratedValue
    private Long id;

    public Person(String name) {
        super();
        this.name = name;
    }

    public Person() {}

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

}
