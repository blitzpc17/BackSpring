package com.gestiondocumentalserviciosdocentes.demo.modelo;

public class AuxiliarUsuarios {

	private String name;
	
	private int code;

	public AuxiliarUsuarios() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AuxiliarUsuarios(String name, int code) {
		super();
		this.name = name;
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return "AuxiliarUsuarios [name=" + name + ", code=" + code + "]";
	}
	
	
}
