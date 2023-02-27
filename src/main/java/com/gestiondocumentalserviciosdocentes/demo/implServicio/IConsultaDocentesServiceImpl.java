package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.IConsultaDocentesService;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IConsultaDocentes;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IConsultaDocentesImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.ConsultasDocentes;

public class IConsultaDocentesServiceImpl implements IConsultaDocentesService{

	@Override
	public List<ConsultasDocentes> getConsultasDocentes(int filtro, int filtro2) {
		IConsultaDocentes daoConsulta;
		List<ConsultasDocentes> respuestaConsulta=new ArrayList<ConsultasDocentes>();
		
		try {
			daoConsulta=new IConsultaDocentesImpl();
			respuestaConsulta=daoConsulta.getConsultasDocentes(filtro, filtro2);
			System.out.println("Comsulta Exitosa");
		}catch (Exception e) {
			e.printStackTrace();
		}
		return respuestaConsulta;
	}

}
