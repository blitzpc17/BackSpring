package com.gestiondocumentalserviciosdocentes.demo.InterfaceService;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.modelo.ValidarPractica;

public interface IValidarPracticaService {
	List<ValidarPractica> getValidarPracticas(int filtro, String filtro2);

}
