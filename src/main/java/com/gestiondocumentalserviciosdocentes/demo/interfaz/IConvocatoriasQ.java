package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.modelo.ConvocatoriasQ;

public interface IConvocatoriasQ {
	
	List<ConvocatoriasQ> getConvocatorias(String Filtro, String Per);

}
