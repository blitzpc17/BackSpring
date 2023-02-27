package com.gestiondocumentalserviciosdocentes.demo.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="intancias_cursos")
public class Instancias {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_Instancia;
	private int id_Curso;
    private String inst_Empresa;
    private int inst_Asistentes;
    private String inst_Periodo;
	public Instancias() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Instancias(int id_Instancia, int id_Curso, String inst_Empresa, int inst_Asistentes, String inst_Periodo) {
		super();
		this.id_Instancia = id_Instancia;
		this.id_Curso = id_Curso;
		this.inst_Empresa = inst_Empresa;
		this.inst_Asistentes = inst_Asistentes;
		this.inst_Periodo = inst_Periodo;
	}
	public int getId_Instancia() {
		return id_Instancia;
	}
	public void setId_Instancia(int id_Instancia) {
		this.id_Instancia = id_Instancia;
	}
	public int getId_Curso() {
		return id_Curso;
	}
	public void setId_Curso(int id_Curso) {
		this.id_Curso = id_Curso;
	}
	public String getInst_Empresa() {
		return inst_Empresa;
	}
	public void setInst_Empresa(String inst_Empresa) {
		this.inst_Empresa = inst_Empresa;
	}
	public int getInst_Asistentes() {
		return inst_Asistentes;
	}
	public void setInst_Asistentes(int inst_Asistentes) {
		this.inst_Asistentes = inst_Asistentes;
	}
	public String getInst_Periodo() {
		return inst_Periodo;
	}
	public void setInst_Periodo(String inst_Periodo) {
		this.inst_Periodo = inst_Periodo;
	}
	@Override
	public String toString() {
		return "Instancias [id_Instancia=" + id_Instancia + ", id_Curso=" + id_Curso + ", inst_Empresa=" + inst_Empresa
				+ ", inst_Asistentes=" + inst_Asistentes + ", inst_Periodo=" + inst_Periodo + "]";
	}
    
    

}
