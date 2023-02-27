package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.InterfaceDepartamentoService;
import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseRepository;
import com.gestiondocumentalserviciosdocentes.demo.genericos.GenericServiceImplm;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IDepartamento;
import com.gestiondocumentalserviciosdocentes.demo.modelo.Departamento;

@Service
public class InterfaceDepartamentoServiceImpl extends GenericServiceImplm<Departamento,Integer> implements InterfaceDepartamentoService{

	@Autowired
	private IDepartamento datosDepartamento;
	
	@Override
	public BaseRepository<Departamento, Integer> getBaseRepository() {
		// TODO Auto-generated method stub
		return datosDepartamento;
	}

	@Override
	public List<Departamento> depacademicos(int id_depaca) {
		// TODO Auto-generated method stub
		return datosDepartamento.depacademicos(id_depaca);
	}

	@Override
	public Departamento traevinculacion() {
		// TODO Auto-generated method stub
		return datosDepartamento.traevinculacion();
	}

	@Override
	public List<Departamento> traeDepAcademicos() {
		// TODO Auto-generated method stub
		return datosDepartamento.traeDepAcademicos();
	}

}
