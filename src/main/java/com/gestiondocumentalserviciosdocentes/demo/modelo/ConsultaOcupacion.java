package com.gestiondocumentalserviciosdocentes.demo.modelo;

public class ConsultaOcupacion {
private int año;
private int mes;
private int dia;
public ConsultaOcupacion() {
	super();
	// TODO Auto-generated constructor stub
}
public ConsultaOcupacion(int año, int mes, int dia) {
	super();
	this.año = año;
	this.mes = mes;
	this.dia = dia;
}
public int getAño() {
	return año;
}
public void setAño(int año) {
	this.año = año;
}
public int getMes() {
	return mes;
}
public void setMes(int mes) {
	this.mes = mes;
}
public int getDia() {
	return dia;
}
public void setDia(int dia) {
	this.dia = dia;
}
@Override
public String toString() {
	return "ConsultaOcupacion [año=" + año + ", mes=" + mes + ", dia=" + dia + "]";
}


}
