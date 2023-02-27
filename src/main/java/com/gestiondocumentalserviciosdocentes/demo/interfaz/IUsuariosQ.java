package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.modelo.UsuariosQ;

public interface IUsuariosQ {
	
	List<UsuariosQ> getUsuarios(String Filtro);
}
