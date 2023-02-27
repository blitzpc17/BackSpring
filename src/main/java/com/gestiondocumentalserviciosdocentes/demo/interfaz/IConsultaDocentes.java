package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.modelo.ConsultasDocentes;

public interface IConsultaDocentes {

	List<ConsultasDocentes> getConsultasDocentes(int filtro, int filtro2);
}
