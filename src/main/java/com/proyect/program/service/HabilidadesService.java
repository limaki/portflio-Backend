package com.proyect.program.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.proyect.program.model.Habilidades;

@Service
public interface HabilidadesService {
	
	public List<Habilidades> findAll();
	public Habilidades save (Habilidades habilidades);
	public Habilidades findById(Integer id);
	public void delete(Integer id);

}
