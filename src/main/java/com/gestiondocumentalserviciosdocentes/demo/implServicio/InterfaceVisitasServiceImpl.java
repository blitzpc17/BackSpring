package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.InterfaceVisitasService;
import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseRepository;
import com.gestiondocumentalserviciosdocentes.demo.genericos.GenericServiceImplm;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IVisitas;
import com.gestiondocumentalserviciosdocentes.demo.modelo.Visitas;

@Service
public class InterfaceVisitasServiceImpl extends GenericServiceImplm<Visitas,Integer> implements InterfaceVisitasService{

	@Autowired
	private IVisitas datosVisitas;
	@Override
	public BaseRepository<Visitas, Integer> getBaseRepository() {
		// TODO Auto-generated method stub
		return datosVisitas;
	}

}
