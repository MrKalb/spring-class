package br.com.uri.spring.service;

import br.com.uri.spring.dto.PersonDTO;
import br.com.uri.spring.entities.PersonEntity;
import br.com.uri.spring.repositories.PersonRepository;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    private PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public void saveObject(PersonDTO personDTO) {
        PersonEntity personEntity = new PersonEntity();
        personEntity.setName(personDTO.getName());
        personRepository.save(personEntity);
    }







}
