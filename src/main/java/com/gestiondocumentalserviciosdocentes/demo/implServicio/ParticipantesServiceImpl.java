package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.ParticipantesService;
import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseRepository;
import com.gestiondocumentalserviciosdocentes.demo.genericos.GenericServiceImplm;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IParticipantes;
import com.gestiondocumentalserviciosdocentes.demo.modelo.Participantes;

@Service
public class ParticipantesServiceImpl  extends GenericServiceImplm<Participantes,Integer> implements ParticipantesService{
	
	@Autowired
	private IParticipantes datosParticipantes;

	@Override
	public BaseRepository<Participantes, Integer> getBaseRepository() {
		// TODO Auto-generated method stub
		return datosParticipantes;
	}

	@Override
	public List<Participantes> buscarParticipantes(int id_capacitacion) {
		// TODO Auto-generated method stub
		return datosParticipantes.buscarParticipantes(id_capacitacion);
	}

}
