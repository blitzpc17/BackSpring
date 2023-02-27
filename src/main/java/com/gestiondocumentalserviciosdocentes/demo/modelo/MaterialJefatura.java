package com.gestiondocumentalserviciosdocentes.demo.modelo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mat_jefatura")
public class MaterialJefatura {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_material;
	
	private int id_departamento;
	private String mtr_nombre;
	private String mtr_enlace;
	private String mtr_creado_por;
	private Date mtr_fecha_creacion;
	private String mtr_actualizado_por;
	private Date mtr_fecha_actualizacion;
	
	public MaterialJefatura() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId_material() {
		return id_material;
	}

	public void setId_material(int id_material) {
		this.id_material = id_material;
	}

	public int getId_departamento() {
		return id_departamento;
	}

	public void setId_departamento(int id_departamento) {
		this.id_departamento = id_departamento;
	}

	public String getMtr_nombre() {
		return mtr_nombre;
	}

	public void setMtr_nombre(String mtr_nombre) {
		this.mtr_nombre = mtr_nombre;
	}

	public String getMtr_enlace() {
		return mtr_enlace;
	}

	public void setMtr_enlace(String mtr_enlace) {
		this.mtr_enlace = mtr_enlace;
	}

	public String getMtr_creado_por() {
		return mtr_creado_por;
	}

	public void setMtr_creado_por(String mtr_creado_por) {
		this.mtr_creado_por = mtr_creado_por;
	}

	public Date getMtr_fecha_creacion() {
		return mtr_fecha_creacion;
	}

	public void setMtr_fecha_creacion(Date mtr_fecha_creacion) {
		this.mtr_fecha_creacion = mtr_fecha_creacion;
	}

	public String getMtr_actualizado_por() {
		return mtr_actualizado_por;
	}

	public void setMtr_actualizado_por(String mtr_actualizado_por) {
		this.mtr_actualizado_por = mtr_actualizado_por;
	}

	public Date getMtr_fecha_actualizacion() {
		return mtr_fecha_actualizacion;
	}

	public void setMtr_fecha_actualizacion(Date mtr_fecha_actualizacion) {
		this.mtr_fecha_actualizacion = mtr_fecha_actualizacion;
	}

}
