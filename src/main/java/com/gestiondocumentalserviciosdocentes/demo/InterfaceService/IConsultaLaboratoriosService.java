package com.gestiondocumentalserviciosdocentes.demo.InterfaceService;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.modelo.ConsultaLaboratorios;

public interface IConsultaLaboratoriosService {
	
	List<ConsultaLaboratorios> getConsultaLaboratorios(int id_Departamento);

}
