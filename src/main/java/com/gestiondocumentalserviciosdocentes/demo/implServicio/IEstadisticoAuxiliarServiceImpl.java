package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.IEstadisticoAuxiliarService;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IEstadisticoAuxiliar;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IEstadisticoAuxiliarImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.EstadisticoAuxiliar;

public class IEstadisticoAuxiliarServiceImpl implements IEstadisticoAuxiliarService{

	@Override
	public List<EstadisticoAuxiliar> getEstadisticoAuxiliar(int filtro) {
		IEstadisticoAuxiliar daoConsulta;
		List<EstadisticoAuxiliar> respuestaConsulta=new ArrayList<EstadisticoAuxiliar>();
		
		try {
			daoConsulta=new IEstadisticoAuxiliarImpl();
			respuestaConsulta=daoConsulta.getEstadisticoAuxiliar(filtro);
			System.out.println("Consulta Exitosa");
		}catch (Exception e) {
			e.printStackTrace();
		}
		return respuestaConsulta;
	}

}
