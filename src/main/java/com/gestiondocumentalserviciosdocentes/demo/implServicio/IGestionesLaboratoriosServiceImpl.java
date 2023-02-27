package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.IGestionesLaboratoriosService;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IGestionesLaboratorios;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IGestionesLaboratoriosImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.GestionesLaboratorios;

public class IGestionesLaboratoriosServiceImpl implements IGestionesLaboratoriosService {

	@Override
	public List<GestionesLaboratorios> getGestionesLaboratorios(int filtro, int filtro2) {
		IGestionesLaboratorios daoConsulta;
		List<GestionesLaboratorios> respuestaConsulta=new ArrayList<GestionesLaboratorios>();
		
		try {
			daoConsulta=new IGestionesLaboratoriosImpl();
			respuestaConsulta=daoConsulta.getGestionesLaboratorios(filtro, filtro2);
			System.out.println("Comsulta Exitosa");
		}catch (Exception e) {
			e.printStackTrace();
		}
		return respuestaConsulta;
	}

	

}
