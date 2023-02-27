package com.gestiondocumentalserviciosdocentes.demo.modelo;


public class ConsultaCubiculos {
	
	private int id_Cubiculo;
	private int id_Usuarios;
	private String cub_Nombre;
	private int cub_Estado;
	private String cub_Inventario;
	private String cub_firmaaceptacion;
	private String user_Nombre;
	
	
	public ConsultaCubiculos() {
		super();
		// TODO Auto-generated constructor stub
	}


	public ConsultaCubiculos(int id_Cubiculo, int id_Usuarios, String cub_Nombre, int cub_Estado, String cub_Inventario,
			String cub_firmaaceptacion, String user_Nombre) {
		super();
		this.id_Cubiculo = id_Cubiculo;
		this.id_Usuarios = id_Usuarios;
		this.cub_Nombre = cub_Nombre;
		this.cub_Estado = cub_Estado;
		this.cub_Inventario = cub_Inventario;
		this.cub_firmaaceptacion = cub_firmaaceptacion;
		this.user_Nombre = user_Nombre;
	}


	public int getId_Cubiculo() {
		return id_Cubiculo;
	}


	public void setId_Cubiculo(int id_Cubiculo) {
		this.id_Cubiculo = id_Cubiculo;
	}


	public int getId_Usuarios() {
		return id_Usuarios;
	}


	public void setId_Usuarios(int id_Usuarios) {
		this.id_Usuarios = id_Usuarios;
	}


	public String getCub_Nombre() {
		return cub_Nombre;
	}


	public void setCub_Nombre(String cub_Nombre) {
		this.cub_Nombre = cub_Nombre;
	}


	public int getCub_Estado() {
		return cub_Estado;
	}


	public void setCub_Estado(int cub_Estado) {
		this.cub_Estado = cub_Estado;
	}


	public String getCub_Inventario() {
		return cub_Inventario;
	}


	public void setCub_Inventario(String cub_Inventario) {
		this.cub_Inventario = cub_Inventario;
	}


	public String getCub_firmaaceptacion() {
		return cub_firmaaceptacion;
	}


	public void setCub_firmaaceptacion(String cub_firmaaceptacion) {
		this.cub_firmaaceptacion = cub_firmaaceptacion;
	}


	public String getUser_Nombre() {
		return user_Nombre;
	}


	public void setUser_Nombre(String user_Nombre) {
		this.user_Nombre = user_Nombre;
	}


	@Override
	public String toString() {
		return "ConsultaCubiculos [id_Cubiculo=" + id_Cubiculo + ", id_Usuarios=" + id_Usuarios + ", cub_Nombre="
				+ cub_Nombre + ", cub_Estado=" + cub_Estado + ", cub_Inventario=" + cub_Inventario
				+ ", cub_firmaaceptacion=" + cub_firmaaceptacion + ", user_Nombre=" + user_Nombre + "]";
	}


	

}
