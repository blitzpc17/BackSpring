package com.gestiondocumentalserviciosdocentes.demo.modelo;


public class ConsultaPeriodosDoc {

	private int id_Periodo;
	private int per_Mes_Inicio; 
	private int per_Mes_Fin; 
	private int per_Year; 
	private boolean per_Estado; 
	private int id_gestionlaboratorio; 
	private int id_Laboratorio;
	
	public ConsultaPeriodosDoc() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ConsultaPeriodosDoc(int id_Periodo, int per_Mes_Inicio, int per_Mes_Fin, int per_Year, boolean per_Estado,
			int id_gestionlaboratorio, int id_Laboratorio) {
		super();
		this.id_Periodo = id_Periodo;
		this.per_Mes_Inicio = per_Mes_Inicio;
		this.per_Mes_Fin = per_Mes_Fin;
		this.per_Year = per_Year;
		this.per_Estado = per_Estado;
		this.id_gestionlaboratorio = id_gestionlaboratorio;
		this.id_Laboratorio = id_Laboratorio;
	}

	public int getId_Periodo() {
		return id_Periodo;
	}

	public void setId_Periodo(int id_Periodo) {
		this.id_Periodo = id_Periodo;
	}

	public int getPer_Mes_Inicio() {
		return per_Mes_Inicio;
	}

	public void setPer_Mes_Inicio(int per_Mes_Inicio) {
		this.per_Mes_Inicio = per_Mes_Inicio;
	}

	public int getPer_Mes_Fin() {
		return per_Mes_Fin;
	}

	public void setPer_Mes_Fin(int per_Mes_Fin) {
		this.per_Mes_Fin = per_Mes_Fin;
	}

	public int getPer_Year() {
		return per_Year;
	}

	public void setPer_Year(int per_Year) {
		this.per_Year = per_Year;
	}

	public boolean isPer_Estado() {
		return per_Estado;
	}

	public void setPer_Estado(boolean per_Estado) {
		this.per_Estado = per_Estado;
	}

	public int getId_gestionlaboratorio() {
		return id_gestionlaboratorio;
	}

	public void setId_gestionlaboratorio(int id_gestionlaboratorio) {
		this.id_gestionlaboratorio = id_gestionlaboratorio;
	}

	public int getId_Laboratorio() {
		return id_Laboratorio;
	}

	public void setId_Laboratorio(int id_Laboratorio) {
		this.id_Laboratorio = id_Laboratorio;
	}

	@Override
	public String toString() {
		return "ConsultaPeriodosDoc [id_Periodo=" + id_Periodo + ", per_Mes_Inicio=" + per_Mes_Inicio + ", per_Mes_Fin="
				+ per_Mes_Fin + ", per_Year=" + per_Year + ", per_Estado=" + per_Estado + ", id_gestionlaboratorio="
				+ id_gestionlaboratorio + ", id_Laboratorio=" + id_Laboratorio + "]";
	}

	
	
}
