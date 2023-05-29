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
import com.gestiondocumentalserviciosdocentes.demo.genericos.Utilidades;
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
			@RequestParam(required=false, name="CapDosEvidencia") String capDosEvidencia,@RequestParam(required=false, name="CapDosEvidenciaFile") MultipartFile capDosEvidenciaFile,  
			@RequestParam(required=true, name="CapTres") double capTres, @RequestParam(required=true, name="CapTresP") double capTresP,
			@RequestParam(required=false, name="CapTresEvidencia") String capTresEvidencia,@RequestParam(required=false, name="CapTresEvidenciaFile") MultipartFile capTresEvidenciaFile,  
			@RequestParam(required=true, name="CapCuatro") double capCuatro, @RequestParam(required=true, name="CapCuatroP") double capCuatroP,
			@RequestParam(required=false, name="CapCuatroEvidencia") String capCuatroEvidencia,@RequestParam(required=false, name="CapCuatroEvidenciaFile") MultipartFile capCuatroEvidenciaFile,
			@RequestParam(required=true, name="CapCinco") double capCinco, @RequestParam(required=true, name="CapCincoP") double capCincoP,
			@RequestParam(required=false, name="CapCincoEvidencia") String capCincoEvidencia,@RequestParam(required=false, name="CapCincoEvidenciaFile") MultipartFile capCincoEvidenciaFile,	
			@RequestParam(required=true, name="Otros") double Otros, @RequestParam(required=false, name="OtrosP") double OtrosP,
			@RequestParam(required=true, name="OtrosEvidencia") String OtrosEvidencia, @RequestParam(required=false, name="OtrosEvidenciaFile") MultipartFile OtrosEvidenciaFile,
			@RequestParam(required=true, name="Total") double Total, @RequestParam(required=false, name="TotalP") double TotalP,
			@RequestParam(required=false, name="CapTotalEvidencia") String TotalEvidencia, @RequestParam(required=false, name="CapTotalEvidenciaFile") MultipartFile TotalEvidenciaFile,
			@RequestParam(required=true, name="NoAsignado") double NoAsignado, @RequestParam(required=true, name="NoAsignadoP") double NoAsignadoP,
			@RequestParam(required=true, name="NoAsignadoEvidencia") String NoAsignadoEvidencia, @RequestParam(required=false, name="NoAsignadoEvidencia") MultipartFile NoAsignadoEvidenciaFile,
			@RequestParam(required=false, name="Id") Integer Id
			) {
		
		FileResponse res = new FileResponse();
		RecursoEjercido obj = new RecursoEjercido();
		
		obj.setId_departamento(DepartamentoId);
		obj.setId_periodo(PeriodoId);
		obj.setCap_dos(capDos);
		obj.setCap_dos_p(capDosP);
		if(capDosEvidencia!=null && !capDosEvidencia.equals("null")) {
			System.out.println("entro dos");
			obj.setCap_dos_ev(capDosEvidencia);
		}		
		obj.setCap_tres(capTres);
		obj.setCap_tres_p(capTresP);
		if(capTresEvidencia!=null && !capTresEvidencia.equals("null")) {
			System.out.println("entro tres");
			obj.setCap_tres_ev(capTresEvidencia);
		}	
		obj.setCap_cuatro(capCuatro);
		obj.setCap_cuatro_p(capCuatroP);
		if(capCuatroEvidencia!=null && !capCuatroEvidencia.equals("null")) {
			System.out.println("entro cuatro");
			obj.setCap_cuatro_ev(capCuatroEvidencia);
		}	
		obj.setCap_cinco(capCinco);
		obj.setCap_cinco_p(capCincoP);
		if(capCincoEvidencia!=null && !capCincoEvidencia.equals("null")) {
			System.out.println("entro cinco");
			obj.setCap_cinco_ev(capCincoEvidencia);
		}	
		obj.setOtros(Otros);
		obj.setOtros_p(OtrosP);
		if(OtrosEvidencia!=null && !OtrosEvidencia.equals("null")) {
			System.out.println("entro otros");
			obj.setOtros_ev(OtrosEvidencia);
		}	
		obj.setTotal(TotalP);
		obj.setTotal_p(TotalP);
		if(TotalEvidencia !=null && !TotalEvidencia.equals("null")) {
			System.out.println("entro total");
			obj.setTotal_ev(TotalEvidencia);
		}	
		obj.setRecurso_no_asignado(NoAsignado);
		obj.setRecurso_no_asignado_p(NoAsignadoP);
		if(NoAsignadoEvidencia!=null && !NoAsignadoEvidencia.equals("null")) {
			System.out.println("entro no asignado");
			obj.setRecurso_no_asignado_ev(NoAsignadoEvidencia);
		}	
		
		if(Id != null) {
			obj.setId(Id);		
		}
		
		service.save(obj);
		
		/*Save files*/
		String msgErrorArchivos = "";
		if( capDosEvidenciaFile !=null ) {
			String[] nombreArchivo = capDosEvidenciaFile.getOriginalFilename().split("\\.");
			String nombreFile = capDosEvidencia;
			res =  Utilidades.SubirArchivos(capDosEvidenciaFile, nombreFile);
			if(res.getStatus()!=200) {
				msgErrorArchivos += "No se pudo guardar el archivo de cap200.";
			}
		}
		if( capTresEvidenciaFile !=null ) {
			String[] nombreArchivo = capTresEvidenciaFile.getOriginalFilename().split("\\.");
			String nombreFile = capTresEvidencia;
			res =  Utilidades.SubirArchivos(capTresEvidenciaFile, nombreFile);
			if(res.getStatus()!=200) {
				msgErrorArchivos += "No se pudo guardar el archivo de cap200.";
			}
		}
		if( capCuatroEvidenciaFile !=null ) {
			String[] nombreArchivo = capCuatroEvidenciaFile.getOriginalFilename().split("\\.");
			String nombreFile = capCuatroEvidencia;
			res =  Utilidades.SubirArchivos(capCuatroEvidenciaFile, nombreFile);
			if(res.getStatus()!=200) {
				msgErrorArchivos += "No se pudo guardar el archivo de cap200.";
			}
		}
		if( capCincoEvidenciaFile !=null ) {
			String[] nombreArchivo = capCincoEvidenciaFile.getOriginalFilename().split("\\.");
			String nombreFile = capCincoEvidencia;
			res =  Utilidades.SubirArchivos(capCincoEvidenciaFile, nombreFile);
			if(res.getStatus()!=200) {
				msgErrorArchivos += "No se pudo guardar el archivo de cap200.";
			}
		}
		if( OtrosEvidenciaFile !=null ) {
			String[] nombreArchivo = OtrosEvidenciaFile.getOriginalFilename().split("\\.");
			String nombreFile = OtrosEvidencia;
			res =  Utilidades.SubirArchivos(OtrosEvidenciaFile, nombreFile);
			if(res.getStatus()!=200) {
				msgErrorArchivos += "No se pudo guardar el archivo de cap200.";
			}
		}
		if( TotalEvidenciaFile !=null ) {
			String[] nombreArchivo = TotalEvidenciaFile.getOriginalFilename().split("\\.");
			String nombreFile = TotalEvidencia;
			res =  Utilidades.SubirArchivos(TotalEvidenciaFile, nombreFile);
			if(res.getStatus()!=200) {
				msgErrorArchivos += "No se pudo guardar el archivo de cap200.";
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
