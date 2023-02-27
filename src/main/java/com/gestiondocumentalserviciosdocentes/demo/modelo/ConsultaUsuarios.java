package com.gestiondocumentalserviciosdocentes.demo.modelo;

public class ConsultaUsuarios {
	
	private int id_Usuarios;
	
	private int id_Departamento;
	private String user_Nombre;
	private String user_Correo;
	private String user_Password;
	
	private int id_rol_usuario;
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
	
	private int user_tipo_maestro;
	private int user_horas;
	
	public ConsultaUsuarios() {
		super();
		// TODO Auto-generated constructor stub
	}


	public ConsultaUsuarios(int id_Usuarios, int id_Departamento, String user_Nombre, String user_Correo,
			String user_Password, int id_rol_usuario, boolean rol_desarrollo_academico_departamental,
			boolean rol_docente, boolean rol_jefe_departamento, boolean rol_jefe_desarrollo_academico,
			boolean rol_jefe_laboratorio, boolean rol_jefe_oficina_servicio_externos_vinculacion,
			boolean rol_jefe_oficina_servicio_social_vinculacion, boolean rol_jefe_vinculacion,
			boolean rol_secretaria_departamento, boolean rol_secretaria_vinculacion,
			boolean rol_jefe_proyectos_docencia, boolean rol_auxiliar_laboratorio,
			boolean rol_coordinador_vinculacion) {
		super();
		this.id_Usuarios = id_Usuarios;
		this.id_Departamento = id_Departamento;
		this.user_Nombre = user_Nombre;
		this.user_Correo = user_Correo;
		this.user_Password = user_Password;
		this.id_rol_usuario = id_rol_usuario;
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
		this.rol_jefe_proyectos_docencia = rol_jefe_proyectos_docencia;
		this.rol_auxiliar_laboratorio = rol_auxiliar_laboratorio;
		this.rol_coordinador_vinculacion = rol_coordinador_vinculacion;
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


	public int getId_rol_usuario() {
		return id_rol_usuario;
	}


	public void setId_rol_usuario(int id_rol_usuario) {
		this.id_rol_usuario = id_rol_usuario;
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


	public boolean isRol_coordinador_vinculacion() {
		return rol_coordinador_vinculacion;
	}


	public void setRol_coordinador_vinculacion(boolean rol_coordinador_vinculacion) {
		this.rol_coordinador_vinculacion = rol_coordinador_vinculacion;
	}


	@Override
	public String toString() {
		return "ConsultaUsuarios [id_Usuarios=" + id_Usuarios + ", id_Departamento=" + id_Departamento
				+ ", user_Nombre=" + user_Nombre + ", user_Correo=" + user_Correo + ", user_Password=" + user_Password
				+ ", id_rol_usuario=" + id_rol_usuario + ", rol_desarrollo_academico_departamental="
				+ rol_desarrollo_academico_departamental + ", rol_docente=" + rol_docente + ", rol_jefe_departamento="
				+ rol_jefe_departamento + ", rol_jefe_desarrollo_academico=" + rol_jefe_desarrollo_academico
				+ ", rol_jefe_laboratorio=" + rol_jefe_laboratorio + ", rol_jefe_oficina_servicio_externos_vinculacion="
				+ rol_jefe_oficina_servicio_externos_vinculacion + ", rol_jefe_oficina_servicio_social_vinculacion="
				+ rol_jefe_oficina_servicio_social_vinculacion + ", rol_jefe_vinculacion=" + rol_jefe_vinculacion
				+ ", rol_secretaria_departamento=" + rol_secretaria_departamento + ", rol_secretaria_vinculacion="
				+ rol_secretaria_vinculacion + ", rol_jefe_proyectos_docencia=" + rol_jefe_proyectos_docencia
				+ ", rol_auxiliar_laboratorio=" + rol_auxiliar_laboratorio + ", rol_coordinador_vinculacion="
				+ rol_coordinador_vinculacion + "]";
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
