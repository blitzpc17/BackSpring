package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.modelo.ConsultaUsuarios;

public interface IConsultaUsuarios {
	
	List<ConsultaUsuarios> getConsultaUsuarios(int iddep);

}
