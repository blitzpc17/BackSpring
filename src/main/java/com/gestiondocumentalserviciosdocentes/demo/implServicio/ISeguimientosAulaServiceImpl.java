package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.ISeguimientosAulaService;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IActividadesDocencia;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IActividadesDocenciaImpl;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IConsultaDocentes;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IConsultaDocentesImpl;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.ISeguimientosAula;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.ISeguimientosAulaImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.ActividadesDocencia;
import com.gestiondocumentalserviciosdocentes.demo.modelo.ConsultasDocentes;
import com.gestiondocumentalserviciosdocentes.demo.modelo.SeguimientosAula;

public class ISeguimientosAulaServiceImpl implements ISeguimientosAulaService{

	@Override
	public List<SeguimientosAula> getSeguimientosAula(int filtro,int filtro2) {
		ISeguimientosAula daoConsulta;
		List<SeguimientosAula> respuestaConsulta=new ArrayList<SeguimientosAula>();
		
		try {
			daoConsulta=new ISeguimientosAulaImpl();
			respuestaConsulta=daoConsulta.getSeguimientosAula(filtro, filtro2);
			System.out.println("Consulta Exitosa");
		}catch (Exception e) {
			e.printStackTrace();
		}
		return respuestaConsulta;
	}
	
}
