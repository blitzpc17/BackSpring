package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.VisitaUsService;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IVisitasUs;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IVisitasUsImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.VisitasUs;

public class VisitasUsServiceImpl implements VisitaUsService{

	@Override
	public List<VisitasUs> getVisitasQ(String Filtro) {
		IVisitasUs daoVisitas;
		List<VisitasUs> respuestaVisitas = new ArrayList<VisitasUs>();
		
		try {
			daoVisitas = new IVisitasUsImpl();
			respuestaVisitas = daoVisitas.getVisitas(Filtro);
			System.out.println("Consulta exitosa");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return respuestaVisitas;
	}

}
