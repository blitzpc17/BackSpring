package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.modelo.Enviados;

public interface IEnviados {
	List<Enviados> getEnviados(String rem, String dest);
}
