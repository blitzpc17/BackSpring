package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.modelo.ExpCurso;

public interface IExpoCurso {
	List<ExpCurso> getCurso(String Filtro);
}
