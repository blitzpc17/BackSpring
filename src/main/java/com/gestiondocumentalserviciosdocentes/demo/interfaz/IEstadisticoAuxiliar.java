package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.modelo.EstadisticoAuxiliar;

public interface IEstadisticoAuxiliar {

	List<EstadisticoAuxiliar> getEstadisticoAuxiliar(int filtro);
}
