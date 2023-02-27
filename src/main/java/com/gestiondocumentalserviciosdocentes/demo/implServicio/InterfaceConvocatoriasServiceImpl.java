package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.InterfaceConvocatoriasService;
import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseRepository;
import com.gestiondocumentalserviciosdocentes.demo.genericos.GenericServiceImplm;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IConvocatorias;
import com.gestiondocumentalserviciosdocentes.demo.modelo.Convocatorias;

@Service
public class InterfaceConvocatoriasServiceImpl extends GenericServiceImplm<Convocatorias,Integer> implements InterfaceConvocatoriasService{
	@Autowired
	private IConvocatorias datosConvocatorias;

	@Override
	public BaseRepository<Convocatorias, Integer> getBaseRepository() {
		// TODO Auto-generated method stub
		return datosConvocatorias;
	}

	@Override
	public List<Convocatorias> buscarxdep(int id_dep, int id_usuario) {
		// TODO Auto-generated method stub
		return datosConvocatorias.buscarxdep(id_dep, id_usuario);
	}
}
