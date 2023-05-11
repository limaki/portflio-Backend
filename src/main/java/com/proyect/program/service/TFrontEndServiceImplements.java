package com.proyect.program.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.proyect.program.dao.DaoTFrontEnd;
import com.proyect.program.model.TFrontEnd;



@Service
public class TFrontEndServiceImplements implements TFrontEndService{
	
	@Autowired
	private DaoTFrontEnd daotfrontend; 

	@Override
	@Transactional(readOnly = true)
	public List<TFrontEnd> findAll() {
		
		return (List<TFrontEnd>)daotfrontend.findAll();
	}

	@Override
	@Transactional(readOnly=false)
	public TFrontEnd save(TFrontEnd tfrontend) {
		
		return daotfrontend.save(tfrontend);
	}

	@Override
	@Transactional(readOnly = true)
	public TFrontEnd findById(Integer id) {
		
		return daotfrontend.findById(id).orElse(null);
	}

	@Override
	@Transactional(readOnly = false)
	public void delete(Integer id) {
		
		daotfrontend.deleteById(id);
	}

}
