package com.gestiondocumentalserviciosdocentes.demo.modelo;

public class QCarreras {
	
	private int id_carrera; 
	private int id_departamento; 
	private String car_nombre;
	public QCarreras() {
		super();
		// TODO Auto-generated constructor stub
	}
	public QCarreras(int id_carrera, int id_departamento, String car_nombre) {
		super();
		this.id_carrera = id_carrera;
		this.id_departamento = id_departamento;
		this.car_nombre = car_nombre;
	}
	public int getId_carrera() {
		return id_carrera;
	}
	public void setId_carrera(int id_carrera) {
		this.id_carrera = id_carrera;
	}
	public int getId_departamento() {
		return id_departamento;
	}
	public void setId_departamento(int id_departamento) {
		this.id_departamento = id_departamento;
	}
	public String getCar_nombre() {
		return car_nombre;
	}
	public void setCar_nombre(String car_nombre) {
		this.car_nombre = car_nombre;
	}
	@Override
	public String toString() {
		return "QCarreras [id_carrera=" + id_carrera + ", id_departamento=" + id_departamento + ", car_nombre="
				+ car_nombre + "]";
	}
}
