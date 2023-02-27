package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.ProDocQService;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IProDocQ;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IProDocQImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.ProDocQ;

public class ProDocQServiceImpl implements ProDocQService{

	@Override
	public List<ProDocQ> getDocenciaQ(String Filtro, int idPer) {
		IProDocQ daoDocencia;
		List<ProDocQ> respuestaDocencia = new ArrayList<ProDocQ>();
		
		try {
			daoDocencia = new IProDocQImpl();
			respuestaDocencia = daoDocencia.getDocencia(Filtro, idPer);
			System.out.println("Consulta exitosa");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		// TODO Auto-generated method stub
		return respuestaDocencia;
	}

}
