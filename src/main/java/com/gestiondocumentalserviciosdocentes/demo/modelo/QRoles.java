package com.gestiondocumentalserviciosdocentes.demo.modelo;

public class QRoles {
	
	private String rol_nombre; 
	private int id_usuario; 
	private String  rol_user_nombre; 
	private int id_rol_usuario;
	private String nombre_rol;
	public QRoles() {
		super();
		// TODO Auto-generated constructor stub
	}
	public QRoles(String rol_nombre, int id_usuario, String rol_user_nombre, int id_rol_usuario, String nombre_rol) {
		super();
		this.rol_nombre = rol_nombre;
		this.id_usuario = id_usuario;
		this.rol_user_nombre = rol_user_nombre;
		this.id_rol_usuario = id_rol_usuario;
		this.nombre_rol = nombre_rol;
	}
	public String getRol_nombre() {
		return rol_nombre;
	}
	public void setRol_nombre(String rol_nombre) {
		this.rol_nombre = rol_nombre;
	}
	public int getId_usuario() {
		return id_usuario;
	}
	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}
	public String getRol_user_nombre() {
		return rol_user_nombre;
	}
	public void setRol_user_nombre(String rol_user_nombre) {
		this.rol_user_nombre = rol_user_nombre;
	}
	public int getId_rol_usuario() {
		return id_rol_usuario;
	}
	public void setId_rol_usuario(int id_rol_usuario) {
		this.id_rol_usuario = id_rol_usuario;
	}
	public String getNombre_rol() {
		return nombre_rol;
	}
	public void setNombre_rol(String nombre_rol) {
		this.nombre_rol = nombre_rol;
	}
	@Override
	public String toString() {
		return "QRoles [rol_nombre=" + rol_nombre + ", id_usuario=" + id_usuario + ", rol_user_nombre="
				+ rol_user_nombre + ", id_rol_usuario=" + id_rol_usuario + ", nombre_rol=" + nombre_rol + "]";
	}
	
	
}
