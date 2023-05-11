package com.proyect.program.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyect.program.model.TFrontEnd;
import com.proyect.program.service.TFrontEndService;

@RestController
@CrossOrigin("*")
@RequestMapping("/apiT")
public class TFrontEndController {
	
	
    @Autowired TFrontEndService tfrontendService;
    
    
    @GetMapping("/tecnologias") 
    List<TFrontEnd> devolverTecnologias() {
    	
    	return tfrontendService.findAll();
    			
    			
    }
    
    @GetMapping("/tecnologias/{id}") 
    TFrontEnd devolverTecnologia(@PathVariable Integer id) {
    	
    	return tfrontendService.findById(id);
    }
    
    @PostMapping("/tecnologias") 
    TFrontEnd guardarTecnologias(@RequestBody TFrontEnd tfrontend) {
    	
    	return tfrontendService.save(tfrontend);
    }
    
    @PutMapping("/tecnologias/{id}") 
    TFrontEnd modificarTecnologias(@PathVariable Integer id, @RequestBody TFrontEnd tfrontend) {
    	
    	   TFrontEnd tfrontendNew = tfrontendService.findById(id);
    	
    	   tfrontendNew.setNombre(tfrontend.getNombre());
    	   tfrontendNew.setNivel(tfrontend.getNivel());
    	   tfrontendNew.setSimbolo(tfrontend.getSimbolo());
    	   
    	   return tfrontendService.save(tfrontendNew);
    }
    
    
    @DeleteMapping("/tecnologias/{id}") 
    public void eliminarTecnologia(@PathVariable Integer id) {
    	
    	tfrontendService.delete(id);
    }
    

}
