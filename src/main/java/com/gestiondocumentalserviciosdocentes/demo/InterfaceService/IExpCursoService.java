package com.gestiondocumentalserviciosdocentes.demo.InterfaceService;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.modelo.ExpCurso;

public interface IExpCursoService {
	public List<ExpCurso> getCursoQ(String Filtro);
}
