package com.gestiondocumentalserviciosdocentes.demo.modelo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cubiculos")
public class Cubiculo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_cubiculo; 
	
	private int id_usuarios; 
    
	private String cub_nombre; 
	
	private String cub_estado; 
	
	private String cub_inventario; 
	
	private String cub_firmaaceptacion; 
	
	private String cub_creado_por;
	
	private Date cub_fecha_creacion; 
	
	private String cub_actualizado_por; 
	
	private Date cub_fecha_actualizacion;
	
	public Cubiculo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cubiculo(int id_cubiculo, int id_usuarios, String cub_nombre, String cub_estado, String cub_inventario,
			String cub_firmaaceptacion, String cub_creado_por, Date cub_fecha_creacion, String cub_actualizado_por,
			Date cub_fecha_actualizacion) {
		super();
		this.id_cubiculo = id_cubiculo;
		this.id_usuarios = id_usuarios;
		this.cub_nombre = cub_nombre;
		this.cub_estado = cub_estado;
		this.cub_inventario = cub_inventario;
		this.cub_firmaaceptacion = cub_firmaaceptacion;
		this.cub_creado_por = cub_creado_por;
		this.cub_fecha_creacion = cub_fecha_creacion;
		this.cub_actualizado_por = cub_actualizado_por;
		this.cub_fecha_actualizacion = cub_fecha_actualizacion;
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
	public String getCub_nombre() {
		return cub_nombre;
	}
	public void setCub_nombre(String cub_nombre) {
		this.cub_nombre = cub_nombre;
	}
	public String getCub_estado() {
		return cub_estado;
	}
	public void setCub_estado(String cub_estado) {
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
		return "Cubiculo [id_cubiculo=" + id_cubiculo + ", id_usuarios=" + id_usuarios + ", cub_nombre=" + cub_nombre
				+ ", cub_estado=" + cub_estado + ", cub_inventario=" + cub_inventario + ", cub_firmaaceptacion="
				+ cub_firmaaceptacion + ", cub_creado_por=" + cub_creado_por + ", cub_fecha_creacion="
				+ cub_fecha_creacion + ", cub_actualizado_por=" + cub_actualizado_por + ", cub_fecha_actualizacion="
				+ cub_fecha_actualizacion + "]";
	} 

	
}
