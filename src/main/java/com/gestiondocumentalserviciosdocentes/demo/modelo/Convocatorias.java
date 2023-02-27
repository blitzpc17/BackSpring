package com.gestiondocumentalserviciosdocentes.demo.modelo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="convocatorias")
public class Convocatorias {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_Convocatoria;
    private int id_Periodo;
	private int id_Departamento;
	private String conv_Nombre;
	private Date conv_Fecha_Expirar;
	private int conv_Estado;
	private int conv_Tipo;
	private String conv_pdf_Informacion;
	private String conv_creado_por;
	private Date conv_fecha_creacion;
	private String conv_actualizado_por;
	private Date conv_fecha_actualizacion;
	public Convocatorias() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Convocatorias(int id_Convocatoria, int id_Periodo, int id_Departamento, String conv_Nombre,
			Date conv_Fecha_Expirar, int conv_Estado, int conv_Tipo, String conv_pdf_Informacion,
			String conv_creado_por, Date conv_fecha_creacion, String conv_actualizado_por,
			Date conv_fecha_actualizacion) {
		super();
		this.id_Convocatoria = id_Convocatoria;
		this.id_Periodo = id_Periodo;
		this.id_Departamento = id_Departamento;
		this.conv_Nombre = conv_Nombre;
		this.conv_Fecha_Expirar = conv_Fecha_Expirar;
		this.conv_Estado = conv_Estado;
		this.conv_Tipo = conv_Tipo;
		this.conv_pdf_Informacion = conv_pdf_Informacion;
		this.conv_creado_por = conv_creado_por;
		this.conv_fecha_creacion = conv_fecha_creacion;
		this.conv_actualizado_por = conv_actualizado_por;
		this.conv_fecha_actualizacion = conv_fecha_actualizacion;
	}
	public int getId_Convocatoria() {
		return id_Convocatoria;
	}
	public void setId_Convocatoria(int id_Convocatoria) {
		this.id_Convocatoria = id_Convocatoria;
	}
	public int getId_Periodo() {
		return id_Periodo;
	}
	public void setId_Periodo(int id_Periodo) {
		this.id_Periodo = id_Periodo;
	}
	public int getId_Departamento() {
		return id_Departamento;
	}
	public void setId_Departamento(int id_Departamento) {
		this.id_Departamento = id_Departamento;
	}
	public String getConv_Nombre() {
		return conv_Nombre;
	}
	public void setConv_Nombre(String conv_Nombre) {
		this.conv_Nombre = conv_Nombre;
	}
	public Date getConv_Fecha_Expirar() {
		return conv_Fecha_Expirar;
	}
	public void setConv_Fecha_Expirar(Date conv_Fecha_Expirar) {
		this.conv_Fecha_Expirar = conv_Fecha_Expirar;
	}
	public int getConv_Estado() {
		return conv_Estado;
	}
	public void setConv_Estado(int conv_Estado) {
		this.conv_Estado = conv_Estado;
	}
	public int getConv_Tipo() {
		return conv_Tipo;
	}
	public void setConv_Tipo(int conv_Tipo) {
		this.conv_Tipo = conv_Tipo;
	}
	public String getConv_pdf_Informacion() {
		return conv_pdf_Informacion;
	}
	public void setConv_pdf_Informacion(String conv_pdf_Informacion) {
		this.conv_pdf_Informacion = conv_pdf_Informacion;
	}
	public String getConv_creado_por() {
		return conv_creado_por;
	}
	public void setConv_creado_por(String conv_creado_por) {
		this.conv_creado_por = conv_creado_por;
	}
	public Date getConv_fecha_creacion() {
		return conv_fecha_creacion;
	}
	public void setConv_fecha_creacion(Date conv_fecha_creacion) {
		this.conv_fecha_creacion = conv_fecha_creacion;
	}
	public String getConv_actualizado_por() {
		return conv_actualizado_por;
	}
	public void setConv_actualizado_por(String conv_actualizado_por) {
		this.conv_actualizado_por = conv_actualizado_por;
	}
	public Date getConv_fecha_actualizacion() {
		return conv_fecha_actualizacion;
	}
	public void setConv_fecha_actualizacion(Date conv_fecha_actualizacion) {
		this.conv_fecha_actualizacion = conv_fecha_actualizacion;
	}
	@Override
	public String toString() {
		return "Convocatorias [id_Convocatoria=" + id_Convocatoria + ", id_Periodo=" + id_Periodo + ", id_Departamento="
				+ id_Departamento + ", conv_Nombre=" + conv_Nombre + ", conv_Fecha_Expirar=" + conv_Fecha_Expirar
				+ ", conv_Estado=" + conv_Estado + ", conv_Tipo=" + conv_Tipo + ", conv_pdf_Informacion="
				+ conv_pdf_Informacion + ", conv_creado_por=" + conv_creado_por + ", conv_fecha_creacion="
				+ conv_fecha_creacion + ", conv_actualizado_por=" + conv_actualizado_por + ", conv_fecha_actualizacion="
				+ conv_fecha_actualizacion + "]";
	}
	
	
	

}
