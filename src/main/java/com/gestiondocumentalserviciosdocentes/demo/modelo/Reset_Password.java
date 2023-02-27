package com.gestiondocumentalserviciosdocentes.demo.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "reset_password")
public class Reset_Password {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_reset;
	
	private String user_Correo;
	private String fecha_reset;
	private int id_usuario;
	
	public Reset_Password() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Reset_Password(int id_reset, String user_Correo, String fecha_reset) {
		super();
		this.id_reset = id_reset;
		this.user_Correo = user_Correo;
		this.fecha_reset = fecha_reset;
	}

	@Override
	public String toString() {
		return "Reset_Password [id_reset=" + id_reset + ", user_Correo=" + user_Correo + ", fecha_reset=" + fecha_reset
				+ "]";
	}

	public int getId_reset() {
		return id_reset;
	}

	public void setId_reset(int id_reset) {
		this.id_reset = id_reset;
	}

	public String getUser_Correo() {
		return user_Correo;
	}

	public void setUser_Correo(String user_Correo) {
		this.user_Correo = user_Correo;
	}

	public String getFecha_reset() {
		return fecha_reset;
	}

	public void setFecha_reset(String fecha_reset) {
		this.fecha_reset = fecha_reset;
	}

	public int getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}
	
}
