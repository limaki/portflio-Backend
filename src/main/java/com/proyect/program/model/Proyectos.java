package com.proyect.program.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "proyectos")
public class Proyectos {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "img_proyecto")
	private String img_proyecto;
	@Column(name = "titulo_proyecto")
	private String titulo_proyecto;
	@Column(name= "descripcion_proyecto")
	private String descripcion_proyecto;
	@Column(name = "enlace_proyecto")
	private String enlace_proyecto;
	
	
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getImg_proyecto() {
		return img_proyecto;
	}
	public void setImg_proyecto(String img_proyecto) {
		this.img_proyecto = img_proyecto;
	}
	public String getTitulo_proyecto() {
		return titulo_proyecto;
	}
	public void setTitulo_proyecto(String titulo_proyecto) {
		this.titulo_proyecto = titulo_proyecto;
	}
	public String getDescripcion_proyecto() {
		return descripcion_proyecto;
	}
	public void setDescripcion_proyecto(String descripcion_proyecto) {
		this.descripcion_proyecto = descripcion_proyecto;
	}
	public String getEnlace_proyecto() {
		return enlace_proyecto;
	}
	public void setEnlace_proyecto(String enlace_proyecto) {
		this.enlace_proyecto = enlace_proyecto;
	}
	
	
	
	
	
	
	
	
}
