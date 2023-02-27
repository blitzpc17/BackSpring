package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.CursoCountService;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.ICursoCount;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.ICursoCountImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.CursoCount;

public class CursoCountServiceImpl implements CursoCountService{

	@Override
	public List<CursoCount> getCursoQ(String Filtro) {
		
		ICursoCount daoCurso;
		List<CursoCount> respuestaCursos = new ArrayList<CursoCount>();
		try {
			daoCurso = new ICursoCountImpl();
			respuestaCursos = daoCurso.getCurso(Filtro);
			System.out.println("Consulta exitosa");
		}catch(Exception e) {
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return respuestaCursos;
	}

}
