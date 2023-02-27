package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.InterfaceLaboratoriosService;
import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseRepository;
import com.gestiondocumentalserviciosdocentes.demo.genericos.GenericServiceImplm;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.ILaboratorios;
import com.gestiondocumentalserviciosdocentes.demo.modelo.Laboratorios;

@Service
public class InterfaceLaboratoriosServiceImpl extends GenericServiceImplm<Laboratorios, Integer> implements InterfaceLaboratoriosService{

	@Autowired
	private ILaboratorios iLaboratorios;
	
	@Override
	public BaseRepository<Laboratorios, Integer> getBaseRepository() {
		// TODO Auto-generated method stub
		return iLaboratorios;
	}

	@Override
	public void deletelab(int id) {
		iLaboratorios.deletelab(id);
		
	}

}
