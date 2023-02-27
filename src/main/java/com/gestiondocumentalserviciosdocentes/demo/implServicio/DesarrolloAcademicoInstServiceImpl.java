package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.DesarrolloAcademicoInstService;
import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseRepository;
import com.gestiondocumentalserviciosdocentes.demo.genericos.GenericServiceImplm;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IDesarrolloAcademicoInst;
import com.gestiondocumentalserviciosdocentes.demo.modelo.DesarrolloAcademicoInst;

@Service
public class DesarrolloAcademicoInstServiceImpl extends GenericServiceImplm<DesarrolloAcademicoInst,Integer> implements DesarrolloAcademicoInstService{

	@Autowired
	private IDesarrolloAcademicoInst datosDesarrollo;
	
	@Override
	public BaseRepository<DesarrolloAcademicoInst, Integer> getBaseRepository() {
		// TODO Auto-generated method stub
		return datosDesarrollo;
	}

	@Override
	public DesarrolloAcademicoInst depxperiodo(int id_periodo) {
		// TODO Auto-generated method stub
		return datosDesarrollo.depxperiodo(id_periodo);
	}

}
