package com.gestiondocumentalserviciosdocentes.demo.InterfaceService;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.modelo.SocialDep;

public interface SocialDepService {
	
	public List<SocialDep> getSocialQ(String Filtro, String Per);

}
