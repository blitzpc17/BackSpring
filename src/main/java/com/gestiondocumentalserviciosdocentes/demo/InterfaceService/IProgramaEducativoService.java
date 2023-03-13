package com.gestiondocumentalserviciosdocentes.demo.InterfaceService;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.genericos.GenericService;
import com.gestiondocumentalserviciosdocentes.demo.modelo.ProgramaEducativo;
import com.gestiondocumentalserviciosdocentes.demo.modelo.clsReportesLaboratorios;

public interface IProgramaEducativoService  extends GenericService<ProgramaEducativo, Integer> {
	
	List<ProgramaEducativo> ListarDocumentosPorDepto(int deptoId);
	
	ProgramaEducativo BuscarDocumentoNombre(String nombredoc, int deptoId);
	
	List<clsReportesLaboratorios>ListarReportesLaboratoriosDepto(int deptoId);
}
