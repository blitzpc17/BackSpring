package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.IInfocursoService;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IInfocurso;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IInfocursoImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.Infocurso;

public class IInfocursoServiceImpl implements IInfocursoService{

	@Override
	public List<Infocurso> getCursoQ(String Filtro) {
		IInfocurso daoCursos;
		List<Infocurso> respuestaCursos = new ArrayList<Infocurso>();
		try {
			daoCursos = new IInfocursoImpl();
			respuestaCursos = daoCursos.getCurso(Filtro);
			System.out.println("Consulta exitosa");
		}catch(Exception e) {
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return respuestaCursos;
	}

}
