package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.VisitasDocService;
import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseRepository;
import com.gestiondocumentalserviciosdocentes.demo.genericos.GenericServiceImplm;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IVisitasDoc;
import com.gestiondocumentalserviciosdocentes.demo.modelo.VisitasDoc;

@Service
public class VisitasDocServiceImpl extends GenericServiceImplm<VisitasDoc,Integer> implements VisitasDocService{

	@Autowired
	private IVisitasDoc datosVisitas;
	
	@Override
	public BaseRepository<VisitasDoc, Integer> getBaseRepository() {		
		
		// TODO Auto-generated method stub
		return datosVisitas;
	}

}
