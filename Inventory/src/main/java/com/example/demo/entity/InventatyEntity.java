package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class InventatyEntity {
	
	
	@Id
	private int id;


	@Column(name = "NOMBRE")
	private String nombre;
	
	@Column(name = "APE_PAT")
	private String apePat;
	
	@Column(name="APE_MAT")
	private String apeMat;
	
	@Column(name="numEmpleadoUno")
	private int noEmpl;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApePat() {
		return apePat;
	}

	public void setApePat(String apePat) {
		this.apePat = apePat;
	}

	public String getApeMat() {
		return apeMat;
	}

	public void setApeMat(String apeMat) {
		this.apeMat = apeMat;
	}

	public int getNoEmpl() {
		return noEmpl;
	}

	public void setNoEmpl(int noEmpl) {
		this.noEmpl = noEmpl;
	}
	


}
