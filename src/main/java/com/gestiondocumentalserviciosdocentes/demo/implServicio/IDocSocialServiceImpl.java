package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.IDocSocialService;
import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseRepository;
import com.gestiondocumentalserviciosdocentes.demo.genericos.GenericServiceImplm;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IDocSocial;
import com.gestiondocumentalserviciosdocentes.demo.modelo.DocSocial;

@Service
public class IDocSocialServiceImpl extends GenericServiceImplm<DocSocial,Integer> implements IDocSocialService{
	
	@Autowired
	private IDocSocial datosDocumentos;
	
	@Override
	public BaseRepository<DocSocial, Integer> getBaseRepository() {
		// TODO Auto-generated method stub
		return datosDocumentos;
	}

}
