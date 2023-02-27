package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.IConsultaDocVisitasService;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IConsultaDocVisitas;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IConsultaDocVisitasImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.ConsultaDocVisitas;

public class InterfaceConsultaDocVisitasServiceImpl implements IConsultaDocVisitasService{

	@Override
	public List<ConsultaDocVisitas> getConsultaDocVisitas(int idvis) {
		IConsultaDocVisitas daoConsultaDocVisitas;
		List<ConsultaDocVisitas> resConsultaDocVisitas = new ArrayList<ConsultaDocVisitas>();
		
		try {
			daoConsultaDocVisitas=new IConsultaDocVisitasImpl();
			resConsultaDocVisitas=daoConsultaDocVisitas.getConsultaDocVisitas(idvis);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resConsultaDocVisitas;
	}

}
