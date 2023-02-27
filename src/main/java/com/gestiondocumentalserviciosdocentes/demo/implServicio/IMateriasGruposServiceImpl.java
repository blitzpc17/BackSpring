package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.IMateriasGruposService;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IMateriasGrupos;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IMateriasGruposImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.DocentesPeriodoMenu;
import com.gestiondocumentalserviciosdocentes.demo.modelo.DocumentosCapacitacionesDocentes;
import com.gestiondocumentalserviciosdocentes.demo.modelo.DocumentosGruposDocente;
import com.gestiondocumentalserviciosdocentes.demo.modelo.MateriasGrupos;
import com.gestiondocumentalserviciosdocentes.demo.modelo.Notificaciones;
import com.gestiondocumentalserviciosdocentes.demo.modelo.ParticipantesDocentes;
import com.gestiondocumentalserviciosdocentes.demo.modelo.SeleccionActividadesDocente;

public class IMateriasGruposServiceImpl implements IMateriasGruposService {

	@Override
	public List<MateriasGrupos> buscarmateriasgrupos(int id_usuarios) {
		IMateriasGrupos daoConsulta;
		List<MateriasGrupos> respuestaConsulta=new ArrayList<MateriasGrupos>();
		
		try {
			daoConsulta=new IMateriasGruposImpl();
			respuestaConsulta = daoConsulta.buscarmateriasgrupos(id_usuarios);
			System.out.println("Comsulta Exitosa");
		}catch (Exception e) {
			e.printStackTrace();
		}
		return respuestaConsulta;
	}

	@Override
	public List<DocumentosGruposDocente> buscarDocumentosGruposDocentes(int id_grupo, int id_departamento) {
		IMateriasGrupos daoConsulta;
		List<DocumentosGruposDocente> respuestaConsulta=new ArrayList<DocumentosGruposDocente>();
		
		try {
			daoConsulta=new IMateriasGruposImpl();
			respuestaConsulta = daoConsulta.buscarDocumentosGruposDocentes(id_grupo, id_departamento);
			System.out.println("Comsulta Exitosa");
		}catch (Exception e) {
			e.printStackTrace();
		}
		return respuestaConsulta;
	}

	@Override
	public List<SeleccionActividadesDocente> buscarselecionactividades(int id_usuarios, int id_docper) {
		IMateriasGrupos daoConsulta;
		List<SeleccionActividadesDocente> respuestaConsulta=new ArrayList<SeleccionActividadesDocente>();
		
		try {
			daoConsulta=new IMateriasGruposImpl();
			respuestaConsulta = daoConsulta.buscarselecionactividades(id_usuarios, id_docper);
			System.out.println("Comsulta Exitosa");
		}catch (Exception e) {
			e.printStackTrace();
		}
		return respuestaConsulta;
	}

	@Override
	public DocentesPeriodoMenu buscardocentesperiodos(int id_usuarios, int id_periodo) {
		IMateriasGrupos daoConsulta;
		DocentesPeriodoMenu respuestaConsulta = new DocentesPeriodoMenu();
		
		try {
			daoConsulta=new IMateriasGruposImpl();
			respuestaConsulta = daoConsulta.buscardocentesperiodos(id_usuarios, id_periodo);
			System.out.println("Comsulta Exitosa");
		}catch (Exception e) {
			e.printStackTrace();
		}
		return respuestaConsulta;
	}

	@Override
	public List<MateriasGrupos> buscargrupossecretaria(int id_docper) {
		IMateriasGrupos daoConsulta;
		List<MateriasGrupos> respuestaConsulta=new ArrayList<MateriasGrupos>();
		
		try {
			daoConsulta=new IMateriasGruposImpl();
			respuestaConsulta = daoConsulta.buscargrupossecretaria(id_docper);
			System.out.println("Comsulta Exitosa");
		}catch (Exception e) {
			e.printStackTrace();
		}
		return respuestaConsulta;
	}

	@Override
	public List<ParticipantesDocentes> participaciones(int id_usuarios, int id_periodo) {
		IMateriasGrupos daoConsulta;
		List<ParticipantesDocentes> respuestaConsulta=new ArrayList<ParticipantesDocentes>();
		
		try {
			daoConsulta=new IMateriasGruposImpl();
			respuestaConsulta = daoConsulta.participaciones(id_usuarios, id_periodo);
			System.out.println("Comsulta Exitosa");
		}catch (Exception e) {
			e.printStackTrace();
		}
		return respuestaConsulta;
	}

	@Override
	public List<Notificaciones> notificaciones(int id_usuarios) {
		IMateriasGrupos daoConsulta;
		List<Notificaciones> respuestaConsulta=new ArrayList<Notificaciones>();
		
		try {
			daoConsulta=new IMateriasGruposImpl();
			respuestaConsulta = daoConsulta.notificaciones(id_usuarios);
			System.out.println("Comsulta Exitosa");
		}catch (Exception e) {
			e.printStackTrace();
		}
		return respuestaConsulta;
	}

	@Override
	public List<DocumentosCapacitacionesDocentes> documentos(int id_capacitacion) {
		IMateriasGrupos daoConsulta;
		List<DocumentosCapacitacionesDocentes> respuestaConsulta=new ArrayList<DocumentosCapacitacionesDocentes>();
		
		try {
			daoConsulta=new IMateriasGruposImpl();
			respuestaConsulta = daoConsulta.documentos(id_capacitacion);
			System.out.println("Comsulta Exitosa");
		}catch (Exception e) {
			e.printStackTrace();
		}
		return respuestaConsulta;
	}

}
