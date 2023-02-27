package com.gestiondocumentalserviciosdocentes.demo.controlador;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseControllerImpl;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.ParticipantesServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.Participantes;

@RestController
@RequestMapping(value = "/api/v1/participantes")
@CrossOrigin("*")
public class ParticipantesControlador extends BaseControllerImpl<Participantes,ParticipantesServiceImpl>{

	@GetMapping(value = "/{id_capacitacion}")
	public List<Participantes> buscarParticipantes(@PathVariable int id_capacitacion){
		return service.buscarParticipantes(id_capacitacion);
	}
}
