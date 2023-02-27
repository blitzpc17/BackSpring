package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.IDocenteCubiculoService;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IDocenteCubiculo;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IDocenteCubiculoImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.DocenteCubiculo;

public class IDocenteCubiculoServiceImpl implements IDocenteCubiculoService {

	@Override
	public List<DocenteCubiculo> getDocenteCubiculos(int filtro,int filtro2) {
		IDocenteCubiculo daoConsulta;
		List<DocenteCubiculo> respuestaConsulta=new ArrayList<DocenteCubiculo>();
		
		try {
			daoConsulta=new IDocenteCubiculoImpl();
			respuestaConsulta=daoConsulta.getDocenteCubiculos(filtro, filtro2);
			System.out.println("Consulta Exitosa");
		}catch (Exception e) {
			e.printStackTrace();
		}
		return respuestaConsulta;
	}

}
