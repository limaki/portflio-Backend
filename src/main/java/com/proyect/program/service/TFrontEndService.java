package com.proyect.program.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.proyect.program.model.TFrontEnd;

@Service
public interface TFrontEndService {

	
	public List<TFrontEnd> findAll();
	public TFrontEnd save(TFrontEnd tfrontend);
	public TFrontEnd findById(Integer id);
	public void delete(Integer id);
}
