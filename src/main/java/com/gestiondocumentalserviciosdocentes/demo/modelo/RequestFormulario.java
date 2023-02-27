package com.gestiondocumentalserviciosdocentes.demo.modelo;

public class RequestFormulario {

	private int iddep;
	private String dep_nombre;
	private String curso;
	private String correo;
	private String empresa;
	private String mensaje;
	
	public RequestFormulario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getIddep() {
		return iddep;
	}

	public void setIddep(int iddep) {
		this.iddep = iddep;
	}

	public String getDep_nombre() {
		return dep_nombre;
	}

	public void setDep_nombre(String dep_nombre) {
		this.dep_nombre = dep_nombre;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
}
