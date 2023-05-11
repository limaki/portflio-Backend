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

import com.proyect.program.model.Habilidades;
import com.proyect.program.service.HabilidadesService;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("/apiH")
public class HabilidadesController {
	
	
	@Autowired 
	private HabilidadesService habilidadesService;

	
	@GetMapping("/habilidades")
	public List<Habilidades> listar(){
		
		return habilidadesService.findAll();
	}
	
	@PostMapping("/habilidades")
	public Habilidades guardar(@RequestBody Habilidades habilidades) {
		
		return habilidadesService.save(habilidades);
	}
	
	@GetMapping("/habilidades/{id}")
	public Habilidades devolver(@PathVariable Integer id) {
		
		return habilidadesService.findById(id);
		
	}
	
	@PutMapping("/habilidades/{id}")
	public Habilidades modificar(@RequestBody Habilidades habilidades, 
			                     @PathVariable Integer id) {
		
		Habilidades habilidadActual = habilidadesService.findById(id);
	
		habilidadActual.setHabilidad_db(habilidades.getHabilidad_db());
		habilidadActual.setPorcentaje_db(habilidades.getPorcentaje_db());
		
		return habilidadesService.save(habilidadActual);
		
	}
	
	@DeleteMapping("/habilidades/{id}")
	public void eliminar(@PathVariable Integer id) {
		
		habilidadesService.delete(id);
	}
	
	
	
	
	
	
	
	
	
	
	
}







