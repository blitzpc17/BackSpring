package com.gestiondocumentalserviciosdocentes.demo.InterfaceService;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.modelo.TecnologicoQ;

public interface TecnologicoQService {
	public List<TecnologicoQ> getTecnologicoQ(String Filtro, int idPer);
}
