package com.gestiondocumentalserviciosdocentes.demo.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "gestionlaboratorio")
public class GestionLaboratorio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_gestionlaboratorio; 
	
	private int id_periodo; 
	
	private int id_laboratorio;
    
	private String geslab_inventarioinicial; 
	
	private String geslab_inventariofinal;
	
	private int  geslab_inventarioinicialestado;
	
	private String  geslab_inventarioinicialcomentario;
	
	private int  geslab_inventariofinalestado;
	
	private String  geslab_inventariofinalcomentario;

	public GestionLaboratorio() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GestionLaboratorio(int id_gestionlaboratorio, int id_periodo, int id_laboratorio,
			String geslab_inventarioinicial, String geslab_inventariofinal, int geslab_inventarioinicialestado,
			String geslab_inventarioinicialcomentario, int geslab_inventariofinalestado,
			String geslab_inventariofinalcomentario) {
		super();
		this.id_gestionlaboratorio = id_gestionlaboratorio;
		this.id_periodo = id_periodo;
		this.id_laboratorio = id_laboratorio;
		this.geslab_inventarioinicial = geslab_inventarioinicial;
		this.geslab_inventariofinal = geslab_inventariofinal;
		this.geslab_inventarioinicialestado = geslab_inventarioinicialestado;
		this.geslab_inventarioinicialcomentario = geslab_inventarioinicialcomentario;
		this.geslab_inventariofinalestado = geslab_inventariofinalestado;
		this.geslab_inventariofinalcomentario = geslab_inventariofinalcomentario;
	}

	public int getId_gestionlaboratorio() {
		return id_gestionlaboratorio;
	}

	public void setId_gestionlaboratorio(int id_gestionlaboratorio) {
		this.id_gestionlaboratorio = id_gestionlaboratorio;
	}

	public int getId_periodo() {
		return id_periodo;
	}

	public void setId_periodo(int id_periodo) {
		this.id_periodo = id_periodo;
	}

	public int getId_laboratorio() {
		return id_laboratorio;
	}

	public void setId_laboratorio(int id_laboratorio) {
		this.id_laboratorio = id_laboratorio;
	}

	public String getGeslab_inventarioinicial() {
		return geslab_inventarioinicial;
	}

	public void setGeslab_inventarioinicial(String geslab_inventarioinicial) {
		this.geslab_inventarioinicial = geslab_inventarioinicial;
	}

	public String getGeslab_inventariofinal() {
		return geslab_inventariofinal;
	}

	public void setGeslab_inventariofinal(String geslab_inventariofinal) {
		this.geslab_inventariofinal = geslab_inventariofinal;
	}

	public int getGeslab_inventarioinicialestado() {
		return geslab_inventarioinicialestado;
	}

	public void setGeslab_inventarioinicialestado(int geslab_inventarioinicialestado) {
		this.geslab_inventarioinicialestado = geslab_inventarioinicialestado;
	}

	public String getGeslab_inventarioinicialcomentario() {
		return geslab_inventarioinicialcomentario;
	}

	public void setGeslab_inventarioinicialcomentario(String geslab_inventarioinicialcomentario) {
		this.geslab_inventarioinicialcomentario = geslab_inventarioinicialcomentario;
	}

	public int getGeslab_inventariofinalestado() {
		return geslab_inventariofinalestado;
	}

	public void setGeslab_inventariofinalestado(int geslab_inventariofinalestado) {
		this.geslab_inventariofinalestado = geslab_inventariofinalestado;
	}

	public String getGeslab_inventariofinalcomentario() {
		return geslab_inventariofinalcomentario;
	}

	public void setGeslab_inventariofinalcomentario(String geslab_inventariofinalcomentario) {
		this.geslab_inventariofinalcomentario = geslab_inventariofinalcomentario;
	}

	@Override
	public String toString() {
		return "GestionLaboratorio [id_gestionlaboratorio=" + id_gestionlaboratorio + ", id_periodo=" + id_periodo
				+ ", id_laboratorio=" + id_laboratorio + ", geslab_inventarioinicial=" + geslab_inventarioinicial
				+ ", geslab_inventariofinal=" + geslab_inventariofinal + ", geslab_inventarioinicialestado="
				+ geslab_inventarioinicialestado + ", geslab_inventarioinicialcomentario="
				+ geslab_inventarioinicialcomentario + ", geslab_inventariofinalestado=" + geslab_inventariofinalestado
				+ ", geslab_inventariofinalcomentario=" + geslab_inventariofinalcomentario + "]";
	}

	
}
