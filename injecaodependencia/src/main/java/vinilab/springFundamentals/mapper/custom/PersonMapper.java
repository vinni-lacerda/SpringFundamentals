package vinilab.springFundamentals.mapper.custom;

import vinilab.springFundamentals.dto.v2.PersonDTOV2;
import vinilab.springFundamentals.model.Person;

import java.util.Date;

public class PersonMapper {
    public PersonDTOV2 convertEntityToDTO(Person person){
        PersonDTOV2 dto = new PersonDTOV2();
        dto.setFirstName(person.getFirstName());
        dto.setLastName(person.getLastName());
        dto.setAddress(person.getAddress());
        dto.setGender(person.getGender());
        dto.setBirthday(new Date());
        return dto;
    }
    public Person convertDTOToEntity(PersonDTOV2 person){
        Person entity = new Person();
        entity.setFirstName(person.getFirstName());
        entity.setLastName(person.getLastName());
        entity.setAddress(person.getAddress());
        entity.setGender(person.getGender());
        return entity;
    }
}
