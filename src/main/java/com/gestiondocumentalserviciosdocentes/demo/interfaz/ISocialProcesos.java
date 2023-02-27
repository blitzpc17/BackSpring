package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.modelo.SocialProcesos;

public interface ISocialProcesos {
	List<SocialProcesos> getSocial(String Filtro);
}
