package com.proyect.program.service;

import org.springframework.stereotype.Service;

import com.proyect.program.model.Experience;

import java.util.List;
@Service
public interface ExperienceService {

	public List<Experience> findAll();
	public Experience save(Experience experience);
	public Experience findById(Integer id);
	public void delete(Integer id);
		
	
}
