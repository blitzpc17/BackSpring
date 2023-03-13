package com.gestiondocumentalserviciosdocentes.demo.modelo;

public class clsReportesLaboratorios {
	
	private int IdArchivo;
	private String RutaArchivo;
	private String NombreFormato;
	private String TipoFormato;
	private String NombreLaboratorio;
	private String NombreDepartamento;
	private int MesInicial;
	private int MesFinal;
	private int Anio;
	private String Encargado;
	private int DepartamentoId;
	
	
	
	public clsReportesLaboratorios() {
		super();
	}
	
	public clsReportesLaboratorios(int idArchivo, String rutaArchivo, String nombreFormato, String tipoFormato,
			String nombreLaboratorio, String nombreDepartamento, int mesInicial, int mesFinal, int anio,
			String encargado, int departamentoId) {
		super();
		IdArchivo = idArchivo;
		RutaArchivo = rutaArchivo;
		NombreFormato = nombreFormato;
		TipoFormato = tipoFormato;
		NombreLaboratorio = nombreLaboratorio;
		NombreDepartamento = nombreDepartamento;
		MesInicial = mesInicial;
		MesFinal = mesFinal;
		Anio = anio;
		Encargado = encargado;
		DepartamentoId = departamentoId;
	}
	public int getIdArchivo() {
		return IdArchivo;
	}
	public void setIdArchivo(int idArchivo) {
		IdArchivo = idArchivo;
	}
	public String getRutaArchivo() {
		return RutaArchivo;
	}
	public void setRutaArchivo(String rutaArchivo) {
		RutaArchivo = rutaArchivo;
	}
	public String getNombreFormato() {
		return NombreFormato;
	}
	public void setNombreFormato(String nombreFormato) {
		NombreFormato = nombreFormato;
	}
	public String getTipoFormato() {
		return TipoFormato;
	}
	public void setTipoFormato(String tipoFormato) {
		TipoFormato = tipoFormato;
	}
	public String getNombreLaboratorio() {
		return NombreLaboratorio;
	}
	public void setNombreLaboratorio(String nombreLaboratorio) {
		NombreLaboratorio = nombreLaboratorio;
	}
	public String getNombreDepartamento() {
		return NombreDepartamento;
	}
	public void setNombreDepartamento(String nombreDepartamento) {
		NombreDepartamento = nombreDepartamento;
	}
	public int getMesInicial() {
		return MesInicial;
	}
	public void setMesInicial(int mesInicial) {
		MesInicial = mesInicial;
	}
	public int getMesFinal() {
		return MesFinal;
	}
	public void setMesFinal(int mesFinal) {
		MesFinal = mesFinal;
	}
	public int getAnio() {
		return Anio;
	}
	public void setAnio(int anio) {
		Anio = anio;
	}
	public String getEncargado() {
		return Encargado;
	}
	public void setEncargado(String encargado) {
		Encargado = encargado;
	}
	public int getDepartamentoId() {
		return DepartamentoId;
	}
	public void setDepartamentoId(int departamentoId) {
		DepartamentoId = departamentoId;
	}
	
	

}
