package com.gestiondocumentalserviciosdocentes.demo.modelo;

public class SocialProcesos {

	private int id_Departamento;
	private String serv_nombre_departamento;
	private int serv_prosesos;
	public SocialProcesos() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SocialProcesos(int id_Departamento, String serv_nombre_departamento, int serv_prosesos) {
		super();
		this.id_Departamento = id_Departamento;
		this.serv_nombre_departamento = serv_nombre_departamento;
		this.serv_prosesos = serv_prosesos;
	}
	public int getId_Departamento() {
		return id_Departamento;
	}
	public void setId_Departamento(int id_Departamento) {
		this.id_Departamento = id_Departamento;
	}
	public String getServ_nombre_departamento() {
		return serv_nombre_departamento;
	}
	public void setServ_nombre_departamento(String serv_nombre_departamento) {
		this.serv_nombre_departamento = serv_nombre_departamento;
	}
	public int getServ_prosesos() {
		return serv_prosesos;
	}
	public void setServ_prosesos(int serv_prosesos) {
		this.serv_prosesos = serv_prosesos;
	}
	@Override
	public String toString() {
		return "SocialProcesos [id_Departamento=" + id_Departamento + ", serv_nombre_departamento="
				+ serv_nombre_departamento + ", serv_prosesos=" + serv_prosesos + "]";
	}
	
	
}
