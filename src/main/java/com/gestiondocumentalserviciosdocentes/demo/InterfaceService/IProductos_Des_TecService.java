package com.gestiondocumentalserviciosdocentes.demo.InterfaceService;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.genericos.GenericService;
import com.gestiondocumentalserviciosdocentes.demo.modelo.Productos_Des_Tecnologico;

public interface IProductos_Des_TecService extends GenericService<Productos_Des_Tecnologico, Integer> {

	List<Productos_Des_Tecnologico> buscarProductos_Des_Tec(int id_docper, int id_usuario);
}
