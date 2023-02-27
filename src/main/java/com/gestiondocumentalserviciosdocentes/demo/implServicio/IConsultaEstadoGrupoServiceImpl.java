package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.IConsultaEstadoGrupoService;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IConsultaEstadoGrupo;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IConsultaEstadoGrupoImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.ConsultaEstadoGrupo;


public class IConsultaEstadoGrupoServiceImpl implements IConsultaEstadoGrupoService {

	@Override
	public List<ConsultaEstadoGrupo> getConsultaEstadoGrupos(int filtro, int filtro2) {
		IConsultaEstadoGrupo daoConsulta;
		List<ConsultaEstadoGrupo> respuestaConsulta=new ArrayList<ConsultaEstadoGrupo>();
		
		try {
			daoConsulta=new IConsultaEstadoGrupoImpl();
			respuestaConsulta=daoConsulta.getConsultaEstadoGrupos(filtro, filtro2);
			System.out.println("Consulta Exitosa");
		}catch (Exception e) {
			e.printStackTrace();
		}
		return respuestaConsulta;
	}

}
