package com.gestiondocumentalserviciosdocentes.demo.InterfaceService;

import com.gestiondocumentalserviciosdocentes.demo.genericos.GenericService;
import com.gestiondocumentalserviciosdocentes.demo.modelo.DesarrolloAcademicoInst;

public interface DesarrolloAcademicoInstService extends GenericService<DesarrolloAcademicoInst,Integer>{

	DesarrolloAcademicoInst depxperiodo( int id_periodo);
}
