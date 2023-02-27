package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.modelo.ConsultaAlumnos;

public interface IConsultaAlumnos {

	List<ConsultaAlumnos> getConsultaAlumnos(int iddep, int idper, int idusuario);
	
}
