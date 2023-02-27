package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.IConsultaDepartamentService;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IConsultaDepartamento;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IConsultaDepartamentoImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.ConsultaDepartamento;

public class InterfaceConsultaDepartamentoServiceImpl implements IConsultaDepartamentService{

	@Override
	public List<ConsultaDepartamento> getConsultaDepartamento() {
		IConsultaDepartamento daoConsultaDepartamento;
		List<ConsultaDepartamento> resConsultaDepartamentos=new ArrayList<ConsultaDepartamento>();
		
		try {
			daoConsultaDepartamento=new IConsultaDepartamentoImpl();
			resConsultaDepartamentos=daoConsultaDepartamento.getConsultaDepartamento();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resConsultaDepartamentos;
	}

}
