package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.InterfaceMatJefaturaService;
import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseRepository;
import com.gestiondocumentalserviciosdocentes.demo.genericos.GenericServiceImplm;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IMatJefatura;
import com.gestiondocumentalserviciosdocentes.demo.modelo.MatJefatura;

@Service
public class InterfaceMatJefaturaServiceImpl extends GenericServiceImplm<MatJefatura,Integer> implements InterfaceMatJefaturaService{

	@Autowired
	private IMatJefatura datosMatjefatura;
	
	@Override
	public BaseRepository<MatJefatura, Integer> getBaseRepository() {
		// TODO Auto-generated method stub
		return datosMatjefatura;
	}

}
