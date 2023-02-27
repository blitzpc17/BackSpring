package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.IUcursosService;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IUcursos;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IUcursosImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.Ucursos;

public class IUcursosServiceImpl implements IUcursosService{

	@Override
	public List<Ucursos> getCursosUsuario(String filtro) {
		IUcursos daoCursos;
		List<Ucursos> respuestaCursos = new ArrayList<Ucursos>();
		try {
			daoCursos = new IUcursosImpl();
			respuestaCursos = daoCursos.grtCursos(filtro);
			System.out.println("Consulta exitosa");
		}catch(Exception e) {
			e.printStackTrace();
		}
		return respuestaCursos;
	}

}
