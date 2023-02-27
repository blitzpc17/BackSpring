package com.gestiondocumentalserviciosdocentes.demo.InterfaceService;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.modelo.EstadisticoAuxiliar;

public interface IEstadisticoAuxiliarService {
	
	List<EstadisticoAuxiliar> getEstadisticoAuxiliar(int filtro);
}
