package com.gestiondocumentalserviciosdocentes.demo.modelo;

public class DocenteCubiculo {
	private int id_cubiculo;
	private int id_usuarios;
	private String user_nombre;
	private String cub_nombre;
	private int cub_estado;
	private String cub_inventario;
	private String cub_firmaaceptacion;
	public DocenteCubiculo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DocenteCubiculo(int id_cubiculo, int id_usuarios, String user_nombre, String cub_nombre, int cub_estado,
			String cub_inventario, String cub_firmaaceptacion) {
		super();
		this.id_cubiculo = id_cubiculo;
		this.id_usuarios = id_usuarios;
		this.user_nombre = user_nombre;
		this.cub_nombre = cub_nombre;
		this.cub_estado = cub_estado;
		this.cub_inventario = cub_inventario;
		this.cub_firmaaceptacion = cub_firmaaceptacion;
	}
	public int getId_cubiculo() {
		return id_cubiculo;
	}
	public void setId_cubiculo(int id_cubiculo) {
		this.id_cubiculo = id_cubiculo;
	}
	public int getId_usuarios() {
		return id_usuarios;
	}
	public void setId_usuarios(int id_usuarios) {
		this.id_usuarios = id_usuarios;
	}
	public String getUser_nombre() {
		return user_nombre;
	}
	public void setUser_nombre(String user_nombre) {
		this.user_nombre = user_nombre;
	}
	public String getCub_nombre() {
		return cub_nombre;
	}
	public void setCub_nombre(String cub_nombre) {
		this.cub_nombre = cub_nombre;
	}
	public int getCub_estado() {
		return cub_estado;
	}
	public void setCub_estado(int cub_estado) {
		this.cub_estado = cub_estado;
	}
	public String getCub_inventario() {
		return cub_inventario;
	}
	public void setCub_inventario(String cub_inventario) {
		this.cub_inventario = cub_inventario;
	}
	public String getCub_firmaaceptacion() {
		return cub_firmaaceptacion;
	}
	public void setCub_firmaaceptacion(String cub_firmaaceptacion) {
		this.cub_firmaaceptacion = cub_firmaaceptacion;
	}
	@Override
	public String toString() {
		return "DocenteCubiculo [id_cubiculo=" + id_cubiculo + ", id_usuarios=" + id_usuarios + ", user_nombre="
				+ user_nombre + ", cub_nombre=" + cub_nombre + ", cub_estado=" + cub_estado + ", cub_inventario="
				+ cub_inventario + ", cub_firmaaceptacion=" + cub_firmaaceptacion + "]";
	}
	
	
}
