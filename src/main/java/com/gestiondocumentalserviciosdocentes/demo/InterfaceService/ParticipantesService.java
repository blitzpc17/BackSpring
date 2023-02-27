package com.gestiondocumentalserviciosdocentes.demo.InterfaceService;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.genericos.GenericService;
import com.gestiondocumentalserviciosdocentes.demo.modelo.Participantes;

public interface ParticipantesService  extends GenericService<Participantes,Integer>{

	List<Participantes> buscarParticipantes(int id_capacitacion);
}
