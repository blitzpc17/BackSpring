package com.gestiondocumentalserviciosdocentes.demo.InterfaceService;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.modelo.AuxiliarUsuarios;

public interface IAuxiliarUsuariosService {
	List<AuxiliarUsuarios> getAuxiliarUsuarios(int filtro);
}
