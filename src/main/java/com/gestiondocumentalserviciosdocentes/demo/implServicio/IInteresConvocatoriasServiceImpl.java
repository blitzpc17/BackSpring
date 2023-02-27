package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.IInteresConvocatoriasService;
import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseRepository;
import com.gestiondocumentalserviciosdocentes.demo.genericos.GenericServiceImplm;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IInteresConvocatorias;
import com.gestiondocumentalserviciosdocentes.demo.modelo.InteresConvocatorias;

@Service
public class IInteresConvocatoriasServiceImpl extends GenericServiceImplm<InteresConvocatorias, Integer> implements IInteresConvocatoriasService {

	@Autowired
	IInteresConvocatorias iConvocatorias;
	
	@Override
	public BaseRepository<InteresConvocatorias, Integer> getBaseRepository() {
		// TODO Auto-generated method stub
		return iConvocatorias;
	}

}
