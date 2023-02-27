package com.gestiondocumentalserviciosdocentes.demo.modelo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mat_jefatura")
public class MatJefatura {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_Material;
	
	private int id_Departamento;
    private String mtr_Nombre;
	private String mtr_Enlace;
	private String mtr_creado_por;
	private Date mtr_fecha_creacion;
	private String mtr_actualizado_por;
	private Date mtr_fecha_actualizacion;
	public MatJefatura() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MatJefatura(int id_Material, int id_Departamento, String mtr_Nombre, String mtr_Enlace,
			String mtr_creado_por, Date mtr_fecha_creacion, String mtr_actualizado_por, Date mtr_fecha_actualizacion) {
		super();
		this.id_Material = id_Material;
		this.id_Departamento = id_Departamento;
		this.mtr_Nombre = mtr_Nombre;
		this.mtr_Enlace = mtr_Enlace;
		this.mtr_creado_por = mtr_creado_por;
		this.mtr_fecha_creacion = mtr_fecha_creacion;
		this.mtr_actualizado_por = mtr_actualizado_por;
		this.mtr_fecha_actualizacion = mtr_fecha_actualizacion;
	}
	public int getId_Material() {
		return id_Material;
	}
	public void setId_Material(int id_Material) {
		this.id_Material = id_Material;
	}
	public int getId_Departamento() {
		return id_Departamento;
	}
	public void setId_Departamento(int id_Departamento) {
		this.id_Departamento = id_Departamento;
	}
	public String getMtr_Nombre() {
		return mtr_Nombre;
	}
	public void setMtr_Nombre(String mtr_Nombre) {
		this.mtr_Nombre = mtr_Nombre;
	}
	public String getMtr_Enlace() {
		return mtr_Enlace;
	}
	public void setMtr_Enlace(String mtr_Enlace) {
		this.mtr_Enlace = mtr_Enlace;
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
	@Override
	public String toString() {
		return "MatJefatura [id_Material=" + id_Material + ", id_Departamento=" + id_Departamento + ", mtr_Nombre="
				+ mtr_Nombre + ", mtr_Enlace=" + mtr_Enlace + ", mtr_creado_por=" + mtr_creado_por
				+ ", mtr_fecha_creacion=" + mtr_fecha_creacion + ", mtr_actualizado_por=" + mtr_actualizado_por
				+ ", mtr_fecha_actualizacion=" + mtr_fecha_actualizacion + "]";
	}
	
	

}
