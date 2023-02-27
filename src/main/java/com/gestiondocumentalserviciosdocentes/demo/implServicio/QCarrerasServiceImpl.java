package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.QCarrerasService;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IQCarreras;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IQCarrerasImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.QCarreras;

public class QCarrerasServiceImpl implements QCarrerasService{

	@Override
	public List<QCarreras> getCarrerasQ(String Filtro) {
		IQCarreras daoCarreras;
		List<QCarreras> respuestaCarreras = new ArrayList<QCarreras>();
		try {
			daoCarreras = new IQCarrerasImpl();	
			respuestaCarreras = daoCarreras.getCarreras(Filtro);
			System.out.println("Consulta exitosa");
		}catch(Exception e) {
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return respuestaCarreras;
	}

}
