package com.gestiondocumentalserviciosdocentes.demo.InterfaceService;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.modelo.ConsultaDocVisitas;

public interface IConsultaDocVisitasService {

	public List<ConsultaDocVisitas> getConsultaDocVisitas(int idvis);
	
}
