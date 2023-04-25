package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.InterfaceRecursoProgramado;
import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseRepository;
import com.gestiondocumentalserviciosdocentes.demo.genericos.GenericServiceImplm;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IRecursoProgramado;
import com.gestiondocumentalserviciosdocentes.demo.modelo.RecursoProgramado;

@Service
public class RecursoProgramadoServiceImpl extends GenericServiceImplm<RecursoProgramado, Integer> implements InterfaceRecursoProgramado
{
	@Autowired
	private IRecursoProgramado iRecursoProgramado;
	@Override
	public BaseRepository<RecursoProgramado, Integer> getBaseRepository() {
		// TODO Auto-generated method stub
		return iRecursoProgramado;
	}
}






	
