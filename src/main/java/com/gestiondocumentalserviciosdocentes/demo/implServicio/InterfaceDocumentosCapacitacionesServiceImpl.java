package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.InterfaceDocumentosCapacitacionesService;
import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseRepository;
import com.gestiondocumentalserviciosdocentes.demo.genericos.GenericServiceImplm;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IDocumentosCapacitaciones;
import com.gestiondocumentalserviciosdocentes.demo.modelo.DocumentosCapacitaciones;

@Service
public class InterfaceDocumentosCapacitacionesServiceImpl extends GenericServiceImplm<DocumentosCapacitaciones,Integer> implements InterfaceDocumentosCapacitacionesService{

	@Autowired
	private IDocumentosCapacitaciones datosCapacitaciones;
	
	
	@Override
	public BaseRepository<DocumentosCapacitaciones, Integer> getBaseRepository() {
		// TODO Auto-generated method stub
		return datosCapacitaciones;
	}


	@Override
	public List<DocumentosCapacitaciones> documentos(int id_capacitacion) {
		// TODO Auto-generated method stub
		return datosCapacitaciones.documentos(id_capacitacion);
	}

}
