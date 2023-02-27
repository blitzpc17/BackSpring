package com.gestiondocumentalserviciosdocentes.demo.InterfaceService;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.modelo.GestionAuxiliar;

public interface IGestionAuxiliarService {
	List<GestionAuxiliar> getGestionAuxiliar(int filtro,int filtro2);
}
