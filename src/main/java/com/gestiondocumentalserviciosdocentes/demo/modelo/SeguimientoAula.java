package com.gestiondocumentalserviciosdocentes.demo.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "segimiento_aula")
public class SeguimientoAula {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_seguimiento ;
	
    private int  id_docper ;
    
	private int  id_formato ;	
	
	private String docgrp_pdf_documento ;

	public SeguimientoAula() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SeguimientoAula(int id_seguimiento, int id_docper, int id_formato, String docgrp_pdf_documento) {
		super();
		this.id_seguimiento = id_seguimiento;
		this.id_docper = id_docper;
		this.id_formato = id_formato;
		this.docgrp_pdf_documento = docgrp_pdf_documento;
	}

	public int getId_seguimiento() {
		return id_seguimiento;
	}

	public void setId_seguimiento(int id_seguimiento) {
		this.id_seguimiento = id_seguimiento;
	}

	public int getId_docper() {
		return id_docper;
	}

	public void setId_docper(int id_docper) {
		this.id_docper = id_docper;
	}

	public int getId_formato() {
		return id_formato;
	}

	public void setId_formato(int id_formato) {
		this.id_formato = id_formato;
	}

	public String getDocgrp_pdf_documento() {
		return docgrp_pdf_documento;
	}

	public void setDocgrp_pdf_documento(String docgrp_pdf_documento) {
		this.docgrp_pdf_documento = docgrp_pdf_documento;
	}

	@Override
	public String toString() {
		return "SeguimientoAula [id_seguimiento=" + id_seguimiento + ", id_docper=" + id_docper + ", id_formato="
				+ id_formato + ", docgrp_pdf_documento=" + docgrp_pdf_documento + "]";
	}

	
}
