package com.gestiondocumentalserviciosdocentes.demo.modelo;

import java.util.Date;

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
	private String ruta_archivo;
	private int id_Departamento;
	
	public ProgramaEducativo() {
		
	}
	
	public ProgramaEducativo(int id, String nombre, Date fecha, String tipo, String enlace, String ruta_archivo, int id_departamento) {
	
		super();
		this.id = id;
		this.Nombre = nombre;
		this.Fecha = fecha;
		this.Tipo = tipo;
		this.Enlace = enlace;
		this.ruta_archivo = ruta_archivo;
		this.id_Departamento = id_departamento;
		System.out.println(this.id_Departamento);
	}
	
	

	public String getRuta_archivo() {
		return ruta_archivo;
	}

	public void setRuta_archivo(String ruta_archivo) {
		this.ruta_archivo = ruta_archivo;
	}

	public int getId_Departamento() {
		return id_Departamento;
	}

	public void setId_Departamento(int id_Departamento) {
		this.id_Departamento = id_Departamento;
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
