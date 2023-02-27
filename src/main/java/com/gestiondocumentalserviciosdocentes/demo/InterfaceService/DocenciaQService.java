package com.gestiondocumentalserviciosdocentes.demo.InterfaceService;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.modelo.DocenciaQ;

public interface DocenciaQService {
	public List<DocenciaQ> getDocenciaQ(String Filtro);
}
