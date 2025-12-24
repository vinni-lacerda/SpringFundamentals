package vinilab.springFundamentals.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vinilab.springFundamentals.dto.PersonDTO;
import vinilab.springFundamentals.exception.ResourceNotFoundException;
import vinilab.springFundamentals.model.Person;
import vinilab.springFundamentals.repositories.PersonRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;
import static vinilab.springFundamentals.mapper.ObjectMapper.parseObjects;
import static vinilab.springFundamentals.mapper.ObjectMapper.parseObject;


@Service
public class PersonServices {

    private final AtomicLong counter = new AtomicLong();
    private Logger logger = Logger.getLogger(PersonServices.class.getName());
    @Autowired
    PersonRepository personRepository;

    public PersonDTO findById(Long id){
        logger.info("Finding one Person!");
        Person entity = personRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("No records found for this id"));
        return parseObject(entity, PersonDTO.class);
    }
    public List<PersonDTO> findAll() {
        logger.info(("Finding all people!"));
        return parseObjects(personRepository.findAll(), PersonDTO.class);
    }


    public PersonDTO create(PersonDTO person){
        logger.info("Creating one person");
        Person entity = parseObject(person, Person.class);
        return parseObject(personRepository.save(entity), PersonDTO.class);
    }
    public PersonDTO update(PersonDTO person){
        logger.info("updating one person!");
        Person entity = personRepository.findById(person.getId()).orElseThrow(() -> new ResourceNotFoundException("Updating a person"));
        entity.setFirstName(person.getFirstName());
        entity.setLastName(person.getLastName());
        entity.setAddress(person.getAddress());
        entity.setGender(person.getGender());

        return parseObject(personRepository.save(entity), PersonDTO.class);
    }
    public void delete(Long id){
        logger.info("Deleting one person");
        Person entity = personRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Deleting a person"));
        personRepository.delete(entity);
    }
}
