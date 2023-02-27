package com.gestiondocumentalserviciosdocentes.demo.InterfaceService;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.modelo.ConsultaDocLab;

public interface IConsultaDocLabService {
	
	public List<ConsultaDocLab> getConsultaDocLab(int idgestion,int iddep);

}
