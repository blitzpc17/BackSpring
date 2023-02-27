package com.gestiondocumentalserviciosdocentes.demo.modelo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="visitas")
public class Visitas {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int	id_Visita; 
	private int	id_Periodo; 
	private int	id_Departamento; 
	private int	id_Usuarios; 
	private int	id_Carrera; 
	private String vst_nombre_empresa; 
	private String 	vst_tipo_visita; 
	private String	vst_creado_por; 
	private Date vst_fecha_creacion; 
	private String	vst_actualizado_por; 
	private Date vst_fecha_actualizacion;
	public Visitas() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Visitas(int id_Visita, int id_Periodo, int id_Departamento, int id_Usuarios, int id_Carrera,
			String vst_nombre_empresa, String vst_tipo_visita, String vst_creado_por, Date vst_fecha_creacion,
			String vst_actualizado_por, Date vst_fecha_actualizacion) {
		super();
		this.id_Visita = id_Visita;
		this.id_Periodo = id_Periodo;
		this.id_Departamento = id_Departamento;
		this.id_Usuarios = id_Usuarios;
		this.id_Carrera = id_Carrera;
		this.vst_nombre_empresa = vst_nombre_empresa;
		this.vst_tipo_visita = vst_tipo_visita;
		this.vst_creado_por = vst_creado_por;
		this.vst_fecha_creacion = vst_fecha_creacion;
		this.vst_actualizado_por = vst_actualizado_por;
		this.vst_fecha_actualizacion = vst_fecha_actualizacion;
	}
	public int getId_Visita() {
		return id_Visita;
	}
	public void setId_Visita(int id_Visita) {
		this.id_Visita = id_Visita;
	}
	public int getId_Periodo() {
		return id_Periodo;
	}
	public void setId_Periodo(int id_Periodo) {
		this.id_Periodo = id_Periodo;
	}
	public int getId_Departamento() {
		return id_Departamento;
	}
	public void setId_Departamento(int id_Departamento) {
		this.id_Departamento = id_Departamento;
	}
	public int getId_Usuarios() {
		return id_Usuarios;
	}
	public void setId_Usuarios(int id_Usuarios) {
		this.id_Usuarios = id_Usuarios;
	}
	public int getId_Carrera() {
		return id_Carrera;
	}
	public void setId_Carrera(int id_Carrera) {
		this.id_Carrera = id_Carrera;
	}
	public String getVst_nombre_empresa() {
		return vst_nombre_empresa;
	}
	public void setVst_nombre_empresa(String vst_nombre_empresa) {
		this.vst_nombre_empresa = vst_nombre_empresa;
	}
	public String getVst_tipo_visita() {
		return vst_tipo_visita;
	}
	public void setVst_tipo_visita(String vst_tipo_visita) {
		this.vst_tipo_visita = vst_tipo_visita;
	}
	public String getVst_creado_por() {
		return vst_creado_por;
	}
	public void setVst_creado_por(String vst_creado_por) {
		this.vst_creado_por = vst_creado_por;
	}
	public Date getVst_fecha_creacion() {
		return vst_fecha_creacion;
	}
	public void setVst_fecha_creacion(Date vst_fecha_creacion) {
		this.vst_fecha_creacion = vst_fecha_creacion;
	}
	public String getVst_actualizado_por() {
		return vst_actualizado_por;
	}
	public void setVst_actualizado_por(String vst_actualizado_por) {
		this.vst_actualizado_por = vst_actualizado_por;
	}
	public Date getVst_fecha_actualizacion() {
		return vst_fecha_actualizacion;
	}
	public void setVst_fecha_actualizacion(Date vst_fecha_actualizacion) {
		this.vst_fecha_actualizacion = vst_fecha_actualizacion;
	}
	@Override
	public String toString() {
		return "Visitas [id_Visita=" + id_Visita + ", id_Periodo=" + id_Periodo + ", id_Departamento=" + id_Departamento
				+ ", id_Usuarios=" + id_Usuarios + ", id_Carrera=" + id_Carrera + ", vst_nombre_empresa="
				+ vst_nombre_empresa + ", vst_tipo_visita=" + vst_tipo_visita + ", vst_creado_por=" + vst_creado_por
				+ ", vst_fecha_creacion=" + vst_fecha_creacion + ", vst_actualizado_por=" + vst_actualizado_por
				+ ", vst_fecha_actualizacion=" + vst_fecha_actualizacion + "]";
	}
	
	
}
