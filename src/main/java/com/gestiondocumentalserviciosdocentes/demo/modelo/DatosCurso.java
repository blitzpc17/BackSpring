package com.gestiondocumentalserviciosdocentes.demo.modelo;

public class DatosCurso {
	
	private String usuario;
	private String curso; 
	private String tipo; 
	private int cupo; 
	private int horas; 
	private String temario;
	public DatosCurso() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DatosCurso(String usuario, String curso, String tipo, int cupo, int horas, String temario) {
		super();
		this.usuario = usuario;
		this.curso = curso;
		this.tipo = tipo;
		this.cupo = cupo;
		this.horas = horas;
		this.temario = temario;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getCupo() {
		return cupo;
	}
	public void setCupo(int cupo) {
		this.cupo = cupo;
	}
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}
	public String getTemario() {
		return temario;
	}
	public void setTemario(String temario) {
		this.temario = temario;
	}
	@Override
	public String toString() {
		return "DatosCurso [usuario=" + usuario + ", curso=" + curso + ", tipo=" + tipo + ", cupo=" + cupo + ", horas="
				+ horas + ", temario=" + temario + "]";
	}
	
	

}
