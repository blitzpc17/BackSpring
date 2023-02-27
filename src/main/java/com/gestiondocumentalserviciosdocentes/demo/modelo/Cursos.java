package com.gestiondocumentalserviciosdocentes.demo.modelo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="catalogo_cursos")
public class Cursos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_Curso;
	private int id_Departamento;
	private int id_Usuarios;
    private String curso_Nombre;
	private String curso_Tipo;
	private int curso_Cupo;
	private int curso_Horas;
	private int curso_Estado;
	private int curso_Visualizacion;
	private String curso_pdf_Temario;	
	private String curso_creado_por;
	private Date curso_fecha_creacion;
	private String curso_actualizado_por;
	private Date curso_fecha_actualizacion;
	public Cursos() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cursos(int id_Curso, int id_Departamento, int id_Usuarios, String curso_Nombre, String curso_Tipo,
			int curso_Cupo, int curso_Horas, int curso_Estado, int curso_Visualizacion, String curso_pdf_Temario,
			String curso_creado_por, Date curso_fecha_creacion, String curso_actualizado_por,
			Date curso_fecha_actualizacion) {
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
		this.curso_creado_por = curso_creado_por;
		this.curso_fecha_creacion = curso_fecha_creacion;
		this.curso_actualizado_por = curso_actualizado_por;
		this.curso_fecha_actualizacion = curso_fecha_actualizacion;
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
	public int getCurso_Estado() {
		return curso_Estado;
	}
	public void setCurso_Estado(int curso_Estado) {
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
	public String getCurso_creado_por() {
		return curso_creado_por;
	}
	public void setCurso_creado_por(String curso_creado_por) {
		this.curso_creado_por = curso_creado_por;
	}
	public Date getCurso_fecha_creacion() {
		return curso_fecha_creacion;
	}
	public void setCurso_fecha_creacion(Date curso_fecha_creacion) {
		this.curso_fecha_creacion = curso_fecha_creacion;
	}
	public String getCurso_actualizado_por() {
		return curso_actualizado_por;
	}
	public void setCurso_actualizado_por(String curso_actualizado_por) {
		this.curso_actualizado_por = curso_actualizado_por;
	}
	public Date getCurso_fecha_actualizacion() {
		return curso_fecha_actualizacion;
	}
	public void setCurso_fecha_actualizacion(Date curso_fecha_actualizacion) {
		this.curso_fecha_actualizacion = curso_fecha_actualizacion;
	}
	@Override
	public String toString() {
		return "Cursos [id_Curso=" + id_Curso + ", id_Departamento=" + id_Departamento + ", id_Usuarios=" + id_Usuarios
				+ ", curso_Nombre=" + curso_Nombre + ", curso_Tipo=" + curso_Tipo + ", curso_Cupo=" + curso_Cupo
				+ ", curso_Horas=" + curso_Horas + ", curso_Estado=" + curso_Estado + ", curso_Visualizacion="
				+ curso_Visualizacion + ", curso_pdf_Temario=" + curso_pdf_Temario + ", curso_creado_por="
				+ curso_creado_por + ", curso_fecha_creacion=" + curso_fecha_creacion + ", curso_actualizado_por="
				+ curso_actualizado_por + ", curso_fecha_actualizacion=" + curso_fecha_actualizacion + "]";
	}
	
	

}
