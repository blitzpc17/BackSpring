package com.gestiondocumentalserviciosdocentes.demo.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="documentos_visitas")
public class VisitasDoc {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_Documentos_Visita;
	
	private int id_Visita;
	private String docvst_pdf_oficio_solicitud;
	private String docvst_pdf_formato_solicitud;
	private String docvst_pdf_formato_oficio_solicitud ;
	private String docvst_pdf_formato_programa ;
	private String docvst_pdf_carta_agradecimientos;
	private String docvst_pdf_resultados_incidencias;
	private String docvst_pdf_lista_estudiantes ;
	private String docvst_pdf_formato_resultados_incidencias;
	private String docvst_pdf_formato_lista_estudiantes ;
	private String docvst_pdf_evidencias ;
	private String docvst_pdf_oficio_constancia;
	
	public VisitasDoc() {
		super();
		// TODO Auto-generated constructor stub
	}

	public VisitasDoc(int id_Documentos_Visita, int id_Visita, String docvst_pdf_oficio_solicitud,
			String docvst_pdf_formato_solicitud, String docvst_pdf_formato_oficio_solicitud,
			String docvst_pdf_formato_programa, String docvst_pdf_carta_agradecimientos,
			String docvst_pdf_resultados_incidencias, String docvst_pdf_lista_estudiantes,
			String docvst_pdf_formato_resultados_incidencias, String docvst_pdf_formato_lista_estudiantes,
			String docvst_pdf_evidencias, String docvst_pdf_oficio_constancia) {
		super();
		this.id_Documentos_Visita = id_Documentos_Visita;
		this.id_Visita = id_Visita;
		this.docvst_pdf_oficio_solicitud = docvst_pdf_oficio_solicitud;
		this.docvst_pdf_formato_solicitud = docvst_pdf_formato_solicitud;
		this.docvst_pdf_formato_oficio_solicitud = docvst_pdf_formato_oficio_solicitud;
		this.docvst_pdf_formato_programa = docvst_pdf_formato_programa;
		this.docvst_pdf_carta_agradecimientos = docvst_pdf_carta_agradecimientos;
		this.docvst_pdf_resultados_incidencias = docvst_pdf_resultados_incidencias;
		this.docvst_pdf_lista_estudiantes = docvst_pdf_lista_estudiantes;
		this.docvst_pdf_formato_resultados_incidencias = docvst_pdf_formato_resultados_incidencias;
		this.docvst_pdf_formato_lista_estudiantes = docvst_pdf_formato_lista_estudiantes;
		this.docvst_pdf_evidencias = docvst_pdf_evidencias;
		this.docvst_pdf_oficio_constancia = docvst_pdf_oficio_constancia;
	}

	public int getId_Documentos_Visita() {
		return id_Documentos_Visita;
	}

	public void setId_Documentos_Visita(int id_Documentos_Visita) {
		this.id_Documentos_Visita = id_Documentos_Visita;
	}

	public int getId_Visita() {
		return id_Visita;
	}

	public void setId_Visita(int id_Visita) {
		this.id_Visita = id_Visita;
	}

	public String getDocvst_pdf_oficio_solicitud() {
		return docvst_pdf_oficio_solicitud;
	}

	public void setDocvst_pdf_oficio_solicitud(String docvst_pdf_oficio_solicitud) {
		this.docvst_pdf_oficio_solicitud = docvst_pdf_oficio_solicitud;
	}

	public String getDocvst_pdf_formato_solicitud() {
		return docvst_pdf_formato_solicitud;
	}

	public void setDocvst_pdf_formato_solicitud(String docvst_pdf_formato_solicitud) {
		this.docvst_pdf_formato_solicitud = docvst_pdf_formato_solicitud;
	}

	public String getDocvst_pdf_formato_oficio_solicitud() {
		return docvst_pdf_formato_oficio_solicitud;
	}

	public void setDocvst_pdf_formato_oficio_solicitud(String docvst_pdf_formato_oficio_solicitud) {
		this.docvst_pdf_formato_oficio_solicitud = docvst_pdf_formato_oficio_solicitud;
	}

