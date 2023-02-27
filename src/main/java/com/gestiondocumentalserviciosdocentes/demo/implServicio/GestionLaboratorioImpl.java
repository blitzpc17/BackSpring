package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseRepository;
import com.gestiondocumentalserviciosdocentes.demo.genericos.GenericServiceImplm;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IGestionLaboratorio;
import com.gestiondocumentalserviciosdocentes.demo.modelo.GestionLaboratorio;

@Service
public class GestionLaboratorioImpl extends GenericServiceImplm<GestionLaboratorio, Integer> {
	
	@Autowired
	private IGestionLaboratorio datosGestionLaboratorio;
	@Override
	public BaseRepository<GestionLaboratorio, Integer> getBaseRepository() {
		// TODO Auto-generated method stub
		return datosGestionLaboratorio;
	}

}
