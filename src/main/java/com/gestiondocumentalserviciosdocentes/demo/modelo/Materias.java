package com.gestiondocumentalserviciosdocentes.demo.modelo;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="materias")
public class Materias {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_Materia;
	
	private int id_Departamento;
	private String mat_Clave;
	private String mat_Nombre;
	private String mat_creado_por;
	private Date mat_fecha_creacion;
	private String mat_actualizado_por;
	private Date mat_fecha_actualizacion;
	
	
	public Materias() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Materias(int id_Materia, int id_Departamento, String mat_Clave, String mat_Nombre, String mat_creado_por,
			Date mat_fecha_creacion, String mat_actualizado_por, Date mat_fecha_actualizacion) {
		super();
		this.id_Materia = id_Materia;
		this.id_Departamento = id_Departamento;
		this.mat_Clave = mat_Clave;
		this.mat_Nombre = mat_Nombre;
		this.mat_creado_por = mat_creado_por;
		this.mat_fecha_creacion = mat_fecha_creacion;
		this.mat_actualizado_por = mat_actualizado_por;
		this.mat_fecha_actualizacion = mat_fecha_actualizacion;
	}


	public int getId_Materia() {
		return id_Materia;
	}


	public void setId_Materia(int id_Materia) {
		this.id_Materia = id_Materia;
	}


	public int getId_Departamento() {
		return id_Departamento;
	}


	public void setId_Departamento(int id_Departamento) {
		this.id_Departamento = id_Departamento;
	}


	public String getMat_Clave() {
		return mat_Clave;
	}


	public void setMat_Clave(String mat_Clave) {
		this.mat_Clave = mat_Clave;
	}


	public String getMat_Nombre() {
		return mat_Nombre;
	}


	public void setMat_Nombre(String mat_Nombre) {
		this.mat_Nombre = mat_Nombre;
	}


	public String getMat_creado_por() {
		return mat_creado_por;
	}


	public void setMat_creado_por(String mat_creado_por) {
		this.mat_creado_por = mat_creado_por;
	}


	public Date getMat_fecha_creacion() {
		return mat_fecha_creacion;
	}


	public void setMat_fecha_creacion(Date mat_fecha_creacion) {
		this.mat_fecha_creacion = mat_fecha_creacion;
	}


	public String getMat_actualizado_por() {
		return mat_actualizado_por;
	}


	public void setMat_actualizado_por(String mat_actualizado_por) {
		this.mat_actualizado_por = mat_actualizado_por;
	}


	public Date getMat_fecha_actualizacion() {
		return mat_fecha_actualizacion;
	}


	public void setMat_fecha_actualizacion(Date mat_fecha_actualizacion) {
		this.mat_fecha_actualizacion = mat_fecha_actualizacion;
	}


	@Override
	public String toString() {
		return "Materias [id_Materia=" + id_Materia + ", id_Departamento=" + id_Departamento + ", mat_Clave="
				+ mat_Clave + ", mat_Nombre=" + mat_Nombre + ", mat_creado_por=" + mat_creado_por
				+ ", mat_fecha_creacion=" + mat_fecha_creacion + ", mat_actualizado_por=" + mat_actualizado_por
				+ ", mat_fecha_actualizacion=" + mat_fecha_actualizacion + "]";
	}



	
	
}
