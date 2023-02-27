package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.IConsultaUsuariosService;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IConsultaUsuarios;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IConsultaUsuariosImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.ConsultaUsuarios;

public class InterfaceConsultaUsuariosServiceImpl implements IConsultaUsuariosService {

	@Override
	public List<ConsultaUsuarios> getConsultaUsuarios(int iddep){
		
		IConsultaUsuarios daConsultaUsuarios;
		List<ConsultaUsuarios> resConsultaUsuarios = new ArrayList<ConsultaUsuarios>();
		
		try {
			
			daConsultaUsuarios=new IConsultaUsuariosImpl();
			resConsultaUsuarios= daConsultaUsuarios.getConsultaUsuarios(iddep);
			System.out.println("Consulta Exitosa");
			
		} catch (Exception e) {

			e.printStackTrace();
			
		}
		
		return resConsultaUsuarios;
		
	}
	
}
