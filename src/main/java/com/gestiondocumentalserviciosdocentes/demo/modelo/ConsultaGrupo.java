package com.gestiondocumentalserviciosdocentes.demo.modelo;



public class ConsultaGrupo {

private int id_grupo;
private String clavemateria;
private String nombre;
private String grupo;
private String docente;
public ConsultaGrupo() {
	super();
	// TODO Auto-generated constructor stub
}
public ConsultaGrupo(int id_grupo, String clavemateria, String nombre, String grupo, String docente) {
	super();
	this.id_grupo = id_grupo;
	this.clavemateria = clavemateria;
	this.nombre = nombre;
	this.grupo = grupo;
	this.docente = docente;
}
public int getId_grupo() {
	return id_grupo;
}
public void setId_grupo(int id_grupo) {
	this.id_grupo = id_grupo;
}
public String getClavemateria() {
	return clavemateria;
}
public void setClavemateria(String clavemateria) {
	this.clavemateria = clavemateria;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getGrupo() {
	return grupo;
}
public void setGrupo(String grupo) {
	this.grupo = grupo;
}
public String getDocente() {
	return docente;
}
public void setDocente(String docente) {
	this.docente = docente;
}
@Override
public String toString() {
	return "ConsultaGrupo [id_grupo=" + id_grupo + ", clavemateria=" + clavemateria + ", nombre=" + nombre + ", grupo="
			+ grupo + ", docente=" + docente + "]";
}


}
