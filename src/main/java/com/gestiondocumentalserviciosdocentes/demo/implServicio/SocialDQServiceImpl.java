package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.SocialDQService;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.ISocialDQ;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.ISocialDQImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.SocialDQ;

public class SocialDQServiceImpl implements SocialDQService{

	@Override
	public List<SocialDQ> getDocumentosQ(String Filtro) {
		ISocialDQ daoDocumentos;
		List<SocialDQ> respuestaDocumentos = new ArrayList<SocialDQ>();
		try {
			daoDocumentos = new ISocialDQImpl();
			respuestaDocumentos = daoDocumentos.getDocumentos(Filtro);
			System.out.println("Consulta exitosa");
		}catch(Exception e) {
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return respuestaDocumentos;
	}

}
