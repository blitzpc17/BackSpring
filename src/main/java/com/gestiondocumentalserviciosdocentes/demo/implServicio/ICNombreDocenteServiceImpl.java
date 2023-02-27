package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.ICNombreDocenteService;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.ICNombreDocente;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.ICNombreDocenteImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.CNombreDocente;

public class ICNombreDocenteServiceImpl implements ICNombreDocenteService{

	@Override
	public List<CNombreDocente> getCNombreDocentes(int filtro) {
		ICNombreDocente daoConsulta;
		List<CNombreDocente> respuestaConsulta=new ArrayList<CNombreDocente>();
		
		try {
			daoConsulta=new ICNombreDocenteImpl();
			respuestaConsulta=daoConsulta.getCNombreDocentes(filtro);
			System.out.println("Consulta Exitosa");
		}catch (Exception e) {
			e.printStackTrace();
		}
		return respuestaConsulta;
	}

}
