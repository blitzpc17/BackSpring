package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.IOcupacionAuxiliarService;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IOcupacionAuxiliar;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IOcupacionAuxiliarImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.OcupacionAuxiliar;

public class IOcupacionAuxiliarServiceImpl implements IOcupacionAuxiliarService {

	@Override
	public List<OcupacionAuxiliar> getocuOcupacionAuxiliar(int filtro) {
		IOcupacionAuxiliar daoConsulta;
		List<OcupacionAuxiliar> respuestaConsulta=new ArrayList<OcupacionAuxiliar>();
		
		try {
			daoConsulta=new IOcupacionAuxiliarImpl();
			respuestaConsulta=daoConsulta.getocuOcupacionAuxiliar(filtro);
			System.out.println("Consulta Exitosa");
		}catch (Exception e) {
			e.printStackTrace();
		}
		return respuestaConsulta;
	}

}
