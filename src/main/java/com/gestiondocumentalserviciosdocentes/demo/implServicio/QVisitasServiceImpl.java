package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.QVisitasService;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IQVisitas;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IQVisitasImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.QVisitas;

public class QVisitasServiceImpl implements QVisitasService{

	@Override
	public List<QVisitas> getVisitasQ(String Filtro) {
		IQVisitas daoVisitas;
		List<QVisitas> respuestaVisitas = new ArrayList<QVisitas>();
		
		try {
			daoVisitas = new IQVisitasImpl();
			respuestaVisitas = daoVisitas.getVisitas(Filtro);
			System.out.println("Consulta exitosa");
		}catch(Exception e) {
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return respuestaVisitas;
	}

}
