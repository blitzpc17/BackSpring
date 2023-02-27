package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.ISeleccionApoyoDocenciaService;
import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseRepository;
import com.gestiondocumentalserviciosdocentes.demo.genericos.GenericServiceImplm;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.ISeleccionApoyoDocencia;
import com.gestiondocumentalserviciosdocentes.demo.modelo.SeleccionApoyoDocencia;

@Service
public class ISeleccionApoyoDocenciaServiceImpl extends GenericServiceImplm<SeleccionApoyoDocencia, Integer> implements ISeleccionApoyoDocenciaService{

	@Autowired
	private ISeleccionApoyoDocencia iseleccion;
	
	@Override
	public BaseRepository<SeleccionApoyoDocencia, Integer> getBaseRepository() {
		// TODO Auto-generated method stub
		return iseleccion;
	}

	@Override
	public SeleccionApoyoDocencia buscaxdepactividad(int id_dep, int id_act) {
		// TODO Auto-generated method stub
		return iseleccion.buscaxdepactividad(id_dep, id_act);
	}

}
