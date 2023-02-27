package com.gestiondocumentalserviciosdocentes.demo.modelo;

public class DocumentosCapacitacionesDocentes {

	private int id_doc_capacitaciones;
    private int id_capacitacion;
	private int id_Formato;
	private String  doccap_pdf_documento;
	private String  formato;
	
	public DocumentosCapacitacionesDocentes() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId_doc_capacitaciones() {
		return id_doc_capacitaciones;
	}

	public void setId_doc_capacitaciones(int id_doc_capacitaciones) {
		this.id_doc_capacitaciones = id_doc_capacitaciones;
	}

	public int getId_capacitacion() {
		return id_capacitacion;
	}

	public void setId_capacitacion(int id_capacitacion) {
		this.id_capacitacion = id_capacitacion;
	}

	public int getId_Formato() {
		return id_Formato;
	}

	public void setId_Formato(int id_Formato) {
		this.id_Formato = id_Formato;
	}

	public String getDoccap_pdf_documento() {
		return doccap_pdf_documento;
	}

	public void setDoccap_pdf_documento(String doccap_pdf_documento) {
		this.doccap_pdf_documento = doccap_pdf_documento;
	}

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}
	
}
