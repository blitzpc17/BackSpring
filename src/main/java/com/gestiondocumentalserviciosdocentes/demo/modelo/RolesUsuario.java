package com.gestiondocumentalserviciosdocentes.demo.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="rolesusuario")
public class RolesUsuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_rol_usuario;
	
	private int id_usuarios;
	private boolean rol_desarrollo_academico_departamental;
	private boolean rol_docente;
	private boolean rol_jefe_departamento;
	private boolean rol_jefe_desarrollo_academico;
	private boolean rol_jefe_laboratorio;
	private boolean rol_jefe_oficina_servicio_externos_vinculacion;
	private boolean rol_jefe_oficina_servicio_social_vinculacion;
	private boolean rol_jefe_vinculacion;
	private boolean rol_secretaria_departamento;
	private boolean rol_secretaria_vinculacion;
	private boolean rol_jefe_proyectos_docencia;
	private boolean rol_auxiliar_laboratorio;
	private boolean rol_coordinador_vinculacion;
	
	public RolesUsuario() {
		super();
		// TODO Auto-generated constructor stub
	}


	public RolesUsuario(int id_rol_usuario, int id_usuario, boolean rol_desarrollo_academico_departamental,
			boolean rol_docente, boolean rol_jefe_departamento, boolean rol_jefe_desarrollo_academico,
			boolean rol_jefe_laboratorio, boolean rol_jefe_oficina_servicio_externos_vinculacion,
			boolean rol_jefe_oficina_servicio_social_vinculacion, boolean rol_jefe_vinculacion,
			boolean rol_secretaria_departamento, boolean rol_secretaria_vinculacion) {
		super();
		this.id_rol_usuario = id_rol_usuario;
		this.id_usuarios = id_usuario;
		this.rol_desarrollo_academico_departamental = rol_desarrollo_academico_departamental;
		this.rol_docente = rol_docente;
		this.rol_jefe_departamento = rol_jefe_departamento;
		this.rol_jefe_desarrollo_academico = rol_jefe_desarrollo_academico;
		this.rol_jefe_laboratorio = rol_jefe_laboratorio;
		this.rol_jefe_oficina_servicio_externos_vinculacion = rol_jefe_oficina_servicio_externos_vinculacion;
		this.rol_jefe_oficina_servicio_social_vinculacion = rol_jefe_oficina_servicio_social_vinculacion;
		this.rol_jefe_vinculacion = rol_jefe_vinculacion;
		this.rol_secretaria_departamento = rol_secretaria_departamento;
		this.rol_secretaria_vinculacion = rol_secretaria_vinculacion;
	}


	public int getId_rol_usuario() {
		return id_rol_usuario;
	}


	public void setId_rol_usuario(int id_rol_usuario) {
		this.id_rol_usuario = id_rol_usuario;
	}


	public int getId_usuarios() {
		return id_usuarios;
	}


	public void setId_usuarios(int id_usuario) {
		this.id_usuarios = id_usuario;
	}


	public boolean isRol_desarrollo_academico_departamental() {
		return rol_desarrollo_academico_departamental;
	}


	public void setRol_desarrollo_academico_departamental(boolean rol_desarrollo_academico_departamental) {
		this.rol_desarrollo_academico_departamental = rol_desarrollo_academico_departamental;
	}


	public boolean isRol_docente() {
		return rol_docente;
	}


	public void setRol_docente(boolean rol_docente) {
		this.rol_docente = rol_docente;
	}


	public boolean isRol_jefe_departamento() {
		return rol_jefe_departamento;
	}


	public void setRol_jefe_departamento(boolean rol_jefe_departamento) {
		this.rol_jefe_departamento = rol_jefe_departamento;
	}


	public boolean isRol_jefe_desarrollo_academico() {
		return rol_jefe_desarrollo_academico;
	}


	public boolean isRol_coordinador_vinculacion() {
		return rol_coordinador_vinculacion;
	}


	public void setRol_coordinador_vinculacion(boolean rol_coordinador_vinculacion) {
		this.rol_coordinador_vinculacion = rol_coordinador_vinculacion;
	}


	public void setRol_jefe_desarrollo_academico(boolean rol_jefe_desarrollo_academico) {
		this.rol_jefe_desarrollo_academico = rol_jefe_desarrollo_academico;
	}


	public boolean isRol_jefe_laboratorio() {
		return rol_jefe_laboratorio;
	}


	public void setRol_jefe_laboratorio(boolean rol_jefe_laboratorio) {
		this.rol_jefe_laboratorio = rol_jefe_laboratorio;
	}


	public boolean isRol_jefe_oficina_servicio_externos_vinculacion() {
		return rol_jefe_oficina_servicio_externos_vinculacion;
	}


	public void setRol_jefe_oficina_servicio_externos_vinculacion(boolean rol_jefe_oficina_servicio_externos_vinculacion) {
		this.rol_jefe_oficina_servicio_externos_vinculacion = rol_jefe_oficina_servicio_externos_vinculacion;
	}


	public boolean isRol_jefe_oficina_servicio_social_vinculacion() {
		return rol_jefe_oficina_servicio_social_vinculacion;
	}


	public void setRol_jefe_oficina_servicio_social_vinculacion(boolean rol_jefe_oficina_servicio_social_vinculacion) {
		this.rol_jefe_oficina_servicio_social_vinculacion = rol_jefe_oficina_servicio_social_vinculacion;
	}


	public boolean isRol_jefe_vinculacion() {
		return rol_jefe_vinculacion;
	}


	public void setRol_jefe_vinculacion(boolean rol_jefe_vinculacion) {
		this.rol_jefe_vinculacion = rol_jefe_vinculacion;
	}


	public boolean isRol_secretaria_departamento() {
		return rol_secretaria_departamento;
	}


	public void setRol_secretaria_departamento(boolean rol_secretaria_departamento) {
		this.rol_secretaria_departamento = rol_secretaria_departamento;
	}


	public boolean isRol_secretaria_vinculacion() {
		return rol_secretaria_vinculacion;
	}


	public void setRol_secretaria_vinculacion(boolean rol_secretaria_vinculacion) {
		this.rol_secretaria_vinculacion = rol_secretaria_vinculacion;
	}


	public boolean isRol_jefe_proyectos_docencia() {
		return rol_jefe_proyectos_docencia;
	}


	public void setRol_jefe_proyectos_docencia(boolean rol_jefe_proyectos_docencia) {
		this.rol_jefe_proyectos_docencia = rol_jefe_proyectos_docencia;
	}


	public boolean isRol_auxiliar_laboratorio() {
		return rol_auxiliar_laboratorio;
	}


	public void setRol_auxiliar_laboratorio(boolean rol_auxiliar_laboratorio) {
		this.rol_auxiliar_laboratorio = rol_auxiliar_laboratorio;
	}


	@Override
	public String toString() {
		return "RolesUsuario [id_rol_usuario=" + id_rol_usuario + ", id_usuario=" + id_usuarios
				+ ", rol_desarrollo_academico_departamental=" + rol_desarrollo_academico_departamental
				+ ", rol_docente=" + rol_docente + ", rol_jefe_departamento=" + rol_jefe_departamento
				+ ", rol_jefe_desarrollo_academico=" + rol_jefe_desarrollo_academico + ", rol_jefe_laboratorio="
				+ rol_jefe_laboratorio + ", rol_jefe_oficina_servicio_externos_vinculacion="
				+ rol_jefe_oficina_servicio_externos_vinculacion + ", rol_jefe_oficina_servicio_social_vinculacion="
				+ rol_jefe_oficina_servicio_social_vinculacion + ", rol_jefe_vinculacion=" + rol_jefe_vinculacion
				+ ", rol_secretaria_departamento=" + rol_secretaria_departamento + ", rol_secretaria_vinculacion="
				+ rol_secretaria_vinculacion + "]";
	}


	

}
