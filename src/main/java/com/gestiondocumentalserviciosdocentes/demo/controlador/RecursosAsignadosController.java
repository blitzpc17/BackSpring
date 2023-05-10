package com.gestiondocumentalserviciosdocentes.demo.controlador;

import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.InterfaceRecursoAsignadoService;
import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseControllerImpl;
import com.gestiondocumentalserviciosdocentes.demo.genericos.Utilidades;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.RecursoAsignadoServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.FileResponse;
import com.gestiondocumentalserviciosdocentes.demo.modelo.ProgramaEducativo;
import com.gestiondocumentalserviciosdocentes.demo.modelo.RecursoAsignado;

@RestController
@RequestMapping("api/v1/ra")
@CrossOrigin("*")
public class RecursosAsignadosController  extends BaseControllerImpl<RecursoAsignado, RecursoAsignadoServiceImpl>{
	
	@GetMapping(value = "/obtener/{deptoId}/{periodoId}")
	public RecursoAsignado ObtenerRecursoAsignadoPeriodo(@PathVariable int periodoId, @PathVariable int deptoId){
		return service.ObtenerRecursoAsignadoDeptoPeriodo(deptoId, periodoId);
	}
	
	
	@PostMapping(value="/guardar")
	public FileResponse  InsertarRecursoAsignado(@RequestParam(required=true, name="DepartamentoId") int DepartamentoId,
			@RequestParam(required=true, name="PeriodoId") int PeriodoId, @RequestParam(required=true, name="Poa") double Poa,
			@RequestParam(required=false, name="PoaEvidencia") MultipartFile PoaEvidencia, @RequestParam(required=true, name="Pta") double Pta,
			@RequestParam(required=false, name="PtaEvidencia") MultipartFile PtaEvidencia, @RequestParam(required=true, name="PagoInscripcion") double PagoInscripcion,
			@RequestParam(required=true, name="MontoCaptado") double MontoCaptado, @RequestParam(required=true, name="MontoTotal") double MontoTotal,
			@RequestParam(required=true, name="Matricula") double Matricula, @RequestParam(required=false, name="MatriculaEvidencia") MultipartFile MatriculaEvidencia
			) {
		
		FileResponse res = new FileResponse();
		RecursoAsignado obj = new RecursoAsignado();
		
		obj.setId_Departamento(DepartamentoId);
		obj.setId_Periodo(PeriodoId);
		obj.setPoa(Poa);
		obj.setPoaEvidencia("poaasignado.pdf");
		obj.setPta(Pta);
		obj.setPtaEvidencia("ptaasignado.pdf");
		obj.setPagoInscripcion(PagoInscripcion);
		obj.setMontoCaptado(MontoCaptado);
		obj.setMontoCaptadoTotal(MontoTotal);
		obj.setMatricula(Matricula);
		obj.setMatriculaEvidencia("matricula.pdf");
		
		service.save(obj);
		
		
		
		res.setStatus(200);
		res.setMessage("Registro guardado correctamente.");
		res.setTimestamp(new Date().toString());
	
		return res;
	}
	
	
	

}
