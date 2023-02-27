package com.gestiondocumentalserviciosdocentes.demo.InterfaceService;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.modelo.ConsultasDocentes;

public interface IConsultaDocentesService {
	List<ConsultasDocentes> getConsultasDocentes(int filtro, int filtro2);
}
