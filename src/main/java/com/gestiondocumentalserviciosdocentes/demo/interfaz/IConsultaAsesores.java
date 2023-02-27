package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.modelo.ConsultaAsesores;

public interface IConsultaAsesores {
	
	List<ConsultaAsesores> getConsultaAsesores(int iddep, int iddper);

}
