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

import com.proyect.program.model.Person;
import com.proyect.program.service.PersonService;



@RestController
@CrossOrigin(origins="*")
@RequestMapping("/api")
public class PersonController {

	
	
	

		@Autowired
		private PersonService personService ; //llamandoTareaService
		
		
		@GetMapping("/persons")
		public List<Person> listar(){
			
			return personService.findAll();
		}
		
		
		@PostMapping("/persons")
		public Person guardar(@RequestBody Person person) {
			return personService.save(person);
		}
		
		
		@GetMapping("/persons/{id}")
		public Person getUnaPersona(@PathVariable Integer id) {
			return personService.findById(id);
		}
		
	
		@PutMapping("/persons/{id}")
		public Person modificar(@RequestBody Person person, 
				                @PathVariable Integer id) {
			
			Person personActual = personService.findById(id); //SeleccionarTarea
			personActual.setColor(person.getColor());        //ModificarTareaSeleccionada
			personActual.setDescription_perfil(person.getDescription_perfil()); //ModificarTareaSeleccionada
			personActual.setImg_banner(person.getImg_banner());
			personActual.setImg_perfil(person.getImg_perfil());
			personActual.setText_banner(person.getText_banner());
			personActual.setName_perfil(person.getName_perfil());
			
			return personService.save(personActual);
		}
		
		
		@DeleteMapping("/persons/{id}")
		public void eliminar(@PathVariable Integer id) {
			personService.delete(id);
		}
}
