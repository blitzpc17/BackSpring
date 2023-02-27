package com.gestiondocumentalserviciosdocentes.demo.modelo;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "laboratorios")
public class Laboratorios {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_Laboratorio; 
	
	
	private String lab_Nombre;
	private int id_Usuarios;
	private int id_Departamento;
	private String lab_Clave;
	private int lab_Capacidad;
	private String lab_Horario; 
	private String lab_creado_por;
	private Date lab_fecha_creacion;
	private String lab_actualizado_por;
	private Date lab_fecha_actualizacion;
	
	
	public Laboratorios() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Laboratorios(int id_Laboratorio, String lab_Nombre, int id_Usuarios, int id_Departamento, String lab_Clave,
			int lab_Capacidad, String lab_Horario, String lab_creado_por, Date lab_fecha_creacion,
			String lab_actualizado_por, Date lab_fecha_actualizacion) {
		super();
		this.id_Laboratorio = id_Laboratorio;
		this.lab_Nombre = lab_Nombre;
		this.id_Usuarios = id_Usuarios;
		this.id_Departamento = id_Departamento;
		this.lab_Clave = lab_Clave;
		this.lab_Capacidad = lab_Capacidad;
		this.lab_Horario = lab_Horario;
		this.lab_creado_por = lab_creado_por;
		this.lab_fecha_creacion = lab_fecha_creacion;
		this.lab_actualizado_por = lab_actualizado_por;
		this.lab_fecha_actualizacion = lab_fecha_actualizacion;
	}


	public int getId_Laboratorio() {
		return id_Laboratorio;
	}


	public void setId_Laboratorio(int id_Laboratorio) {
		this.id_Laboratorio = id_Laboratorio;
	}


	public String getLab_Nombre() {
		return lab_Nombre;
	}


	public void setLab_Nombre(String lab_Nombre) {
		this.lab_Nombre = lab_Nombre;
	}


	public int getId_Usuarios() {
		return id_Usuarios;
	}


	public void setId_Usuarios(int id_Usuarios) {
		this.id_Usuarios = id_Usuarios;
	}


	public int getId_Departamento() {
		return id_Departamento;
	}


	public void setId_Departamento(int id_Departamento) {
		this.id_Departamento = id_Departamento;
	}


	public String getLab_Clave() {
		return lab_Clave;
	}


	public void setLab_Clave(String lab_Clave) {
		this.lab_Clave = lab_Clave;
	}


	public int getLab_Capacidad() {
		return lab_Capacidad;
	}


	public void setLab_Capacidad(int lab_Capacidad) {
		this.lab_Capacidad = lab_Capacidad;
	}


	public String getLab_Horario() {
		return lab_Horario;
	}


	public void setLab_Horario(String lab_Horario) {
		this.lab_Horario = lab_Horario;
	}


	public String getLab_creado_por() {
		return lab_creado_por;
	}


	public void setLab_creado_por(String lab_creado_por) {
		this.lab_creado_por = lab_creado_por;
	}


	public Date getLab_fecha_creacion() {
		return lab_fecha_creacion;
	}


	public void setLab_fecha_creacion(Date lab_fecha_creacion) {
		this.lab_fecha_creacion = lab_fecha_creacion;
	}


	public String getLab_actualizado_por() {
		return lab_actualizado_por;
	}


	public void setLab_actualizado_por(String lab_actualizado_por) {
		this.lab_actualizado_por = lab_actualizado_por;
	}


	public Date getLab_fecha_actualizacion() {
		return lab_fecha_actualizacion;
	}


	public void setLab_fecha_actualizacion(Date lab_fecha_actualizacion) {
		this.lab_fecha_actualizacion = lab_fecha_actualizacion;
	}


	@Override
	public String toString() {
		return "Laboratorios [id_Laboratorio=" + id_Laboratorio + ", lab_Nombre=" + lab_Nombre + ", id_Usuarios="
				+ id_Usuarios + ", id_Departamento=" + id_Departamento + ", lab_Clave=" + lab_Clave + ", lab_Capacidad="
				+ lab_Capacidad + ", lab_Horario=" + lab_Horario + ", lab_creado_por=" + lab_creado_por
				+ ", lab_fecha_creacion=" + lab_fecha_creacion + ", lab_actualizado_por=" + lab_actualizado_por
				+ ", lab_fecha_actualizacion=" + lab_fecha_actualizacion + "]";
	}


	
	
	

}
