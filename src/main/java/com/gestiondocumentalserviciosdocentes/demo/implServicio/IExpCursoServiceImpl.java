package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.IExpCursoService;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IExpCursoImpl;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IExpoCurso;
import com.gestiondocumentalserviciosdocentes.demo.modelo.ExpCurso;

public class IExpCursoServiceImpl implements IExpCursoService{

	@Override
	public List<ExpCurso> getCursoQ(String Filtro) {
		IExpoCurso daoCurso;
		List<ExpCurso> respuestaCurso = new ArrayList<ExpCurso>();
		try {
			daoCurso = new IExpCursoImpl();
			respuestaCurso = daoCurso.getCurso(Filtro);
			System.out.println("Consulta exitosa");
		}catch(Exception e) {
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return respuestaCurso;
	}

}
