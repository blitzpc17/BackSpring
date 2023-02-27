package com.gestiondocumentalserviciosdocentes.demo.modelo;

public class ConsultaLaboratorios {
	
	private int id_Laboratorio;
	private int id_Usuarios;
	private int id_Departamento;
	private String lab_Nombre;
	private String lab_Clave;
	private int lab_Capacidad;
	private String lab_Horario;
	private String user_Nombre;
	
	
	public ConsultaLaboratorios() {
		super();
		// TODO Auto-generated constructor stub
	}


	public ConsultaLaboratorios(int id_Laboratorio, int id_Usuarios, int id_Departamento, String lab_Nombre,
			String lab_Clave, int lab_Capacidad, String lab_Horario, String user_Nombre) {
		super();
		this.id_Laboratorio = id_Laboratorio;
		this.id_Usuarios = id_Usuarios;
		this.id_Departamento = id_Departamento;
		this.lab_Nombre = lab_Nombre;
		this.lab_Clave = lab_Clave;
		this.lab_Capacidad = lab_Capacidad;
		this.lab_Horario = lab_Horario;
		this.user_Nombre = user_Nombre;
	}


	public int getId_Laboratorio() {
		return id_Laboratorio;
	}


	public void setId_Laboratorio(int id_Laboratorio) {
		this.id_Laboratorio = id_Laboratorio;
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


	public String getLab_Nombre() {
		return lab_Nombre;
	}


	public void setLab_Nombre(String lab_Nombre) {
		this.lab_Nombre = lab_Nombre;
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


	public String getUser_Nombre() {
		return user_Nombre;
	}


	public void setUser_Nombre(String user_Nombre) {
		this.user_Nombre = user_Nombre;
	}


	@Override
	public String toString() {
		return "ConsultaLaboratorios [id_Laboratorio=" + id_Laboratorio + ", id_Usuarios=" + id_Usuarios
				+ ", id_Departamento=" + id_Departamento + ", lab_Nombre=" + lab_Nombre + ", lab_Clave=" + lab_Clave
				+ ", lab_Capacidad=" + lab_Capacidad + ", lab_Horario=" + lab_Horario + ", user_Nombre=" + user_Nombre
				+ "]";
	}


	
	

}
