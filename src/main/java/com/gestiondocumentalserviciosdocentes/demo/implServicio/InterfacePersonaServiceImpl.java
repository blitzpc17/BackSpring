package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.InterfacePersonaService;
import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseRepository;
import com.gestiondocumentalserviciosdocentes.demo.genericos.GenericServiceImplm;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IPersona;
import com.gestiondocumentalserviciosdocentes.demo.modelo.Persona;

@Service
public class InterfacePersonaServiceImpl extends GenericServiceImplm<Persona, Integer> implements InterfacePersonaService{

	@Autowired
	private IPersona datosIPersona;
	
	@Override
	public BaseRepository<Persona, Integer> getBaseRepository() {
		// TODO Auto-generated method stub
		return datosIPersona;
	}

	@Override
	public List<Persona> search(String filtro, String filtro2) {
		// TODO Auto-generated method stub
		List<Persona> returnList = datosIPersona.search(filtro,filtro2);
		
		return returnList;
	}

	@Override
	public List<Persona> search2(String filtro, String filtro2) {
		// TODO Auto-generated method stub
		
		List<Persona> returnList2 = datosIPersona.search2(filtro, filtro2);
		return returnList2;
	}

}
