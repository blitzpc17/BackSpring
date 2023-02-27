package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.IConsultaDocCatalogoService;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IConsultaDocCatalogo;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IConsultaDocCatalogoImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.ConsultaDocCatalogo;

public class InterfaceConsultaDocCatalogoServiceImpl implements IConsultaDocCatalogoService {

	@Override
	public List<ConsultaDocCatalogo> getConsultaDocCatalogos(int iddep) {
		IConsultaDocCatalogo daoCatalogo;
		List<ConsultaDocCatalogo> resConsultaDocCatalogos=new ArrayList<ConsultaDocCatalogo>();
		
		try {
			daoCatalogo=new IConsultaDocCatalogoImpl();
			resConsultaDocCatalogos=daoCatalogo.getConsultaDocCatalogos(iddep);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return resConsultaDocCatalogos;
	}
	
	

}
