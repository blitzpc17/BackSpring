package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.modelo.SocialDQ;

public interface ISocialDQ {
	List<SocialDQ> getDocumentos(String Filtro);
}
