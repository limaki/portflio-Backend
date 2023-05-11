package com.proyect.program.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.proyect.program.dao.DaoPerson;
import com.proyect.program.model.Person;



@Service
public class PersonServiceImplements implements PersonService{
	
	@Autowired
	private DaoPerson personDao;  //UtilizamosFuncionesDaoDeInterface
	
	

	@Override
	@Transactional(readOnly=true)
	public Person findById(Integer id) {
		
		return personDao.findById(id).orElse(null);
	}



	@Override
	@Transactional(readOnly=true)
	public List<Person> findAll() {
		
		return (List<Person>)personDao.findAll();
	}



	@Override
	@Transactional(readOnly=false)
	public Person save(Person person) {
		
		return personDao.save(person);
	}



	@Override
	@Transactional(readOnly=false)
	public void delete(Integer id) {
		
		personDao.deleteById(id);
	}

}
