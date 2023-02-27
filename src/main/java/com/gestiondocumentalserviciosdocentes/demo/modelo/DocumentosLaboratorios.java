package com.gestiondocumentalserviciosdocentes.demo.modelo;

public class DocumentosLaboratorios {

	private int id_documentolaboratorio;
	private int id_gestionlaboratorio;
	private int id_formato;
	private String frm_nombre;
	private String doclab_pdf;
	private int doclab_estado;
	private String doclab_retroalimentacion;
	public DocumentosLaboratorios() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DocumentosLaboratorios(int id_documentolaboratorio, int id_gestionlaboratorio, int id_formato,
			String frm_nombre, String doclab_pdf, int doclab_estado, String doclab_retroalimentacion) {
		super();
		this.id_documentolaboratorio = id_documentolaboratorio;
		this.id_gestionlaboratorio = id_gestionlaboratorio;
		this.id_formato = id_formato;
		this.frm_nombre = frm_nombre;
		this.doclab_pdf = doclab_pdf;
		this.doclab_estado = doclab_estado;
		this.doclab_retroalimentacion = doclab_retroalimentacion;
	}
	public int getId_documentolaboratorio() {
		return id_documentolaboratorio;
	}
	public void setId_documentolaboratorio(int id_documentolaboratorio) {
		this.id_documentolaboratorio = id_documentolaboratorio;
	}
	public int getId_gestionlaboratorio() {
		return id_gestionlaboratorio;
	}
	public void setId_gestionlaboratorio(int id_gestionlaboratorio) {
		this.id_gestionlaboratorio = id_gestionlaboratorio;
	}
	public int getId_formato() {
		return id_formato;
	}
	public void setId_formato(int id_formato) {
		this.id_formato = id_formato;
	}
	public String getFrm_nombre() {
		return frm_nombre;
	}
	public void setFrm_nombre(String frm_nombre) {
		this.frm_nombre = frm_nombre;
	}
	public String getDoclab_pdf() {
		return doclab_pdf;
	}
	public void setDoclab_pdf(String doclab_pdf) {
		this.doclab_pdf = doclab_pdf;
	}
	public int getDoclab_estado() {
		return doclab_estado;
	}
	public void setDoclab_estado(int doclab_estado) {
		this.doclab_estado = doclab_estado;
	}
	public String getDoclab_retroalimentacion() {
		return doclab_retroalimentacion;
	}
	public void setDoclab_retroalimentacion(String doclab_retroalimentacion) {
		this.doclab_retroalimentacion = doclab_retroalimentacion;
	}
	@Override
	public String toString() {
		return "DocumentosLaboratorios [id_documentolaboratorio=" + id_documentolaboratorio + ", id_gestionlaboratorio="
				+ id_gestionlaboratorio + ", id_formato=" + id_formato + ", frm_nombre=" + frm_nombre + ", doclab_pdf="
				+ doclab_pdf + ", doclab_estado=" + doclab_estado + ", doclab_retroalimentacion="
				+ doclab_retroalimentacion + "]";
	}
	
	
}
