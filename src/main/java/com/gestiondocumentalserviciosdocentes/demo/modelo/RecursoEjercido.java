package com.gestiondocumentalserviciosdocentes.demo.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "recurso_ejercido")
public class RecursoEjercido {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int id_periodo;
	private int id_departamento;
	private double cap_dos;
	private double cap_dos_p;
	private String evidencia;
	
	public RecursoEjercido() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RecursoEjercido(int id, int id_periodo, int id_departamento, double cap_dos, double cap_dos_p,
			String evidencia) {
		super();
		this.id = id;
		this.id_periodo = id_periodo;
		this.id_departamento = id_departamento;
		this.cap_dos = cap_dos;
		this.cap_dos_p = cap_dos_p;
		this.evidencia = evidencia;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId_periodo() {
		return id_periodo;
	}

	public void setId_periodo(int id_periodo) {
		this.id_periodo = id_periodo;
	}

	public int getId_departamento() {
		return id_departamento;
	}

	public void setId_departamento(int id_departamento) {
		this.id_departamento = id_departamento;
	}

	public double getCap_dos() {
		return cap_dos;
	}

	public void setCap_dos(double cap_dos) {
		this.cap_dos = cap_dos;
	}

	public double getCap_dos_p() {
		return cap_dos_p;
	}

	public void setCap_dos_p(double cap_dos_p) {
		this.cap_dos_p = cap_dos_p;
	}

	public String getEvidencia() {
		return evidencia;
	}

	public void setEvidencia(String evidencia) {
		this.evidencia = evidencia;
	}
	
	
	
	
	
	
	
	

}
