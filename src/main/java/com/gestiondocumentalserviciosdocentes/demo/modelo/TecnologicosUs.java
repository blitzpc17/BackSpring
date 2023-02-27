package com.gestiondocumentalserviciosdocentes.demo.modelo;

public class TecnologicosUs {
	
	private int id_docper; 
	private int id_productos_tecnologico; 
	private String prodestec_nombre_user; 
	private String prodestec_nombre_producto; 
	private String prodestec_procedencia; 
	private int prodestec_estado; 
	private String prodestec_pdf_producto; 
	private String prodestec_comentario; 
	private int prodestec_retroalimentacion;
	public TecnologicosUs() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TecnologicosUs(int id_docper, int id_productos_tecnologico, String prodestec_nombre_user,
			String prodestec_nombre_producto, String prodestec_procedencia, int prodestec_estado,
			String prodestec_pdf_producto, String prodestec_comentario, int prodestec_retroalimentacion) {
		super();
		this.id_docper = id_docper;
		this.id_productos_tecnologico = id_productos_tecnologico;
		this.prodestec_nombre_user = prodestec_nombre_user;
		this.prodestec_nombre_producto = prodestec_nombre_producto;
		this.prodestec_procedencia = prodestec_procedencia;
		this.prodestec_estado = prodestec_estado;
		this.prodestec_pdf_producto = prodestec_pdf_producto;
		this.prodestec_comentario = prodestec_comentario;
		this.prodestec_retroalimentacion = prodestec_retroalimentacion;
	}
	public int getId_docper() {
		return id_docper;
	}
	public void setId_docper(int id_docper) {
		this.id_docper = id_docper;
	}
	public int getId_productos_tecnologico() {
		return id_productos_tecnologico;
	}
	public void setId_productos_tecnologico(int id_productos_tecnologico) {
		this.id_productos_tecnologico = id_productos_tecnologico;
	}
	public String getProdestec_nombre_user() {
		return prodestec_nombre_user;
	}
	public void setProdestec_nombre_user(String prodestec_nombre_user) {
		this.prodestec_nombre_user = prodestec_nombre_user;
	}
	public String getProdestec_nombre_producto() {
		return prodestec_nombre_producto;
	}
	public void setProdestec_nombre_producto(String prodestec_nombre_producto) {
		this.prodestec_nombre_producto = prodestec_nombre_producto;
	}
	public String getProdestec_procedencia() {
		return prodestec_procedencia;
	}
	public void setProdestec_procedencia(String prodestec_procedencia) {
		this.prodestec_procedencia = prodestec_procedencia;
	}
	public int getProdestec_estado() {
		return prodestec_estado;
	}
	public void setProdestec_estado(int prodestec_estado) {
		this.prodestec_estado = prodestec_estado;
	}
	public String getProdestec_pdf_producto() {
		return prodestec_pdf_producto;
	}
	public void setProdestec_pdf_producto(String prodestec_pdf_producto) {
		this.prodestec_pdf_producto = prodestec_pdf_producto;
	}
	public String getProdestec_comentario() {
		return prodestec_comentario;
	}
	public void setProdestec_comentario(String prodestec_comentario) {
		this.prodestec_comentario = prodestec_comentario;
	}
	public int getProdestec_retroalimentacion() {
		return prodestec_retroalimentacion;
	}
	public void setProdestec_retroalimentacion(int prodestec_retroalimentacion) {
		this.prodestec_retroalimentacion = prodestec_retroalimentacion;
	}
	@Override
	public String toString() {
		return "TecnologicosUs [id_docper=" + id_docper + ", id_productos_tecnologico=" + id_productos_tecnologico
				+ ", prodestec_nombre_user=" + prodestec_nombre_user + ", prodestec_nombre_producto="
				+ prodestec_nombre_producto + ", prodestec_procedencia=" + prodestec_procedencia + ", prodestec_estado="
				+ prodestec_estado + ", prodestec_pdf_producto=" + prodestec_pdf_producto + ", prodestec_comentario="
				+ prodestec_comentario + ", prodestec_retroalimentacion=" + prodestec_retroalimentacion + "]";
	}
	
	

}
