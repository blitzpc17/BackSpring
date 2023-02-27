package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.IConsultaAsesoresService;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IConsultaAsesores;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IConsultaAsesoresImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.ConsultaAsesores;

public class InterfaceConsultaAsesoresServiceImpl implements IConsultaAsesoresService {

	@Override
	public List<ConsultaAsesores> getConsultaAsesores(int iddep, int idper) {
		IConsultaAsesores daoConsultaAsesores;
		List<ConsultaAsesores> resConsultaAsesores = new ArrayList<ConsultaAsesores>();
		
		try {
			daoConsultaAsesores=new IConsultaAsesoresImpl();
			resConsultaAsesores=daoConsultaAsesores.getConsultaAsesores(iddep,idper);
			
		
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return resConsultaAsesores;
	}

}
