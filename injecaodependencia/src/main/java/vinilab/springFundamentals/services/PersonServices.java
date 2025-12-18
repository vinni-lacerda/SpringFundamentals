package vinilab.springFundamentals.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import vinilab.springFundamentals.model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Slf4j
@Service
public class PersonServices {
    private final AtomicLong counter = new AtomicLong();
    private Logger logger = Logger.getLogger(PersonServices.class.getName());

    public Person findById(String id){
        logger.info("Finding one Person!");

        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Vinicius");
        person.setLastName("Lacerda");
        person.setAdress("Salvador, Bahia, Brasil");
        person.setGender("Male");
        return person;
    }
    public List<Person> findAll() {
        logger.info(("Finding all people!"));
        List<Person> persons = new ArrayList<Person>();
        for (int i = 0; i < 8; i++) {
            Person person = mockPerson(i);
            persons.add(person);
        }
        return persons;
    }

    private Person mockPerson(int i) {
        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("FirstName" + i);
        person.setLastName("LastName" + i);
        person.setAdress("Some addres in Brazil");
        person.setGender("Male");
        return person;
    }

    public Person create(Person person){
        logger.info("Creating one person");
        return person;
    }
    public Person update(Person person){
        logger.info("updating one person!");
        return person;
    }
    public void delete(String id){
        logger.info("Deleting one person");
    }
}
