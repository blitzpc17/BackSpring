package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.InterfaceCubiculosService;
import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseRepository;
import com.gestiondocumentalserviciosdocentes.demo.genericos.GenericServiceImplm;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.ICubiculos;
import com.gestiondocumentalserviciosdocentes.demo.modelo.Cubiculos;


@Service
public class InterfaceCubiculosServiceImpl extends GenericServiceImplm<Cubiculos, Integer> implements InterfaceCubiculosService{

	@Autowired
	private ICubiculos iCubiculos;
	
	@Override
	public BaseRepository<Cubiculos, Integer> getBaseRepository() {
		// TODO Auto-generated method stub
		return iCubiculos;
	}

}
