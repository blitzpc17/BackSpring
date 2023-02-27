package com.gestiondocumentalserviciosdocentes.demo.InterfaceService;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.modelo.ConvocatoriasQ;

public interface ConvocatoriasQService {
	
	public List<ConvocatoriasQ> getConvocatoriasQ(String Filtro, String Per);

}
