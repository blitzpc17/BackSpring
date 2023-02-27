package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.CountVisitasService;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.ICountVisitas;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.ICountVisitasImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.CountVisitas;

public class CountVisitasServiceImpl implements CountVisitasService {

	@Override
	public List<CountVisitas> getVisitasQ(String Filtro, String Per) {
		ICountVisitas  daoVisitas;
		List<CountVisitas> respuesta = new ArrayList<CountVisitas>();
		
		try {
			daoVisitas = new ICountVisitasImpl();
			respuesta = daoVisitas.getVisitas(Filtro, Per);
			System.out.println("Consulta exitosa");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		// TODO Auto-generated method stub
		return respuesta;
	}

}
