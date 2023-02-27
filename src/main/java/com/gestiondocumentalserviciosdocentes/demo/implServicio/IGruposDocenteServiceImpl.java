package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.IGruposDocenteService;
import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseRepository;
import com.gestiondocumentalserviciosdocentes.demo.genericos.GenericServiceImplm;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IGruposDocentes;
import com.gestiondocumentalserviciosdocentes.demo.modelo.GruposDocente;

@Service
public class IGruposDocenteServiceImpl extends GenericServiceImplm<GruposDocente, Integer> implements IGruposDocenteService{

	@Autowired
	private IGruposDocentes igrupos;
	
	@Override
	public BaseRepository<GruposDocente, Integer> getBaseRepository() {
		// TODO Auto-generated method stub
		return igrupos;
	}

	@Override
	public GruposDocente comprobarGrupos(int id_mat, String grupo, int iddocper) {
		// TODO Auto-generated method stub
		return igrupos.comprobarGrupos(id_mat, grupo, iddocper);
	}

}
