package com.gestiondocumentalserviciosdocentes.demo.InterfaceService;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.modelo.UsuariosQ;

public interface UsuariosQService {
	
	public List<UsuariosQ> getUsuarios(String Filtro);

}
