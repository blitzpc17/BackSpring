package com.gestiondocumentalserviciosdocentes.demo.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "recurso_asignado")
public class RecursoAsignado {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	private int id_Periodo;
	private double Poa;
	private String PoaEvidencia;
	private double Pta;
	private String PtaEvidencia;
	private int id_Departamento;
	private double PagoInscripcion;
	private double MontoCaptado;
	private double MontoCaptadoTotal;
	
	public RecursoAsignado() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RecursoAsignado(int id, int id_Periodo, double poa, String poaEvidencia, double pta, String ptaEvidencia,
			int id_Departamento, double pagoInscripcion, double montoCaptado, double montoCaptadoTotal) {
		super();
		Id = id;
		this.id_Periodo = id_Periodo;
		Poa = poa;
		PoaEvidencia = poaEvidencia;
		Pta = pta;
		PtaEvidencia = ptaEvidencia;
		this.id_Departamento = id_Departamento;
		PagoInscripcion = pagoInscripcion;
		MontoCaptado = montoCaptado;
		MontoCaptadoTotal = montoCaptadoTotal;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public int getId_Periodo() {
		return id_Periodo;
	}

	public void setId_Periodo(int id_Periodo) {
		this.id_Periodo = id_Periodo;
	}

	public double getPoa() {
		return Poa;
	}

	public void setPoa(double poa) {
		Poa = poa;
	}

	public String getPoaEvidencia() {
		return PoaEvidencia;
	}

	public void setPoaEvidencia(String poaEvidencia) {
		PoaEvidencia = poaEvidencia;
	}

	public double getPta() {
		return Pta;
	}

	public void setPta(double pta) {
		Pta = pta;
	}

	public String getPtaEvidencia() {
		return PtaEvidencia;
	}

	public void setPtaEvidencia(String ptaEvidencia) {
		PtaEvidencia = ptaEvidencia;
	}

	public int getId_Departamento() {
		return id_Departamento;
	}

	public void setId_Departamento(int id_Departamento) {
		this.id_Departamento = id_Departamento;
	}

	public double getPagoInscripcion() {
		return PagoInscripcion;
	}

	public void setPagoInscripcion(double pagoInscripcion) {
		PagoInscripcion = pagoInscripcion;
	}

	public double getMontoCaptado() {
		return MontoCaptado;
	}

	public void setMontoCaptado(double montoCaptado) {
		MontoCaptado = montoCaptado;
	}

	public double getMontoCaptadoTotal() {
		return MontoCaptadoTotal;
	}

	public void setMontoCaptadoTotal(double montoCaptadoTotal) {
		MontoCaptadoTotal = montoCaptadoTotal;
	}
	
	
	
	
	
	
}
