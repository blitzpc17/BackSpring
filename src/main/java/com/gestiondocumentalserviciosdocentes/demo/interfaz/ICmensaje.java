package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.modelo.Cmensajes;

public interface ICmensaje {
	
	List<Cmensajes> getMensajes(String filtro);

}
