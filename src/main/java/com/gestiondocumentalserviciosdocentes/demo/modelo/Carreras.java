package com.gestiondocumentalserviciosdocentes.demo.modelo;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "carreras")
public class Carreras {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_Carrera;
	
	private int id_Departamento;
	private String car_Nombre;
	private String car_creado_por;
	private Date car_fecha_creacion;
	private String car_actualizado_por;
	private Date car_fecha_actualizacion;
	
	public Carreras() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Carreras(int id_Carrera, int id_Departamento, String car_Nombre, String car_creado_por,
			Date car_fecha_creacion, String car_actualizado_por, Date car_fecha_actualizacion) {
		super();
		this.id_Carrera = id_Carrera;
		this.id_Departamento = id_Departamento;
		this.car_Nombre = car_Nombre;
		this.car_creado_por = car_creado_por;
		this.car_fecha_creacion = car_fecha_creacion;
		this.car_actualizado_por = car_actualizado_por;
		this.car_fecha_actualizacion = car_fecha_actualizacion;
	}

	public int getId_Carrera() {
		return id_Carrera;
	}

	public void setId_Carrera(int id_Carrera) {
		this.id_Carrera = id_Carrera;
	}

	public int getId_Departamento() {
		return id_Departamento;
	}

	public void setId_Departamento(int id_Departamento) {
		this.id_Departamento = id_Departamento;
	}

	public String getCar_Nombre() {
		return car_Nombre;
	}

	public void setCar_Nombre(String car_Nombre) {
		this.car_Nombre = car_Nombre;
	}

	public String getCar_creado_por() {
		return car_creado_por;
	}

	public void setCar_creado_por(String car_creado_por) {
		this.car_creado_por = car_creado_por;
	}

	public Date getCar_fecha_creacion() {
		return car_fecha_creacion;
	}

	public void setCar_fecha_creacion(Date car_fecha_creacion) {
		this.car_fecha_creacion = car_fecha_creacion;
	}

	public String getCar_actualizado_por() {
		return car_actualizado_por;
	}

	public void setCar_actualizado_por(String car_actualizado_por) {
		this.car_actualizado_por = car_actualizado_por;
	}

	public Date getCar_fecha_actualizacion() {
		return car_fecha_actualizacion;
	}

	public void setCar_fecha_actualizacion(Date car_fecha_actualizacion) {
		this.car_fecha_actualizacion = car_fecha_actualizacion;
	}

	@Override
	public String toString() {
		return "Carreras [id_Carrera=" + id_Carrera + ", id_Departamento=" + id_Departamento + ", car_Nombre="
				+ car_Nombre + ", car_creado_por=" + car_creado_por + ", car_fecha_creacion=" + car_fecha_creacion
				+ ", car_actualizado_por=" + car_actualizado_por + ", car_fecha_actualizacion="
				+ car_fecha_actualizacion + "]";
	}

	
	
}
