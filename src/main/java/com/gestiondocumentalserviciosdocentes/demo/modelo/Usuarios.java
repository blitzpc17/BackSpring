package com.gestiondocumentalserviciosdocentes.demo.modelo;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuarios")
public class Usuarios {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_Usuarios;
	
	private int id_Departamento;
	private String user_Nombre;
	private String user_Correo;
	private String user_Password;
	private String user_creado_por;
	private Date user_fecha_creacion;
	private String user_actualizado_por;
	private Date user_fecha_actualizacion;
	private int user_tipo_maestro = 6;
	private int user_horas = 0;
	
	
	public Usuarios() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Usuarios(int id_Usuarios, int id_Departamento, String user_Nombre, String user_Correo, String user_Password,
			String user_creado_por, Date user_fecha_creacion, String user_actualizado_por,
			Date user_fecha_actualizacion) {
		super();
		this.id_Usuarios = id_Usuarios;
		this.id_Departamento = id_Departamento;
		this.user_Nombre = user_Nombre;
		this.user_Correo = user_Correo;
		this.user_Password = user_Password;
		this.user_creado_por = user_creado_por;
		this.user_fecha_creacion = user_fecha_creacion;
		this.user_actualizado_por = user_actualizado_por;
		this.user_fecha_actualizacion = user_fecha_actualizacion;
	}


	@Override
	public String toString() {
		return "Usuarios [id_Usuarios=" + id_Usuarios + ", id_Departamento=" + id_Departamento + ", user_Nombre="
				+ user_Nombre + ", user_Correo=" + user_Correo + ", user_Password=" + user_Password
				+ ", user_creado_por=" + user_creado_por + ", user_fecha_creacion=" + user_fecha_creacion
				+ ", user_actualizado_por=" + user_actualizado_por + ", user_fecha_actualizacion="
				+ user_fecha_actualizacion + "]";
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


	public String getUser_Nombre() {
		return user_Nombre;
	}


	public void setUser_Nombre(String user_Nombre) {
		this.user_Nombre = user_Nombre;
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


	public String getUser_creado_por() {
		return user_creado_por;
	}


	public void setUser_creado_por(String user_creado_por) {
		this.user_creado_por = user_creado_por;
	}


	public Date getUser_fecha_creacion() {
		return user_fecha_creacion;
	}


	public void setUser_fecha_creacion(Date user_fecha_creacion) {
		this.user_fecha_creacion = user_fecha_creacion;
	}


	public String getUser_actualizado_por() {
		return user_actualizado_por;
	}


	public void setUser_actualizado_por(String user_actualizado_por) {
		this.user_actualizado_por = user_actualizado_por;
	}


	public Date getUser_fecha_actualizacion() {
		return user_fecha_actualizacion;
	}


	public void setUser_fecha_actualizacion(Date user_fecha_actualizacion) {
		this.user_fecha_actualizacion = user_fecha_actualizacion;
	}


	public int getUser_tipo_maestro() {
		return user_tipo_maestro;
	}


	public void setUser_tipo_maestro(int user_tipo_maestro) {
		this.user_tipo_maestro = user_tipo_maestro;
	}


	public int getUser_horas() {
		return user_horas;
	}


	public void setUser_horas(int user_horas) {
		this.user_horas = user_horas;
	}
	
}
