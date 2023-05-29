package com.gestiondocumentalserviciosdocentes.demo.controlador;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

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
			@RequestParam(required=true, name="PeriodoId") int PeriodoId, 
			@RequestParam(required=true, name="Poa") double Poa,
			@RequestParam(required=false, name="PoaEvidencia") String PoaEvidencia, @RequestParam(required=false, name="PoaEvidenciaFile") MultipartFile PoaEvidenciaFile, 
			@RequestParam(required=true, name="Pta") double Pta,
			@RequestParam(required=false, name="PtaEvidencia") String PtaEvidencia, @RequestParam(required=false, name="PtaEvidenciaFile") MultipartFile PtaEvidenciaFile,
			@RequestParam(required=true, name="PagoInscripcion") double PagoInscripcion,
			@RequestParam(required=true, name="MontoCaptado") double MontoCaptado,
			@RequestParam(required=true, name="MontoTotal") double MontoTotal,
			@RequestParam(required=true, name="Matricula") double Matricula, @RequestParam(required=false, name="MatriculaEvidenciaFile") MultipartFile MatriculaEvidenciaFile,
			@RequestParam(required=false, name="MatriculaEvidencia") String MatriculaEvidencia,
			@RequestParam(required=false, name="Id") Integer Id
			) {
		
		FileResponse res;
		RecursoAsignado obj = new RecursoAsignado();
		
		obj.setId_Departamento(DepartamentoId);
		obj.setId_Periodo(PeriodoId);
		obj.setPoa(Poa);
		if(PoaEvidencia!=null && !PoaEvidencia.equals("null")) {
			System.out.println("entro poa");
			obj.setPoaEvidencia(PoaEvidencia);
		}		
		obj.setPta(Pta);
		if(PtaEvidencia!=null && !PtaEvidencia.equals("null")) {
			System.out.println("entro pta");
			obj.setPtaEvidencia(PtaEvidencia);
		}		
		obj.setPagoInscripcion(PagoInscripcion);
		obj.setMontoCaptado(MontoCaptado);
		
		if(DepartamentoId == 3 || DepartamentoId == 12)//si es electronica o biomedica
		{
			int depa = DepartamentoId==3?12:3;
			RecursoAsignado perAux = service.ObtenerRecursoAsignadoDeptoPeriodo(depa, PeriodoId);
			obj.setMontoCaptadoTotal(MontoCaptado+perAux.getMontoCaptado());
		}else {
			obj.setMontoCaptadoTotal(MontoCaptado);
		}
		
		
		obj.setMatricula(Matricula);
		if(MatriculaEvidencia!=null && !MatriculaEvidencia.equals("null")) {
			System.out.println("entro matricula");
			obj.setMatriculaEvidencia(MatriculaEvidencia);
		}
		
		
		if(Id != null) {
			obj.setId(Id);		
		}
		
		service.save(obj);
		
		/*Save files*/
		String msgErrorArchivos = "";
		if(PoaEvidenciaFile!=null ) {
			String[] nombreArchivo = PoaEvidenciaFile.getOriginalFilename().split("\\.");
			String nombreFile = PoaEvidencia;
			res =  Utilidades.SubirArchivos(PoaEvidenciaFile, nombreFile);
			if(res.getStatus()!=200) {
				msgErrorArchivos += "No se pudo guardar el archivo de POA.";
			}
		}
		if(PtaEvidenciaFile!=null) {
			String[] nombreArchivo = PtaEvidenciaFile.getOriginalFilename().split("\\.");
			String nombreFile = PtaEvidencia+"."+nombreArchivo[nombreArchivo.length-1];
			res =  Utilidades.SubirArchivos(PtaEvidenciaFile, nombreFile);
			if(res.getStatus()!=200) {
				msgErrorArchivos += "No se pudo guardar el archivo de PTA.";
			}
		}
		if(MatriculaEvidenciaFile!=null) {
			String[] nombreArchivo = MatriculaEvidenciaFile.getOriginalFilename().split("\\.");
			String nombreFile = MatriculaEvidencia+"."+nombreArchivo[nombreArchivo.length-1];
			res =  Utilidades.SubirArchivos(MatriculaEvidenciaFile, nombreFile);
			if(res.getStatus()!=200) {
				msgErrorArchivos += "No se pudo guardar el archivo de Matricula.";
			}
		}
		
		
		
		if(msgErrorArchivos.trim().isEmpty()) {
			res = new FileResponse(new Date().toString(), 200, "Registro guardado correctamente.");
		}else {
			res = new FileResponse(new Date().toString(), 501, "No se pudieron subir los siguientes archivos: "+msgErrorArchivos);
		}
	
		return res;
	}
	
	
	

}
