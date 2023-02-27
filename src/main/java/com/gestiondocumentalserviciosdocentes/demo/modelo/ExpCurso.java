package com.gestiondocumentalserviciosdocentes.demo.modelo;

public class ExpCurso {
	private int id_Curso; 
	private int id_Instancia; 
    private String inst_Nombre_Curso; 
    private String inst_Empresa; 
	private String inst_Periodo;    
    private int inst_Asistentes; 
    private String inst_Tipo; 
    private String inst_docente_imparte;
    private int inst_Cupo; 
    private int inst_Horas;
	public ExpCurso() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ExpCurso(int id_Curso, int id_Instancia, String inst_Nombre_Curso, String inst_Empresa, String inst_Periodo,
			int inst_Asistentes, String inst_Tipo, String inst_docente_imparte, int inst_Cupo, int inst_Horas) {
		super();
		this.id_Curso = id_Curso;
		this.id_Instancia = id_Instancia;
		this.inst_Nombre_Curso = inst_Nombre_Curso;
		this.inst_Empresa = inst_Empresa;
		this.inst_Periodo = inst_Periodo;
		this.inst_Asistentes = inst_Asistentes;
		this.inst_Tipo = inst_Tipo;
		this.inst_docente_imparte = inst_docente_imparte;
		this.inst_Cupo = inst_Cupo;
		this.inst_Horas = inst_Horas;
	}
	public int getId_Curso() {
		return id_Curso;
	}
	public void setId_Curso(int id_Curso) {
		this.id_Curso = id_Curso;
	}
	public int getId_Instancia() {
		return id_Instancia;
	}
	public void setId_Instancia(int id_Instancia) {
		this.id_Instancia = id_Instancia;
	}
	public String getInst_Nombre_Curso() {
		return inst_Nombre_Curso;
	}
	public void setInst_Nombre_Curso(String inst_Nombre_Curso) {
		this.inst_Nombre_Curso = inst_Nombre_Curso;
	}
	public String getInst_Empresa() {
		return inst_Empresa;
	}
	public void setInst_Empresa(String inst_Empresa) {
		this.inst_Empresa = inst_Empresa;
	}
	public String getInst_Periodo() {
		return inst_Periodo;
	}
	public void setInst_Periodo(String inst_Periodo) {
		this.inst_Periodo = inst_Periodo;
	}
	public int getInst_Asistentes() {
		return inst_Asistentes;
	}
	public void setInst_Asistentes(int inst_Asistentes) {
		this.inst_Asistentes = inst_Asistentes;
	}
	public String getInst_Tipo() {
		return inst_Tipo;
	}
	public void setInst_Tipo(String inst_Tipo) {
		this.inst_Tipo = inst_Tipo;
	}
	public String getInst_docente_imparte() {
		return inst_docente_imparte;
	}
	public void setInst_docente_imparte(String inst_docente_imparte) {
		this.inst_docente_imparte = inst_docente_imparte;
	}
	public int getInst_Cupo() {
		return inst_Cupo;
	}
	public void setInst_Cupo(int inst_Cupo) {
		this.inst_Cupo = inst_Cupo;
	}
	public int getInst_Horas() {
		return inst_Horas;
	}
	public void setInst_Horas(int inst_Horas) {
		this.inst_Horas = inst_Horas;
	}
	@Override
	public String toString() {
		return "ExpCurso [id_Curso=" + id_Curso + ", id_Instancia=" + id_Instancia + ", inst_Nombre_Curso="
				+ inst_Nombre_Curso + ", inst_Empresa=" + inst_Empresa + ", inst_Periodo=" + inst_Periodo
				+ ", inst_Asistentes=" + inst_Asistentes + ", inst_Tipo=" + inst_Tipo + ", inst_docente_imparte="
				+ inst_docente_imparte + ", inst_Cupo=" + inst_Cupo + ", inst_Horas=" + inst_Horas + "]";
	}
    
    

}
