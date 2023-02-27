package com.gestiondocumentalserviciosdocentes.demo.InterfaceService;

import com.gestiondocumentalserviciosdocentes.demo.modelo.ConsultaAlumnos;

import java.util.List;

public interface IConsultaAlumnosService {
	
	public List<ConsultaAlumnos> getConsultaAlumnos(int iddep , int idper , int idusuario );

}
