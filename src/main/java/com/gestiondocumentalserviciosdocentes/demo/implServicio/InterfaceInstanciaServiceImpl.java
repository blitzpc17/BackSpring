package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.InterfaceInstanciasService;
import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseRepository;
import com.gestiondocumentalserviciosdocentes.demo.genericos.GenericServiceImplm;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IInstancias;
import com.gestiondocumentalserviciosdocentes.demo.modelo.Instancias;

@Service
public class InterfaceInstanciaServiceImpl extends GenericServiceImplm<Instancias,Integer> implements InterfaceInstanciasService{

	@Autowired
	private IInstancias datosIntancia; 
	@Override
	public BaseRepository<Instancias, Integer> getBaseRepository() {
		return datosIntancia;
	}
}
