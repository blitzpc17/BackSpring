package com.gestiondocumentalserviciosdocentes.demo.InterfaceService;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.modelo.CNombreDocente;

public interface ICNombreDocenteService {
	List<CNombreDocente> getCNombreDocentes(int filtro);
}
