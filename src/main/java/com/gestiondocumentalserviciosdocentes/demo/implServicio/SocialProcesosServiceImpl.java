package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.SocialProcesosService;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.ISocialProcesos;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.ISocialProcesosImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.SocialProcesos;

public class SocialProcesosServiceImpl implements SocialProcesosService{

	@Override
	public List<SocialProcesos> getSocialq(String Filtro) {
		ISocialProcesos daoSocial;
		List<SocialProcesos> respuestaSocial = new ArrayList<SocialProcesos>();
		try {
			daoSocial = new ISocialProcesosImpl();
			respuestaSocial = daoSocial.getSocial(Filtro);
			System.out.println("Consulta exitosa");
		}catch(Exception e) {
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return respuestaSocial;
	}

}
