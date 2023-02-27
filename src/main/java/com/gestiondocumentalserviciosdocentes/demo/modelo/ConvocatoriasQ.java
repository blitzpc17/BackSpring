package com.gestiondocumentalserviciosdocentes.demo.modelo;

import java.util.Date;

public class ConvocatoriasQ {

	private int id_convocatoria; 
	private int id_periodo; 
	private int id_departamento; 
	private String conv_nombre;
	private int conv_cantidad;
	private int conv_num_user;
	private Date conv_expirar; 
	private int conv_estado; 
	private int conv_tipo; 
	private String conv_informacion;
	public ConvocatoriasQ() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ConvocatoriasQ(int id_convocatoria, int id_periodo, int id_departamento, String conv_nombre,
			int conv_cantidad, int conv_num_user, Date conv_expirar, int conv_estado, int conv_tipo,
			String conv_informacion) {
		super();
		this.id_convocatoria = id_convocatoria;
		this.id_periodo = id_periodo;
		this.id_departamento = id_departamento;
		this.conv_nombre = conv_nombre;
		this.conv_cantidad = conv_cantidad;
		this.conv_num_user = conv_num_user;
		this.conv_expirar = conv_expirar;
		this.conv_estado = conv_estado;
		this.conv_tipo = conv_tipo;
		this.conv_informacion = conv_informacion;
	}
	public int getId_convocatoria() {
		return id_convocatoria;
	}
	public void setId_convocatoria(int id_convocatoria) {
		this.id_convocatoria = id_convocatoria;
	}
	public int getId_periodo() {
		return id_periodo;
	}
	public void setId_periodo(int id_periodo) {
		this.id_periodo = id_periodo;
	}
	public int getId_departamento() {
		return id_departamento;
	}
	public void setId_departamento(int id_departamento) {
		this.id_departamento = id_departamento;
	}
	public String getConv_nombre() {
		return conv_nombre;
	}
	public void setConv_nombre(String conv_nombre) {
		this.conv_nombre = conv_nombre;
	}
	public int getConv_cantidad() {
		return conv_cantidad;
	}
	public void setConv_cantidad(int conv_cantidad) {
		this.conv_cantidad = conv_cantidad;
	}
	public int getConv_num_user() {
		return conv_num_user;
	}
	public void setConv_num_user(int conv_num_user) {
		this.conv_num_user = conv_num_user;
	}
	public Date getConv_expirar() {
		return conv_expirar;
	}
	public void setConv_expirar(Date conv_expirar) {
		this.conv_expirar = conv_expirar;
	}
	public int getConv_estado() {
		return conv_estado;
	}
	public void setConv_estado(int conv_estado) {
		this.conv_estado = conv_estado;
	}
	public int getConv_tipo() {
		return conv_tipo;
	}
	public void setConv_tipo(int conv_tipo) {
		this.conv_tipo = conv_tipo;
	}
	public String getConv_informacion() {
		return conv_informacion;
	}
	public void setConv_informacion(String conv_informacion) {
		this.conv_informacion = conv_informacion;
	}
	@Override
	public String toString() {
		return "ConvocatoriasQ [id_convocatoria=" + id_convocatoria + ", id_periodo=" + id_periodo
				+ ", id_departamento=" + id_departamento + ", conv_nombre=" + conv_nombre + ", conv_cantidad="
				+ conv_cantidad + ", conv_num_user=" + conv_num_user + ", conv_expirar=" + conv_expirar
				+ ", conv_estado=" + conv_estado + ", conv_tipo=" + conv_tipo + ", conv_informacion=" + conv_informacion
				+ "]";
	}
	
	
	
}
