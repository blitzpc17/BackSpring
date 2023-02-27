package com.gestiondocumentalserviciosdocentes.demo.InterfaceService;

import com.gestiondocumentalserviciosdocentes.demo.genericos.GenericService;
import com.gestiondocumentalserviciosdocentes.demo.modelo.DepartamentoAcademico;

public interface DepartamentoAcademicoService extends GenericService<DepartamentoAcademico,Integer>{

	DepartamentoAcademico depacademicos(int id_desarrollo_academico, int id_departamento);
}
