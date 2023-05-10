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
	private String cap_dos_ev;
	private double cap_tres;	
	private double cap_tres_p;
	private String cap_tres_ev;
	private double cap_cuatro;
	private double cap_cuatro_p;
	private String cap_cuatro_ev;
	private double cap_cinco;
	private double cap_cinco_p;
	private String cap_cinco_ev;
	private double otros;
	private double otros_p;
	private String otros_ev;
	private double total;
	private double total_p;
	private String total_ev;
	private double recurso_no_asignado;
	private double recurso_no_asignado_p;
	private String recurso_no_asignado_ev;
	
	
	
	public RecursoEjercido() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public RecursoEjercido(int id, int id_periodo, int id_departamento, double cap_dos, double cap_dos_p,
			String cap_dos_ev, double cap_tres, double cap_tres_p, String cap_tres_ev, double cap_cuatro,
			double cap_cuatro_p, String cap_cuatro_ev, double cap_cinco, double cap_cinco_p, String cap_cinco_ev,
			double otros, double otros_p, String otros_ev, double total, double total_p, String total_ev,
			double recurso_no_asignado, double recurso_no_asignado_p, String recurso_no_asignado_ev) {
		super();
		this.id = id;
		this.id_periodo = id_periodo;
		this.id_departamento = id_departamento;
		this.cap_dos = cap_dos;
		this.cap_dos_p = cap_dos_p;
		this.cap_dos_ev = cap_dos_ev;
		this.cap_tres = cap_tres;
		this.cap_tres_p = cap_tres_p;
		this.cap_tres_ev = cap_tres_ev;
		this.cap_cuatro = cap_cuatro;
		this.cap_cuatro_p = cap_cuatro_p;
		this.cap_cuatro_ev = cap_cuatro_ev;
		this.cap_cinco = cap_cinco;
		this.cap_cinco_p = cap_cinco_p;
		this.cap_cinco_ev = cap_cinco_ev;
		this.otros = otros;
		this.otros_p = otros_p;
		this.otros_ev = otros_ev;
		this.total = total;
		this.total_p = total_p;
		this.total_ev = total_ev;
		this.recurso_no_asignado = recurso_no_asignado;
		this.recurso_no_asignado_p = recurso_no_asignado_p;
		this.recurso_no_asignado_ev = recurso_no_asignado_ev;
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
	
	public String getCap_dos_ev() {
		return cap_dos_ev;
	}



	public void setCap_dos_ev(String cap_dos_ev) {
		this.cap_dos_ev = cap_dos_ev;
	}



	public double getCap_tres() {
		return cap_tres;
	}



	public void setCap_tres(double cap_tres) {
		this.cap_tres = cap_tres;
	}



	public double getCap_tres_p() {
		return cap_tres_p;
	}



	public void setCap_tres_p(double cap_tres_p) {
		this.cap_tres_p = cap_tres_p;
	}



	public String getCap_tres_ev() {
		return cap_tres_ev;
	}



	public void setCap_tres_ev(String cap_tres_ev) {
		this.cap_tres_ev = cap_tres_ev;
	}



	public double getCap_cuatro() {
		return cap_cuatro;
	}



	public void setCap_cuatro(double cap_cuatro) {
		this.cap_cuatro = cap_cuatro;
	}



	public double getCap_cuatro_p() {
		return cap_cuatro_p;
	}



	public void setCap_cuatro_p(double cap_cuatro_p) {
		this.cap_cuatro_p = cap_cuatro_p;
	}



	public String getCap_cuatro_ev() {
		return cap_cuatro_ev;
	}



	public void setCap_cuatro_ev(String cap_cuatro_ev) {
		this.cap_cuatro_ev = cap_cuatro_ev;
	}



	public double getCap_cinco() {
		return cap_cinco;
	}



	public void setCap_cinco(double cap_cinco) {
		this.cap_cinco = cap_cinco;
	}



	public double getCap_cinco_p() {
		return cap_cinco_p;
	}



	public void setCap_cinco_p(double cap_cinco_p) {
		this.cap_cinco_p = cap_cinco_p;
	}



	public String getCap_cinco_ev() {
		return cap_cinco_ev;
	}



	public void setCap_cinco_ev(String cap_cinco_ev) {
		this.cap_cinco_ev = cap_cinco_ev;
	}



	public double getOtros() {
		return otros;
	}



	public void setOtros(double otros) {
		this.otros = otros;
	}



	public double getOtros_p() {
		return otros_p;
	}



	public void setOtros_p(double otros_p) {
		this.otros_p = otros_p;
	}



	public String getOtros_ev() {
		return otros_ev;
	}



	public void setOtros_ev(String otros_ev) {
		this.otros_ev = otros_ev;
	}



	public double getTotal() {
		return total;
	}



	public void setTotal(double total) {
		this.total = total;
	}



	public double getTotal_p() {
		return total_p;
	}



	public void setTotal_p(double total_p) {
		this.total_p = total_p;
	}



	public String getTotal_ev() {
		return total_ev;
	}



	public void setTotal_ev(String total_ev) {
		this.total_ev = total_ev;
	}



	public double getRecurso_no_asignado() {
		return recurso_no_asignado;
	}



	public void setRecurso_no_asignado(double recurso_no_asignado) {
		this.recurso_no_asignado = recurso_no_asignado;
	}



	public double getRecurso_no_asignado_p() {
		return recurso_no_asignado_p;
	}



	public void setRecurso_no_asignado_p(double recurso_no_asignado_p) {
		this.recurso_no_asignado_p = recurso_no_asignado_p;
	}



	public String getRecurso_no_asignado_ev() {
		return recurso_no_asignado_ev;
	}



	public void setRecurso_no_asignado_ev(String recurso_no_asignado_ev) {
		this.recurso_no_asignado_ev = recurso_no_asignado_ev;
	}
	
	
	
	
	
	
	
	

}
