package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.IConsultaCatalogoService;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IConsultaCatalogo;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IConsultaCatalogoImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.ConsultaCatalogo;

public class InterfaceConsultaCatalogoServiceImpl implements IConsultaCatalogoService {

	@Override
	public List<ConsultaCatalogo> getConsultaCatalogos(int dep) {
		IConsultaCatalogo daoConsultaCatalogo;
		List<ConsultaCatalogo> resConsultaCatalogos = new ArrayList<ConsultaCatalogo>();
		
		try {
			daoConsultaCatalogo= new IConsultaCatalogoImpl();
			resConsultaCatalogos=daoConsultaCatalogo.getConsultaCatalogos(dep);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resConsultaCatalogos;
	}

}
