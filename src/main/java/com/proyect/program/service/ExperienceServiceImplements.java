package com.proyect.program.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.proyect.program.dao.DaoExperiencia;
import com.proyect.program.model.Experience;

@Service
public class ExperienceServiceImplements implements ExperienceService{
	
	@Autowired
	private DaoExperiencia daoExperience;

	@Override
	@Transactional(readOnly=true)
	public List<Experience> findAll() {
		
		
		return (List<Experience>)daoExperience.findAll();
	}

	@Override
	@Transactional(readOnly=false)
	public Experience save(Experience experience) {
		
		return daoExperience.save(experience);
	}

	@Override
	@Transactional(readOnly=true)
	public Experience findById(Integer id) {
		
		return daoExperience.findById(id).orElse(null);
	}

	@Override
	@Transactional(readOnly=false)
	public void delete(Integer id) {
		
		daoExperience.deleteById(id);
	}

}
