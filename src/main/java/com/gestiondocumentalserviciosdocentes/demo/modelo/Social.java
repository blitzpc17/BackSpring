package com.gestiondocumentalserviciosdocentes.demo.modelo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="servicio")
public class Social {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_Servicio;
    private int id_Periodo;
	private int id_Usuarios;
	private int id_Departamento;
	private String serv_no_Control;
	private String serv_nombre_Alumno;
	private String serv_Carrera;
	private String serv_creado_por;
	private Date serv_fecha_creacion;
	private String serv_actualizado_por;
	private Date serv_fecha_actualizacion;
	public Social() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Social(int id_Servicio, int id_Periodo, int id_Usuarios, int id_Departamento, String serv_no_Control,
			String serv_nombre_Alumno, String serv_Carrera, String serv_creado_por, Date serv_fecha_creacion,
			String serv_actualizado_por, Date serv_fecha_actualizacion) {
		super();
		this.id_Servicio = id_Servicio;
		this.id_Periodo = id_Periodo;
		this.id_Usuarios = id_Usuarios;
		this.id_Departamento = id_Departamento;
		this.serv_no_Control = serv_no_Control;
		this.serv_nombre_Alumno = serv_nombre_Alumno;
		this.serv_Carrera = serv_Carrera;
		this.serv_creado_por = serv_creado_por;
		this.serv_fecha_creacion = serv_fecha_creacion;
		this.serv_actualizado_por = serv_actualizado_por;
		this.serv_fecha_actualizacion = serv_fecha_actualizacion;
	}
	public int getId_Servicio() {
		return id_Servicio;
	}
	public void setId_Servicio(int id_Servicio) {
		this.id_Servicio = id_Servicio;
	}
	public int getId_Periodo() {
		return id_Periodo;
	}
	public void setId_Periodo(int id_Periodo) {
		this.id_Periodo = id_Periodo;
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
	public String getServ_no_Control() {
		return serv_no_Control;
	}
	public void setServ_no_Control(String serv_no_Control) {
		this.serv_no_Control = serv_no_Control;
	}
	public String getServ_nombre_Alumno() {
		return serv_nombre_Alumno;
	}
	public void setServ_nombre_Alumno(String serv_nombre_Alumno) {
		this.serv_nombre_Alumno = serv_nombre_Alumno;
	}
	public String getServ_Carrera() {
		return serv_Carrera;
	}
	public void setServ_Carrera(String serv_Carrera) {
		this.serv_Carrera = serv_Carrera;
	}
	public String getServ_creado_por() {
		return serv_creado_por;
	}
	public void setServ_creado_por(String serv_creado_por) {
		this.serv_creado_por = serv_creado_por;
	}
	public Date getServ_fecha_creacion() {
		return serv_fecha_creacion;
	}
	public void setServ_fecha_creacion(Date serv_fecha_creacion) {
		this.serv_fecha_creacion = serv_fecha_creacion;
	}
	public String getServ_actualizado_por() {
		return serv_actualizado_por;
	}
	public void setServ_actualizado_por(String serv_actualizado_por) {
		this.serv_actualizado_por = serv_actualizado_por;
	}
	public Date getServ_fecha_actualizacion() {
		return serv_fecha_actualizacion;
	}
	public void setServ_fecha_actualizacion(Date serv_fecha_actualizacion) {
		this.serv_fecha_actualizacion = serv_fecha_actualizacion;
	}
	@Override
	public String toString() {
		return "Social [id_Servicio=" + id_Servicio + ", id_Periodo=" + id_Periodo + ", id_Usuarios=" + id_Usuarios
				+ ", id_Departamento=" + id_Departamento + ", serv_no_Control=" + serv_no_Control
				+ ", serv_nombre_Alumno=" + serv_nombre_Alumno + ", serv_Carrera=" + serv_Carrera + ", serv_creado_por="
				+ serv_creado_por + ", serv_fecha_creacion=" + serv_fecha_creacion + ", serv_actualizado_por="
				+ serv_actualizado_por + ", serv_fecha_actualizacion=" + serv_fecha_actualizacion + "]";
	}
	
	
}
