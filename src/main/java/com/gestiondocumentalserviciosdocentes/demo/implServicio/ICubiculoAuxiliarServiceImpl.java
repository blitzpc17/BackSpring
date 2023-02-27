package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.ICubiculoAuxiliarService;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IConsultaGrupo;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IConsultaGrupoImpl;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.ICubiculoAuxiliar;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.ICubiculoAuxiliarImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.ConsultaGrupo;
import com.gestiondocumentalserviciosdocentes.demo.modelo.CubiculoAuxiliar;

public class ICubiculoAuxiliarServiceImpl implements ICubiculoAuxiliarService{

	@Override
	public List<CubiculoAuxiliar> getCubiculoAuxiliar(int filtro) {
		ICubiculoAuxiliar daoConsulta;
		List<CubiculoAuxiliar> respuestaConsulta=new ArrayList<CubiculoAuxiliar>();
		
		try {
			daoConsulta=new ICubiculoAuxiliarImpl();
			respuestaConsulta=daoConsulta.getCubiculoAuxiliar(filtro);
			System.out.println("Consulta Exitosa");
		}catch (Exception e) {
			e.printStackTrace();
		}
		return respuestaConsulta;
	}

}
