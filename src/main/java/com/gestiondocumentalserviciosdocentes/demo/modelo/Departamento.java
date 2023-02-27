package com.gestiondocumentalserviciosdocentes.demo.modelo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "departamento")
public class Departamento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_Departamento;
    private String dep_nombre;	
    private String dep_creado_por;
    private Date dep_fecha_creacion;
    private String dep_actualizado_por;
    private Date dep_fecha_actualizacion;
	public Departamento() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Departamento(int id_Departamento, String dep_nombre, String dep_creado_por, Date dep_fecha_creacion,
			String dep_actualizado_por, Date dep_fecha_actualizacion) {
		super();
		this.id_Departamento = id_Departamento;
		this.dep_nombre = dep_nombre;
		this.dep_creado_por = dep_creado_por;
		this.dep_fecha_creacion = dep_fecha_creacion;
		this.dep_actualizado_por = dep_actualizado_por;
		this.dep_fecha_actualizacion = dep_fecha_actualizacion;
	}
	public int getId_Departamento() {
		return id_Departamento;
	}
	public void setId_Departamento(int id_Departamento) {
		this.id_Departamento = id_Departamento;
	}
	public String getDep_nombre() {
		return dep_nombre;
	}
	public void setDep_nombre(String dep_nombre) {
		this.dep_nombre = dep_nombre;
	}
	public String getDep_creado_por() {
		return dep_creado_por;
	}
	public void setDep_creado_por(String dep_creado_por) {
		this.dep_creado_por = dep_creado_por;
	}
	public Date getDep_fecha_creacion() {
		return dep_fecha_creacion;
	}
	public void setDep_fecha_creacion(Date dep_fecha_creacion) {
		this.dep_fecha_creacion = dep_fecha_creacion;
	}
	public String getdep_actualizado_por() {
		return dep_actualizado_por;
	}
	public void setdep_actualizado_por(String dep_actualizado_por) {
		this.dep_actualizado_por = dep_actualizado_por;
	}
	public Date getDep_fecha_actualizacion() {
		return dep_fecha_actualizacion;
	}
	public void setDep_fecha_actualizacion(Date dep_fecha_actualizacion) {
		this.dep_fecha_actualizacion = dep_fecha_actualizacion;
	}
	@Override
	public String toString() {
		return "Departamento [id_Departamento=" + id_Departamento + ", dep_nombre=" + dep_nombre + ", dep_creado_por="
				+ dep_creado_por + ", dep_fecha_creacion=" + dep_fecha_creacion + ", dep_actualizado_por=" + dep_actualizado_por
				+ ", dep_fecha_actualizacion=" + dep_fecha_actualizacion + "]";
	}
    
    

}
