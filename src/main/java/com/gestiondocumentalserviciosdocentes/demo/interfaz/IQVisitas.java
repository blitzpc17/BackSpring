package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.modelo.QVisitas;

public interface IQVisitas {
	
	List<QVisitas> getVisitas(String Filtro);

}
