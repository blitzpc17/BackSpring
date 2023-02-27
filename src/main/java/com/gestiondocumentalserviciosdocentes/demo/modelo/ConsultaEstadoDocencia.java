package com.gestiondocumentalserviciosdocentes.demo.modelo;

public class ConsultaEstadoDocencia {
	private int id_docper;
	
	private int id_usuarios;
	
	private String nombredocente;
	
	private int id_periodo;
	
	private int actdoc_estadocomentario;

	public ConsultaEstadoDocencia() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ConsultaEstadoDocencia(int id_docper, int id_usuarios, String nombredocente, int id_periodo,
			int actdoc_estadocomentario) {
		super();
		this.id_docper = id_docper;
		this.id_usuarios = id_usuarios;
		this.nombredocente = nombredocente;
		this.id_periodo = id_periodo;
		this.actdoc_estadocomentario = actdoc_estadocomentario;
	}

	public int getId_docper() {
		return id_docper;
	}

	public void setId_docper(int id_docper) {
		this.id_docper = id_docper;
	}

	public int getId_usuarios() {
		return id_usuarios;
	}

	public void setId_usuarios(int id_usuarios) {
		this.id_usuarios = id_usuarios;
	}

	public String getNombredocente() {
		return nombredocente;
	}

	public void setNombredocente(String nombredocente) {
		this.nombredocente = nombredocente;
	}

	public int getId_periodo() {
		return id_periodo;
	}

	public void setId_periodo(int id_periodo) {
		this.id_periodo = id_periodo;
	}

	public int getActdoc_estadocomentario() {
		return actdoc_estadocomentario;
	}

	public void setActdoc_estadocomentario(int actdoc_estadocomentario) {
		this.actdoc_estadocomentario = actdoc_estadocomentario;
	}

	@Override
	public String toString() {
		return "ConsultaEstadoDocencia [id_docper=" + id_docper + ", id_usuarios=" + id_usuarios + ", nombredocente="
				+ nombredocente + ", id_periodo=" + id_periodo + ", actdoc_estadocomentario=" + actdoc_estadocomentario
				+ "]";
	}

	
	
}
