package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.modelo.EMensajes;

public interface IEMensajes {
	List<EMensajes> getMensajes(String rem, String dest);
}
