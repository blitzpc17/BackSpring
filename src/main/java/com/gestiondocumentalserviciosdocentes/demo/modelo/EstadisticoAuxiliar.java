package com.gestiondocumentalserviciosdocentes.demo.modelo;

public class EstadisticoAuxiliar {

	private int practicas;
	
	 private int total;

	public EstadisticoAuxiliar() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EstadisticoAuxiliar(int practicas, int total) {
		super();
		this.practicas = practicas;
		this.total = total;
	}

	public int getPracticas() {
		return practicas;
	}

	public void setPracticas(int practicas) {
		this.practicas = practicas;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "EstadisticoAuxiliar [practicas=" + practicas + ", total=" + total + "]";
	}
	 
	 
}
