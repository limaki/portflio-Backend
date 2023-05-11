package com.proyect.program.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.proyect.program.model.Proyectos;

@Service
public interface ProyectosService {
	
	public List<Proyectos> findAll();
	public Proyectos save(Proyectos proyectos);
	public Proyectos findById(Integer id);
	public void delete(Integer id);

}
