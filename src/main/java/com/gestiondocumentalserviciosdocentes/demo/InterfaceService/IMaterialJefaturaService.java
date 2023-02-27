package com.gestiondocumentalserviciosdocentes.demo.InterfaceService;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.genericos.GenericService;
import com.gestiondocumentalserviciosdocentes.demo.modelo.MaterialJefatura;

public interface IMaterialJefaturaService extends GenericService<MaterialJefatura, Integer> {
	
	List<MaterialJefatura> materialxdep(int id_dep);

}
