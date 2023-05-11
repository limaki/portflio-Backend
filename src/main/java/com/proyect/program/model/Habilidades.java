package com.proyect.program.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "habilidades")
public class Habilidades {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "id")
	private Integer id;
	
	@Column(name = "habilidad")
	private String habilidad_db;
	
	@Column(name = "porcentaje")
	private String porcentaje_db;

	
	
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getHabilidad_db() {
		return habilidad_db;
	}

	public void setHabilidad_db(String habilidad_db) {
		this.habilidad_db = habilidad_db;
	}

	public String getPorcentaje_db() {
		return porcentaje_db;
	}

	public void setPorcentaje_db(String porcentaje_db) {
		this.porcentaje_db = porcentaje_db;
	}

	

	

	
	
	
	
	
	
}
