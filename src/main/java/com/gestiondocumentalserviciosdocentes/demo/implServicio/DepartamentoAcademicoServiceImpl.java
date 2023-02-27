package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.DepartamentoAcademicoService;
import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseRepository;
import com.gestiondocumentalserviciosdocentes.demo.genericos.GenericServiceImplm;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IDepartamentoAcademico;
import com.gestiondocumentalserviciosdocentes.demo.modelo.DepartamentoAcademico;

@Service
public class DepartamentoAcademicoServiceImpl extends GenericServiceImplm<DepartamentoAcademico,Integer> implements DepartamentoAcademicoService{

	@Autowired
	private	IDepartamentoAcademico datosAcademico;
	
	
	@Override
	public BaseRepository<DepartamentoAcademico, Integer> getBaseRepository() {
		// TODO Auto-generated method stub
		return datosAcademico;
	}


	@Override
	public DepartamentoAcademico depacademicos(int id_desarrollo_academico, int id_departamento) {
		// TODO Auto-generated method stub
		return datosAcademico.depacademicos(id_desarrollo_academico, id_departamento);
	}

}
