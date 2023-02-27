package com.gestiondocumentalserviciosdocentes.demo.InterfaceService;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.modelo.ConsultaCatalogo;

public interface IConsultaCatalogoService {
	
	public List<ConsultaCatalogo> getConsultaCatalogos(int dep);

}
