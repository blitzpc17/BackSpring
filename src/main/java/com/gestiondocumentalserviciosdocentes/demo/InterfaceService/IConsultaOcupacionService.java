package com.gestiondocumentalserviciosdocentes.demo.InterfaceService;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.modelo.ConsultaOcupacion;

public interface IConsultaOcupacionService {
	List<ConsultaOcupacion> getOcupaciones(int filtro);

}
