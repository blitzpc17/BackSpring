package com.gestiondocumentalserviciosdocentes.demo.InterfaceService;

import com.gestiondocumentalserviciosdocentes.demo.genericos.GenericService;
import com.gestiondocumentalserviciosdocentes.demo.modelo.GruposDocente;

public interface IGruposDocenteService extends GenericService<GruposDocente, Integer>{

	GruposDocente comprobarGrupos( int id_mat, String grupo, int iddocper);
}
