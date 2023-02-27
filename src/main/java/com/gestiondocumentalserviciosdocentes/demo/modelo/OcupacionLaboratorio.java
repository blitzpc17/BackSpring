package com.gestiondocumentalserviciosdocentes.demo.modelo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ocupacionlaboratorio")
public class OcupacionLaboratorio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_ocupacionlaboratorio;
	
	private int id_gestionlaboratorio;
	
    private String oculab_titulo;
    
    private int oculab_estado;
    
	private Date oculab_fechahorainicio;
		
	private Date  oculab_fechahoratermino;

	public OcupacionLaboratorio() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OcupacionLaboratorio(int id_ocupacionlaboratorio, int id_gestionlaboratorio, String oculab_titulo,
			int oculab_estado, Date oculab_fechahorainicio, Date oculab_fechahoratermino) {
		super();
		this.id_ocupacionlaboratorio = id_ocupacionlaboratorio;
		this.id_gestionlaboratorio = id_gestionlaboratorio;
		this.oculab_titulo = oculab_titulo;
		this.oculab_estado = oculab_estado;
		this.oculab_fechahorainicio = oculab_fechahorainicio;
		this.oculab_fechahoratermino = oculab_fechahoratermino;
	}

	public int getId_ocupacionlaboratorio() {
		return id_ocupacionlaboratorio;
	}

	public void setId_ocupacionlaboratorio(int id_ocupacionlaboratorio) {
		this.id_ocupacionlaboratorio = id_ocupacionlaboratorio;
	}

	public int getId_gestionlaboratorio() {
		return id_gestionlaboratorio;
	}

	public void setId_gestionlaboratorio(int id_gestionlaboratorio) {
		this.id_gestionlaboratorio = id_gestionlaboratorio;
	}

	public String getOculab_titulo() {
		return oculab_titulo;
	}

	public void setOculab_titulo(String oculab_titulo) {
		this.oculab_titulo = oculab_titulo;
	}

	public int getOculab_estado() {
		return oculab_estado;
	}

	public void setOculab_estado(int oculab_estado) {
		this.oculab_estado = oculab_estado;
	}

	public Date getOculab_fechahorainicio() {
		return oculab_fechahorainicio;
	}

	public void setOculab_fechahorainicio(Date oculab_fechahorainicio) {
		this.oculab_fechahorainicio = oculab_fechahorainicio;
	}

	public Date getOculab_fechahoratermino() {
		return oculab_fechahoratermino;
	}

	public void setOculab_fechahoratermino(Date oculab_fechahoratermino) {
		this.oculab_fechahoratermino = oculab_fechahoratermino;
	}

	@Override
	public String toString() {
		return "OcupacionLaboratorio [id_ocupacionlaboratorio=" + id_ocupacionlaboratorio + ", id_gestionlaboratorio="
				+ id_gestionlaboratorio + ", oculab_titulo=" + oculab_titulo + ", oculab_estado=" + oculab_estado
				+ ", oculab_fechahorainicio=" + oculab_fechahorainicio + ", oculab_fechahoratermino="
				+ oculab_fechahoratermino + "]";
	}

	
	
}
