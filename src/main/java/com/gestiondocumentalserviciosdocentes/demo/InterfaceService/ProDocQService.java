package com.gestiondocumentalserviciosdocentes.demo.InterfaceService;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.modelo.ProDocQ;

public interface ProDocQService {
	public List<ProDocQ> getDocenciaQ(String Filtro, int idPer);
}
