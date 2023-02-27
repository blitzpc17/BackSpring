package com.gestiondocumentalserviciosdocentes.demo.modelo;

public class ParticipantesDocentes {
	
	private int id_participante;
    private int id_capacitacion;
	private int id_Usuarios;
	private String part_pdf_encuesta;
	private String part_pdf_constancia;
	private String nombre;
	private int row;
	private String fecha;
	
	public ParticipantesDocentes() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId_participante() {
		return id_participante;
	}

	public void setId_participante(int id_participante) {
		this.id_participante = id_participante;
	}

	public int getId_capacitacion() {
		return id_capacitacion;
	}

	public void setId_capacitacion(int id_capacitacion) {
		this.id_capacitacion = id_capacitacion;
	}

	public int getId_Usuarios() {
		return id_Usuarios;
	}

	public void setId_Usuarios(int id_Usuarios) {
		this.id_Usuarios = id_Usuarios;
	}

	public String getPart_pdf_encuesta() {
		return part_pdf_encuesta;
	}

	public void setPart_pdf_encuesta(String part_pdf_encuesta) {
		this.part_pdf_encuesta = part_pdf_encuesta;
	}

	public String getPart_pdf_constancia() {
		return part_pdf_constancia;
	}

	public void setPart_pdf_constancia(String part_pdf_constancia) {
		this.part_pdf_constancia = part_pdf_constancia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

}
