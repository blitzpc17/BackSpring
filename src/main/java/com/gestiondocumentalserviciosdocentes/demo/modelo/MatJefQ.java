package com.gestiondocumentalserviciosdocentes.demo.modelo;

public class MatJefQ {
	
	private int id_material; 
	private int id_departamento; 
	private String mtr_nombre; 
	private String mtr_enlace;
	public MatJefQ() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MatJefQ(int id_material, int id_departamento, String mtr_nombre, String mtr_enlace) {
		super();
		this.id_material = id_material;
		this.id_departamento = id_departamento;
		this.mtr_nombre = mtr_nombre;
		this.mtr_enlace = mtr_enlace;
	}
	public int getId_material() {
		return id_material;
	}
	public void setId_material(int id_material) {
		this.id_material = id_material;
	}
	public int getId_departamento() {
		return id_departamento;
	}
	public void setId_departamento(int id_departamento) {
		this.id_departamento = id_departamento;
	}
	public String getMtr_nombre() {
		return mtr_nombre;
	}
	public void setMtr_nombre(String mtr_nombre) {
		this.mtr_nombre = mtr_nombre;
	}
	public String getMtr_enlace() {
		return mtr_enlace;
	}
	public void setMtr_enlace(String mtr_enlace) {
		this.mtr_enlace = mtr_enlace;
	}
	@Override
	public String toString() {
		return "MatJefQ [id_material=" + id_material + ", id_departamento=" + id_departamento + ", mtr_nombre="
				+ mtr_nombre + ", mtr_enlace=" + mtr_enlace + "]";
	}
	
	

}
