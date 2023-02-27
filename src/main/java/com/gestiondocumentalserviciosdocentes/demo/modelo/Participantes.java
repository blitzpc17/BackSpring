package com.gestiondocumentalserviciosdocentes.demo.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="participantes")
public class Participantes {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_participante;
	
    private int id_capacitacion;
	private int id_Usuarios;
	private String part_pdf_encuesta;
	private String part_pdf_constancia;
	public Participantes() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Participantes(int id_participante, int id_capacitacion, int id_Usuarios, String part_pdf_encuesta,
			String part_pdf_constancia) {
		super();
		this.id_participante = id_participante;
		this.id_capacitacion = id_capacitacion;
		this.id_Usuarios = id_Usuarios;
		this.part_pdf_encuesta = part_pdf_encuesta;
		this.part_pdf_constancia = part_pdf_constancia;
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
	@Override
	public String toString() {
		return "Participantes [id_participante=" + id_participante + ", id_capacitacion=" + id_capacitacion
				+ ", id_Usuarios=" + id_Usuarios + ", part_pdf_encuesta=" + part_pdf_encuesta + ", part_pdf_constancia="
				+ part_pdf_constancia + "]";
	}
	
	

}
