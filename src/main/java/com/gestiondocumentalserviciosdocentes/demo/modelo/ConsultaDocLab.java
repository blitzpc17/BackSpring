package com.gestiondocumentalserviciosdocentes.demo.modelo;

public class ConsultaDocLab {
	
	private String frm_Nombre;
	private int id_documentolaboratorio;
	private int id_gestionlaboratorio;
	private int id_Formato;
	private int doclab_Estado;
	private String doclab_Retroalimentacion;
	private String doclab_pdf;
	
	public ConsultaDocLab() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ConsultaDocLab(String frm_Nombre, int id_documentolaboratorio, int id_gestionlaboratorio, int id_Formato,
			int doclab_Estado, String doclab_Retroalimentacion, String doclab_pdf) {
		super();
		this.frm_Nombre = frm_Nombre;
		this.id_documentolaboratorio = id_documentolaboratorio;
		this.id_gestionlaboratorio = id_gestionlaboratorio;
		this.id_Formato = id_Formato;
		this.doclab_Estado = doclab_Estado;
		this.doclab_Retroalimentacion = doclab_Retroalimentacion;
		this.doclab_pdf = doclab_pdf;
	}

	public String getFrm_Nombre() {
		return frm_Nombre;
	}

	public void setFrm_Nombre(String frm_Nombre) {
		this.frm_Nombre = frm_Nombre;
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

	public int getId_Formato() {
		return id_Formato;
	}

	public void setId_Formato(int id_Formato) {
		this.id_Formato = id_Formato;
	}

	public int getDoclab_Estado() {
		return doclab_Estado;
	}

	public void setDoclab_Estado(int doclab_Estado) {
		this.doclab_Estado = doclab_Estado;
	}

	public String getDoclab_Retroalimentacion() {
		return doclab_Retroalimentacion;
	}

	public void setDoclab_Retroalimentacion(String doclab_Retroalimentacion) {
		this.doclab_Retroalimentacion = doclab_Retroalimentacion;
	}

	public String getDoclab_pdf() {
		return doclab_pdf;
	}

	public void setDoclab_pdf(String doclab_pdf) {
		this.doclab_pdf = doclab_pdf;
	}

	@Override
	public String toString() {
		return "ConsultaDocLab [frm_Nombre=" + frm_Nombre + ", id_documentolaboratorio=" + id_documentolaboratorio
				+ ", id_gestionlaboratorio=" + id_gestionlaboratorio + ", id_Formato=" + id_Formato + ", doclab_Estado="
				+ doclab_Estado + ", doclab_Retroalimentacion=" + doclab_Retroalimentacion + ", doclab_pdf="
				+ doclab_pdf + "]";
	}

	
	

}
