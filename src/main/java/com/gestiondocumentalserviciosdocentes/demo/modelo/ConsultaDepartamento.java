package com.gestiondocumentalserviciosdocentes.demo.modelo;

import java.util.List;

public class ConsultaDepartamento {
	
	private String dep_nombre;
	private String user_nombre;
	private int id_Usuarios;
	private int id_rol_usuario;
	private boolean rol_jefe_departamento;
	private int id_Departamento;
	private String user_Correo;
	private String user_Password;
	
	private List<Usuarios> usuarios;
	
	public ConsultaDepartamento() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ConsultaDepartamento(String dep_nombre, String user_nombre, int id_Usuarios, int id_rol_usuario,
			boolean rol_jefe_departamento, int id_Departamento, String user_Correo, String user_Password,
			List<Usuarios> usuarios) {
		super();
		this.dep_nombre = dep_nombre;
		this.user_nombre = user_nombre;
		this.id_Usuarios = id_Usuarios;
		this.id_rol_usuario = id_rol_usuario;
		this.rol_jefe_departamento = rol_jefe_departamento;
		this.id_Departamento = id_Departamento;
		this.user_Correo = user_Correo;
		this.user_Password = user_Password;
		this.usuarios = usuarios;
	}

	public String getDep_nombre() {
		return dep_nombre;
	}

	public void setDep_nombre(String dep_nombre) {
		this.dep_nombre = dep_nombre;
	}

	public String getUser_nombre() {
		return user_nombre;
	}

	public void setUser_nombre(String user_nombre) {
		this.user_nombre = user_nombre;
	}

	public int getId_Usuarios() {
		return id_Usuarios;
	}

	public void setId_Usuarios(int id_Usuarios) {
		this.id_Usuarios = id_Usuarios;
	}

	public int getId_rol_usuario() {
		return id_rol_usuario;
	}

	public void setId_rol_usuario(int id_rol_usuario) {
		this.id_rol_usuario = id_rol_usuario;
	}

	public boolean isRol_jefe_departamento() {
		return rol_jefe_departamento;
	}

	public void setRol_jefe_departamento(boolean rol_jefe_departamento) {
		this.rol_jefe_departamento = rol_jefe_departamento;
	}

	public int getId_Departamento() {
		return id_Departamento;
	}

	public void setId_Departamento(int id_Departamento) {
		this.id_Departamento = id_Departamento;
	}

	public String getUser_Correo() {
		return user_Correo;
	}

	public void setUser_Correo(String user_Correo) {
		this.user_Correo = user_Correo;
	}

	public String getUser_Password() {
		return user_Password;
	}

	public void setUser_Password(String user_Password) {
		this.user_Password = user_Password;
	}

	public List<Usuarios> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuarios> usuarios) {
		this.usuarios = usuarios;
	}

	@Override
	public String toString() {
		return "ConsultaDepartamento [dep_nombre=" + dep_nombre + ", user_nombre=" + user_nombre + ", id_Usuarios="
				+ id_Usuarios + ", id_rol_usuario=" + id_rol_usuario + ", rol_jefe_departamento="
				+ rol_jefe_departamento + ", id_Departamento=" + id_Departamento + ", user_Correo=" + user_Correo
				+ ", user_Password=" + user_Password + ", usuarios=" + usuarios + "]";
	}
	
	
}
