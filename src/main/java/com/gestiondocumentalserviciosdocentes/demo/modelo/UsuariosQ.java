package com.gestiondocumentalserviciosdocentes.demo.modelo;

public class UsuariosQ {
	
	private int id_Usuarios;
	private int id_Departamento;
	private String user_nombre;
	private String user_correo;
	private String user_password;
	public UsuariosQ() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UsuariosQ(int id_Usuarios, int id_Departamento, String user_nombre, String user_correo,
			String user_password) {
		super();
		this.id_Usuarios = id_Usuarios;
		this.id_Departamento = id_Departamento;
		this.user_nombre = user_nombre;
		this.user_correo = user_correo;
		this.user_password = user_password;
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
	public String getUser_nombre() {
		return user_nombre;
	}
	public void setUser_nombre(String user_nombre) {
		this.user_nombre = user_nombre;
	}
	public String getUser_correo() {
		return user_correo;
	}
	public void setUser_correo(String user_correo) {
		this.user_correo = user_correo;
	}
	public String getUser_password() {
		return user_password;
	}
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	@Override
	public String toString() {
		return "UsuariosQ [id_Usuarios=" + id_Usuarios + ", id_Departamento=" + id_Departamento + ", user_nombre="
				+ user_nombre + ", user_correo=" + user_correo + ", user_password=" + user_password + "]";
	}
	
	


}
