package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.modelo.DocenciaQ;

public interface IDocenciaQ {
	List<DocenciaQ> getDocencia(String Filtro);
}
