package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.ICmensajeService;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.ICmensaje;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.ICmensajeImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.Cmensajes;

public class ICmensajeServiceImpl implements ICmensajeService{

	@Override
	public List<Cmensajes> getMensajesDep(String filtro) {
		ICmensaje daoMensaje;
		List<Cmensajes>  respuestaMensaje = new ArrayList<Cmensajes>();
		try {
			daoMensaje = new ICmensajeImpl();
			respuestaMensaje = daoMensaje.getMensajes(filtro);
			System.out.println("Consulta exitosa");
		}catch(Exception e) {
			e.printStackTrace();
		}
		return respuestaMensaje;
	}

}
