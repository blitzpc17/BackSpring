package com.gestiondocumentalserviciosdocentes.demo.modelo;

public class JSolicitudes {
	
	 private int id_solicitud;
	 
	 private int  id_gestionlaboratorio;
	 
	 private String soli_fecha;
	 
	 private String soli_asunto;
	 
	 private int	soli_estado;
	 
	 private String soli_recibidas;
	 
	 private String	soli_atendidas;

	public JSolicitudes() {
		super();
		// TODO Auto-generated constructor stub
	}

	public JSolicitudes(int id_solicitud, int id_gestionlaboratorio, String soli_fecha, String soli_asunto,
			int soli_estado, String soli_recibidas, String soli_atendidas) {
		super();
		this.id_solicitud = id_solicitud;
		this.id_gestionlaboratorio = id_gestionlaboratorio;
		this.soli_fecha = soli_fecha;
		this.soli_asunto = soli_asunto;
		this.soli_estado = soli_estado;
		this.soli_recibidas = soli_recibidas;
		this.soli_atendidas = soli_atendidas;
	}

	public int getId_solicitud() {
		return id_solicitud;
	}

	public void setId_solicitud(int id_solicitud) {
		this.id_solicitud = id_solicitud;
	}

	public int getId_gestionlaboratorio() {
		return id_gestionlaboratorio;
	}

	public void setId_gestionlaboratorio(int id_gestionlaboratorio) {
		this.id_gestionlaboratorio = id_gestionlaboratorio;
	}

	public String getSoli_fecha() {
		return soli_fecha;
	}

	public void setSoli_fecha(String soli_fecha) {
		this.soli_fecha = soli_fecha;
	}

	public String getSoli_asunto() {
		return soli_asunto;
	}

	public void setSoli_asunto(String soli_asunto) {
		this.soli_asunto = soli_asunto;
	}

	public int getSoli_estado() {
		return soli_estado;
	}

	public void setSoli_estado(int soli_estado) {
		this.soli_estado = soli_estado;
	}

	public String getSoli_recibidas() {
		return soli_recibidas;
	}

	public void setSoli_recibidas(String soli_recibidas) {
		this.soli_recibidas = soli_recibidas;
	}

	public String getSoli_atendidas() {
		return soli_atendidas;
	}

	public void setSoli_atendidas(String soli_atendidas) {
		this.soli_atendidas = soli_atendidas;
	}

	@Override
	public String toString() {
		return "JSolicitudes [id_solicitud=" + id_solicitud + ", id_gestionlaboratorio=" + id_gestionlaboratorio
				+ ", soli_fecha=" + soli_fecha + ", soli_asunto=" + soli_asunto + ", soli_estado=" + soli_estado
				+ ", soli_recibidas=" + soli_recibidas + ", soli_atendidas=" + soli_atendidas + "]";
	}

	
}
