package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.modelo.CountVisitas;

public interface ICountVisitas {
	
	List<CountVisitas> getVisitas(String Filtro, String Per);

}
