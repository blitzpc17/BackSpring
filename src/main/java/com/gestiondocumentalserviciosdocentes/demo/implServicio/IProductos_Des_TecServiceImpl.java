package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.IProductos_Des_TecService;
import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseRepository;
import com.gestiondocumentalserviciosdocentes.demo.genericos.GenericServiceImplm;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IProductos_Des_Tecnologico;
import com.gestiondocumentalserviciosdocentes.demo.modelo.Productos_Des_Tecnologico;

@Service
public class IProductos_Des_TecServiceImpl extends GenericServiceImplm<Productos_Des_Tecnologico, Integer> implements IProductos_Des_TecService {

	@Autowired
	private IProductos_Des_Tecnologico iprodestec;
	
	@Override
	public BaseRepository<Productos_Des_Tecnologico, Integer> getBaseRepository() {
		// TODO Auto-generated method stub
		return iprodestec;
	}

	@Override
	public List<Productos_Des_Tecnologico> buscarProductos_Des_Tec(int id_docper, int id_usuario) {
		// TODO Auto-generated method stub
		return iprodestec.buscarProductos_Des_Tec(id_docper, id_usuario);
	}

}
