package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.modelo.MatJefQ;

public interface IMatJefQ {
	
	List<MatJefQ> getMaterial(String Filtro);

}
