package com.gestiondocumentalserviciosdocentes.demo.modelo;

public class ConsultaDocCatalogo {
	
	private String user_Nombre;
	private int id_Usuarios;
	
	
	public ConsultaDocCatalogo() {
		super();
		// TODO Auto-generated constructor stub
	}


	public ConsultaDocCatalogo(String user_Nombre, int id_Usuarios) {
		super();
		this.user_Nombre = user_Nombre;
		this.id_Usuarios = id_Usuarios;
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


	@Override
	public String toString() {
		return "ConsultaDocCatalogo [user_Nombre=" + user_Nombre + ", id_Usuarios=" + id_Usuarios + "]";
	}
	
	


}
