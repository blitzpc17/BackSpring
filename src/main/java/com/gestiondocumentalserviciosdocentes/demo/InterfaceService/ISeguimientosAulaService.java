package com.gestiondocumentalserviciosdocentes.demo.InterfaceService;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.modelo.SeguimientosAula;

public interface ISeguimientosAulaService {
	List<SeguimientosAula> getSeguimientosAula(int filtro,int filtro2);
}
