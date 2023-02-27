package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.IAuxiliarUsuariosService;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IAuxiliarUsuarios;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IAuxiliarUsuariosImpl;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IConsultaDocentes;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IConsultaDocentesImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.AuxiliarUsuarios;
import com.gestiondocumentalserviciosdocentes.demo.modelo.ConsultasDocentes;

public class IAuxiliarUsuariosServiceImpl implements IAuxiliarUsuariosService{

	@Override
	public List<AuxiliarUsuarios> getAuxiliarUsuarios(int filtro) {
		IAuxiliarUsuarios daoConsulta;
		List<AuxiliarUsuarios> respuestaConsulta=new ArrayList<AuxiliarUsuarios>();
		
		try {
			daoConsulta=new IAuxiliarUsuariosImpl();
			respuestaConsulta=daoConsulta.getAuxiliarUsuarios(filtro);
			System.out.println("Consulta Exitosa");
		}catch (Exception e) {
			e.printStackTrace();
		}
		return respuestaConsulta;
	}

}
