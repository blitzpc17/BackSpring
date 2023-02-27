package com.gestiondocumentalserviciosdocentes.demo.modelo;

public class ConsultaAsesores {
	
	private int id_Periodo;
	private int id_Usuarios;
	private String user_Nombre;
	private int asesorados;
	
	public ConsultaAsesores() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ConsultaAsesores(int id_Periodo, int id_Usuarios, String user_Nombre, int asesorados) {
		super();
		this.id_Periodo = id_Periodo;
		this.id_Usuarios = id_Usuarios;
		this.user_Nombre = user_Nombre;
		this.asesorados = asesorados;
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

	public String getUser_Nombre() {
		return user_Nombre;
	}

	public void setUser_Nombre(String user_Nombre) {
		this.user_Nombre = user_Nombre;
	}

	public int getAsesorados() {
		return asesorados;
	}

	public void setAsesorados(int asesorados) {
		this.asesorados = asesorados;
	}

	@Override
	public String toString() {
		return "ConsultaAsesores [id_Periodo=" + id_Periodo + ", id_Usuarios=" + id_Usuarios + ", user_Nombre="
				+ user_Nombre + ", asesorados=" + asesorados + "]";
	}
	
	

}
