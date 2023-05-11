package com.proyect.program.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.proyect.program.dao.DaoProyectos;
import com.proyect.program.model.Proyectos;

@Service
public class ProyectosServiceImplements implements ProyectosService{
	
	@Autowired DaoProyectos daoProyectos;

	@Override
	@Transactional(readOnly = true)
	public List<Proyectos> findAll() {
		
		return (List<Proyectos>)daoProyectos.findAll();
	}

	@Override
	@Transactional(readOnly = false)
	public Proyectos save(Proyectos proyectos) {
		
		return daoProyectos.save(proyectos);
		}

	@Override
	@Transactional(readOnly = true)
	public Proyectos findById(Integer id) {
		
		return daoProyectos.findById(id).orElse(null);
	}

	@Override
	@Transactional(readOnly = false)
	public void delete(Integer id) {
		
		daoProyectos.deleteById(id);
		
		
	}

}
