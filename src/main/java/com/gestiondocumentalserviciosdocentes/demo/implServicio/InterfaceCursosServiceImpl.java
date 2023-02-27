package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.InterfaceCursosService;
import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseRepository;
import com.gestiondocumentalserviciosdocentes.demo.genericos.GenericServiceImplm;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.ICursos;
import com.gestiondocumentalserviciosdocentes.demo.modelo.Cursos;

@Service
public class InterfaceCursosServiceImpl extends GenericServiceImplm<Cursos,Integer> implements InterfaceCursosService{

	@Autowired
	private ICursos datosCursos;
	
	@Override
	public BaseRepository<Cursos, Integer> getBaseRepository() {
		// TODO Auto-generated method stub
		return datosCursos;
	}

}
