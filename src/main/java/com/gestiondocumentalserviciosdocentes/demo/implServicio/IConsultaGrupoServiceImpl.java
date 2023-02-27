package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.IConsultaGrupoService;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IConsultaGrupo;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IConsultaGrupoImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.ConsultaGrupo;

public class IConsultaGrupoServiceImpl implements IConsultaGrupoService {

	@Override
	public List<ConsultaGrupo> getConsultaGrupo(int filtro, int filtro2) {
		
		IConsultaGrupo daoConsulta;
		List<ConsultaGrupo> respuestaConsulta=new ArrayList<ConsultaGrupo>();
		
		try {
			daoConsulta=new IConsultaGrupoImpl();
			respuestaConsulta=daoConsulta.getConsultaGrupo(filtro, filtro2);
			System.out.println("Comsulta Exitosa");
		}catch (Exception e) {
			e.printStackTrace();
		}
		return respuestaConsulta;
	}

}
