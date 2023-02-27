package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.modelo.ProDocQ;

public interface IProDocQ {
	List<ProDocQ> getDocencia(String Filtro, int idPer);
}
