package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.modelo.TecnologicoQ;

public interface ITecnologicoQ {
	List<TecnologicoQ> getTecnologico(String Filtro, int idPer);
}
