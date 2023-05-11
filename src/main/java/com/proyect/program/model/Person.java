package com.proyect.program.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Entity
@Table (name = "persona")
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "img_banner")
	private String img_banner;
	
	@Column(name = "text_banner")
	private String text_banner;
	
	@Column(name = "img_perfil")
	private String img_perfil;
	
	@Column(name = "name")
	private String name_perfil;
	
	@Column(name = "description")
	private String description_perfil;
	
	@Column(name = "color")
	private String color;
	
	
	
	
	
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getImg_banner() {
		return img_banner;
	}

	public void setImg_banner(String img_banner) {
		this.img_banner = img_banner;
	}

	public String getText_banner() {
		return text_banner;
	}

	public void setText_banner(String text_banner) {
		this.text_banner = text_banner;
	}

	public String getImg_perfil() {
		return img_perfil;
	}

	public void setImg_perfil(String img_perfil) {
		this.img_perfil = img_perfil;
	}

	public String getName_perfil() {
		return name_perfil;
	}

	public void setName_perfil(String name_perfil) {
		this.name_perfil = name_perfil;
	}

	public String getDescription_perfil() {
		return description_perfil;
	}

	public void setDescription_perfil(String description_perfil) {
		this.description_perfil = description_perfil;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	
}
