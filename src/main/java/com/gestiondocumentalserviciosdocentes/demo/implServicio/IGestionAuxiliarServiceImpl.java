package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.IGestionAuxiliarService;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IDocumentosLaboratorios;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IDocumentosLaboratoriosImpl;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IGestionAuxiliar;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IGestionAuxiliarImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.DocumentosLaboratorios;
import com.gestiondocumentalserviciosdocentes.demo.modelo.GestionAuxiliar;

public class IGestionAuxiliarServiceImpl implements IGestionAuxiliarService {

	@Override
	public List<GestionAuxiliar> getGestionAuxiliar(int filtro,int filtro2) {
		IGestionAuxiliar daoConsulta;
		List<GestionAuxiliar> respuestaConsulta=new ArrayList<GestionAuxiliar>();
		
		try {
			daoConsulta=new IGestionAuxiliarImpl();
			respuestaConsulta=daoConsulta.getGestionAuxiliar(filtro, filtro2);
			System.out.println("Consulta Exitosa");
		}catch (Exception e) {
			e.printStackTrace();
		}
		return respuestaConsulta;
	}

	}


