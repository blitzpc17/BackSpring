package com.gestiondocumentalserviciosdocentes.demo.InterfaceService;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.modelo.ConsultaPeriodosDoc;

public interface IConsultaPeriodosDocService {
	
	List<ConsultaPeriodosDoc> getConsultaPeriodosDoc(int idlab);

}
