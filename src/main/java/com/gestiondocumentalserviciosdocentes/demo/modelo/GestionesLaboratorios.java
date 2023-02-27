package com.gestiondocumentalserviciosdocentes.demo.modelo;

public class GestionesLaboratorios {
	
	private int  id_gestionlaboratorio;
	
	private int id_periodo;
	
	private int id_laboratorio;
	
	private int id_usuarios;
	
	private String lab_nombre;
	
	private String user_nombre;
	
	private String lab_clave;
	
	private String lab_capacidad;
	
	private String lab_horario;
	
	private String geslab_inventarioinicial;
	
	private String geslab_inventariofinal;
	
	private int  geslab_inventarioinicialestado;
	
	private String  geslab_inventarioinicialcomentario;
	
	private int  geslab_inventariofinalestado;
	
	private String  geslab_inventariofinalcomentario;

	public GestionesLaboratorios() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GestionesLaboratorios(int id_gestionlaboratorio, int id_periodo, int id_laboratorio, int id_usuarios,
			String lab_nombre, String user_nombre, String lab_clave, String lab_capacidad, String lab_horario,
			String geslab_inventarioinicial, String geslab_inventariofinal, int geslab_inventarioinicialestado,
			String geslab_inventarioinicialcomentario, int geslab_inventariofinalestado,
			String geslab_inventariofinalcomentario) {
		super();
		this.id_gestionlaboratorio = id_gestionlaboratorio;
		this.id_periodo = id_periodo;
		this.id_laboratorio = id_laboratorio;
		this.id_usuarios = id_usuarios;
		this.lab_nombre = lab_nombre;
		this.user_nombre = user_nombre;
		this.lab_clave = lab_clave;
		this.lab_capacidad = lab_capacidad;
		this.lab_horario = lab_horario;
		this.geslab_inventarioinicial = geslab_inventarioinicial;
		this.geslab_inventariofinal = geslab_inventariofinal;
		this.geslab_inventarioinicialestado = geslab_inventarioinicialestado;
		this.geslab_inventarioinicialcomentario = geslab_inventarioinicialcomentario;
		this.geslab_inventariofinalestado = geslab_inventariofinalestado;
		this.geslab_inventariofinalcomentario = geslab_inventariofinalcomentario;
	}

	public int getId_gestionlaboratorio() {
		return id_gestionlaboratorio;
	}

	public void setId_gestionlaboratorio(int id_gestionlaboratorio) {
		this.id_gestionlaboratorio = id_gestionlaboratorio;
	}

	public int getId_periodo() {
		return id_periodo;
	}

	public void setId_periodo(int id_periodo) {
		this.id_periodo = id_periodo;
	}

	public int getId_laboratorio() {
		return id_laboratorio;
	}

	public void setId_laboratorio(int id_laboratorio) {
		this.id_laboratorio = id_laboratorio;
	}

	public int getId_usuarios() {
		return id_usuarios;
	}

	public void setId_usuarios(int id_usuarios) {
		this.id_usuarios = id_usuarios;
	}

	public String getLab_nombre() {
		return lab_nombre;
	}

	public void setLab_nombre(String lab_nombre) {
		this.lab_nombre = lab_nombre;
	}

	public String getUser_nombre() {
		return user_nombre;
	}

	public void setUser_nombre(String user_nombre) {
		this.user_nombre = user_nombre;
	}

	public String getLab_clave() {
		return lab_clave;
	}

	public void setLab_clave(String lab_clave) {
		this.lab_clave = lab_clave;
	}

	public String getLab_capacidad() {
		return lab_capacidad;
	}

	public void setLab_capacidad(String lab_capacidad) {
		this.lab_capacidad = lab_capacidad;
	}

	public String getLab_horario() {
		return lab_horario;
	}

	public void setLab_horario(String lab_horario) {
		this.lab_horario = lab_horario;
	}

	public String getGeslab_inventarioinicial() {
		return geslab_inventarioinicial;
	}

	public void setGeslab_inventarioinicial(String geslab_inventarioinicial) {
		this.geslab_inventarioinicial = geslab_inventarioinicial;
	}

	public String getGeslab_inventariofinal() {
		return geslab_inventariofinal;
	}

	public void setGeslab_inventariofinal(String geslab_inventariofinal) {
		this.geslab_inventariofinal = geslab_inventariofinal;
	}

	public int getGeslab_inventarioinicialestado() {
		return geslab_inventarioinicialestado;
	}

	public void setGeslab_inventarioinicialestado(int geslab_inventarioinicialestado) {
		this.geslab_inventarioinicialestado = geslab_inventarioinicialestado;
	}

	public String getGeslab_inventarioinicialcomentario() {
		return geslab_inventarioinicialcomentario;
	}

	public void setGeslab_inventarioinicialcomentario(String geslab_inventarioinicialcomentario) {
		this.geslab_inventarioinicialcomentario = geslab_inventarioinicialcomentario;
	}

	public int getGeslab_inventariofinalestado() {
		return geslab_inventariofinalestado;
	}

	public void setGeslab_inventariofinalestado(int geslab_inventariofinalestado) {
		this.geslab_inventariofinalestado = geslab_inventariofinalestado;
	}

	public String getGeslab_inventariofinalcomentario() {
		return geslab_inventariofinalcomentario;
	}

	public void setGeslab_inventariofinalcomentario(String geslab_inventariofinalcomentario) {
		this.geslab_inventariofinalcomentario = geslab_inventariofinalcomentario;
	}

	@Override
	public String toString() {
		return "GestionesLaboratorios [id_gestionlaboratorio=" + id_gestionlaboratorio + ", id_periodo=" + id_periodo
				+ ", id_laboratorio=" + id_laboratorio + ", id_usuarios=" + id_usuarios + ", lab_nombre=" + lab_nombre
				+ ", user_nombre=" + user_nombre + ", lab_clave=" + lab_clave + ", lab_capacidad=" + lab_capacidad
				+ ", lab_horario=" + lab_horario + ", geslab_inventarioinicial=" + geslab_inventarioinicial
				+ ", geslab_inventariofinal=" + geslab_inventariofinal + ", geslab_inventarioinicialestado="
				+ geslab_inventarioinicialestado + ", geslab_inventarioinicialcomentario="
				+ geslab_inventarioinicialcomentario + ", geslab_inventariofinalestado=" + geslab_inventariofinalestado
				+ ", geslab_inventariofinalcomentario=" + geslab_inventariofinalcomentario + "]";
	}

	
}
