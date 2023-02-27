package com.gestiondocumentalserviciosdocentes.demo.modelo;

public class DateInn {
	
	private int id_innovacion;
	private int id_departamento;
	private String inn_etapa ;
	private int inn_año ;
	private int inn_numero ;
	private String inn_folio ;
	private  String inn_proyecto ;
	private String inn_categoria ;
	private int inn_semestre ;
	private String inn_autor ;
	private String inn_no_control ;
	private String inn_asesor ;
	private String inn_tipo_asesor ;
	private int inn_departamento ;
	private String inn_nombre_departamento ;
	public DateInn() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DateInn(int id_innovacion, int id_departamento, String inn_etapa, int inn_año, int inn_numero,
			String inn_folio, String inn_proyecto, String inn_categoria, int inn_semestre, String inn_autor,
			String inn_no_control, String inn_asesor, String inn_tipo_asesor, int inn_departamento,
			String inn_nombre_departamento) {
		super();
		this.id_innovacion = id_innovacion;
		this.id_departamento = id_departamento;
		this.inn_etapa = inn_etapa;
		this.inn_año = inn_año;
		this.inn_numero = inn_numero;
		this.inn_folio = inn_folio;
		this.inn_proyecto = inn_proyecto;
		this.inn_categoria = inn_categoria;
		this.inn_semestre = inn_semestre;
		this.inn_autor = inn_autor;
		this.inn_no_control = inn_no_control;
		this.inn_asesor = inn_asesor;
		this.inn_tipo_asesor = inn_tipo_asesor;
		this.inn_departamento = inn_departamento;
		this.inn_nombre_departamento = inn_nombre_departamento;
	}
	public int getId_innovacion() {
		return id_innovacion;
	}
	public void setId_innovacion(int id_innovacion) {
		this.id_innovacion = id_innovacion;
	}
	public int getId_departamento() {
		return id_departamento;
	}
	public void setId_departamento(int id_departamento) {
		this.id_departamento = id_departamento;
	}
	public String getInn_etapa() {
		return inn_etapa;
	}
	public void setInn_etapa(String inn_etapa) {
		this.inn_etapa = inn_etapa;
	}
	public int getInn_año() {
		return inn_año;
	}
	public void setInn_año(int inn_año) {
		this.inn_año = inn_año;
	}
	public int getInn_numero() {
		return inn_numero;
	}
	public void setInn_numero(int inn_numero) {
		this.inn_numero = inn_numero;
	}
	public String getInn_folio() {
		return inn_folio;
	}
	public void setInn_folio(String inn_folio) {
		this.inn_folio = inn_folio;
	}
	public String getInn_proyecto() {
		return inn_proyecto;
	}
	public void setInn_proyecto(String inn_proyecto) {
		this.inn_proyecto = inn_proyecto;
	}
	public String getInn_categoria() {
		return inn_categoria;
	}
	public void setInn_categoria(String inn_categoria) {
		this.inn_categoria = inn_categoria;
	}
	public int getInn_semestre() {
		return inn_semestre;
	}
	public void setInn_semestre(int inn_semestre) {
		this.inn_semestre = inn_semestre;
	}
	public String getInn_autor() {
		return inn_autor;
	}
	public void setInn_autor(String inn_autor) {
		this.inn_autor = inn_autor;
	}
	public String getInn_no_control() {
		return inn_no_control;
	}
	public void setInn_no_control(String inn_no_control) {
		this.inn_no_control = inn_no_control;
	}
	public String getInn_asesor() {
		return inn_asesor;
	}
	public void setInn_asesor(String inn_asesor) {
		this.inn_asesor = inn_asesor;
	}
	public String getInn_tipo_asesor() {
		return inn_tipo_asesor;
	}
	public void setInn_tipo_asesor(String inn_tipo_asesor) {
		this.inn_tipo_asesor = inn_tipo_asesor;
	}
	public int getInn_departamento() {
		return inn_departamento;
	}
	public void setInn_departamento(int inn_departamento) {
		this.inn_departamento = inn_departamento;
	}
	public String getInn_nombre_departamento() {
		return inn_nombre_departamento;
	}
	public void setInn_nombre_departamento(String inn_nombre_departamento) {
		this.inn_nombre_departamento = inn_nombre_departamento;
	}
	@Override
	public String toString() {
		return "DateInn [id_innovacion=" + id_innovacion + ", id_departamento=" + id_departamento + ", inn_etapa="
				+ inn_etapa + ", inn_año=" + inn_año + ", inn_numero=" + inn_numero + ", inn_folio=" + inn_folio
				+ ", inn_proyecto=" + inn_proyecto + ", inn_categoria=" + inn_categoria + ", inn_semestre="
				+ inn_semestre + ", inn_autor=" + inn_autor + ", inn_no_control=" + inn_no_control + ", inn_asesor="
				+ inn_asesor + ", inn_tipo_asesor=" + inn_tipo_asesor + ", inn_departamento=" + inn_departamento
				+ ", inn_nombre_departamento=" + inn_nombre_departamento + "]";
	}
	
	

}
