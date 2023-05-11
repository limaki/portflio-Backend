package com.proyect.program.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "experiencia")
public class Experience {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "img_blue_perfil")
	private String img_blue_perfil_intento;
	
	@Column(name = "img_blue_person")
	private String img_blue_person_intento;
	

	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getImgBluePerfil() {
		return img_blue_perfil_intento;
	}
	public void setImgBluePerfil(String img_blue_perfil_intento) {
		this.img_blue_perfil_intento = img_blue_perfil_intento;
	}
	public String getDescriptionLarge() {
		return img_blue_person_intento;
	}
	public void setDescriptionLarge(String img_blue_person_intento) {
		this.img_blue_person_intento = img_blue_person_intento;
	}
	
	



}
