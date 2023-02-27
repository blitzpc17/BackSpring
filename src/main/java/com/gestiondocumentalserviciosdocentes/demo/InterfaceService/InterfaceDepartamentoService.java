package com.gestiondocumentalserviciosdocentes.demo.InterfaceService;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.genericos.GenericService;
import com.gestiondocumentalserviciosdocentes.demo.modelo.Departamento;

public interface InterfaceDepartamentoService extends GenericService <Departamento,Integer>{

	List<Departamento> depacademicos(int id_depaca);
	
	Departamento traevinculacion();
	
	List<Departamento> traeDepAcademicos();
}
