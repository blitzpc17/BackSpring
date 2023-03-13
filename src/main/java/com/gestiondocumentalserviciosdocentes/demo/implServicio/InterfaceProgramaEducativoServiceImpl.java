package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.IProgramaEducativoService;
import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseRepository;
import com.gestiondocumentalserviciosdocentes.demo.genericos.GenericServiceImplm;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IProgramaEducativo;
import com.gestiondocumentalserviciosdocentes.demo.modelo.ProgramaEducativo;
import com.gestiondocumentalserviciosdocentes.demo.modelo.clsReportesLaboratorios;

import com.gestiondocumentalserviciosdocentes.demo.interfaz.IConsultaReportesLaboratorio;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IConsultaReportesLaboratorios;



@Service
public class InterfaceProgramaEducativoServiceImpl extends GenericServiceImplm<ProgramaEducativo, Integer> implements IProgramaEducativoService{

	@Autowired
	private IProgramaEducativo iProgramaEducativo;
	
	@Override
	public BaseRepository<ProgramaEducativo, Integer> getBaseRepository() {
		return iProgramaEducativo;
	}

	@Override
	public ProgramaEducativo BuscarDocumentoNombre(String nombredoc, int deptoId) {
		return iProgramaEducativo.BuscarDocumentoNombre(nombredoc, deptoId);
	}

	@Override
	public List<ProgramaEducativo> ListarDocumentosPorDepto(int deptoId) {
		return iProgramaEducativo.ListarDocumentosPorDepto(deptoId);
	}

	@Override
	public List<clsReportesLaboratorios> ListarReportesLaboratoriosDepto(int deptoId) {
		IConsultaReportesLaboratorios dao = new IConsultaReportesLaboratorios();
		return dao.ListarReportesLaboratoriosDepto(deptoId);
		
	}	
	
	
	

}
