package com.gestiondocumentalserviciosdocentes.demo.modelo;

public class GestionAuxiliar {
	
	private int id_gestionlaboratorio;
	private int id_periodo;
	private int id_laboratorio;
	private String lab_nombre;
	private String user_nombre;
	private String geslab_inventarioinicial;
	private int geslab_inventarioinicialestado;
	private String geslab_inventarioinicialcomentario;
	private String geslab_inventariofinal;
    private int geslab_inventariofinalestado;
    private String geslab_inventariofinalcomentario;
	public GestionAuxiliar() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GestionAuxiliar(int id_gestionlaboratorio, int id_periodo, int id_laboratorio, String lab_nombre,
			String user_nombre, String geslab_inventarioinicial, int geslab_inventarioinicialestado,
			String geslab_inventarioinicialcomentario, String geslab_inventariofinal, int geslab_inventariofinalestado,
			String geslab_inventariofinalcomentario) {
		super();
		this.id_gestionlaboratorio = id_gestionlaboratorio;
		this.id_periodo = id_periodo;
		this.id_laboratorio = id_laboratorio;
		this.lab_nombre = lab_nombre;
		this.user_nombre = user_nombre;
		this.geslab_inventarioinicial = geslab_inventarioinicial;
		this.geslab_inventarioinicialestado = geslab_inventarioinicialestado;
		this.geslab_inventarioinicialcomentario = geslab_inventarioinicialcomentario;
		this.geslab_inventariofinal = geslab_inventariofinal;
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
	public String getGeslab_inventarioinicial() {
		return geslab_inventarioinicial;
	}
	public void setGeslab_inventarioinicial(String geslab_inventarioinicial) {
		this.geslab_inventarioinicial = geslab_inventarioinicial;
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
	public String getGeslab_inventariofinal() {
		return geslab_inventariofinal;
	}
	public void setGeslab_inventariofinal(String geslab_inventariofinal) {
		this.geslab_inventariofinal = geslab_inventariofinal;
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
		return "GestionAuxiliar [id_gestionlaboratorio=" + id_gestionlaboratorio + ", id_periodo=" + id_periodo
				+ ", id_laboratorio=" + id_laboratorio + ", lab_nombre=" + lab_nombre + ", user_nombre=" + user_nombre
				+ ", geslab_inventarioinicial=" + geslab_inventarioinicial + ", geslab_inventarioinicialestado="
				+ geslab_inventarioinicialestado + ", geslab_inventarioinicialcomentario="
				+ geslab_inventarioinicialcomentario + ", geslab_inventariofinal=" + geslab_inventariofinal
				+ ", geslab_inventariofinalestado=" + geslab_inventariofinalestado
				+ ", geslab_inventariofinalcomentario=" + geslab_inventariofinalcomentario + "]";
	}
    
    
}
