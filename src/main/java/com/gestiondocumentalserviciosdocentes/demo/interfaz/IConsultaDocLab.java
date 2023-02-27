package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.modelo.ConsultaDocLab;

public interface IConsultaDocLab  {
	
	List<ConsultaDocLab> getConsultaDocLab(int idgestion, int iddep);

}
