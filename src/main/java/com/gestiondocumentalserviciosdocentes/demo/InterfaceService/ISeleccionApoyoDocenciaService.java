package com.gestiondocumentalserviciosdocentes.demo.InterfaceService;

import com.gestiondocumentalserviciosdocentes.demo.genericos.GenericService;
import com.gestiondocumentalserviciosdocentes.demo.modelo.SeleccionApoyoDocencia;

public interface ISeleccionApoyoDocenciaService extends GenericService<SeleccionApoyoDocencia, Integer>{

	SeleccionApoyoDocencia buscaxdepactividad( int id_dep, int id_act);
}
