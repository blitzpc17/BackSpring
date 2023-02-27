package com.gestiondocumentalserviciosdocentes.demo.InterfaceService;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.modelo.QVisitas;

public interface QVisitasService {
	
	public List<QVisitas> getVisitasQ(String Filtro);

}
