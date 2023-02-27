package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.modelo.ConsultaVisitasDocente;

public interface IConsultaVisitasDocente {
	
	List<ConsultaVisitasDocente> getConsultaVisitasDocentes(int iddep, int idper, int iduser);

}
