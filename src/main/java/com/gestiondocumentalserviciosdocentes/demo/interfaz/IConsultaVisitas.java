package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.modelo.ConsultaVisitas;

public interface IConsultaVisitas {
	
	List<ConsultaVisitas> getConsultaVisitas(int iddep, int idper);

}
