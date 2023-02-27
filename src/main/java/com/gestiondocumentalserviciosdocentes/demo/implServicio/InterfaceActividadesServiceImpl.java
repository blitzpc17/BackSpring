package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.InterfaceActividadesService;
import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseRepository;
import com.gestiondocumentalserviciosdocentes.demo.genericos.GenericServiceImplm;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IActividades;
import com.gestiondocumentalserviciosdocentes.demo.modelo.Actividades;

@Service
public class InterfaceActividadesServiceImpl extends GenericServiceImplm<Actividades, Integer> implements InterfaceActividadesService{

	@Autowired
	private IActividades iActividades;
	
	@Override
	public BaseRepository<Actividades, Integer> getBaseRepository() {
		// TODO Auto-generated method stub
		return iActividades;
	}

	@Override
	public List<Actividades> buscarActividadxDep(int id_dep) {
		// TODO Auto-generated method stub
		return iActividades.buscarActividadxDep(id_dep);
	}

}
