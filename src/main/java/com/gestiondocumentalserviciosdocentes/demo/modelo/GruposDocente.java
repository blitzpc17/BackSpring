package com.gestiondocumentalserviciosdocentes.demo.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="grupos_docentes")
public class GruposDocente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_grupo;
	
	private int id_materia;
	private int id_docper;
	private String grp_grupo;
	
	public GruposDocente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId_grupo() {
		return id_grupo;
	}

	public void setId_grupo(int id_grupo) {
		this.id_grupo = id_grupo;
	}

	public int getId_materia() {
		return id_materia;
	}

	public void setId_materia(int id_materia) {
		this.id_materia = id_materia;
	}

	public int getId_docper() {
		return id_docper;
	}

	public void setId_docper(int id_docper) {
		this.id_docper = id_docper;
	}

	public String getGrp_grupo() {
		return grp_grupo;
	}

	public void setGrp_grupo(String grp_grupo) {
		this.grp_grupo = grp_grupo;
	}

}
