package com.gestiondocumentalserviciosdocentes.demo.modelo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "formatos")
public class Formatos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_formato;
	
	private int id_departamento;
	private String frm_clave;
	private String frm_nombre;
	private String frm_pdf_formato;
	private String fmr_tipo;
	private String frm_creado_por;
	private Date frm_fecha_creacion;
	private String frm_actualizado_por;
	private Date frm_fecha_actualizacion;
	
	public Formatos() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId_formato() {
		return id_formato;
	}

	public void setId_formato(int id_formato) {
		this.id_formato = id_formato;
	}

	public int getId_departamento() {
		return id_departamento;
	}

	public void setId_departamento(int id_departamento) {
		this.id_departamento = id_departamento;
	}

	public String getFrm_clave() {
		return frm_clave;
	}

	public void setFrm_clave(String frm_clave) {
		this.frm_clave = frm_clave;
	}

	public String getFrm_nombre() {
		return frm_nombre;
	}

	public void setFrm_nombre(String frm_nombre) {
		this.frm_nombre = frm_nombre;
	}

	public String getFrm_pdf_formato() {
		return frm_pdf_formato;
	}

	public void setFrm_pdf_formato(String frm_pdf_formato) {
		this.frm_pdf_formato = frm_pdf_formato;
	}

	public String getFmr_tipo() {
		return fmr_tipo;
	}

	public void setFmr_tipo(String fmr_tipo) {
		this.fmr_tipo = fmr_tipo;
	}

	public String getFrm_creado_por() {
		return frm_creado_por;
	}

	public void setFrm_creado_por(String frm_creado_por) {
		this.frm_creado_por = frm_creado_por;
	}

	public Date getFrm_fecha_creacion() {
		return frm_fecha_creacion;
	}

	public void setFrm_fecha_creacion(Date frm_fecha_creacion) {
		this.frm_fecha_creacion = frm_fecha_creacion;
	}

	public String getFrm_actualizado_por() {
		return frm_actualizado_por;
	}

	public void setFrm_actualizado_por(String frm_actualizado_por) {
		this.frm_actualizado_por = frm_actualizado_por;
	}

	public Date getFrm_fecha_actualizacion() {
		return frm_fecha_actualizacion;
	}

	public void setFrm_fecha_actualizacion(Date frm_fecha_actualizacion) {
		this.frm_fecha_actualizacion = frm_fecha_actualizacion;
	}
	
}