	public String getDocvst_pdf_formato_programa() {
		return docvst_pdf_formato_programa;
	}

	public void setDocvst_pdf_formato_programa(String docvst_pdf_formato_programa) {
		this.docvst_pdf_formato_programa = docvst_pdf_formato_programa;
	}

	public String getDocvst_pdf_carta_agradecimientos() {
		return docvst_pdf_carta_agradecimientos;
	}

	public void setDocvst_pdf_carta_agradecimientos(String docvst_pdf_carta_agradecimientos) {
		this.docvst_pdf_carta_agradecimientos = docvst_pdf_carta_agradecimientos;
	}

	public String getDocvst_pdf_resultados_incidencias() {
		return docvst_pdf_resultados_incidencias;
	}

	public void setDocvst_pdf_resultados_incidencias(String docvst_pdf_resultados_incidencias) {
		this.docvst_pdf_resultados_incidencias = docvst_pdf_resultados_incidencias;
	}

	public String getDocvst_pdf_lista_estudiantes() {
		return docvst_pdf_lista_estudiantes;
	}

	public void setDocvst_pdf_lista_estudiantes(String docvst_pdf_lista_estudiantes) {
		this.docvst_pdf_lista_estudiantes = docvst_pdf_lista_estudiantes;
	}

	public String getDocvst_pdf_formato_resultados_incidencias() {
		return docvst_pdf_formato_resultados_incidencias;
	}

	public void setDocvst_pdf_formato_resultados_incidencias(String docvst_pdf_formato_resultados_incidencias) {
		this.docvst_pdf_formato_resultados_incidencias = docvst_pdf_formato_resultados_incidencias;
	}

	public String getDocvst_pdf_formato_lista_estudiantes() {
		return docvst_pdf_formato_lista_estudiantes;
	}

	public void setDocvst_pdf_formato_lista_estudiantes(String docvst_pdf_formato_lista_estudiantes) {
		this.docvst_pdf_formato_lista_estudiantes = docvst_pdf_formato_lista_estudiantes;
	}

	public String getDocvst_pdf_evidencias() {
		return docvst_pdf_evidencias;
	}

	public void setDocvst_pdf_evidencias(String docvst_pdf_evidencias) {
		this.docvst_pdf_evidencias = docvst_pdf_evidencias;
	}

	public String getDocvst_pdf_oficio_constancia() {
		return docvst_pdf_oficio_constancia;
	}

	public void setDocvst_pdf_oficio_constancia(String docvst_pdf_oficio_constancia) {
		this.docvst_pdf_oficio_constancia = docvst_pdf_oficio_constancia;
	}

	@Override
	public String toString() {
		return "VisitasDoc [id_Documentos_Visita=" + id_Documentos_Visita + ", id_Visita=" + id_Visita
				+ ", docvst_pdf_oficio_solicitud=" + docvst_pdf_oficio_solicitud + ", docvst_pdf_formato_solicitud="
				+ docvst_pdf_formato_solicitud + ", docvst_pdf_formato_oficio_solicitud="
				+ docvst_pdf_formato_oficio_solicitud + ", docvst_pdf_formato_programa=" + docvst_pdf_formato_programa
				+ ", docvst_pdf_carta_agradecimientos=" + docvst_pdf_carta_agradecimientos
				+ ", docvst_pdf_resultados_incidencias=" + docvst_pdf_resultados_incidencias
				+ ", docvst_pdf_lista_estudiantes=" + docvst_pdf_lista_estudiantes
				+ ", docvst_pdf_formato_resultados_incidencias=" + docvst_pdf_formato_resultados_incidencias
				+ ", docvst_pdf_formato_lista_estudiantes=" + docvst_pdf_formato_lista_estudiantes
				+ ", docvst_pdf_evidencias=" + docvst_pdf_evidencias + ", docvst_pdf_oficio_constancia="
				+ docvst_pdf_oficio_constancia + "]";
	}
	
	

}
