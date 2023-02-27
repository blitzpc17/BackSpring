package com.gestiondocumentalserviciosdocentes.demo.InterfaceService;

import com.gestiondocumentalserviciosdocentes.demo.genericos.GenericService;
import com.gestiondocumentalserviciosdocentes.demo.modelo.Cubiculo;

public interface CubiculoService extends GenericService<Cubiculo, Integer> {

	Cubiculo buscarCubiculoxUsuario(int id_usuarios);
	
}
