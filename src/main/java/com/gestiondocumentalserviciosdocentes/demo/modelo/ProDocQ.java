package com.gestiondocumentalserviciosdocentes.demo.modelo;

public class ProDocQ {

	private int id_producto_doc;
	private String nombre_producto_doc;
	private int comp_residencia;
	private int in_residencia;
	private int comp_tesis;
	private int in_tesis;
	private int comp_articulo;
	private int in_articulo;
	private int comp_prototipo;
	private int in_prototipo;
	private int comp_investigacion;
	private int in_investigacion;
	private int comp_otro;
	private int in_otro;
	public ProDocQ() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProDocQ(int id_producto_doc, String nombre_producto_doc, int comp_residencia, int in_residencia,
			int comp_tesis, int in_tesis, int comp_articulo, int in_articulo, int comp_prototipo, int in_prototipo,
			int comp_investigacion, int in_investigacion, int comp_otro, int in_otro) {
		super();
		this.id_producto_doc = id_producto_doc;
		this.nombre_producto_doc = nombre_producto_doc;
		this.comp_residencia = comp_residencia;
		this.in_residencia = in_residencia;
		this.comp_tesis = comp_tesis;
		this.in_tesis = in_tesis;
		this.comp_articulo = comp_articulo;
		this.in_articulo = in_articulo;
		this.comp_prototipo = comp_prototipo;
		this.in_prototipo = in_prototipo;
		this.comp_investigacion = comp_investigacion;
		this.in_investigacion = in_investigacion;
		this.comp_otro = comp_otro;
		this.in_otro = in_otro;
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
	public int getComp_prototipo() {
		return comp_prototipo;
	}
	public void setComp_prototipo(int comp_prototipo) {
		this.comp_prototipo = comp_prototipo;
	}
	public int getIn_prototipo() {
		return in_prototipo;
	}
	public void setIn_prototipo(int in_prototipo) {
		this.in_prototipo = in_prototipo;
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
	public int getComp_otro() {
		return comp_otro;
	}
	public void setComp_otro(int comp_otro) {
		this.comp_otro = comp_otro;
	}
	public int getIn_otro() {
		return in_otro;
	}
	public void setIn_otro(int in_otro) {
		this.in_otro = in_otro;
	}
	@Override
	public String toString() {
		return "ProDocQ [id_producto_doc=" + id_producto_doc + ", nombre_producto_doc=" + nombre_producto_doc
				+ ", comp_residencia=" + comp_residencia + ", in_residencia=" + in_residencia + ", comp_tesis="
				+ comp_tesis + ", in_tesis=" + in_tesis + ", comp_articulo=" + comp_articulo + ", in_articulo="
				+ in_articulo + ", comp_prototipo=" + comp_prototipo + ", in_prototipo=" + in_prototipo
				+ ", comp_investigacion=" + comp_investigacion + ", in_investigacion=" + in_investigacion
				+ ", comp_otro=" + comp_otro + ", in_otro=" + in_otro + "]";
	}
	
	
}
