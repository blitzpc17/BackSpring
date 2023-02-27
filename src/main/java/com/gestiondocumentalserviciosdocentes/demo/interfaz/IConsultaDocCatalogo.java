package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.modelo.ConsultaDocCatalogo;

public interface IConsultaDocCatalogo {
	
	List<ConsultaDocCatalogo> getConsultaDocCatalogos(int iddep);

}
