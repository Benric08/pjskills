package pe.pj.person.service;

import java.time.LocalDateTime;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.persistence.EntityNotFoundException;
import pe.pj.person.dto.PersonDTO;
import pe.pj.person.entity.Person;
import pe.pj.person.repository.PersonRepository;

@Service
public class PersonService {
	
	@Autowired
	private PersonRepository personRepository;
	
	public List<Person> getPeople() {
        return personRepository.findByStatusTrue();
    }
	
	public Person createPerson(Person person) {
        return personRepository.save(person);
    }
	
	public Person getPersonById(Integer id) {
		return personRepository.findById(id).orElseThrow(EntityNotFoundException::new);
	}
	
	public List <Person> getPersonByName(String name) {
		return personRepository.findByNameContainingIgnoreCase(name);
	}

	public Person updatePerson(Integer id, PersonDTO personDTO) {
		Person person = getPersonById(id);
		new ModelMapper().map(personDTO, person);
        return personRepository.save(person); 
	}
	
	public void deletePerson(Integer id) {
		Person person = getPersonById(id);
		person.setStatus(false);
		person.setDeletedAt(LocalDateTime.now());
		personRepository.save(person);
		
	}
}
