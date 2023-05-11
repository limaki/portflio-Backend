package com.proyect.program.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.proyect.program.model.Person;


@Service
public interface PersonService {
	
	public List<Person> findAll();
	public Person save(Person person);
	public Person findById(Integer id);
	public void delete(Integer id);

}
