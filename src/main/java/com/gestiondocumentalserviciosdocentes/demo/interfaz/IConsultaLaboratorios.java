package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.modelo.ConsultaLaboratorios;

public interface IConsultaLaboratorios {
	
	List<ConsultaLaboratorios> getConsultaLaboratorios(int id_Departamento);

}
