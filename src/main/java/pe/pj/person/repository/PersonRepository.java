package pe.pj.person.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.pj.person.entity.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {
	List<Person> findByStatusTrue();
	List<Person> findByNameContainingIgnoreCase(String name);
}
