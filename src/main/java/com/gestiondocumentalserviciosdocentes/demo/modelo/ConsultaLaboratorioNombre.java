package com.gestiondocumentalserviciosdocentes.demo.modelo;

public class ConsultaLaboratorioNombre {

	private int id_laboratorio;
	
	private String lab_nombre;
	
	private String user_nombre;

	public ConsultaLaboratorioNombre() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ConsultaLaboratorioNombre(int id_laboratorio, String lab_nombre, String user_nombre) {
		super();
		this.id_laboratorio = id_laboratorio;
		this.lab_nombre = lab_nombre;
		this.user_nombre = user_nombre;
	}

	public int getId_laboratorio() {
		return id_laboratorio;
	}

	public void setId_laboratorio(int id_laboratorio) {
		this.id_laboratorio = id_laboratorio;
	}

	public String getLab_nombre() {
		return lab_nombre;
	}

	public void setLab_nombre(String lab_nombre) {
		this.lab_nombre = lab_nombre;
	}

	public String getUser_nombre() {
		return user_nombre;
	}

	public void setUser_nombre(String user_nombre) {
		this.user_nombre = user_nombre;
	}

	@Override
	public String toString() {
		return "ConsultaLaboratorioNombre [id_laboratorio=" + id_laboratorio + ", lab_nombre=" + lab_nombre
				+ ", user_nombre=" + user_nombre + "]";
	}
	
	
	
}
