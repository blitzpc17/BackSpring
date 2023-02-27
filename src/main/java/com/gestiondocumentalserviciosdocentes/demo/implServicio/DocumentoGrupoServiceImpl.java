package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseRepository;
import com.gestiondocumentalserviciosdocentes.demo.genericos.GenericServiceImplm;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IDocumentoGrupo;
import com.gestiondocumentalserviciosdocentes.demo.modelo.DocumentoGrupo;
@Service
public class DocumentoGrupoServiceImpl extends GenericServiceImplm<DocumentoGrupo, Integer>{

	@Autowired
	private IDocumentoGrupo datosDocumentoGrupo;
	@Override
	public BaseRepository<DocumentoGrupo, Integer> getBaseRepository() {
		// TODO Auto-generated method stub
		return datosDocumentoGrupo;
	}

}
