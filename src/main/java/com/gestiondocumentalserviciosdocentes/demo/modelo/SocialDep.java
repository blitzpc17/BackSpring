package com.gestiondocumentalserviciosdocentes.demo.modelo;

public class SocialDep {
	
	private int id_Servicio;
	private int id_Periodo;
	private int id_Usuarios;
	private int id_Departamento;
	private String serv_no_control;
	private String serv_nombre_alumno;
	private String serv_carrera;
	public SocialDep() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SocialDep(int id_Servicio, int id_Periodo, int id_Usuarios, int id_Departamento, String serv_no_control,
			String serv_nombre_alumno, String serv_carrera) {
		super();
		this.id_Servicio = id_Servicio;
		this.id_Periodo = id_Periodo;
		this.id_Usuarios = id_Usuarios;
		this.id_Departamento = id_Departamento;
		this.serv_no_control = serv_no_control;
		this.serv_nombre_alumno = serv_nombre_alumno;
		this.serv_carrera = serv_carrera;
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
	public String getServ_no_control() {
		return serv_no_control;
	}
	public void setServ_no_control(String serv_no_control) {
		this.serv_no_control = serv_no_control;
	}
	public String getServ_nombre_alumno() {
		return serv_nombre_alumno;
	}
	public void setServ_nombre_alumno(String serv_nombre_alumno) {
		this.serv_nombre_alumno = serv_nombre_alumno;
	}
	public String getServ_carrera() {
		return serv_carrera;
	}
	public void setServ_carrera(String serv_carrera) {
		this.serv_carrera = serv_carrera;
	}
	@Override
	public String toString() {
		return "SocialDep [id_Servicio=" + id_Servicio + ", id_Periodo=" + id_Periodo + ", id_Usuarios=" + id_Usuarios
				+ ", id_Departamento=" + id_Departamento + ", serv_no_control=" + serv_no_control
				+ ", serv_nombre_alumno=" + serv_nombre_alumno + ", serv_carrera=" + serv_carrera + "]";
	}
	
	

}
