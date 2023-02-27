package com.gestiondocumentalserviciosdocentes.demo.InterfaceService;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.modelo.ConsultaAsesores;

public interface IConsultaAsesoresService {
	
	public List<ConsultaAsesores> getConsultaAsesores(int iddep, int idper);

}
