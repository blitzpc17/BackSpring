package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.IDocumentosGruposService;
import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseRepository;
import com.gestiondocumentalserviciosdocentes.demo.genericos.GenericServiceImplm;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IDocumentosGrupos;
import com.gestiondocumentalserviciosdocentes.demo.modelo.DocumentosGrupos;

@Service
public class IDocumentosGruposServiceImpl extends GenericServiceImplm<DocumentosGrupos, Integer> implements IDocumentosGruposService {

	@Autowired
	private IDocumentosGrupos iDocumentosGrupos;
	
	@Override
	public BaseRepository<DocumentosGrupos, Integer> getBaseRepository() {
		// TODO Auto-generated method stub
		return iDocumentosGrupos;
	}

}
