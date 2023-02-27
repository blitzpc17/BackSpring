package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.modelo.TecnologicosUs;

public interface ITecnologicosUs {
	List<TecnologicosUs> getTecnologicos(String Filtro);
}
