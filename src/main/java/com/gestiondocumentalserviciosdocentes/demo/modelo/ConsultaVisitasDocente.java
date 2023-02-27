package com.gestiondocumentalserviciosdocentes.demo.modelo;

public class ConsultaVisitasDocente {
	
	private int id_Visita;
	private int id_Carrera;
	private String vst_nombre_empresa;
	private String vst_tipo_visita;
	
	public ConsultaVisitasDocente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ConsultaVisitasDocente(int id_Visita, int id_Carrera, String vst_nombre_empresa, String vst_tipo_visita) {
		super();
		this.id_Visita = id_Visita;
		this.id_Carrera = id_Carrera;
		this.vst_nombre_empresa = vst_nombre_empresa;
		this.vst_tipo_visita = vst_tipo_visita;
	}

	public int getId_Visita() {
		return id_Visita;
	}

	public void setId_Visita(int id_Visita) {
		this.id_Visita = id_Visita;
	}

	public int getId_Carrera() {
		return id_Carrera;
	}

	public void setId_Carrera(int id_Carrera) {
		this.id_Carrera = id_Carrera;
	}

	public String getVst_nombre_empresa() {
		return vst_nombre_empresa;
	}

	public void setVst_nombre_empresa(String vst_nombre_empresa) {
		this.vst_nombre_empresa = vst_nombre_empresa;
	}

	public String getVst_tipo_visita() {
		return vst_tipo_visita;
	}

	public void setVst_tipo_visita(String vst_tipo_visita) {
		this.vst_tipo_visita = vst_tipo_visita;
	}

	@Override
	public String toString() {
		return "ConsultaVisitasDocente [id_Visita=" + id_Visita + ", id_Carrera=" + id_Carrera + ", vst_nombre_empresa="
				+ vst_nombre_empresa + ", vst_tipo_visita=" + vst_tipo_visita + "]";
	}

	
}
