package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseRepository;
import com.gestiondocumentalserviciosdocentes.demo.genericos.GenericServiceImplm;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IOcupacionLaboratorio;
import com.gestiondocumentalserviciosdocentes.demo.modelo.OcupacionLaboratorio;
@Service
public class OcupacionLaboratorioServiceImpl extends GenericServiceImplm<OcupacionLaboratorio, Integer>{
	@Autowired
	private IOcupacionLaboratorio datOcupacionLaboratorio;
	@Override
	public BaseRepository<OcupacionLaboratorio, Integer> getBaseRepository() {
		// TODO Auto-generated method stub
		return datOcupacionLaboratorio;
	}

}
