package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.IDocumentosLaboratoriosService;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IDocumentosLaboratorios;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IDocumentosLaboratoriosImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.DocumentosLaboratorios;

public class IDocumentosLaboratoriosServiceImpl implements IDocumentosLaboratoriosService{

	@Override
	public List<DocumentosLaboratorios> getDocumentosLaboratorios(int filtro,int filtro2) {
		IDocumentosLaboratorios daoConsulta;
		List<DocumentosLaboratorios> respuestaConsulta=new ArrayList<DocumentosLaboratorios>();
		
		try {
			daoConsulta=new IDocumentosLaboratoriosImpl();
			respuestaConsulta=daoConsulta.getDocumentosLaboratorios(filtro,filtro2);
			System.out.println("Consulta Exitosa");
		}catch (Exception e) {
			e.printStackTrace();
		}
		return respuestaConsulta;
	}

}
