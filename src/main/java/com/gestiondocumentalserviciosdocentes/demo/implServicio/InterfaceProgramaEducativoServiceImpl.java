package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.IProgramaEducativoService;
import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseRepository;
import com.gestiondocumentalserviciosdocentes.demo.genericos.GenericServiceImplm;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IProgramaEducativo;
import com.gestiondocumentalserviciosdocentes.demo.modelo.ProgramaEducativo;



@Service
public class InterfaceProgramaEducativoServiceImpl extends GenericServiceImplm<ProgramaEducativo, Integer> implements IProgramaEducativoService{

	@Autowired
	private IProgramaEducativo iProgramaEducativo;
	
	@Override
	public BaseRepository<ProgramaEducativo, Integer> getBaseRepository() {
		// TODO Auto-generated method stub
		return iProgramaEducativo;
	}
	
	
	

}
