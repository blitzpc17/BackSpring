package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.IProductos_DocenciaService;
import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseRepository;
import com.gestiondocumentalserviciosdocentes.demo.genericos.GenericServiceImplm;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IProductos_Docencia;
import com.gestiondocumentalserviciosdocentes.demo.modelo.Productos_Docencia;

@Service
public class IProductos_DocenciaServiceImpl extends GenericServiceImplm<Productos_Docencia, Integer> implements IProductos_DocenciaService {

	@Autowired
	private IProductos_Docencia iprodoc;
	
	@Override
	public BaseRepository<Productos_Docencia, Integer> getBaseRepository() {
		// TODO Auto-generated method stub
		return iprodoc;
	}

	@Override
	public List<Productos_Docencia> buscarProductos_Docencia(int id_docper, int id_usuario) {
		// TODO Auto-generated method stub
		return iprodoc.buscarProductos_Docencia(id_docper, id_usuario);
	}

}
