package com.gestiondocumentalserviciosdocentes.demo.modelo;

import java.util.Date;

public class ConsultaPeriodo1 {
	
	
	private int id_Periodo;
	private byte per_Mes_Inicio;
	private byte per_Mes_Fin;
	private short per_Year;
	private boolean per_Estado;
	private String per_lbl_Periodo;
	private String per_creado_por;
	private Date per_fecha_creacion;
	private String per_actualizado_por;
	private Date per_fecha_actualizacion;
	
	
	public ConsultaPeriodo1() {
		super();
		// TODO Auto-generated constructor stub
	}


	public ConsultaPeriodo1(int id_Periodo, byte per_Mes_Inicio, byte per_Mes_Fin, short per_Year, boolean per_Estado,
			String per_lbl_Periodo, String per_creado_por, Date per_fecha_creacion, String per_actualizado_por,
			Date per_fecha_actualizacion) {
		super();
		this.id_Periodo = id_Periodo;
		this.per_Mes_Inicio = per_Mes_Inicio;
		this.per_Mes_Fin = per_Mes_Fin;
		this.per_Year = per_Year;
		this.per_Estado = per_Estado;
		this.per_lbl_Periodo = per_lbl_Periodo;
		this.per_creado_por = per_creado_por;
		this.per_fecha_creacion = per_fecha_creacion;
		this.per_actualizado_por = per_actualizado_por;
		this.per_fecha_actualizacion = per_fecha_actualizacion;
	}


	public int getId_Periodo() {
		return id_Periodo;
	}


	public void setId_Periodo(int id_Periodo) {
		this.id_Periodo = id_Periodo;
	}


	public byte getPer_Mes_Inicio() {
		return per_Mes_Inicio;
	}


	public void setPer_Mes_Inicio(byte per_Mes_Inicio) {
		this.per_Mes_Inicio = per_Mes_Inicio;
	}


	public byte getPer_Mes_Fin() {
		return per_Mes_Fin;
	}


	public void setPer_Mes_Fin(byte per_Mes_Fin) {
		this.per_Mes_Fin = per_Mes_Fin;
	}


	public short getPer_Year() {
		return per_Year;
	}


	public void setPer_Year(short per_Year) {
		this.per_Year = per_Year;
	}


	public boolean isPer_Estado() {
		return per_Estado;
	}


	public void setPer_Estado(boolean per_Estado) {
		this.per_Estado = per_Estado;
	}


	public String getPer_lbl_Periodo() {
		return per_lbl_Periodo;
	}


	public void setPer_lbl_Periodo(String per_lbl_Periodo) {
		this.per_lbl_Periodo = per_lbl_Periodo;
	}


	public String getPer_creado_por() {
		return per_creado_por;
	}


	public void setPer_creado_por(String per_creado_por) {
		this.per_creado_por = per_creado_por;
	}


	public Date getPer_fecha_creacion() {
		return per_fecha_creacion;
	}


	public void setPer_fecha_creacion(Date per_fecha_creacion) {
		this.per_fecha_creacion = per_fecha_creacion;
	}


	public String getPer_actualizado_por() {
		return per_actualizado_por;
	}


	public void setPer_actualizado_por(String per_actualizado_por) {
		this.per_actualizado_por = per_actualizado_por;
	}


	public Date getPer_fecha_actualizacion() {
		return per_fecha_actualizacion;
	}


	public void setPer_fecha_actualizacion(Date per_fecha_actualizacion) {
		this.per_fecha_actualizacion = per_fecha_actualizacion;
	}


	@Override
	public String toString() {
		return "ConsultaPeriodo1 [id_Periodo=" + id_Periodo + ", per_Mes_Inicio=" + per_Mes_Inicio + ", per_Mes_Fin="
				+ per_Mes_Fin + ", per_Year=" + per_Year + ", per_Estado=" + per_Estado + ", per_lbl_Periodo="
				+ per_lbl_Periodo + ", per_creado_por=" + per_creado_por + ", per_fecha_creacion=" + per_fecha_creacion
				+ ", per_actualizado_por=" + per_actualizado_por + ", per_fecha_actualizacion="
				+ per_fecha_actualizacion + "]";
	}



	
	
	
	
}
