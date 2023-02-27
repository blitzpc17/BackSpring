package com.gestiondocumentalserviciosdocentes.demo.modelo;

public class ConsultaVisitas {
	
	private String user_Nombre;
	private int id_Usuarios;
 	private int visitasp;
 	private int visitasv;
 	
	public ConsultaVisitas() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ConsultaVisitas(String user_Nombre, int id_Usuarios, int visitasp, int visitasv) {
		super();
		this.user_Nombre = user_Nombre;
		this.id_Usuarios = id_Usuarios;
		this.visitasp = visitasp;
		this.visitasv = visitasv;
	}

	public String getUser_Nombre() {
		return user_Nombre;
	}

	public void setUser_Nombre(String user_Nombre) {
		this.user_Nombre = user_Nombre;
	}

	public int getId_Usuarios() {
		return id_Usuarios;
	}

	public void setId_Usuarios(int id_Usuarios) {
		this.id_Usuarios = id_Usuarios;
	}

	public int getVisitasp() {
		return visitasp;
	}

	public void setVisitasp(int visitasp) {
		this.visitasp = visitasp;
	}

	public int getVisitasv() {
		return visitasv;
	}

	public void setVisitasv(int visitasv) {
		this.visitasv = visitasv;
	}

	@Override
	public String toString() {
		return "ConsultaVisitas [user_Nombre=" + user_Nombre + ", id_Usuarios=" + id_Usuarios + ", visitasp=" + visitasp
				+ ", visitasv=" + visitasv + "]";
	}
 	
 	

}
