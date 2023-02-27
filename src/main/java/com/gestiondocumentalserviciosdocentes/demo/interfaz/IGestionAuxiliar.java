package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.modelo.GestionAuxiliar;

public interface IGestionAuxiliar {
	
	List<GestionAuxiliar> getGestionAuxiliar(int filtro,int filtro2);

}
