package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.IActividadesDocenciaService;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IActividadesDocencia;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IActividadesDocenciaImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.ActividadesDocencia;


public class IActividadesDocenciaServiceImpl implements IActividadesDocenciaService {

	@Override
	public List<ActividadesDocencia> getActividadesDocencia(int filtro, int filtro2) {
		IActividadesDocencia daoConsulta;
		List<ActividadesDocencia> respuestaConsulta=new ArrayList<ActividadesDocencia>();
		
		try {
			daoConsulta=new IActividadesDocenciaImpl();
			respuestaConsulta=daoConsulta.getActividadesDocencia(filtro, filtro2);
			System.out.println("Comsulta Exitosa");
		}catch (Exception e) {
			e.printStackTrace();
		}
		return respuestaConsulta;
	}

}
