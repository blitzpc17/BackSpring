package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.DocenciaQService;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IDocenciaQ;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IDocenciaQImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.DocenciaQ;

public class DocenciaQServiceImpl implements DocenciaQService{

	@Override
	public List<DocenciaQ> getDocenciaQ(String Filtro) {
		IDocenciaQ daoDocencia;
		List<DocenciaQ> respuestaDocencia = new ArrayList<DocenciaQ>();
		
		try {
			daoDocencia = new IDocenciaQImpl();
			respuestaDocencia = daoDocencia.getDocencia(Filtro);
			System.out.println("Consulta exitosa");
		}catch(Exception e) {
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return respuestaDocencia;
	}

}
