package com.gestiondocumentalserviciosdocentes.demo.InterfaceService;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.modelo.CNombreMateriaDocente;

public interface ICNombreMateriaDocenteService {
	List<CNombreMateriaDocente> getCNombreMateriaDocentes(int filtro,int filtro2, int filtro3);
}
