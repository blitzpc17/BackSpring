package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.InterfaceMateriasService;
import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseRepository;
import com.gestiondocumentalserviciosdocentes.demo.genericos.GenericServiceImplm;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IMaterias;
import com.gestiondocumentalserviciosdocentes.demo.modelo.Materias;

@Service
public class InterfaceMateriasServiceImpl extends GenericServiceImplm<Materias, Integer> implements InterfaceMateriasService{

	@Autowired
	private IMaterias iMaterias;
	
	@Override
	public BaseRepository<Materias, Integer> getBaseRepository() {
		// TODO Auto-generated method stub
		return iMaterias;
	}

	@Override
	public List<Materias> searchbyDep(String id) {
		// TODO Auto-generated method stub
		List<Materias> returnList=iMaterias.searchbyDep(id);
		return returnList;
	}

	@Override
	public Materias comprobarmaterias(String id,String clave) {
		// TODO Auto-generated method stub
		return iMaterias.comprobarmaterias(id,clave);
	}

}
