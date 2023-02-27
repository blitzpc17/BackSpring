package com.gestiondocumentalserviciosdocentes.demo.InterfaceService;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.modelo.ConsultaEstadoGrupo;

public interface IConsultaEstadoGrupoService {
	List<ConsultaEstadoGrupo> getConsultaEstadoGrupos(int filtro,int filtro2);

}
