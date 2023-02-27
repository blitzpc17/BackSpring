package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.InterfaceInnovacionService;
import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseRepository;
import com.gestiondocumentalserviciosdocentes.demo.genericos.GenericServiceImplm;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IInnovacion;
import com.gestiondocumentalserviciosdocentes.demo.modelo.Innovacion;

@Service
public class InterfaceInnovacionServiceImpl extends GenericServiceImplm<Innovacion,Integer> implements InterfaceInnovacionService{
	
	@Autowired
	private IInnovacion datosIn;

	@Override
	public BaseRepository<Innovacion, Integer> getBaseRepository() {
		// TODO Auto-generated method stub
		return datosIn;
	}

}
