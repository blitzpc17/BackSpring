package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.IFormatosService;
import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseRepository;
import com.gestiondocumentalserviciosdocentes.demo.genericos.GenericServiceImplm;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IFormatos;
import com.gestiondocumentalserviciosdocentes.demo.modelo.Formatos;

@Service
public class IFormatosServiceImpl extends GenericServiceImplm<Formatos, Integer> implements IFormatosService {

	@Autowired
	IFormatos iFormatos;
	
	@Override
	public BaseRepository<Formatos, Integer> getBaseRepository() {
		// TODO Auto-generated method stub
		return iFormatos;
	}

	@Override
	public List<Formatos> formatosxdep(int id_dep) {
		// TODO Auto-generated method stub
		return iFormatos.formatosxdep(id_dep);
	}

}
