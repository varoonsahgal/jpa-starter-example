package com.intuit.jpa_example;//JPA will provide a default implementation of this for us
import com.intuit.jpa_example.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long> {

    //what did we NOT have to do at all??

}
