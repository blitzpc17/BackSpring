package com.gestiondocumentalserviciosdocentes.demo.modelo;

public class OcupacionAuxiliar {
		private int id ;	
		private String  title ;
		private String	start ;
		private String  end;
	
		public OcupacionAuxiliar() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OcupacionAuxiliar(int id, String title, String start, String end) {
		super();
		this.id = id;
		this.title = title;
		this.start = start;
		this.end = end;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getStart() {
		return start;
	}
	public void setStart(String start) {
		this.start = start;
	}
	public String getEnd() {
		return end;
	}
	public void setEnd(String end) {
		this.end = end;
	}
	@Override
	public String toString() {
		return "OcupacionAuxiliar [id=" + id + ", title=" + title + ", start=" + start + ", end=" + end + "]";
	}
	
	
}
