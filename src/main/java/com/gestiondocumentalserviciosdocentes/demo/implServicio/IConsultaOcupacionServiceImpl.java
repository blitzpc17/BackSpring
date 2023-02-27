package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.IConsultaOcupacionService;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IConsultaOcupacion;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IConsultaOcupacionImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.ConsultaOcupacion;

public class IConsultaOcupacionServiceImpl implements IConsultaOcupacionService{

	@Override
	public List<ConsultaOcupacion> getOcupaciones(int filtro) {
		IConsultaOcupacion daoConsulta;
		List<ConsultaOcupacion> respuestaConsulta=new ArrayList<ConsultaOcupacion>();
		
		try {
			daoConsulta=new IConsultaOcupacionImpl();
			respuestaConsulta=daoConsulta.getOcupaciones(filtro);
			System.out.println("Consulta Exitosa");
		}catch (Exception e) {
			e.printStackTrace();
		}
		return respuestaConsulta;
	}

}
