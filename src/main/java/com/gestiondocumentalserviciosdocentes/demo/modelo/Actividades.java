package com.gestiondocumentalserviciosdocentes.demo.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "act_Apoyo_Docencia")
public class Actividades {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_Actividades_Docencia;
	
	private int id_Departamento;
	private String actdoc_Nombre_Actividad;
	private String actdoc_Clave;
	
	
	public Actividades() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Actividades(int id_Actividades_Docencia, int id_Departamento, String actdoc_Nombre_Actividad,
			String actdoc_Clave) {
		super();
		this.id_Actividades_Docencia = id_Actividades_Docencia;
		this.id_Departamento = id_Departamento;
		this.actdoc_Nombre_Actividad = actdoc_Nombre_Actividad;
		this.actdoc_Clave = actdoc_Clave;
	}


	public int getId_Actividades_Docencia() {
		return id_Actividades_Docencia;
	}


	public void setId_Actividades_Docencia(int id_Actividades_Docencia) {
		this.id_Actividades_Docencia = id_Actividades_Docencia;
	}


	public int getId_Departamento() {
		return id_Departamento;
	}


	public void setId_Departamento(int id_Departamento) {
		this.id_Departamento = id_Departamento;
	}


	public String getActdoc_Nombre_Actividad() {
		return actdoc_Nombre_Actividad;
	}


	public void setActdoc_Nombre_Actividad(String actdoc_Nombre_Actividad) {
		this.actdoc_Nombre_Actividad = actdoc_Nombre_Actividad;
	}


	public String getActdoc_Clave() {
		return actdoc_Clave;
	}


	public void setActdoc_Clave(String actdoc_Clave) {
		this.actdoc_Clave = actdoc_Clave;
	}


	@Override
	public String toString() {
		return "Actividades [id_Actividades_Docencia=" + id_Actividades_Docencia + ", id_Departamento="
				+ id_Departamento + ", actdoc_Nombre_Actividad=" + actdoc_Nombre_Actividad + ", actdoc_Clave="
				+ actdoc_Clave + "]";
	}


	

	
}
