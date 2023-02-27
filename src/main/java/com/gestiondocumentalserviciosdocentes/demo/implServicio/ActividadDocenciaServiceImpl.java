package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseRepository;
import com.gestiondocumentalserviciosdocentes.demo.genericos.GenericServiceImplm;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IActividadDocencia;
import com.gestiondocumentalserviciosdocentes.demo.modelo.ActividadDocencia;
@Service
public class ActividadDocenciaServiceImpl extends GenericServiceImplm<ActividadDocencia, Integer>{
@Autowired
	private IActividadDocencia datosActividadDocencia;
	@Override
	public BaseRepository<ActividadDocencia, Integer> getBaseRepository() {
		// TODO Auto-generated method stub
		return datosActividadDocencia;
	}

}
