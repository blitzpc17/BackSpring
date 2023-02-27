package com.gestiondocumentalserviciosdocentes.demo.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="departamento_desarrollo_Academico")
public class DepartamentoAcademico {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_Dep_Desa;
	
    private int  id_desarrollo_academico;
	private int  id_departamento;
	private String depac_pdf_diagnostico_necesidades;
	public DepartamentoAcademico() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DepartamentoAcademico(int id_Dep_Desa, int id_desarrollo_academico, int id_departamento,
			String depac_pdf_diagnostico_necesidades) {
		super();
		this.id_Dep_Desa = id_Dep_Desa;
		this.id_desarrollo_academico = id_desarrollo_academico;
		this.id_departamento = id_departamento;
		this.depac_pdf_diagnostico_necesidades = depac_pdf_diagnostico_necesidades;
	}
	public int getId_Dep_Desa() {
		return id_Dep_Desa;
	}
	public void setId_Dep_Desa(int id_Dep_Desa) {
		this.id_Dep_Desa = id_Dep_Desa;
	}
	public int getId_desarrollo_academico() {
		return id_desarrollo_academico;
	}
	public void setId_desarrollo_academico(int id_desarrollo_academico) {
		this.id_desarrollo_academico = id_desarrollo_academico;
	}
	public int getId_departamento() {
		return id_departamento;
	}
	public void setId_departamento(int id_departamento) {
		this.id_departamento = id_departamento;
	}
	public String getDepac_pdf_diagnostico_necesidades() {
		return depac_pdf_diagnostico_necesidades;
	}
	public void setDepac_pdf_diagnostico_necesidades(String depac_pdf_diagnostico_necesidades) {
		this.depac_pdf_diagnostico_necesidades = depac_pdf_diagnostico_necesidades;
	}
	@Override
	public String toString() {
		return "DepartamentoAcademico [id_Dep_Desa=" + id_Dep_Desa + ", id_desarrollo_academico="
				+ id_desarrollo_academico + ", id_departamento=" + id_departamento
				+ ", depac_pdf_diagnostico_necesidades=" + depac_pdf_diagnostico_necesidades + "]";
	}
	

}
