package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.SocialDepService;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.ISocialDep;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.ISocialDepImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.SocialDep;

public class SocialDepServiceImpl implements SocialDepService{

	@Override
	public List<SocialDep> getSocialQ(String Filtro, String Per) {
		ISocialDep daoSocial;
		List<SocialDep> respuestaSocial = new ArrayList<SocialDep>();
		
		try {
			daoSocial = new ISocialDepImpl();
			respuestaSocial = daoSocial.getSocial(Filtro, Per);
			System.out.println("Consulta exitosa");
		}catch(Exception e) {
			e.printStackTrace();
		}
		return respuestaSocial;
		
	}

}
