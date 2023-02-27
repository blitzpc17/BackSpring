package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.modelo.VisitasUs;

public interface IVisitasUs {
	
	List<VisitasUs> getVisitas(String Filtro);

}
