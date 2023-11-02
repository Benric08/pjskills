package pe.pj.person.controller;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import pe.pj.person.dto.PersonDTO;
import pe.pj.person.entity.Person;
import pe.pj.person.service.PersonService;

@RestController
@RequestMapping("/api/people")
public class PersonController {
	
	@Autowired
    private PersonService personService;

    @GetMapping("")
    public List<Person> listPeople() {
        return personService.getPeople();
    }
    
    @GetMapping("/search")
    public List<Person> getPersonByName(@RequestParam String name) {
    	return personService.getPersonByName(name);
    }
    
    @PostMapping("")
    public Person createPerson(@RequestBody PersonDTO personDTO) {
    	Person person = new ModelMapper().map(personDTO, Person.class);
    	return personService.createPerson(person);
    }
    
    @GetMapping("/{id}")
    public Person getPersonById(@PathVariable Integer id) {
    	return personService.getPersonById(id);
    }
    
    @PutMapping("/{id}")
    public Person updatePerson(@PathVariable Integer id,@RequestBody PersonDTO personDTO) {
    	return personService.updatePerson(id,personDTO);
    }
    
    @DeleteMapping("/{id}")
    public void deletePerson(@PathVariable Integer id) {
    	personService.deletePerson(id);
    }
    
}
