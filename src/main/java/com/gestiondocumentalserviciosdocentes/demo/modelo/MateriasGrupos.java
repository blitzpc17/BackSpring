package com.gestiondocumentalserviciosdocentes.demo.modelo;

public class MateriasGrupos {
	
	private int rowmg;
	
	private int id_grupo;
	
	private String clave;
	
	private String nombre;
	
	private String grupo;

	public MateriasGrupos() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MateriasGrupos(int rowmg, String clave, String nombre, String grupo) {
		super();
		this.rowmg = rowmg;
		this.clave = clave;
		this.nombre = nombre;
		this.grupo = grupo;
	}

	public int getRowmg() {
		return rowmg;
	}

	public void setRowmg(int rowmg) {
		this.rowmg = rowmg;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public int getId_grupo() {
		return id_grupo;
	}

	public void setId_grupo(int id_grupo) {
		this.id_grupo = id_grupo;
	}

}
