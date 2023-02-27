package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.IConsultaP1Service;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IConsultaPeriodo1;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IConsultaPeriodo1Impl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.ConsultaPeriodo1;

public class InterfaceConsultaP1Impl implements IConsultaP1Service{

	@Override
	public List<ConsultaPeriodo1> getConsultaPeriodo1() {
		
		IConsultaPeriodo1 daoConsulta;
		List<ConsultaPeriodo1> respuestaConsulta = new ArrayList<ConsultaPeriodo1>();
		
		try {
			
			daoConsulta = new IConsultaPeriodo1Impl();
			respuestaConsulta = daoConsulta.getConsultaPeriodo1();
			System.out.println("Consulta Exitosa");
			
		} catch (Exception e) {

			e.printStackTrace();
			
		}
		
		return respuestaConsulta;
	}

}
