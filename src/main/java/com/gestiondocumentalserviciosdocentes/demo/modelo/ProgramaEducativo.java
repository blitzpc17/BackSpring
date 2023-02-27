package com.gestiondocumentalserviciosdocentes.demo.modelo;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "programa_educativo")
public class ProgramaEducativo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String Nombre;
	private Date Fecha;	
	private String Tipo;
	private String Enlace;
	
	public ProgramaEducativo() {
		
	}
	
	public ProgramaEducativo(int id, String nombre, Date fecha, String tipo, String enlace) {
		super();
		this.id = id;
		Nombre = nombre;
		Fecha = fecha;
		Tipo = tipo;
		Enlace = enlace;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTipo() {
		return Tipo;
	}
	public void setTipo(String tipo) {
		Tipo = tipo;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public Date getFecha() {
		return Fecha;
	}
	public void setFecha(Date fecha) {
		Fecha = fecha;
	}

	public String getEnlace() {
		return Enlace;
	}

	public void setEnlace(String enlace) {
		Enlace = enlace;
	}
	
	
	
	
	

}
