package com.gestiondocumentalserviciosdocentes.demo.modelo;

public class ConsultaCatalogo {
	
	private int id_Curso;
	private int id_Departamento;
	private int id_Usuarios;
	private String curso_Nombre;
	private String curso_Tipo;
	private int curso_Cupo;
	private int curso_Horas;
	private boolean curso_Estado;
	private int curso_Visualizacion;
	private String curso_pdf_Temario;
	private String user_Nombre;
	
	public ConsultaCatalogo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ConsultaCatalogo(int id_Curso, int id_Departamento, int id_Usuarios, String curso_Nombre, String curso_Tipo,
			int curso_Cupo, int curso_Horas, boolean curso_Estado, int curso_Visualizacion, String curso_pdf_Temario,
			String user_Nombre) {
		super();
		this.id_Curso = id_Curso;
		this.id_Departamento = id_Departamento;
		this.id_Usuarios = id_Usuarios;
		this.curso_Nombre = curso_Nombre;
		this.curso_Tipo = curso_Tipo;
		this.curso_Cupo = curso_Cupo;
		this.curso_Horas = curso_Horas;
		this.curso_Estado = curso_Estado;
		this.curso_Visualizacion = curso_Visualizacion;
		this.curso_pdf_Temario = curso_pdf_Temario;
		this.user_Nombre = user_Nombre;
	}

	public int getId_Curso() {
		return id_Curso;
	}

	public void setId_Curso(int id_Curso) {
		this.id_Curso = id_Curso;
	}

	public int getId_Departamento() {
		return id_Departamento;
	}

	public void setId_Departamento(int id_Departamento) {
		this.id_Departamento = id_Departamento;
	}

	public int getId_Usuarios() {
		return id_Usuarios;
	}

	public void setId_Usuarios(int id_Usuarios) {
		this.id_Usuarios = id_Usuarios;
	}

	public String getCurso_Nombre() {
		return curso_Nombre;
	}

	public void setCurso_Nombre(String curso_Nombre) {
		this.curso_Nombre = curso_Nombre;
	}

	public String getCurso_Tipo() {
		return curso_Tipo;
	}

	public void setCurso_Tipo(String curso_Tipo) {
		this.curso_Tipo = curso_Tipo;
	}

	public int getCurso_Cupo() {
		return curso_Cupo;
	}

	public void setCurso_Cupo(int curso_Cupo) {
		this.curso_Cupo = curso_Cupo;
	}

	public int getCurso_Horas() {
		return curso_Horas;
	}

	public void setCurso_Horas(int curso_Horas) {
		this.curso_Horas = curso_Horas;
	}

	public boolean isCurso_Estado() {
		return curso_Estado;
	}

	public void setCurso_Estado(boolean curso_Estado) {
		this.curso_Estado = curso_Estado;
	}

	public int getCurso_Visualizacion() {
		return curso_Visualizacion;
	}

	public void setCurso_Visualizacion(int curso_Visualizacion) {
		this.curso_Visualizacion = curso_Visualizacion;
	}

	public String getCurso_pdf_Temario() {
		return curso_pdf_Temario;
	}

	public void setCurso_pdf_Temario(String curso_pdf_Temario) {
		this.curso_pdf_Temario = curso_pdf_Temario;
	}

	public String getUser_Nombre() {
		return user_Nombre;
	}

	public void setUser_Nombre(String user_Nombre) {
		this.user_Nombre = user_Nombre;
	}

	@Override
	public String toString() {
		return "ConsultaCatalogo [id_Curso=" + id_Curso + ", id_Departamento=" + id_Departamento + ", id_Usuarios="
				+ id_Usuarios + ", curso_Nombre=" + curso_Nombre + ", curso_Tipo=" + curso_Tipo + ", curso_Cupo="
				+ curso_Cupo + ", curso_Horas=" + curso_Horas + ", curso_Estado=" + curso_Estado
				+ ", curso_Visualizacion=" + curso_Visualizacion + ", curso_pdf_Temario=" + curso_pdf_Temario
				+ ", user_Nombre=" + user_Nombre + "]";
	}

	

}
