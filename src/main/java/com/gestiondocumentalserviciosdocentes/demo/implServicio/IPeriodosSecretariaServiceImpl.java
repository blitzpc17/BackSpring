package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.IPeriodosSecretariaService;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IPeriodosSecretaria;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IPeriodosSecretariaImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.DocentePeriodoSecretaria;
import com.gestiondocumentalserviciosdocentes.demo.modelo.EstadisticasJefeDep;
import com.gestiondocumentalserviciosdocentes.demo.modelo.SeleccionActividadesDocente;

@Service
public class IPeriodosSecretariaServiceImpl implements IPeriodosSecretariaService {

	@Override
	public List<DocentePeriodoSecretaria> buscarDocentePeriodoSecretarias(int id_periodo, int id_dep) {
		IPeriodosSecretaria daoConsulta;
		List<DocentePeriodoSecretaria> respuestaConsulta=new ArrayList<DocentePeriodoSecretaria>();
		
		try {
			daoConsulta=new IPeriodosSecretariaImpl();
			respuestaConsulta = daoConsulta.buscarDocentePeriodoSecretarias(id_periodo, id_dep);
			System.out.println("Comsulta Exitosa");
		}catch (Exception e) {
			e.printStackTrace();
		}
		return respuestaConsulta;
	}

	@Override
	public List<SeleccionActividadesDocente> buscarselecionactividades(int id_docper) {
		IPeriodosSecretaria daoConsulta;
		List<SeleccionActividadesDocente> respuestaConsulta=new ArrayList<SeleccionActividadesDocente>();
		
		try {
			daoConsulta=new IPeriodosSecretariaImpl();
			respuestaConsulta = daoConsulta.buscarselecionactividades(id_docper);
			System.out.println("Comsulta Exitosa");
		}catch (Exception e) {
			e.printStackTrace();
		}
		return respuestaConsulta;
	}

	@Override
	public boolean subeLiberacion(int id_dep, int id_docper) {
		IPeriodosSecretaria daoConsulta;
		boolean respuestaConsulta = false;
		
		try {
			daoConsulta=new IPeriodosSecretariaImpl();
			respuestaConsulta = daoConsulta.subeLiberacion(id_dep, id_docper);
			System.out.println("Comsulta Exitosa");
		}catch (Exception e) {
			e.printStackTrace();
		}
		return respuestaConsulta;
	}

	@Override
	public List<EstadisticasJefeDep> estadisticoJefeDep(int id_dep, int id_per) {
		IPeriodosSecretaria daoConsulta;
		List<EstadisticasJefeDep> respuestaConsulta=new ArrayList<EstadisticasJefeDep>();
		
		try {
			daoConsulta=new IPeriodosSecretariaImpl();
			respuestaConsulta = daoConsulta.estadisticoJefeDep(id_dep, id_per);
			System.out.println("Comsulta Exitosa");
		}catch (Exception e) {
			e.printStackTrace();
		}
		return respuestaConsulta;
	}

}
