package vinilab.springFundamentals.request.converters;

import org.springframework.stereotype.Service;
import vinilab.springFundamentals.model.Person;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

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
}
