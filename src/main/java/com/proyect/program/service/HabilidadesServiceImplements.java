package com.proyect.program.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.proyect.program.dao.DaoHabilidad;
import com.proyect.program.model.Habilidades;

@Service
public class HabilidadesServiceImplements implements HabilidadesService{
	
	@Autowired
	private DaoHabilidad daoHabilidad;
	
	
	

	@Override
	@Transactional(readOnly=true)
	public List<Habilidades> findAll() {
		
		return (List<Habilidades>)daoHabilidad.findAll();
	}

	@Override
	@Transactional(readOnly=false)
	public Habilidades save(Habilidades habilidades) {
	
		return daoHabilidad.save(habilidades);
	}

	@Override
	@Transactional(readOnly=true)
	public Habilidades findById(Integer id) {
		
		return daoHabilidad.findById(id).orElse(null);
	}

	@Override
	@Transactional(readOnly=false)
	public void delete(Integer id) {
		
		daoHabilidad.deleteById(id);
	}

	
	
	
}
