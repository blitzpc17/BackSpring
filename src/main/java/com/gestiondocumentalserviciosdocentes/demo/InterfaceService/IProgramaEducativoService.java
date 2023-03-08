package com.gestiondocumentalserviciosdocentes.demo.InterfaceService;

import java.util.ArrayList;
import java.util.List;


import com.gestiondocumentalserviciosdocentes.demo.genericos.GenericService;
import com.gestiondocumentalserviciosdocentes.demo.modelo.ProgramaEducativo;

public interface IProgramaEducativoService  extends GenericService<ProgramaEducativo, Integer> {
	
	List<ProgramaEducativo> ListarDocumentosPorDepto(int deptoId);
	
	ProgramaEducativo BuscarDocumentoNombre(String nombredoc, int deptoId);
}
