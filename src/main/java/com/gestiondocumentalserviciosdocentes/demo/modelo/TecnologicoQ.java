package com.gestiondocumentalserviciosdocentes.demo.modelo;

public class TecnologicoQ {
	
	private int id_producto_doc; 
	private String nombre_producto_doc; 
	private int comp_residencia; 
	private int in_residencia; 
	private int comp_tesis; 
	private int in_tesis; 
	private int comp_articulo; 
	private int in_articulo; 
	private int comp_investigacion; 
	private int in_investigacion; 
	private int comp_computo; 
	private int in_computo;
	public TecnologicoQ() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TecnologicoQ(int id_producto_doc, String nombre_producto_doc, int comp_residencia, int in_residencia,
			int comp_tesis, int in_tesis, int comp_articulo, int in_articulo, int comp_investigacion,
			int in_investigacion, int comp_computo, int in_computo) {
		super();
		this.id_producto_doc = id_producto_doc;
		this.nombre_producto_doc = nombre_producto_doc;
		this.comp_residencia = comp_residencia;
		this.in_residencia = in_residencia;
		this.comp_tesis = comp_tesis;
		this.in_tesis = in_tesis;
		this.comp_articulo = comp_articulo;
		this.in_articulo = in_articulo;
		this.comp_investigacion = comp_investigacion;
		this.in_investigacion = in_investigacion;
		this.comp_computo = comp_computo;
		this.in_computo = in_computo;
	}
	public int getId_producto_doc() {
		return id_producto_doc;
	}
	public void setId_producto_doc(int id_producto_doc) {
		this.id_producto_doc = id_producto_doc;
	}
	public String getNombre_producto_doc() {
		return nombre_producto_doc;
	}
	public void setNombre_producto_doc(String nombre_producto_doc) {
		this.nombre_producto_doc = nombre_producto_doc;
	}
	public int getComp_residencia() {
		return comp_residencia;
	}
	public void setComp_residencia(int comp_residencia) {
		this.comp_residencia = comp_residencia;
	}
	public int getIn_residencia() {
		return in_residencia;
	}
	public void setIn_residencia(int in_residencia) {
		this.in_residencia = in_residencia;
	}
	public int getComp_tesis() {
		return comp_tesis;
	}
	public void setComp_tesis(int comp_tesis) {
		this.comp_tesis = comp_tesis;
	}
	public int getIn_tesis() {
		return in_tesis;
	}
	public void setIn_tesis(int in_tesis) {
		this.in_tesis = in_tesis;
	}
	public int getComp_articulo() {
		return comp_articulo;
	}
	public void setComp_articulo(int comp_articulo) {
		this.comp_articulo = comp_articulo;
	}
	public int getIn_articulo() {
		return in_articulo;
	}
	public void setIn_articulo(int in_articulo) {
		this.in_articulo = in_articulo;
	}
	public int getComp_investigacion() {
		return comp_investigacion;
	}
	public void setComp_investigacion(int comp_investigacion) {
		this.comp_investigacion = comp_investigacion;
	}
	public int getIn_investigacion() {
		return in_investigacion;
	}
	public void setIn_investigacion(int in_investigacion) {
		this.in_investigacion = in_investigacion;
	}
	public int getComp_computo() {
		return comp_computo;
	}
	public void setComp_computo(int comp_computo) {
		this.comp_computo = comp_computo;
	}
	public int getIn_computo() {
		return in_computo;
	}
	public void setIn_computo(int in_computo) {
		this.in_computo = in_computo;
	}
	@Override
	public String toString() {
		return "TecnologicoQ [id_producto_doc=" + id_producto_doc + ", nombre_producto_doc=" + nombre_producto_doc
				+ ", comp_residencia=" + comp_residencia + ", in_residencia=" + in_residencia + ", comp_tesis="
				+ comp_tesis + ", in_tesis=" + in_tesis + ", comp_articulo=" + comp_articulo + ", in_articulo="
				+ in_articulo + ", comp_investigacion=" + comp_investigacion + ", in_investigacion=" + in_investigacion
				+ ", comp_computo=" + comp_computo + ", in_computo=" + in_computo + "]";
	}
	
	

}
