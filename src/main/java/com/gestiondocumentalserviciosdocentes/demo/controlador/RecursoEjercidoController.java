package com.gestiondocumentalserviciosdocentes.demo.controlador;

import java.util.Date;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.gestiondocumentalserviciosdocentes.demo.modelo.FileResponse;
import com.gestiondocumentalserviciosdocentes.demo.modelo.RecursoAsignado;
import com.gestiondocumentalserviciosdocentes.demo.modelo.RecursoEjercido;
import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseControllerImpl;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.RecursoEjercidoServiceImpl;

@RestController
@RequestMapping("api/v1/re")
@CrossOrigin("*")
public class RecursoEjercidoController extends BaseControllerImpl<RecursoEjercido, RecursoEjercidoServiceImpl>{
	
	@GetMapping(value = "/obtener/{deptoId}/{periodoId}")
	public RecursoEjercido ObtenerRecursoEjercidoPeriodo(@PathVariable int periodoId, @PathVariable int deptoId){
		return service.ObtenerRecursoEjercidoDeptoPeriodo(deptoId, periodoId);
	}
	
	
	@PostMapping(value="/guardar")
	public FileResponse  InsertarRecursoEjercido(@RequestParam(required=true, name="DepartamentoId") int DepartamentoId,
			@RequestParam(required=true, name="PeriodoId") int PeriodoId, 
			@RequestParam(required=true, name="CapDos") double capDos, @RequestParam(required=true, name="CapDosP") double capDosP,
			@RequestParam(required=false, name="Evidencia") MultipartFile Evidencia
			) {
		
		FileResponse res = new FileResponse();
		RecursoEjercido obj = new RecursoEjercido();
		
		obj.setId_departamento(DepartamentoId);
		obj.setId_periodo(PeriodoId);
		obj.setCap_dos(capDos);
		obj.setCap_dos(capDosP);
		obj.setEvidencia("evidencia.pdf");
		
		service.save(obj);
		
		
		
		res.setStatus(200);
		res.setMessage("Registro guardado correctamente.");
		res.setTimestamp(new Date().toString());
	
		return res;
	}
	
	

}
