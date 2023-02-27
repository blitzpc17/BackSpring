package com.gestiondocumentalserviciosdocentes.demo.InterfaceService;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.modelo.ConsultaVisitas;

public interface IConsultaVisitasService {
	
	public List<ConsultaVisitas> getConsultaVisitas(int iddep, int idper);

}
