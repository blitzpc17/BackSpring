package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.JefeService;
import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseRepository;
import com.gestiondocumentalserviciosdocentes.demo.genericos.GenericServiceImplm;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IJefe;
import com.gestiondocumentalserviciosdocentes.demo.modelo.Jefe;

@Service
public class JefeServiceImpl extends GenericServiceImplm<Jefe, Integer> implements JefeService{

	@Autowired
	private IJefe iJefe;
	
	@Override
	public BaseRepository<Jefe, Integer> getBaseRepository() {
		// TODO Auto-generated method stub
		return iJefe;
	}
}
