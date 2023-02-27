package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.modelo.DatosCurso;

public interface IDatosCurso {
	List<DatosCurso> getCurso(String Filtro);
}
