package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.InterfaceRecursoAsignadoService;
import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseRepository;
import com.gestiondocumentalserviciosdocentes.demo.genericos.GenericServiceImplm;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IRecursoAsignado;
import com.gestiondocumentalserviciosdocentes.demo.modelo.RecursoAsignado;

@Service
public class RecursoAsignadoServiceImpl extends GenericServiceImplm<RecursoAsignado, Integer> implements InterfaceRecursoAsignadoService{
	
	@Autowired
	private IRecursoAsignado iRecursoAsignado;
	
	@Override
	public BaseRepository<RecursoAsignado, Integer> getBaseRepository() {
		// TODO Auto-generated method stub
		return iRecursoAsignado;
	}

	@Override
	public RecursoAsignado ObtenerRecursoAsignadoDeptoPeriodo(int depto, int periodo) {
		// TODO Auto-generated method stub
		return iRecursoAsignado.Obtener(periodo, depto);
	}
	
	

	
	

	
	
	

}
