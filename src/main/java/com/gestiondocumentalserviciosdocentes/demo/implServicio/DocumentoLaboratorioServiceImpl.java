package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseRepository;
import com.gestiondocumentalserviciosdocentes.demo.genericos.GenericServiceImplm;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IDocumentoLaboratorio;
import com.gestiondocumentalserviciosdocentes.demo.modelo.DocumentoLaboratorio;

@Service
public class DocumentoLaboratorioServiceImpl extends GenericServiceImplm<DocumentoLaboratorio, Integer> {

	 @Autowired
	private  IDocumentoLaboratorio datosDocumentoLaboratorio;
	@Override
	public BaseRepository<DocumentoLaboratorio, Integer> getBaseRepository() {
		// TODO Auto-generated method stub
		return datosDocumentoLaboratorio;
	}

	
}
