package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.IConsultaAlumnosService;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IConsultaAlumnos;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IConsultaAlumnosImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.ConsultaAlumnos;

public class InterfaceConsultaAlumnosServiceImpl implements IConsultaAlumnosService{

	@Override
	public List<ConsultaAlumnos> getConsultaAlumnos(int iddep, int idper, int idusuario) {
		IConsultaAlumnos daoConsultaAlumnos;
		List<ConsultaAlumnos> resConsultaAlumnos = new ArrayList<ConsultaAlumnos>();
		
		try {
			daoConsultaAlumnos=new IConsultaAlumnosImpl();
			resConsultaAlumnos=daoConsultaAlumnos.getConsultaAlumnos(iddep, idper, idusuario);
			
		
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return resConsultaAlumnos;
	}

}
