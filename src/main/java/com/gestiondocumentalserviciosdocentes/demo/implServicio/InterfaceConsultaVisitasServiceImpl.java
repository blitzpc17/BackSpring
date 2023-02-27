package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.IConsultaVisitasService;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IConsultaVisitas;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IConsultaVisitasImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.ConsultaVisitas;

public class InterfaceConsultaVisitasServiceImpl implements IConsultaVisitasService {

	@Override
	public List<ConsultaVisitas> getConsultaVisitas(int iddep, int idper) {
		IConsultaVisitas daoConsultaVisitas;
		List<ConsultaVisitas> resConsultaVisitas = new ArrayList<ConsultaVisitas>();
		
		try {
			daoConsultaVisitas=new IConsultaVisitasImpl();
			resConsultaVisitas=daoConsultaVisitas.getConsultaVisitas(iddep, idper);			
		
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return resConsultaVisitas;
	}

}
