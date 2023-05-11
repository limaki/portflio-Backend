package com.proyect.program.dao;

import org.springframework.data.repository.CrudRepository;

import com.proyect.program.model.Person;

public interface DaoPerson extends CrudRepository<Person, Integer>{

}
