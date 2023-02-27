package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.IConsultaDocLabService;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IConsultaDocLab;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IConsultaDocLabImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.ConsultaDocLab;

public class InterfaceConsultaDocLabServiceImpl implements IConsultaDocLabService{

	@Override
	public List<ConsultaDocLab> getConsultaDocLab(int idgestion, int iddep) {
		IConsultaDocLab daoConsultaDocLab;
		List<ConsultaDocLab> resConsultaDocLab= new ArrayList<ConsultaDocLab>();
		
		try {
			daoConsultaDocLab=new IConsultaDocLabImpl();
			resConsultaDocLab=daoConsultaDocLab.getConsultaDocLab(idgestion, iddep);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return resConsultaDocLab;
	}
	
}
