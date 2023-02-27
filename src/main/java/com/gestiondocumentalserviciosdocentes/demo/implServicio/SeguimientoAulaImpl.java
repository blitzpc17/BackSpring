package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseRepository;
import com.gestiondocumentalserviciosdocentes.demo.genericos.GenericServiceImplm;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.ISeguimientoAula;
import com.gestiondocumentalserviciosdocentes.demo.modelo.SeguimientoAula;

@Service
public class SeguimientoAulaImpl extends GenericServiceImplm<SeguimientoAula, Integer>{
	
	@Autowired
	private ISeguimientoAula datoISeguimientoAula;
	
	@Override
	public BaseRepository<SeguimientoAula, Integer> getBaseRepository() {
		// TODO Auto-generated method stub
		return datoISeguimientoAula;
	}

	
}
