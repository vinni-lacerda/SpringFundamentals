package vinilab.springFundamentals.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vinilab.springFundamentals.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
