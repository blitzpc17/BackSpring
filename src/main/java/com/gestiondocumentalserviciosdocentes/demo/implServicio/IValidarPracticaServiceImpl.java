package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.IValidarPracticaService;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IValidarPractica;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IValidarPracticaImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.ValidarPractica;

public class IValidarPracticaServiceImpl implements IValidarPracticaService{

	@Override
	public List<ValidarPractica> getValidarPracticas(int filtro, String filtro2) {
		IValidarPractica daoConsulta;
		List<ValidarPractica> respuestaConsulta=new ArrayList<ValidarPractica>();
		
		try {
			daoConsulta=new IValidarPracticaImpl();
			respuestaConsulta=daoConsulta.getValidarPracticas(filtro,filtro2);
			System.out.println("Consulta Exitosa");
		}catch (Exception e) {
			e.printStackTrace();
		}
		return respuestaConsulta;
	}

}
