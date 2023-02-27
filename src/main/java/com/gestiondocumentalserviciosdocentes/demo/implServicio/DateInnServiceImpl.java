package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.DateInnService;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IDateInn;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IDateInnImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.DateInn;

public class DateInnServiceImpl implements DateInnService{

	@Override
	public List<DateInn> getDateInn(String year) {
		IDateInn daoMensaje;
		List<DateInn>  respuestaMensaje = new ArrayList<DateInn>();
		try {
			daoMensaje = new IDateInnImpl();
			respuestaMensaje = daoMensaje.getDate(year);
			System.out.println("Consulta exitosa");
		}catch(Exception e) {
			e.printStackTrace();
		}
		return respuestaMensaje;
	}

}
