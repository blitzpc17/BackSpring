package com.gestiondocumentalserviciosdocentes.demo.InterfaceService;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.modelo.ConsultaVisitasDocente;

public interface IConsultaVisitasDocenteService {
	
	public List<ConsultaVisitasDocente> getConsultaVisitasDocentes(int iddep, int idper, int iduser);

}
