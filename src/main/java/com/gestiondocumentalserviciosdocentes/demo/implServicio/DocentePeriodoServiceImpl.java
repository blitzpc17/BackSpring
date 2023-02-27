package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseRepository;
import com.gestiondocumentalserviciosdocentes.demo.genericos.GenericServiceImplm;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IDocentePeriodo;
import com.gestiondocumentalserviciosdocentes.demo.modelo.DocentePeriodo;
@Service
public class DocentePeriodoServiceImpl extends GenericServiceImplm<DocentePeriodo, Integer> {
 @Autowired
	private IDocentePeriodo datoDocentePeriodo;
	@Override
	public BaseRepository<DocentePeriodo, Integer> getBaseRepository() {
		// TODO Auto-generated method stub
		return datoDocentePeriodo;
	}

}
