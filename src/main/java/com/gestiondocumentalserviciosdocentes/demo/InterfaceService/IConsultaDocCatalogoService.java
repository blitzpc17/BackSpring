package com.gestiondocumentalserviciosdocentes.demo.InterfaceService;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.modelo.ConsultaDocCatalogo;

public interface IConsultaDocCatalogoService {
	
	public List<ConsultaDocCatalogo> getConsultaDocCatalogos(int iddep);
	

}
