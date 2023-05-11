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

import com.proyect.program.model.Experience;
import com.proyect.program.service.ExperienceService;




@RestController
@CrossOrigin(origins= {"*"})
@RequestMapping("/apiE")    //DejoAsiParaProbar
public class ExperienceController {

	
	
	@Autowired
	private ExperienceService experienceService ;
	
	@CrossOrigin(origins="*")
	@GetMapping("/experiencias")
	private List<Experience> devolverExperiences() {
		
		return experienceService.findAll();
				
	}
	@CrossOrigin(origins="*")
	@PostMapping("/experiencias")
	private Experience guardarExperiencias(@RequestBody Experience experience) {
		
		return experienceService.save(experience);
	}
	
	@CrossOrigin(origins="*")
	@GetMapping("/experiencias/{id}")
	private Experience eligirExperiencia(@PathVariable Integer id) {
		
		return experienceService.findById(id);
	}
	@CrossOrigin(origins="*")
	@PutMapping("/experiencias/{id}")
	private Experience editarExperiencia(@RequestBody Experience experience,
			                         @PathVariable Integer id) {
		
		Experience experienciaActual = experienceService.findById(id);
		
		experienciaActual.setImgBluePerfil(experience.getImgBluePerfil());
		experienciaActual.setDescriptionLarge(experience.getDescriptionLarge());

		return experienceService.save(experienciaActual);
		
		
	}
	
	@CrossOrigin(origins="*")
	@DeleteMapping("/experiencias/{id}")
	private void eliminarExperiencia(@PathVariable Integer id) {
		
		experienceService.delete(id);
	}
	
	
	
	
}
