package com.gestiondocumentalserviciosdocentes.demo.InterfaceService;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.modelo.ConsultaUsuarios;

public interface IConsultaUsuariosService {
	
	public List<ConsultaUsuarios> getConsultaUsuarios(int iddep);

}
