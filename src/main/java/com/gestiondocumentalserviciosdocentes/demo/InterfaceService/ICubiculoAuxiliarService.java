package com.gestiondocumentalserviciosdocentes.demo.InterfaceService;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.modelo.CubiculoAuxiliar;

public interface ICubiculoAuxiliarService {
	List<CubiculoAuxiliar> getCubiculoAuxiliar(int filtro);
}
