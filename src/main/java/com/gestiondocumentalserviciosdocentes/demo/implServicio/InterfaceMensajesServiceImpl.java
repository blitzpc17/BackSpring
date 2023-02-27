package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.InterfaceMensajesService;
import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseRepository;
import com.gestiondocumentalserviciosdocentes.demo.genericos.GenericServiceImplm;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IMensajes;
import com.gestiondocumentalserviciosdocentes.demo.modelo.Mensajes;

@Service
public class InterfaceMensajesServiceImpl extends GenericServiceImplm<Mensajes, Integer> implements InterfaceMensajesService{

	@Autowired
	private IMensajes datosImensaje;
	
	@Override
	public BaseRepository<Mensajes, Integer> getBaseRepository() {
		// TODO Auto-generated method stub
		return datosImensaje;
	}

}
