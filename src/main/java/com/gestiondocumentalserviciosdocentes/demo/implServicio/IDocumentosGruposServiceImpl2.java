package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.IDocumentosGruposService2;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IDocumentosGrupos2;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IDocumentosGruposImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.DocumentosGrupos2;

public class IDocumentosGruposServiceImpl2 implements IDocumentosGruposService2{

	@Override
	public List<DocumentosGrupos2> getDocumentosGrupos(int filtro, int filtro2) {
		IDocumentosGrupos2 daoConsulta;
		List<DocumentosGrupos2> respuestaConsulta=new ArrayList<DocumentosGrupos2>();
		
		try {
			daoConsulta=new IDocumentosGruposImpl();
			respuestaConsulta=daoConsulta.getDocumentosGrupos(filtro, filtro2);
			System.out.println("Comsulta Exitosa");
		}catch (Exception e) {
			e.printStackTrace();
		}
		return respuestaConsulta;
	}

}
