package com.gestiondocumentalserviciosdocentes.demo.InterfaceService;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.modelo.DatosCurso;

public interface DatosCursoService {
	public List<DatosCurso> getCursoQ(String Filtro);
}
