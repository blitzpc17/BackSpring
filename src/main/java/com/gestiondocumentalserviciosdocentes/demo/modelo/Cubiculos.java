package com.gestiondocumentalserviciosdocentes.demo.modelo;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cubiculos")
public class Cubiculos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_Cubiculo;
	
	private int id_Usuarios;
	private String cub_Nombre;
	private int cub_Estado;
	private String cub_Inventario;
	private String cub_firmaaceptacion;
	private String cub_creado_por;
	private Date cub_fecha_creacion;
	private String cub_actualizado_por;
	private Date cub_fecha_actualizacion;
	
	
	public Cubiculos() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Cubiculos(int id_Cubiculo, int id_Usuarios, String cub_Nombre, int cub_Estado, String cub_Inventario,
			String cub_firmaaceptacion, String cub_creado_por, Date cub_fecha_creacion, String cub_actualizado_por,
			Date cub_fecha_actualizacion) {
		super();
		this.id_Cubiculo = id_Cubiculo;
		this.id_Usuarios = id_Usuarios;
		this.cub_Nombre = cub_Nombre;
		this.cub_Estado = cub_Estado;
		this.cub_Inventario = cub_Inventario;
		this.cub_firmaaceptacion = cub_firmaaceptacion;
		this.cub_creado_por = cub_creado_por;
		this.cub_fecha_creacion = cub_fecha_creacion;
		this.cub_actualizado_por = cub_actualizado_por;
		this.cub_fecha_actualizacion = cub_fecha_actualizacion;
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


	public String getCub_creado_por() {
		return cub_creado_por;
	}


	public void setCub_creado_por(String cub_creado_por) {
		this.cub_creado_por = cub_creado_por;
	}


	public Date getCub_fecha_creacion() {
		return cub_fecha_creacion;
	}


	public void setCub_fecha_creacion(Date cub_fecha_creacion) {
		this.cub_fecha_creacion = cub_fecha_creacion;
	}


	public String getCub_actualizado_por() {
		return cub_actualizado_por;
	}


	public void setCub_actualizado_por(String cub_actualizado_por) {
		this.cub_actualizado_por = cub_actualizado_por;
	}


	public Date getCub_fecha_actualizacion() {
		return cub_fecha_actualizacion;
	}


	public void setCub_fecha_actualizacion(Date cub_fecha_actualizacion) {
		this.cub_fecha_actualizacion = cub_fecha_actualizacion;
	}


	@Override
	public String toString() {
		return "Cubiculos [id_Cubiculo=" + id_Cubiculo + ", id_Usuarios=" + id_Usuarios + ", cub_Nombre=" + cub_Nombre
				+ ", cub_Estado=" + cub_Estado + ", cub_Inventario=" + cub_Inventario + ", cub_firmaaceptacion="
				+ cub_firmaaceptacion + ", cub_creado_por=" + cub_creado_por + ", cub_fecha_creacion="
				+ cub_fecha_creacion + ", cub_actualizado_por=" + cub_actualizado_por + ", cub_fecha_actualizacion="
				+ cub_fecha_actualizacion + "]";
	}




	
}
