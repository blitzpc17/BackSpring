package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.InterfaceFormatosService;
import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseRepository;
import com.gestiondocumentalserviciosdocentes.demo.genericos.GenericServiceImplm;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IFormatos;
import com.gestiondocumentalserviciosdocentes.demo.modelo.Formatos;

@Service
public class InterfaceFormatosServiceImpl extends GenericServiceImplm<Formatos, Integer> implements InterfaceFormatosService{

	@Autowired
	private IFormatos iFormatos;
	
	@Override
	public BaseRepository<Formatos, Integer> getBaseRepository() {
		// TODO Auto-generated method stub
		return iFormatos;
	}

}
