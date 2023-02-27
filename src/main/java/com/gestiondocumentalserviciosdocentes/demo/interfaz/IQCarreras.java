package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.modelo.QCarreras;

public interface IQCarreras {
	
	List<QCarreras> getCarreras(String Filtro);

}
