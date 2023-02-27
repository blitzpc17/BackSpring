package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.InterfaceSocialService;
import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseRepository;
import com.gestiondocumentalserviciosdocentes.demo.genericos.GenericServiceImplm;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.ISocial;
import com.gestiondocumentalserviciosdocentes.demo.modelo.Social;

@Service
public class InterfaceSocialServiceImpl extends GenericServiceImplm<Social,Integer> implements InterfaceSocialService{

	@Autowired
	private ISocial datoSocial;
	
	@Override
	public BaseRepository<Social, Integer> getBaseRepository() {
		// TODO Auto-generated method stub
		return datoSocial;
	}

}
