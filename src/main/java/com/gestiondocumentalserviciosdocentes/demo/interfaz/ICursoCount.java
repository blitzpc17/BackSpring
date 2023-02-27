package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.modelo.CursoCount;

public interface ICursoCount {
	List<CursoCount> getCurso(String Filtro);
}
