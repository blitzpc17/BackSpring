package com.gestiondocumentalserviciosdocentes.demo.modelo;

public class SeleccionActividadesDocente {

	private int id_actividaddocenteperiodo;
	private int id_docper;
	private int id_actividades_docencia;
	private String actdoc_pdf_actividad;
	private String actdoc_comentario;
	private int actdoc_estadocomentario;
	private String actdoc_nombre_actividad;
	
	public SeleccionActividadesDocente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SeleccionActividadesDocente(int id_actividaddocenteperiodo, int id_docper, int id_actividades_docencia,
			String actdoc_pdf_actividad, String actdoc_comentario, int actdoc_estadocomentario,
			String actdoc_nombre_actividad) {
		super();
		this.id_actividaddocenteperiodo = id_actividaddocenteperiodo;
		this.id_docper = id_docper;
		this.id_actividades_docencia = id_actividades_docencia;
		this.actdoc_pdf_actividad = actdoc_pdf_actividad;
		this.actdoc_comentario = actdoc_comentario;
		this.actdoc_estadocomentario = actdoc_estadocomentario;
		this.actdoc_nombre_actividad = actdoc_nombre_actividad;
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

	public String getActdoc_pdf_actividad() {
		return actdoc_pdf_actividad;
	}

	public void setActdoc_pdf_actividad(String actdoc_pdf_actividad) {
		this.actdoc_pdf_actividad = actdoc_pdf_actividad;
	}

	public String getActdoc_comentario() {
		return actdoc_comentario;
	}

	public void setActdoc_comentario(String actdoc_comentario) {
		this.actdoc_comentario = actdoc_comentario;
	}

	public int getActdoc_estadocomentario() {
		return actdoc_estadocomentario;
	}

	public void setActdoc_estadocomentario(int actdoc_estadocomentario) {
		this.actdoc_estadocomentario = actdoc_estadocomentario;
	}

	public String getActdoc_nombre_actividad() {
		return actdoc_nombre_actividad;
	}

	public void setActdoc_nombre_actividad(String actdoc_nombre_actividad) {
		this.actdoc_nombre_actividad = actdoc_nombre_actividad;
	}
	
}
