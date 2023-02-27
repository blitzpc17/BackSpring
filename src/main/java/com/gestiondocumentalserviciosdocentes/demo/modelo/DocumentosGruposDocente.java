package com.gestiondocumentalserviciosdocentes.demo.modelo;

public class DocumentosGruposDocente {

	private int id_documentogrupo;
	
	private int id_grupo;
	
	private int id_formato;
	
	private String docgrp_pdf_documento;
	
	private String docgrp_comentario;
	
	private int docgrp_estadocomentario;
	
	private String frm_nombre;
	
	private int rowdgc;

	public DocumentosGruposDocente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DocumentosGruposDocente(int id_documentogrupo, int id_grupo, int id_formato, String docgrp_pdf_documento,
			String docgrp_comentario, int docgrp_estadocomentario, String frm_nombre) {
		super();
		this.id_documentogrupo = id_documentogrupo;
		this.id_grupo = id_grupo;
		this.id_formato = id_formato;
		this.docgrp_pdf_documento = docgrp_pdf_documento;
		this.docgrp_comentario = docgrp_comentario;
		this.docgrp_estadocomentario = docgrp_estadocomentario;
		this.frm_nombre = frm_nombre;
	}

	public int getId_documentogrupo() {
		return id_documentogrupo;
	}

	public void setId_documentogrupo(int id_documentogrupo) {
		this.id_documentogrupo = id_documentogrupo;
	}

	public int getId_grupo() {
		return id_grupo;
	}

	public void setId_grupo(int id_grupo) {
		this.id_grupo = id_grupo;
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

	public String getDocgrp_comentario() {
		return docgrp_comentario;
	}

	public void setDocgrp_comentario(String docgrp_comentario) {
		this.docgrp_comentario = docgrp_comentario;
	}

	public int getDocgrp_estadocomentario() {
		return docgrp_estadocomentario;
	}

	public void setDocgrp_estadocomentario(int docgrp_estadocomentario) {
		this.docgrp_estadocomentario = docgrp_estadocomentario;
	}

	public String getFrm_nombre() {
		return frm_nombre;
	}

	public void setFrm_nombre(String frm_nombre) {
		this.frm_nombre = frm_nombre;
	}

	public int getRowdgc() {
		return rowdgc;
	}

	public void setRowdgc(int rowdgc) {
		this.rowdgc = rowdgc;
	}
	
}
