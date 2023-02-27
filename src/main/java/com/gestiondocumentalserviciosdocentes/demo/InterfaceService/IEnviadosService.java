package com.gestiondocumentalserviciosdocentes.demo.InterfaceService;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.modelo.Enviados;

public interface IEnviadosService {
	public List<Enviados> getEnviadosQ(String rem, String dest);
}
