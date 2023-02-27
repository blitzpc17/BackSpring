package com.gestiondocumentalserviciosdocentes.demo.InterfaceService;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.modelo.CursoCount;

public interface CursoCountService {

	List<CursoCount> getCursoQ(String Filtro);
}
