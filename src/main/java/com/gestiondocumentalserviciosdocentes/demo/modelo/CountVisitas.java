package com.gestiondocumentalserviciosdocentes.demo.modelo;

public class CountVisitas {
	
	private int id_Usuarios;
	private String vst_docente;
	private int vst_virtuales;
	private int vst_presencial;
	public CountVisitas() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CountVisitas(int id_Usuarios, String vst_docente, int vst_virtuales, int vst_presencial) {
		super();
		this.id_Usuarios = id_Usuarios;
		this.vst_docente = vst_docente;
		this.vst_virtuales = vst_virtuales;
		this.vst_presencial = vst_presencial;
	}
	public int getId_Usuarios() {
		return id_Usuarios;
	}
	public void setId_Usuarios(int id_Usuarios) {
		this.id_Usuarios = id_Usuarios;
	}
	public String getVst_docente() {
		return vst_docente;
	}
	public void setVst_docente(String vst_docente) {
		this.vst_docente = vst_docente;
	}
	public int getVst_virtuales() {
		return vst_virtuales;
	}
	public void setVst_virtuales(int vst_virtuales) {
		this.vst_virtuales = vst_virtuales;
	}
	public int getVst_presencial() {
		return vst_presencial;
	}
	public void setVst_presencial(int vst_presencial) {
		this.vst_presencial = vst_presencial;
	}
	@Override
	public String toString() {
		return "CountVisitas [id_Usuarios=" + id_Usuarios + ", vst_docente=" + vst_docente + ", vst_virtuales="
				+ vst_virtuales + ", vst_presencial=" + vst_presencial + "]";
	}
	
	
}
