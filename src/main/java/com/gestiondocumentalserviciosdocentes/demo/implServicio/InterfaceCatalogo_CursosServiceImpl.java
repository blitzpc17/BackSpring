package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.InterfaceCatalogo_CursosService;
import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseRepository;
import com.gestiondocumentalserviciosdocentes.demo.genericos.GenericServiceImplm;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.ICatalogo_Cursos;
import com.gestiondocumentalserviciosdocentes.demo.modelo.Catalogo_Cursos;

@Service
public class InterfaceCatalogo_CursosServiceImpl extends GenericServiceImplm<Catalogo_Cursos, Integer> implements InterfaceCatalogo_CursosService{

	@Autowired
	private ICatalogo_Cursos iCatalogo_Cursos;
	 
	@Override
	public BaseRepository<Catalogo_Cursos, Integer> getBaseRepository() {
		// TODO Auto-generated method stub
		return iCatalogo_Cursos;
	}

	@Override
	public List<Catalogo_Cursos> catalogocursos(int id_dep) {
		// TODO Auto-generated method stub
		return iCatalogo_Cursos.catalogocursos(id_dep);
	}

}
