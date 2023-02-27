package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.UsuariosQService;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IUsuariosQ;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IUsuariosQImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.UsuariosQ;

public class UsuariosQServiceImpl implements UsuariosQService{

	@Override
	public List<UsuariosQ> getUsuarios(String Filtro) {
		IUsuariosQ daoUsuarios;
		List<UsuariosQ> respuestaUsuarios = new ArrayList<UsuariosQ>();
		
		try {
			daoUsuarios = new IUsuariosQImpl();
			respuestaUsuarios = daoUsuarios.getUsuarios(Filtro);
			System.out.println("Consulta exitosa");
		}catch(Exception e) {
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return respuestaUsuarios;
	}
	

}
