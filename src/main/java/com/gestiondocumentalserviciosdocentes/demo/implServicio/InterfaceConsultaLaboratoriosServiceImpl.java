package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.IConsultaLaboratoriosService;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IConsultaLaboratorios;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IConsultaLaboratoriosImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.ConsultaLaboratorios;

public class InterfaceConsultaLaboratoriosServiceImpl implements IConsultaLaboratoriosService {

	@Override
	public List<ConsultaLaboratorios> getConsultaLaboratorios(int id_Departamento) {
		IConsultaLaboratorios daoConsultaLaboratorios;
		List<ConsultaLaboratorios> resConsultaLaboratorios=new ArrayList<ConsultaLaboratorios>();
		
		try {
			daoConsultaLaboratorios=new IConsultaLaboratoriosImpl();
			resConsultaLaboratorios=daoConsultaLaboratorios.getConsultaLaboratorios(id_Departamento);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resConsultaLaboratorios;
	}

}
