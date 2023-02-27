package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.CapacitacionesService;
import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseRepository;
import com.gestiondocumentalserviciosdocentes.demo.genericos.GenericServiceImplm;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.ICapacitaciones;
import com.gestiondocumentalserviciosdocentes.demo.modelo.Capacitaciones;

@Service
public class CapacitacionesServiceImpl  extends GenericServiceImplm<Capacitaciones,Integer> implements CapacitacionesService{
	
	@Autowired
	private ICapacitaciones datosCapacitaciones;

	@Override
	public BaseRepository<Capacitaciones, Integer> getBaseRepository() {
		// TODO Auto-generated method stub
		return datosCapacitaciones;
	}

	@Override
	public List<Capacitaciones> buscarxusuariodep(int id_Periodo, int id_usuario) {
		// TODO Auto-generated method stub
		return datosCapacitaciones.buscarxusuariodep(id_Periodo, id_usuario);
	}

	@Override
	public List<Capacitaciones> buscardepdesa(int id_depdesa) {
		// TODO Auto-generated method stub
		return datosCapacitaciones.buscardepdesa(id_depdesa);
	}

}
