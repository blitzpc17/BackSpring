package com.gestiondocumentalserviciosdocentes.demo.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "seleccion_apoyodocencia")
public class ActividadDocencia {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_actividaddocenteperiodo;
	
	private int id_docper;
	
	private int id_actividades_docencia;
	
	private int actdoc_estadocomentario;
	
	private String actdoc_comentario;
	
	private String actdoc_pdf_actividad;

	public ActividadDocencia() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ActividadDocencia(int id_actividaddocenteperiodo, int id_docper, int id_actividades_docencia,
			int actdoc_estadocomentario, String actdoc_comentario, String actdoc_pdf_actividad) {
		super();
		this.id_actividaddocenteperiodo = id_actividaddocenteperiodo;
		this.id_docper = id_docper;
		this.id_actividades_docencia = id_actividades_docencia;
		this.actdoc_estadocomentario = actdoc_estadocomentario;
		this.actdoc_comentario = actdoc_comentario;
		this.actdoc_pdf_actividad = actdoc_pdf_actividad;
	}

	public int getId_actividaddocenteperiodo() {
		return id_actividaddocenteperiodo;
	}

	public void setId_actividaddocenteperiodo(int id_actividaddocenteperiodo) {
		this.id_actividaddocenteperiodo = id_actividaddocenteperiodo;
	}

	public int getId_docper() {
		return id_docper;
	}

	public void setId_docper(int id_docper) {
		this.id_docper = id_docper;
	}

	public int getId_actividades_docencia() {
		return id_actividades_docencia;
	}

	public void setId_actividades_docencia(int id_actividades_docencia) {
		this.id_actividades_docencia = id_actividades_docencia;
	}

	public int getActdoc_estadocomentario() {
		return actdoc_estadocomentario;
	}

	public void setActdoc_estadocomentario(int actdoc_estadocomentario) {
		this.actdoc_estadocomentario = actdoc_estadocomentario;
	}

	public String getActdoc_comentario() {
		return actdoc_comentario;
	}

	public void setActdoc_comentario(String actdoc_comentario) {
		this.actdoc_comentario = actdoc_comentario;
	}

	public String getActdoc_pdf_actividad() {
		return actdoc_pdf_actividad;
	}

	public void setActdoc_pdf_actividad(String actdoc_pdf_actividad) {
		this.actdoc_pdf_actividad = actdoc_pdf_actividad;
	}

	@Override
	public String toString() {
		return "ActividadDocencia [id_actividaddocenteperiodo=" + id_actividaddocenteperiodo + ", id_docper="
				+ id_docper + ", id_actividades_docencia=" + id_actividades_docencia + ", actdoc_estadocomentario="
				+ actdoc_estadocomentario + ", actdoc_comentario=" + actdoc_comentario + ", actdoc_pdf_actividad="
				+ actdoc_pdf_actividad + "]";
	}

	
	
}
