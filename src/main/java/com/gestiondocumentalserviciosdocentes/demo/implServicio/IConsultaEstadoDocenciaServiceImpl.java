package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.IConsultaEstadoDocenciaService;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IConsultaEstadoDocencia;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IConsultaEstadoDocenciaImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.ConsultaEstadoDocencia;

public class IConsultaEstadoDocenciaServiceImpl implements IConsultaEstadoDocenciaService{

	@Override
	public List<ConsultaEstadoDocencia> getConsultaEstadoDocencias(int filtro, int filtro2) {
		IConsultaEstadoDocencia daoConsulta;
		List<ConsultaEstadoDocencia> respuestaConsulta=new ArrayList<ConsultaEstadoDocencia>();
		
		try {
			daoConsulta=new IConsultaEstadoDocenciaImpl();
			respuestaConsulta=daoConsulta.getConsultaEstadoDocencias(filtro, filtro2);
			System.out.println("Consulta Exitosa");
		}catch (Exception e) {
			e.printStackTrace();
		}
		return respuestaConsulta;
	}

}
