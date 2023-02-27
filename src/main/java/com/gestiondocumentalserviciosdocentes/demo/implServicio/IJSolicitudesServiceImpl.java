package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.IJSolicitudesService;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IJSolicitudes;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IJSolicitudesImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.JSolicitudes;


public class IJSolicitudesServiceImpl implements IJSolicitudesService{

	@Override
	public List<JSolicitudes> getJSolicitudes(int filtro,String  filtro2,int filtro3) {
		IJSolicitudes daoConsulta;
		List<JSolicitudes> respuestaConsulta=new ArrayList<JSolicitudes>();
		
		try {
			daoConsulta=new IJSolicitudesImpl();
			respuestaConsulta=daoConsulta.getJSolicitudes(filtro,filtro2,filtro3);
			System.out.println("Consulta Exitosa");
		}catch (Exception e) {
			e.printStackTrace();
		}
		return respuestaConsulta;
	}

}
