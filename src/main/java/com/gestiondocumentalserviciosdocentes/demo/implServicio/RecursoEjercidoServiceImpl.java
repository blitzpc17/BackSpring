package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseRepository;
import com.gestiondocumentalserviciosdocentes.demo.genericos.GenericServiceImplm;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IRecursoEjercido;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.InterfaceRecursoEjercido;
import com.gestiondocumentalserviciosdocentes.demo.modelo.RecursoEjercido;

@Service
public class RecursoEjercidoServiceImpl extends GenericServiceImplm<RecursoEjercido, Integer> implements InterfaceRecursoEjercido
{

	@Autowired
	private IRecursoEjercido iRecursoEjercido;

	@Override
	public BaseRepository<RecursoEjercido, Integer> getBaseRepository() {
		// TODO Auto-generated method stub
		return iRecursoEjercido;
	}

	@Override
	public RecursoEjercido ObtenerRecursoEjercidoDeptoPeriodo(int depto, int periodo) {
		// TODO Auto-generated method stub
		return iRecursoEjercido.Obtener(periodo, depto);
	}
	

}
