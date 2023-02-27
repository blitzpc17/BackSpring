package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseRepository;
import com.gestiondocumentalserviciosdocentes.demo.genericos.GenericServiceImplm;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.ISolicitudes;
import com.gestiondocumentalserviciosdocentes.demo.modelo.Solicitudes;

@Service
public class SolicitudesServiceImpl extends GenericServiceImplm<Solicitudes, Integer>{
	
	@Autowired
	private ISolicitudes datoISolicitudes;
	
	@Override
	public BaseRepository<Solicitudes, Integer> getBaseRepository() {
		// TODO Auto-generated method stub
		return datoISolicitudes;
	}

}
