package com.intuit.jpa_example;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    private PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        super();
        this.personRepository = personRepository;
    }

    public Person findPersonById(long id) {
        //thing to remember: WE NEVER created a implementation of PErsonRepository ourselves!!

        Optional<Person> p = personRepository.findById(id);
        if(p.isPresent()) {
            return p.get();
        } else {
            return null;
        }
    }


    public Person savePerson(Person p) {
        return personRepository.save(p);

      //  h2databasesave(p); // if this method changes you'll be in trouble
    }

    // other CRUD methods omitted

}
