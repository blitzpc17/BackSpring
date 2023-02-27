package com.gestiondocumentalserviciosdocentes.demo.modelo;

public class VisitasUs {
	
	private int id_visita;
	private int id_usuario;
	private String vst_carrera;
	private String vst_empresa;
	private String vst_tipo_visita;
	public VisitasUs() {
		super();
		// TODO Auto-generated constructor stub
	}
	public VisitasUs(int id_visita, int id_usuario, String vst_carrera, String vst_empresa, String vst_tipo_visita) {
		super();
		this.id_visita = id_visita;
		this.id_usuario = id_usuario;
		this.vst_carrera = vst_carrera;
		this.vst_empresa = vst_empresa;
		this.vst_tipo_visita = vst_tipo_visita;
	}
	public int getId_visita() {
		return id_visita;
	}
	public void setId_visita(int id_visita) {
		this.id_visita = id_visita;
	}
	public int getId_usuario() {
		return id_usuario;
	}
	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}
	public String getVst_carrera() {
		return vst_carrera;
	}
	public void setVst_carrera(String vst_carrera) {
		this.vst_carrera = vst_carrera;
	}
	public String getVst_empresa() {
		return vst_empresa;
	}
	public void setVst_empresa(String vst_empresa) {
		this.vst_empresa = vst_empresa;
	}
	public String getVst_tipo_visita() {
		return vst_tipo_visita;
	}
	public void setVst_tipo_visita(String vst_tipo_visita) {
		this.vst_tipo_visita = vst_tipo_visita;
	}
	@Override
	public String toString() {
		return "VisitasUs [id_visita=" + id_visita + ", id_usuario=" + id_usuario + ", vst_carrera=" + vst_carrera
				+ ", vst_empresa=" + vst_empresa + ", vst_tipo_visita=" + vst_tipo_visita + "]";
	}
	
	

}
