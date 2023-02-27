package com.gestiondocumentalserviciosdocentes.demo.modelo;

public class DocenciaQ {
	
	private int id_docper; 
	private int id_productos_docencia; 
	private String prodoc_nombre_user;
	private String prodoc_nombre_producto; 
	private String prodoc_procedencia; 
	private int prodoc_estado; 
	private String prodoc_pdf_producto; 
	private String prodoc_comentario; 
	private int prodoc_retroalimentacion;
	public DocenciaQ() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DocenciaQ(int id_docper, int id_productos_docencia, String prodoc_nombre_user, String prodoc_nombre_producto,
			String prodoc_procedencia, int prodoc_estado, String prodoc_pdf_producto, String prodoc_comentario,
			int prodoc_retroalimentacion) {
		super();
		this.id_docper = id_docper;
		this.id_productos_docencia = id_productos_docencia;
		this.prodoc_nombre_user = prodoc_nombre_user;
		this.prodoc_nombre_producto = prodoc_nombre_producto;
		this.prodoc_procedencia = prodoc_procedencia;
		this.prodoc_estado = prodoc_estado;
		this.prodoc_pdf_producto = prodoc_pdf_producto;
		this.prodoc_comentario = prodoc_comentario;
		this.prodoc_retroalimentacion = prodoc_retroalimentacion;
	}
	public int getId_docper() {
		return id_docper;
	}
	public void setId_docper(int id_docper) {
		this.id_docper = id_docper;
	}
	public int getId_productos_docencia() {
		return id_productos_docencia;
	}
	public void setId_productos_docencia(int id_productos_docencia) {
		this.id_productos_docencia = id_productos_docencia;
	}
	public String getProdoc_nombre_user() {
		return prodoc_nombre_user;
	}
	public void setProdoc_nombre_user(String prodoc_nombre_user) {
		this.prodoc_nombre_user = prodoc_nombre_user;
	}
	public String getProdoc_nombre_producto() {
		return prodoc_nombre_producto;
	}
	public void setProdoc_nombre_producto(String prodoc_nombre_producto) {
		this.prodoc_nombre_producto = prodoc_nombre_producto;
	}
	public String getProdoc_procedencia() {
		return prodoc_procedencia;
	}
	public void setProdoc_procedencia(String prodoc_procedencia) {
		this.prodoc_procedencia = prodoc_procedencia;
	}
	public int getProdoc_estado() {
		return prodoc_estado;
	}
	public void setProdoc_estado(int prodoc_estado) {
		this.prodoc_estado = prodoc_estado;
	}
	public String getProdoc_pdf_producto() {
		return prodoc_pdf_producto;
	}
	public void setProdoc_pdf_producto(String prodoc_pdf_producto) {
		this.prodoc_pdf_producto = prodoc_pdf_producto;
	}
	public String getProdoc_comentario() {
		return prodoc_comentario;
	}
	public void setProdoc_comentario(String prodoc_comentario) {
		this.prodoc_comentario = prodoc_comentario;
	}
	public int getProdoc_retroalimentacion() {
		return prodoc_retroalimentacion;
	}
	public void setProdoc_retroalimentacion(int prodoc_retroalimentacion) {
		this.prodoc_retroalimentacion = prodoc_retroalimentacion;
	}
	@Override
	public String toString() {
		return "DocenciaQ [id_docper=" + id_docper + ", id_productos_docencia=" + id_productos_docencia
				+ ", prodoc_nombre_user=" + prodoc_nombre_user + ", prodoc_nombre_producto=" + prodoc_nombre_producto
				+ ", prodoc_procedencia=" + prodoc_procedencia + ", prodoc_estado=" + prodoc_estado
				+ ", prodoc_pdf_producto=" + prodoc_pdf_producto + ", prodoc_comentario=" + prodoc_comentario
				+ ", prodoc_retroalimentacion=" + prodoc_retroalimentacion + "]";
	}
	
	

}
