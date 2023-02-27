package com.gestiondocumentalserviciosdocentes.demo.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "documentoslaboratorios")
public class DocumentoLaboratorio {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_documentolaboratorio;
	
	private int id_gestionlaboratorio;

	private int id_formato;	
	
	private String doclab_pdf;
	
	private int doclab_estado ;
	
	private String doclab_retroalimentacion;

	public DocumentoLaboratorio() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DocumentoLaboratorio(int id_documentolaboratorio, int id_gestionlaboratorio, int id_formato,
			String doclab_pdf, int doclab_estado, String doclab_retroalimentacion) {
		super();
		this.id_documentolaboratorio = id_documentolaboratorio;
		this.id_gestionlaboratorio = id_gestionlaboratorio;
		this.id_formato = id_formato;
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
		return "DocumentoLaboratorio [id_documentolaboratorio=" + id_documentolaboratorio + ", id_gestionlaboratorio="
				+ id_gestionlaboratorio + ", id_formato=" + id_formato + ", doclab_pdf=" + doclab_pdf
				+ ", doclab_estado=" + doclab_estado + ", doclab_retroalimentacion=" + doclab_retroalimentacion + "]";
	}

	
}
