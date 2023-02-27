package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.modelo.SocialDep;

public interface ISocialDep {

	List<SocialDep> getSocial(String Filtro, String Per);
}
