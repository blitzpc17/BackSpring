package com.gestiondocumentalserviciosdocentes.demo.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "productos_Des_Tecnologico")
public class Productos_Des_Tecnologico {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_productos_desa_tec;
	
	private int id_docper;
	private String prodestec_nombre_producto;
	private String prodestec_procedencia;
	private int prodestec_estado;
	private String prodestec_pdf_producto;
	private String prodestec_comentario;
	private int prodestec_retroalimentacion;
	private int notify = 0;
	
	public Productos_Des_Tecnologico() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Productos_Des_Tecnologico(int id_productos_desa_tec, int id_docper, String prodestec_nombre_producto,
			String prodestec_procedencia, int prodestec_estado, String prodestec_pdf_producto,
			String prodestec_comentario, int prodestec_retroalimentacion) {
		super();
		this.id_productos_desa_tec = id_productos_desa_tec;
		this.id_docper = id_docper;
		this.prodestec_nombre_producto = prodestec_nombre_producto;
		this.prodestec_procedencia = prodestec_procedencia;
		this.prodestec_estado = prodestec_estado;
		this.prodestec_pdf_producto = prodestec_pdf_producto;
		this.prodestec_comentario = prodestec_comentario;
		this.prodestec_retroalimentacion = prodestec_retroalimentacion;
	}

	public int getId_productos_desa_tec() {
		return id_productos_desa_tec;
	}

	public void setId_productos_desa_tec(int id_productos_desa_tec) {
		this.id_productos_desa_tec = id_productos_desa_tec;
	}

	public int getId_docper() {
		return id_docper;
	}

	public void setId_docper(int id_docper) {
		this.id_docper = id_docper;
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
	
	public int getNotify() {
		return notify;
	}

	public void setNotify(int notify) {
		this.notify = notify;
	}

}
