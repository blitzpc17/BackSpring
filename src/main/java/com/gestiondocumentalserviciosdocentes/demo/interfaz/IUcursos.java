package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.modelo.Ucursos;

public interface IUcursos {
	List<Ucursos> grtCursos(String Filtro);
}
