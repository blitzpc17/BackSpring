package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.ICarrerasService;
import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseRepository;
import com.gestiondocumentalserviciosdocentes.demo.genericos.GenericServiceImplm;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.ICarreras;
import com.gestiondocumentalserviciosdocentes.demo.modelo.Carreras;

@Service
public class InterfaceCarrerasServiceImpl extends GenericServiceImplm<Carreras, Integer> implements ICarrerasService {

	@Autowired
	private ICarreras iCarreras;
	
	@Override
	public BaseRepository<Carreras, Integer> getBaseRepository() {
		// TODO Auto-generated method stub
		return iCarreras;
	}

	@Override
	public List<Carreras> searchbyDep(String id) {
		List<Carreras> returnList=iCarreras.searchbyDep(id);
		return returnList;
	}

	@Override
	public Carreras comprobarcarrera(String id, String name) {
		// TODO Auto-generated method stub
		return iCarreras.comprobacarrera(id, name);
	}

}
