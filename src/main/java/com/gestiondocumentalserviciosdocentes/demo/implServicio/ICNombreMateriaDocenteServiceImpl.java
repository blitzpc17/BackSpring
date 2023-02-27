package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.ICNombreMateriaDocenteService;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.ICNombreMateriaDocente;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.ICNombreMateriaDocenteImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.CNombreMateriaDocente;


public class ICNombreMateriaDocenteServiceImpl implements ICNombreMateriaDocenteService{

	
	@Override
	public List<CNombreMateriaDocente> getCNombreMateriaDocentes(int filtro, int filtro2, int filtro3) {
		ICNombreMateriaDocente daoConsulta;
		List<CNombreMateriaDocente> respuestaConsulta=new ArrayList<CNombreMateriaDocente>();
		
		try {
			daoConsulta=new ICNombreMateriaDocenteImpl();
			respuestaConsulta=daoConsulta.getCNombreMateriaDocentes(filtro, filtro2,filtro3);
			System.out.println("Consulta Exitosa");
		}catch (Exception e) {
			e.printStackTrace();
		}
		return respuestaConsulta;
	}

}
