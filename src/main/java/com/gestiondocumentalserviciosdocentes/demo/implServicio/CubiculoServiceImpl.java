package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.CubiculoService;
import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseRepository;
import com.gestiondocumentalserviciosdocentes.demo.genericos.GenericServiceImplm;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.ICubiculo;
import com.gestiondocumentalserviciosdocentes.demo.modelo.Cubiculo;

@Service
public class CubiculoServiceImpl extends GenericServiceImplm<Cubiculo, Integer> implements CubiculoService{
	
	@Autowired
	private ICubiculo datosICubiculo;
	
	@Override
	public BaseRepository<Cubiculo, Integer> getBaseRepository() {
		// TODO Auto-generated method stub
		return datosICubiculo;
	}

	@Override
	public Cubiculo buscarCubiculoxUsuario(int id_usuarios) {
		// TODO Auto-generated method stub
		return datosICubiculo.buscarCubiculoxUsuario(id_usuarios);
	}

}
