package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.IConsultaVisitasDocenteService;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IConsultaVisitasDocente;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IConsultaVisitasDocenteImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.ConsultaVisitasDocente;

public class InterfaceConsultaVisitasDocenteServiceImpl implements IConsultaVisitasDocenteService {

	@Override
	public List<ConsultaVisitasDocente> getConsultaVisitasDocentes(int iddep, int idper, int iduser) {
		IConsultaVisitasDocente daoConsultaVisitasDocente;
		List<ConsultaVisitasDocente> resConsultaVisitasDocentes = new ArrayList<ConsultaVisitasDocente>();
		
		try {
			daoConsultaVisitasDocente=new IConsultaVisitasDocenteImpl();
			resConsultaVisitasDocentes=daoConsultaVisitasDocente.getConsultaVisitasDocentes(iddep, idper, iduser);
			
		
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return resConsultaVisitasDocentes;
	}

}
