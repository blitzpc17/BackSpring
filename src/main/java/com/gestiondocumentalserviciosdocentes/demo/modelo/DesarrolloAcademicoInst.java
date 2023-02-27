package com.gestiondocumentalserviciosdocentes.demo.modelo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="desarrollo_academico_institucional")
public class DesarrolloAcademicoInst {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_Desarrollo_Academico;
	
    private int id_Periodo;
	private String desac_pdf_Programa_Institucional;
	private String desac_creado_por;
	private Date desac_fecha_creacion;
	private String desac_actualizado_por;
	private Date desac_fecha_actualizacion;
	
	public DesarrolloAcademicoInst() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DesarrolloAcademicoInst(int id_Desarrollo_Academico, int id_Periodo, String desac_pdf_Programa_Institucional,
			String desac_creado_por, Date desac_fecha_creacion, String desac_actualizado_por,
			Date desac_fecha_actualizacion) {
		super();
		this.id_Desarrollo_Academico = id_Desarrollo_Academico;
		this.id_Periodo = id_Periodo;
		this.desac_pdf_Programa_Institucional = desac_pdf_Programa_Institucional;
		this.desac_creado_por = desac_creado_por;
		this.desac_fecha_creacion = desac_fecha_creacion;
		this.desac_actualizado_por = desac_actualizado_por;
		this.desac_fecha_actualizacion = desac_fecha_actualizacion;
	}
	
	public int getId_Desarrollo_Academico() {
		return id_Desarrollo_Academico;
	}
	
	public void setId_Desarrollo_Academico(int id_Desarrollo_Academico) {
		this.id_Desarrollo_Academico = id_Desarrollo_Academico;
	}
	
	public int getId_Periodo() {
		return id_Periodo;
	}
	
	public void setId_Periodo(int id_Periodo) {
		this.id_Periodo = id_Periodo;
	}
	
	public String getDesac_pdf_Programa_Institucional() {
		return desac_pdf_Programa_Institucional;
	}
	
	public void setDesac_pdf_Programa_Institucional(String desac_pdf_Programa_Institucional) {
		this.desac_pdf_Programa_Institucional = desac_pdf_Programa_Institucional;
	}
	
	public String getDesac_creado_por() {
		return desac_creado_por;
	}
	
	public void setDesac_creado_por(String desac_creado_por) {
		this.desac_creado_por = desac_creado_por;
	}
	
	public Date getDesac_fecha_creacion() {
		return desac_fecha_creacion;
	}
	
	public void setDesac_fecha_creacion(Date desac_fecha_creacion) {
		this.desac_fecha_creacion = desac_fecha_creacion;
	}
	
	public String getDesac_actualizado_por() {
		return desac_actualizado_por;
	}
	
	public void setDesac_actualizado_por(String desac_actualizado_por) {
		this.desac_actualizado_por = desac_actualizado_por;
	}
	
	public Date getDesac_fecha_actualizacion() {
		return desac_fecha_actualizacion;
	}
	
	public void setDesac_fecha_actualizacion(Date desac_fecha_actualizacion) {
		this.desac_fecha_actualizacion = desac_fecha_actualizacion;
	}
	
	@Override
	public String toString() {
		return "DesarrolloAcademicoInst [id_Desarrollo_Academico=" + id_Desarrollo_Academico + ", id_Periodo="
				+ id_Periodo + ", desac_pdf_Programa_Institucional=" + desac_pdf_Programa_Institucional
				+ ", desac_creado_por=" + desac_creado_por + ", desac_fecha_creacion=" + desac_fecha_creacion
				+ ", desac_actualizado_por=" + desac_actualizado_por + ", desac_fecha_actualizacion="
				+ desac_fecha_actualizacion + "]";
	}
	
	

}
