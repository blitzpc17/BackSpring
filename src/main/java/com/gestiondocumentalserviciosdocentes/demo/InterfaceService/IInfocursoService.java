package com.gestiondocumentalserviciosdocentes.demo.InterfaceService;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.modelo.Infocurso;

public interface IInfocursoService {
	public List<Infocurso> getCursoQ(String Filtro);
}
