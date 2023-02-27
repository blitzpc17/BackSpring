package com.gestiondocumentalserviciosdocentes.demo.InterfaceService;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.modelo.CountVisitas;

public interface CountVisitasService {
	
	public List<CountVisitas> getVisitasQ(String Filtro, String Per);

}
