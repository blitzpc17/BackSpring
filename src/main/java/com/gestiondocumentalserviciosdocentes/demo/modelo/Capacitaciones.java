package com.gestiondocumentalserviciosdocentes.demo.modelo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="capacitaciones")
public class Capacitaciones {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_capacitacion;
	
    private int id_dep_desa;
	private String cap_nombre_cap;
	private String cap_nombre_Instructor;
	private String cap_tipo_instructor;
	private Date cap_fecha_impartir;
	private String cap_pdf_encuesta_eficacia;
	private String cap_pdf_constancia_instructor;
	private String cap_creado_por;
	private Date cap_fecha_creacion;
	private String cap_actualizado_por;
	private Date cap_fecha_actualizacion;
	private int id_instructor;
	
	public Capacitaciones() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Capacitaciones(int idcapacitacion, int id_dep_desa, String cap_nombre_cap, String cap_nombre_Instructor,
			String cap_tipo_instructor, Date cap_fecha_impartir, String cap_pdf_encuesta_eficacia,
			String cap_pdf_constancia_instructor, String cap_creado_por, Date cap_fecha_creacion,
			String cap_actualizado_por, Date cap_fecha_actualizacion) {
		super();
		this.id_capacitacion = idcapacitacion;
		this.id_dep_desa = id_dep_desa;
		this.cap_nombre_cap = cap_nombre_cap;
		this.cap_nombre_Instructor = cap_nombre_Instructor;
		this.cap_tipo_instructor = cap_tipo_instructor;
		this.cap_fecha_impartir = cap_fecha_impartir;
		this.cap_pdf_encuesta_eficacia = cap_pdf_encuesta_eficacia;
		this.cap_pdf_constancia_instructor = cap_pdf_constancia_instructor;
		this.cap_creado_por = cap_creado_por;
		this.cap_fecha_creacion = cap_fecha_creacion;
		this.cap_actualizado_por = cap_actualizado_por;
		this.cap_fecha_actualizacion = cap_fecha_actualizacion;
	}
	
	public int getId_instructor() {
		return id_instructor;
	}
	public void setId_instructor(int id_instructor) {
		this.id_instructor = id_instructor;
	}
	public int getId_capacitacion() {
		return id_capacitacion;
	}
	public void setId_capacitacion(int idcapacitacion) {
		this.id_capacitacion = idcapacitacion;
	}
	public int getId_dep_desa() {
		return id_dep_desa;
	}
	public void setId_dep_desa(int id_dep_desa) {
		this.id_dep_desa = id_dep_desa;
	}
	public String getCap_nombre_cap() {
		return cap_nombre_cap;
	}
	public void setCap_nombre_cap(String cap_nombre_cap) {
		this.cap_nombre_cap = cap_nombre_cap;
	}
	public String getCap_nombre_Instructor() {
		return cap_nombre_Instructor;
	}
	public void setCap_nombre_Instructor(String cap_nombre_Instructor) {
		this.cap_nombre_Instructor = cap_nombre_Instructor;
	}
	public String getCap_tipo_instructor() {
		return cap_tipo_instructor;
	}
	public void setCap_tipo_instructor(String cap_tipo_instructor) {
		this.cap_tipo_instructor = cap_tipo_instructor;
	}
	public Date getCap_fecha_impartir() {
		return cap_fecha_impartir;
	}
	public void setCap_fecha_impartir(Date cap_fecha_impartir) {
		this.cap_fecha_impartir = cap_fecha_impartir;
	}
	public String getCap_pdf_encuesta_eficacia() {
		return cap_pdf_encuesta_eficacia;
	}
	public void setCap_pdf_encuesta_eficacia(String cap_pdf_encuesta_eficacia) {
		this.cap_pdf_encuesta_eficacia = cap_pdf_encuesta_eficacia;
	}
	public String getCap_pdf_constancia_instructor() {
		return cap_pdf_constancia_instructor;
	}
	public void setCap_pdf_constancia_instructor(String cap_pdf_constancia_instructor) {
		this.cap_pdf_constancia_instructor = cap_pdf_constancia_instructor;
	}
	public String getCap_creado_por() {
		return cap_creado_por;
	}
	public void setCap_creado_por(String cap_creado_por) {
		this.cap_creado_por = cap_creado_por;
	}
	public Date getCap_fecha_creacion() {
		return cap_fecha_creacion;
	}
	public void setCap_fecha_creacion(Date cap_fecha_creacion) {
		this.cap_fecha_creacion = cap_fecha_creacion;
	}
	public String getCap_actualizado_por() {
		return cap_actualizado_por;
	}
	public void setCap_actualizado_por(String cap_actualizado_por) {
		this.cap_actualizado_por = cap_actualizado_por;
	}
	public Date getCap_fecha_actualizacion() {
		return cap_fecha_actualizacion;
	}
	public void setCap_fecha_actualizacion(Date cap_fecha_actualizacion) {
		this.cap_fecha_actualizacion = cap_fecha_actualizacion;
	}
	@Override
	public String toString() {
		return "Capacitaciones [idcapacitacion=" + id_capacitacion + ", id_dep_desa=" + id_dep_desa + ", cap_nombre_cap="
				+ cap_nombre_cap + ", cap_nombre_Instructor=" + cap_nombre_Instructor + ", cap_tipo_instructor="
				+ cap_tipo_instructor + ", cap_fecha_impartir=" + cap_fecha_impartir + ", cap_pdf_encuesta_eficacia="
				+ cap_pdf_encuesta_eficacia + ", cap_pdf_constancia_instructor=" + cap_pdf_constancia_instructor
				+ ", cap_creado_por=" + cap_creado_por + ", cap_fecha_creacion=" + cap_fecha_creacion
				+ ", cap_actualizado_por=" + cap_actualizado_por + ", cap_fecha_actualizacion="
				+ cap_fecha_actualizacion + "]";
	}
	
	
	

}
