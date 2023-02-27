package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.TecnologicoQService;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.ITecnologicoQ;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.ITecnologicoQImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.TecnologicoQ;

public class TecnologicoQServiceImpl implements TecnologicoQService{

	@Override
	public List<TecnologicoQ> getTecnologicoQ(String Filtro, int idPer) {
		ITecnologicoQ  daoTecnologico;
		List<TecnologicoQ> respuestaTec = new ArrayList<TecnologicoQ>();
		
		try {
			daoTecnologico = new ITecnologicoQImpl();
			respuestaTec = daoTecnologico.getTecnologico(Filtro, idPer);
			System.out.println("Consulta exitosa");
		}catch(Exception e) {
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return respuestaTec;
	}

}
