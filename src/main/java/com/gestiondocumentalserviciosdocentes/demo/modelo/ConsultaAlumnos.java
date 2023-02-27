package com.gestiondocumentalserviciosdocentes.demo.modelo;

public class ConsultaAlumnos {
	
	private int id_Servicio;
	private String serv_nombre_Alumno;
	private String serv_no_Control;
	private String serv_Carrera;
	
	public ConsultaAlumnos() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ConsultaAlumnos(int id_Servicio, String serv_nombre_Alumno, String serv_no_Control, String serv_Carrera) {
		super();
		this.id_Servicio = id_Servicio;
		this.serv_nombre_Alumno = serv_nombre_Alumno;
		this.serv_no_Control = serv_no_Control;
		this.serv_Carrera = serv_Carrera;
	}

	public int getId_Servicio() {
		return id_Servicio;
	}

	public void setId_Servicio(int id_Servicio) {
		this.id_Servicio = id_Servicio;
	}

	public String getServ_nombre_Alumno() {
		return serv_nombre_Alumno;
	}

	public void setServ_nombre_Alumno(String serv_nombre_Alumno) {
		this.serv_nombre_Alumno = serv_nombre_Alumno;
	}

	public String getServ_no_Control() {
		return serv_no_Control;
	}

	public void setServ_no_Control(String serv_no_Control) {
		this.serv_no_Control = serv_no_Control;
	}

	public String getServ_Carrera() {
		return serv_Carrera;
	}

	public void setServ_Carrera(String serv_Carrera) {
		this.serv_Carrera = serv_Carrera;
	}

	@Override
	public String toString() {
		return "ConsultaAlumnos [id_Servicio=" + id_Servicio + ", serv_nombre_Alumno=" + serv_nombre_Alumno
				+ ", serv_no_Control=" + serv_no_Control + ", serv_Carrera=" + serv_Carrera + "]";
	}
	
	

}
