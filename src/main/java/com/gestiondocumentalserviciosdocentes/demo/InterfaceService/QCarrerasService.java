package com.gestiondocumentalserviciosdocentes.demo.InterfaceService;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.modelo.QCarreras;

public interface QCarrerasService {
	
	public List<QCarreras> getCarrerasQ(String Filtro);

}
