package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.TecnologicosUsService;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.ITecnologicosUs;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.ITecnologicosUsImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.TecnologicosUs;

public class TecnologicosUsServiceImpl implements TecnologicosUsService{

	@Override
	public List<TecnologicosUs> getTecnologicoQ(String Filtro) {
		ITecnologicosUs daoTec;
		List<TecnologicosUs> respuestaTec = new ArrayList<TecnologicosUs>();
		
		try {
			daoTec = new ITecnologicosUsImpl();
			respuestaTec = daoTec.getTecnologicos(Filtro);
			System.out.println("Consulta exitosa");			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return respuestaTec;
	}

}
