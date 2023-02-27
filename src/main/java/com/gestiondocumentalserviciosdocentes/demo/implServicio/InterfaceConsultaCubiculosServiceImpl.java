package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.IConsultaCubiculosService;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IConsultaCubiculos;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IConsultaCubiculosImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.ConsultaCubiculos;

public class InterfaceConsultaCubiculosServiceImpl implements IConsultaCubiculosService{

	@Override
	public List<ConsultaCubiculos> getConsultaCubiculos(int iddep) {
		IConsultaCubiculos daConsultaCubiculos;
		List<ConsultaCubiculos> resConsultaCubiculos = new ArrayList<ConsultaCubiculos>();
		
		try {
			daConsultaCubiculos=new IConsultaCubiculosImpl();
			resConsultaCubiculos=daConsultaCubiculos.getConsultaCubiculos(iddep);
			
		
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return resConsultaCubiculos;
	}
	
	

}
