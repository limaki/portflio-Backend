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

import com.proyect.program.model.Proyectos;
import com.proyect.program.service.ProyectosService;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("/apiP")
public class ProyectosController {
	
	@Autowired
	private ProyectosService proyectoService;
	
	
	
	@GetMapping("/proyectos")
	private List<Proyectos> devolverProyectos() {
		
		return proyectoService.findAll();
	}
	
	
	
	
	@PostMapping("/proyectos")
	private Proyectos guardarProyectos(@RequestBody Proyectos proyectos) {
		
		
		return proyectoService.save(proyectos);
	}
	
	
	@GetMapping("/proyectos/{id}")
	private Proyectos DevolverUnProyecto(@PathVariable Integer id) {
		
		return proyectoService.findById(id);
	}
	
	
    @PutMapping("/proyectos/{id}")
    	private Proyectos editarProyecto(@PathVariable Integer id,
    			                         @RequestBody Proyectos proyectos) {
    	
    	Proyectos proyectoNuevo = proyectoService.findById(id);
    	
    	proyectoNuevo.setImg_proyecto(proyectos.getImg_proyecto());
    	proyectoNuevo.setDescripcion_proyecto(proyectos.getDescripcion_proyecto());
    	proyectoNuevo.setEnlace_proyecto(proyectos.getEnlace_proyecto());
    	proyectoNuevo.setTitulo_proyecto(proyectos.getTitulo_proyecto());
    	
    	
    	return proyectoService.save(proyectoNuevo);
    	
    }
	
    @DeleteMapping("/proyectos/{id}")
    private void eliminarProyecto(@PathVariable Integer id) {
    	
    	proyectoService.delete(id);
    }
	
	

}
