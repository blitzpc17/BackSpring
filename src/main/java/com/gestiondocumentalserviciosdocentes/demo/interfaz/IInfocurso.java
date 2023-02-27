package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.modelo.Infocurso;

public interface IInfocurso {
	List<Infocurso> getCurso(String Filtro);
}
