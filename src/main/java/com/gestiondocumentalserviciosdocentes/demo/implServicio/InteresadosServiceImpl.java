package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.InteresadosService;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IInteresados;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IInteresadosImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.Interesados;

public class InteresadosServiceImpl implements InteresadosService{

	@Override
	public List<Interesados> getListaQ(String Filtro) {
		IInteresados daoInteres;
		List<Interesados> respuestaInteres = new ArrayList<Interesados>();
		try {
			daoInteres = new IInteresadosImpl();
			respuestaInteres = daoInteres.getLista(Filtro);
			System.out.println("Consulta exitosa");
		}catch(Exception e) {
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return respuestaInteres;
	}

}
