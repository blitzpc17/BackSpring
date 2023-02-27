package com.gestiondocumentalserviciosdocentes.demo.InterfaceService;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.modelo.ConsultaEstadoDocencia;

public interface IConsultaEstadoDocenciaService {
	List<ConsultaEstadoDocencia> getConsultaEstadoDocencias(int filtro,int filtro2);

}
