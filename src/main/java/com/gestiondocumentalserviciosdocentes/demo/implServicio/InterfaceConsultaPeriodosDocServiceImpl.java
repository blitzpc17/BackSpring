package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.IConsultaPeriodosDocService;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IConsultaPeriodosDoc;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IConsultaPeriodosDocImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.ConsultaPeriodosDoc;

public class InterfaceConsultaPeriodosDocServiceImpl implements IConsultaPeriodosDocService{

	@Override
	public List<ConsultaPeriodosDoc> getConsultaPeriodosDoc(int idlab) {
		IConsultaPeriodosDoc daoConsultaPeriodosDoc;
		List<ConsultaPeriodosDoc> resConsultaPeriodosDocs=new ArrayList<ConsultaPeriodosDoc>();
		 
		try {
			daoConsultaPeriodosDoc=new IConsultaPeriodosDocImpl();
			resConsultaPeriodosDocs=daoConsultaPeriodosDoc.getConsultaPeriodosDoc(idlab);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return resConsultaPeriodosDocs;
	}

}
