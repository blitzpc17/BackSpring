package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.modelo.JSolicitudes;



public interface IJSolicitudes {

	 List<JSolicitudes> getJSolicitudes(int filtro,String filtro2,int filtro3);
}
