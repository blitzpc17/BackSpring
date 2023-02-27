package com.gestiondocumentalserviciosdocentes.demo.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="interes_convocatoria")
public class InteresConvocatorias {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_interes_convocatoria;
	
	private int id_convocatoria;
	private int id_usuarios;
	private int interes;
	
	public InteresConvocatorias() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId_interes_convocatoria() {
		return id_interes_convocatoria;
	}

	public void setId_interes_convocatoria(int id_interes_convocatoria) {
		this.id_interes_convocatoria = id_interes_convocatoria;
	}

	public int getId_convocatoria() {
		return id_convocatoria;
	}

	public void setId_convocatoria(int id_convocatoria) {
		this.id_convocatoria = id_convocatoria;
	}

	public int getId_usuarios() {
		return id_usuarios;
	}

	public void setId_usuarios(int id_usuarios) {
		this.id_usuarios = id_usuarios;
	}

	public int getInteres() {
		return interes;
	}

	public void setInteres(int interes) {
		this.interes = interes;
	}
}
