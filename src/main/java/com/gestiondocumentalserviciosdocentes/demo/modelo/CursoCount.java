package com.gestiondocumentalserviciosdocentes.demo.modelo;

public class CursoCount {

	private int id_Curso;
	private String curso_Nombre_Curso;
	private String curso_Tipo;
	private int curso_Estado;
	private String inst_Temario;
	private int curso_Visualizacion;
	private int curso_cantidad_instancia;
	public CursoCount() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CursoCount(int id_Curso, String curso_Nombre_Curso, String curso_Tipo, int curso_Estado, String inst_Temario,
			int curso_Visualizacion, int curso_cantidad_instancia) {
		super();
		this.id_Curso = id_Curso;
		this.curso_Nombre_Curso = curso_Nombre_Curso;
		this.curso_Tipo = curso_Tipo;
		this.curso_Estado = curso_Estado;
		this.inst_Temario = inst_Temario;
		this.curso_Visualizacion = curso_Visualizacion;
		this.curso_cantidad_instancia = curso_cantidad_instancia;
	}
	public int getId_Curso() {
		return id_Curso;
	}
	public void setId_Curso(int id_Curso) {
		this.id_Curso = id_Curso;
	}
	public String getCurso_Nombre_Curso() {
		return curso_Nombre_Curso;
	}
	public void setCurso_Nombre_Curso(String curso_Nombre_Curso) {
		this.curso_Nombre_Curso = curso_Nombre_Curso;
	}
	public String getCurso_Tipo() {
		return curso_Tipo;
	}
	public void setCurso_Tipo(String curso_Tipo) {
		this.curso_Tipo = curso_Tipo;
	}
	public int getCurso_Estado() {
		return curso_Estado;
	}
	public void setCurso_Estado(int curso_Estado) {
		this.curso_Estado = curso_Estado;
	}
	public String getInst_Temario() {
		return inst_Temario;
	}
	public void setInst_Temario(String inst_Temario) {
		this.inst_Temario = inst_Temario;
	}
	public int getCurso_Visualizacion() {
		return curso_Visualizacion;
	}
	public void setCurso_Visualizacion(int curso_Visualizacion) {
		this.curso_Visualizacion = curso_Visualizacion;
	}
	public int getCurso_cantidad_instancia() {
		return curso_cantidad_instancia;
	}
	public void setCurso_cantidad_instancia(int curso_cantidad_instancia) {
		this.curso_cantidad_instancia = curso_cantidad_instancia;
	}
	@Override
	public String toString() {
		return "CursoCount [id_Curso=" + id_Curso + ", curso_Nombre_Curso=" + curso_Nombre_Curso + ", curso_Tipo="
				+ curso_Tipo + ", curso_Estado=" + curso_Estado + ", inst_Temario=" + inst_Temario
				+ ", curso_Visualizacion=" + curso_Visualizacion + ", curso_cantidad_instancia="
				+ curso_cantidad_instancia + "]";
	}
	
}
