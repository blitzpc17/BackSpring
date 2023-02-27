package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.IConsultaDocSerService;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IConsultaDocSer;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IConsultaDocSerImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.ConsultaDocSer;

public class InterfaceConsultaDocSerServiceImpl implements IConsultaDocSerService{

	
	@Override
	public List<ConsultaDocSer> getConsultaDocSers(int idser) {
		IConsultaDocSer daoConsultaDocSer;
		List<ConsultaDocSer> resConsultaDocSers = new ArrayList<ConsultaDocSer>();
		
		try {
			daoConsultaDocSer=new IConsultaDocSerImpl();
			resConsultaDocSers=daoConsultaDocSer.getConsultaDocSers(idser);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resConsultaDocSers;
	}




}
