package com.gestiondocumentalserviciosdocentes.demo.InterfaceService;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.genericos.GenericService;
import com.gestiondocumentalserviciosdocentes.demo.modelo.Productos_Docencia;

public interface IProductos_DocenciaService extends GenericService<Productos_Docencia, Integer> {

	List<Productos_Docencia> buscarProductos_Docencia(int id_docper, int id_usuario);
}
