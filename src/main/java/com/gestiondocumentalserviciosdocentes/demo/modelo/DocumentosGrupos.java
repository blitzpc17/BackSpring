package com.gestiondocumentalserviciosdocentes.demo.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "documentos_grupos")
public class DocumentosGrupos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_documentogrupo;
	
	private int id_grupo;
	private int id_formato;
	private String docgrp_pdf_documento;
	private String docgrp_comentario;
	private int docgrp_estadocomentario;
	private int notify = 0;
	
	public DocumentosGrupos() {
		super();
		// TODO Auto-generated constructor stub
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

	public int getNotify() {
		return notify;
	}

	public void setNotify(int notify) {
		this.notify = notify;
	}
	
}
