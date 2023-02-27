package com.gestiondocumentalserviciosdocentes.demo.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="documentos_servicio")
public class DocSocial {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_Documentos_Servicio;
	private int  id_Servicio;
	private String DOCSEV_pdf_Const_extraescolar ;
	private String DOCSEV_pdf_vigencia_imss ;
	private String DOCSEV_pdf_formato_solicitud ;
	private String DOCSEV_pdf_carta_compromiso ;
	private String DOCSEV_pdf_carta_presentacion ;
	private String DOCSEV_pdf_carta_aceptacion ;
	private String DOCSEV_pdf_plan_trabajo ;
	private String DOCSEV_pdf_reporte_bimestral ;
	private String DOCSEV_pdf_bimestral_1 ;
	private String DOCSEV_pdf_bimestral_2 ;
	private String DOCSEV_pdf_bimestral_3 ;
	private String DOCSEV_pdf_reporte_final ;
	private String DOCSEV_pdf_carta_liberacion ;
	private String DOCSEV_pdf_tarjeta_control ;
	private String DOCSEV_pdf_constancia_liberacion ;
	public DocSocial() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DocSocial(int id_Documentos_Servicio, int id_Servicio, String dOCSEV_pdf_Const_extraescolar,
			String dOCSEV_pdf_vigencia_imss, String dOCSEV_pdf_formato_solicitud, String dOCSEV_pdf_carta_compromiso,
			String dOCSEV_pdf_carta_presentacion, String dOCSEV_pdf_carta_aceptacion, String dOCSEV_pdf_plan_trabajo,
			String dOCSEV_pdf_reporte_bimestral, String dOCSEV_pdf_bimestral_1, String dOCSEV_pdf_bimestral_2,
			String dOCSEV_pdf_bimestral_3, String dOCSEV_pdf_reporte_final, String dOCSEV_pdf_carta_liberacion,
			String dOCSEV_pdf_tarjeta_control, String dOCSEV_pdf_constancia_liberacion) {
		super();
		this.id_Documentos_Servicio = id_Documentos_Servicio;
		this.id_Servicio = id_Servicio;
		DOCSEV_pdf_Const_extraescolar = dOCSEV_pdf_Const_extraescolar;
		DOCSEV_pdf_vigencia_imss = dOCSEV_pdf_vigencia_imss;
		DOCSEV_pdf_formato_solicitud = dOCSEV_pdf_formato_solicitud;
		DOCSEV_pdf_carta_compromiso = dOCSEV_pdf_carta_compromiso;
		DOCSEV_pdf_carta_presentacion = dOCSEV_pdf_carta_presentacion;
		DOCSEV_pdf_carta_aceptacion = dOCSEV_pdf_carta_aceptacion;
		DOCSEV_pdf_plan_trabajo = dOCSEV_pdf_plan_trabajo;
		DOCSEV_pdf_reporte_bimestral = dOCSEV_pdf_reporte_bimestral;
		DOCSEV_pdf_bimestral_1 = dOCSEV_pdf_bimestral_1;
		DOCSEV_pdf_bimestral_2 = dOCSEV_pdf_bimestral_2;
		DOCSEV_pdf_bimestral_3 = dOCSEV_pdf_bimestral_3;
		DOCSEV_pdf_reporte_final = dOCSEV_pdf_reporte_final;
		DOCSEV_pdf_carta_liberacion = dOCSEV_pdf_carta_liberacion;
		DOCSEV_pdf_tarjeta_control = dOCSEV_pdf_tarjeta_control;
		DOCSEV_pdf_constancia_liberacion = dOCSEV_pdf_constancia_liberacion;
	}
	public int getId_Documentos_Servicio() {
		return id_Documentos_Servicio;
	}
	public void setId_Documentos_Servicio(int id_Documentos_Servicio) {
		this.id_Documentos_Servicio = id_Documentos_Servicio;
	}
	public int getId_Servicio() {
		return id_Servicio;
	}
	public void setId_Servicio(int id_Servicio) {
		this.id_Servicio = id_Servicio;
	}
	public String getDOCSEV_pdf_Const_extraescolar() {
		return DOCSEV_pdf_Const_extraescolar;
	}
	public void setDOCSEV_pdf_Const_extraescolar(String dOCSEV_pdf_Const_extraescolar) {
		DOCSEV_pdf_Const_extraescolar = dOCSEV_pdf_Const_extraescolar;
	}
	public String getDOCSEV_pdf_vigencia_imss() {
		return DOCSEV_pdf_vigencia_imss;
	}
	public void setDOCSEV_pdf_vigencia_imss(String dOCSEV_pdf_vigencia_imss) {
		DOCSEV_pdf_vigencia_imss = dOCSEV_pdf_vigencia_imss;
	}
	public String getDOCSEV_pdf_formato_solicitud() {
		return DOCSEV_pdf_formato_solicitud;
	}
	public void setDOCSEV_pdf_formato_solicitud(String dOCSEV_pdf_formato_solicitud) {
		DOCSEV_pdf_formato_solicitud = dOCSEV_pdf_formato_solicitud;
	}
	public String getDOCSEV_pdf_carta_compromiso() {
		return DOCSEV_pdf_carta_compromiso;
	}
	public void setDOCSEV_pdf_carta_compromiso(String dOCSEV_pdf_carta_compromiso) {
		DOCSEV_pdf_carta_compromiso = dOCSEV_pdf_carta_compromiso;
	}
	public String getDOCSEV_pdf_carta_presentacion() {
		return DOCSEV_pdf_carta_presentacion;
	}
	public void setDOCSEV_pdf_carta_presentacion(String dOCSEV_pdf_carta_presentacion) {
		DOCSEV_pdf_carta_presentacion = dOCSEV_pdf_carta_presentacion;
	}
	public String getDOCSEV_pdf_carta_aceptacion() {
		return DOCSEV_pdf_carta_aceptacion;
	}
	public void setDOCSEV_pdf_carta_aceptacion(String dOCSEV_pdf_carta_aceptacion) {
		DOCSEV_pdf_carta_aceptacion = dOCSEV_pdf_carta_aceptacion;
	}
	public String getDOCSEV_pdf_plan_trabajo() {
		return DOCSEV_pdf_plan_trabajo;
	}
	public void setDOCSEV_pdf_plan_trabajo(String dOCSEV_pdf_plan_trabajo) {
		DOCSEV_pdf_plan_trabajo = dOCSEV_pdf_plan_trabajo;
	}
	public String getDOCSEV_pdf_reporte_bimestral() {
		return DOCSEV_pdf_reporte_bimestral;
	}
	public void setDOCSEV_pdf_reporte_bimestral(String dOCSEV_pdf_reporte_bimestral) {
		DOCSEV_pdf_reporte_bimestral = dOCSEV_pdf_reporte_bimestral;
	}
	public String getDOCSEV_pdf_bimestral_1() {
		return DOCSEV_pdf_bimestral_1;
	}
	public void setDOCSEV_pdf_bimestral_1(String dOCSEV_pdf_bimestral_1) {
		DOCSEV_pdf_bimestral_1 = dOCSEV_pdf_bimestral_1;
	}
	public String getDOCSEV_pdf_bimestral_2() {
		return DOCSEV_pdf_bimestral_2;
	}
	public void setDOCSEV_pdf_bimestral_2(String dOCSEV_pdf_bimestral_2) {
		DOCSEV_pdf_bimestral_2 = dOCSEV_pdf_bimestral_2;
	}
	public String getDOCSEV_pdf_bimestral_3() {
		return DOCSEV_pdf_bimestral_3;
	}
	public void setDOCSEV_pdf_bimestral_3(String dOCSEV_pdf_bimestral_3) {
		DOCSEV_pdf_bimestral_3 = dOCSEV_pdf_bimestral_3;
	}
	public String getDOCSEV_pdf_reporte_final() {
		return DOCSEV_pdf_reporte_final;
	}
	public void setDOCSEV_pdf_reporte_final(String dOCSEV_pdf_reporte_final) {
		DOCSEV_pdf_reporte_final = dOCSEV_pdf_reporte_final;
	}
	public String getDOCSEV_pdf_carta_liberacion() {
		return DOCSEV_pdf_carta_liberacion;
	}
	public void setDOCSEV_pdf_carta_liberacion(String dOCSEV_pdf_carta_liberacion) {
		DOCSEV_pdf_carta_liberacion = dOCSEV_pdf_carta_liberacion;
	}
	public String getDOCSEV_pdf_tarjeta_control() {
		return DOCSEV_pdf_tarjeta_control;
	}
	public void setDOCSEV_pdf_tarjeta_control(String dOCSEV_pdf_tarjeta_control) {
		DOCSEV_pdf_tarjeta_control = dOCSEV_pdf_tarjeta_control;
	}
	public String getDOCSEV_pdf_constancia_liberacion() {
		return DOCSEV_pdf_constancia_liberacion;
	}
	public void setDOCSEV_pdf_constancia_liberacion(String dOCSEV_pdf_constancia_liberacion) {
		DOCSEV_pdf_constancia_liberacion = dOCSEV_pdf_constancia_liberacion;
	}
	@Override
	public String toString() {
		return "DocSocial [id_Documentos_Servicio=" + id_Documentos_Servicio + ", id_Servicio=" + id_Servicio
				+ ", DOCSEV_pdf_Const_extraescolar=" + DOCSEV_pdf_Const_extraescolar + ", DOCSEV_pdf_vigencia_imss="
				+ DOCSEV_pdf_vigencia_imss + ", DOCSEV_pdf_formato_solicitud=" + DOCSEV_pdf_formato_solicitud
				+ ", DOCSEV_pdf_carta_compromiso=" + DOCSEV_pdf_carta_compromiso + ", DOCSEV_pdf_carta_presentacion="
				+ DOCSEV_pdf_carta_presentacion + ", DOCSEV_pdf_carta_aceptacion=" + DOCSEV_pdf_carta_aceptacion
				+ ", DOCSEV_pdf_plan_trabajo=" + DOCSEV_pdf_plan_trabajo + ", DOCSEV_pdf_reporte_bimestral="
				+ DOCSEV_pdf_reporte_bimestral + ", DOCSEV_pdf_bimestral_1=" + DOCSEV_pdf_bimestral_1
				+ ", DOCSEV_pdf_bimestral_2=" + DOCSEV_pdf_bimestral_2 + ", DOCSEV_pdf_bimestral_3="
				+ DOCSEV_pdf_bimestral_3 + ", DOCSEV_pdf_reporte_final=" + DOCSEV_pdf_reporte_final
				+ ", DOCSEV_pdf_carta_liberacion=" + DOCSEV_pdf_carta_liberacion + ", DOCSEV_pdf_tarjeta_control="
				+ DOCSEV_pdf_tarjeta_control + ", DOCSEV_pdf_constancia_liberacion=" + DOCSEV_pdf_constancia_liberacion
				+ "]";
	}
	
	
	
		
	
	
}
