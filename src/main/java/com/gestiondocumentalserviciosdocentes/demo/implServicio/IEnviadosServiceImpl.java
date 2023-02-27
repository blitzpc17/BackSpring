package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.IEnviadosService;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IEnviados;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IEnviadosImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.Enviados;

public class IEnviadosServiceImpl implements IEnviadosService{

	@Override
	public List<Enviados> getEnviadosQ(String rem, String dest) {
		IEnviados daoEnviados;
		List<Enviados> respuestaEnviados = new ArrayList<Enviados>();
		
		try {
			daoEnviados = new IEnviadosImpl();
			respuestaEnviados = daoEnviados.getEnviados(rem, dest);
			System.out.println("Consulta exitosa");
		}catch(Exception e) {
			e.printStackTrace();
		}
		return respuestaEnviados;
	}

}
