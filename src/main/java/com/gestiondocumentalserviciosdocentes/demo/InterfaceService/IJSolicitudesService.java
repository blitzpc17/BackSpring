package com.gestiondocumentalserviciosdocentes.demo.InterfaceService;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.modelo.JSolicitudes;

public interface IJSolicitudesService {
	 List<JSolicitudes> getJSolicitudes(int filtro, String  filtro2,int filtro3);
}
