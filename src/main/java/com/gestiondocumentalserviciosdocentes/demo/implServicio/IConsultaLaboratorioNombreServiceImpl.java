package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.IConsultaLaboratorioNombreService;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IConsultaLaboratorioNombre;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IConsultaLaboratorioNombreImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.ConsultaLaboratorioNombre;


public class IConsultaLaboratorioNombreServiceImpl implements IConsultaLaboratorioNombreService{

	@Override
	public List<ConsultaLaboratorioNombre> getConsultaLaboratorioNombresint(int filtro) {
		IConsultaLaboratorioNombre daoConsulta;
		List<ConsultaLaboratorioNombre> respuestaConsulta=new ArrayList<ConsultaLaboratorioNombre>();
		
		try {
			daoConsulta=new IConsultaLaboratorioNombreImpl();
			respuestaConsulta=daoConsulta.getConsultaLaboratorioNombresint(filtro);
			System.out.println("Consulta Exitosa");
		}catch (Exception e) {
			e.printStackTrace();
		}
		return respuestaConsulta;
	}
	

}
