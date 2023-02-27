package com.gestiondocumentalserviciosdocentes.demo.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "docentes_periodo")
public class DocentePeriodo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_docper;
	
	private int id_usuarios;
	
	private int id_periodo;
	
	private String docper_pdf_horario;
	
	private String docper_pdf_liberacionact;
	
	private String docper_pdf_reportefinal;
	
	private int  docper_estado_reportefinal;
	
	private String docper_retroalimentacion_reportefinal;
	
	private int notify = 0;

	public DocentePeriodo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DocentePeriodo(int id_docper, int id_usuarios, int id_periodo, String docper_pdf_horario,
			String docper_pdf_liberacionact, String docper_pdf_reportefinal, int docper_estado_reportefinal,
			String docper_retroalimentacion_reportefinal) {
		super();
		this.id_docper = id_docper;
		this.id_usuarios = id_usuarios;
		this.id_periodo = id_periodo;
		this.docper_pdf_horario = docper_pdf_horario;
		this.docper_pdf_liberacionact = docper_pdf_liberacionact;
		this.docper_pdf_reportefinal = docper_pdf_reportefinal;
		this.docper_estado_reportefinal = docper_estado_reportefinal;
		this.docper_retroalimentacion_reportefinal = docper_retroalimentacion_reportefinal;
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

	public int getId_periodo() {
		return id_periodo;
	}

	public void setId_periodo(int id_periodo) {
		this.id_periodo = id_periodo;
	}

	public String getDocper_pdf_horario() {
		return docper_pdf_horario;
	}

	public void setDocper_pdf_horario(String docper_pdf_horario) {
		this.docper_pdf_horario = docper_pdf_horario;
	}

	public String getDocper_pdf_liberacionact() {
		return docper_pdf_liberacionact;
	}

	public void setDocper_pdf_liberacionact(String docper_pdf_liberacionact) {
		this.docper_pdf_liberacionact = docper_pdf_liberacionact;
	}

	public String getDocper_pdf_reportefinal() {
		return docper_pdf_reportefinal;
	}

	public void setDocper_pdf_reportefinal(String docper_pdf_reportefinal) {
		this.docper_pdf_reportefinal = docper_pdf_reportefinal;
	}

	public int getDocper_estado_reportefinal() {
		return docper_estado_reportefinal;
	}

	public void setDocper_estado_reportefinal(int docper_estado_reportefinal) {
		this.docper_estado_reportefinal = docper_estado_reportefinal;
	}

	public String getDocper_retroalimentacion_reportefinal() {
		return docper_retroalimentacion_reportefinal;
	}

	public void setDocper_retroalimentacion_reportefinal(String docper_retroalimentacion_reportefinal) {
		this.docper_retroalimentacion_reportefinal = docper_retroalimentacion_reportefinal;
	}

	@Override
	public String toString() {
		return "DocentePeriodo [id_docper=" + id_docper + ", id_usuarios=" + id_usuarios + ", id_periodo=" + id_periodo
				+ ", docper_pdf_horario=" + docper_pdf_horario + ", docper_pdf_liberacionact="
				+ docper_pdf_liberacionact + ", docper_pdf_reportefinal=" + docper_pdf_reportefinal
				+ ", docper_estado_reportefinal=" + docper_estado_reportefinal
				+ ", docper_retroalimentacion_reportefinal=" + docper_retroalimentacion_reportefinal + "]";
	}
	
	public int getNotify() {
		return notify;
	}

	public void setNotify(int notify) {
		this.notify = notify;
	}
	
}
