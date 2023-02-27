package com.gestiondocumentalserviciosdocentes.demo.InterfaceService;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.modelo.SocialDQ;

public interface SocialDQService {
	public List<SocialDQ> getDocumentosQ(String Filtro);
}
