package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.DatosCursoService;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IDatosCurso;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IDatosCursoImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.DatosCurso;

public class DatosCursoServiceImpl implements DatosCursoService{

	@Override
	public List<DatosCurso> getCursoQ(String Filtro) {
		IDatosCurso daoCurso;
		List<DatosCurso> respuestaCurso = new ArrayList<DatosCurso>();
		try {
			daoCurso = new IDatosCursoImpl();
			respuestaCurso = daoCurso.getCurso(Filtro);
			System.out.println("Consulta exitosa");
		}catch(Exception e) {
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return respuestaCurso;
	}

}
