package com.gestiondocumentalserviciosdocentes.demo.modelo;

public class CNombreDocente {
	private int id_docper;
	private int id_usuarios;
	private String docente; 
	 private int id_periodo;
	public CNombreDocente() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CNombreDocente(int id_docper, int id_usuarios, String docente, int id_periodo) {
		super();
		this.id_docper = id_docper;
		this.id_usuarios = id_usuarios;
		this.docente = docente;
		this.id_periodo = id_periodo;
	}
	
	
	public int getId_docper() {
		return id_docper;
	}
	public void setId_docper(int id_docper) {
		this.id_docper = id_docper;
	}
	public int getId_usuarios() {
		return id_usuarios;
	}
	public void setId_usuarios(int id_usuarios) {
		this.id_usuarios = id_usuarios;
	}
	public String getDocente() {
		return docente;
	}
	public void setDocente(String docente) {
		this.docente = docente;
	}
	public int getId_periodo() {
		return id_periodo;
	}
	public void setId_periodo(int id_periodo) {
		this.id_periodo = id_periodo;
	}
	@Override
	public String toString() {
		return "CNombreDocente [id_docper=" + id_docper + ", id_usuarios=" + id_usuarios + ", docente=" + docente
				+ ", id_periodo=" + id_periodo + "]";
	}
	 
	 
}
