package com.gestiondocumentalserviciosdocentes.demo.modelo;

public class Interesados {
	
	private int secuencia;
	private String conv_nombre_user;
	public Interesados() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Interesados(int secuencia, String conv_nombre_user) {
		super();
		this.secuencia = secuencia;
		this.conv_nombre_user = conv_nombre_user;
	}
	public int getSecuencia() {
		return secuencia;
	}
	public void setSecuencia(int secuencia) {
		this.secuencia = secuencia;
	}
	public String getConv_nombre_user() {
		return conv_nombre_user;
	}
	public void setConv_nombre_user(String conv_nombre_user) {
		this.conv_nombre_user = conv_nombre_user;
	}
	@Override
	public String toString() {
		return "Interesados [secuencia=" + secuencia + ", conv_nombre_user=" + conv_nombre_user + "]";
	}
	
	

}
