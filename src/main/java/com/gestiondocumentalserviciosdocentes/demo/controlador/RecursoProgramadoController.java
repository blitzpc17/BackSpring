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

import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseControllerImpl;
import com.gestiondocumentalserviciosdocentes.demo.genericos.Utilidades;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.RecursoProgramadoServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.FileResponse;
import com.gestiondocumentalserviciosdocentes.demo.modelo.RecursoAsignado;
import com.gestiondocumentalserviciosdocentes.demo.modelo.RecursoProgramado;


@RestController
@RequestMapping("api/v1/rp")
@CrossOrigin("*")
public class RecursoProgramadoController extends BaseControllerImpl<RecursoProgramado, RecursoProgramadoServiceImpl>{
	
	@GetMapping(value = "/obtener/{deptoId}/{periodoId}")
	public RecursoProgramado ObtenerRecursoAsignadoPeriodo(@PathVariable int periodoId, @PathVariable int deptoId){
		return service.ObtenerRecursoProgramadoDeptoPeriodo(deptoId, periodoId);
	}	
	
	@PostMapping(value="/guardar")
	public FileResponse  InsertarRecursoProgramado(@RequestParam(required=true, name="DepartamentoId") int DepartamentoId,
			@RequestParam(required=true, name="PeriodoId") int PeriodoId, @RequestParam(required=false, name="Id") Integer Id, 
			@RequestParam(required=true, name="CapDos") double capDos, @RequestParam(required=true, name="CapDosP") double capDosP,
			@RequestParam(required=false, name="CapDosEvidencia") String capDosEvidencia, @RequestParam(required=false, name="CapDosEvidenciaFile") MultipartFile capDosEvidenciaFile,  
			@RequestParam(required=true, name="CapTres") double capTres, @RequestParam(required=true, name="CapTresP") double capTresP,
			@RequestParam(required=false, name="CapTresEvidencia") String capTresEvidencia,@RequestParam(required=false, name="CapTresEvidenciaFile") MultipartFile capTresEvidenciaFile,  
			@RequestParam(required=true, name="CapCuatro") double capCuatro, @RequestParam(required=true, name="CapCuatroP") double capCuatroP,
			@RequestParam(required=false, name="CapCuatroEvidencia") String capCuatroEvidencia,@RequestParam(required=false, name="CapCuatroEvidenciaFile") MultipartFile capCuatroEvidenciaFile,
			@RequestParam(required=true, name="CapCinco") double capCinco, @RequestParam(required=true, name="CapCincoP") double capCincoP,
			@RequestParam(required=false, name="CapCincoEvidencia") String capCincoEvidencia,@RequestParam(required=false, name="CapCincoEvidenciaFile") MultipartFile capCincoEvidenciaFile,	
			@RequestParam(required=true, name="Otros") double Otros, @RequestParam(required=false, name="OtrosP") double OtrosP,
			@RequestParam(required=true, name="OtrosEvidencia") String OtrosEvidencia, @RequestParam(required=false, name="OtrosEvidenciaFile") MultipartFile OtrosEvidenciaFile,
			@RequestParam(required=true, name="Total") double Total, @RequestParam(required=false, name="TotalP") double TotalP,
			@RequestParam(required=false, name="TotalEvidencia") String TotalEvidencia, @RequestParam(required=false, name="TotalEvidenciaFile") MultipartFile TotalEvidenciaFile
			
			) {
		
		FileResponse res = new FileResponse();
		RecursoProgramado obj = new RecursoProgramado();
		
		obj.setId_departamento(DepartamentoId);
		obj.setId_periodo(PeriodoId);
		obj.setCap_dos(capDos);
		obj.setCap_dos_p(capDosP);
		if(capDosEvidencia!=null && !capDosEvidencia.equals("null")) {
			obj.setCap_dos_ev(capDosEvidencia);
		}			
		obj.setCap_tres(capTres);
		obj.setCap_tres_p(capTresP);
		if(capTresEvidencia!=null && !capTresEvidencia.equals("null")) {
			obj.setCap_tres_ev(capTresEvidencia);
		}		
		obj.setCap_cuatro(capCuatro);
		obj.setCap_cuatro_p(capCuatroP);
		if(capCuatroEvidencia!=null && !capCuatroEvidencia.equals("null")) {
			obj.setCap_cuatro_ev(capCuatroEvidencia);
		}			
		obj.setCap_cinco(capCinco);
		obj.setCap_cinco_p(capCincoP);
		if(capCincoEvidencia!=null && !capCincoEvidencia.equals("null")) {
			obj.setCap_cinco_ev(capCincoEvidencia);
		}		
		obj.setOtros(Otros);
		obj.setOtros_p(OtrosP);
		if(OtrosEvidencia!=null && !OtrosEvidencia.equals("null")) {
			obj.setOtros_ev(OtrosEvidencia);
		}		
		obj.setTotal(TotalP);
		obj.setTotal_p(TotalP);
		if(TotalEvidencia!=null && !TotalEvidencia.equals("null")) {
			obj.setTotal_ev(TotalEvidencia);
		}	
		
		if(Id != null) {
			obj.setId(Id);		
		}		
		
		service.save(obj);
		
		/*Save files*/
		String msgErrorArchivos = "";
		if(capDosEvidenciaFile!=null ) {
			String[] nombreArchivo = capDosEvidenciaFile.getOriginalFilename().split("\\.");
			String nombreFile = capDosEvidencia;
			res =  Utilidades.SubirArchivos(capDosEvidenciaFile, nombreFile);
			if(res.getStatus()!=200) {
				msgErrorArchivos += "No se pudo guardar el archivo de POA.";
			}
		}
		
		if(capTresEvidenciaFile!=null ) {
			String[] nombreArchivo = capTresEvidenciaFile.getOriginalFilename().split("\\.");
			String nombreFile = capTresEvidencia;
			res =  Utilidades.SubirArchivos(capTresEvidenciaFile, nombreFile);
			if(res.getStatus()!=200) {
				msgErrorArchivos += "No se pudo guardar el archivo de POA.";
			}
		}
		
		if(capCuatroEvidenciaFile!=null ) {
			String[] nombreArchivo = capCuatroEvidenciaFile.getOriginalFilename().split("\\.");
			String nombreFile = capCuatroEvidencia;
			res =  Utilidades.SubirArchivos(capCuatroEvidenciaFile, nombreFile);
			if(res.getStatus()!=200) {
				msgErrorArchivos += "No se pudo guardar el archivo de POA.";
			}
		}
		
		if(capCincoEvidenciaFile!=null ) {
			String[] nombreArchivo = capCincoEvidenciaFile.getOriginalFilename().split("\\.");
			String nombreFile = capCincoEvidencia;
			res =  Utilidades.SubirArchivos(capCincoEvidenciaFile, nombreFile);
			if(res.getStatus()!=200) {
				msgErrorArchivos += "No se pudo guardar el archivo de POA.";
			}
		}
		
		if(OtrosEvidenciaFile!=null ) {
			String[] nombreArchivo = OtrosEvidenciaFile.getOriginalFilename().split("\\.");
			String nombreFile = OtrosEvidencia;
			res =  Utilidades.SubirArchivos(OtrosEvidenciaFile, nombreFile);
			if(res.getStatus()!=200) {
				msgErrorArchivos += "No se pudo guardar el archivo de POA.";
			}
		}
		
		if(TotalEvidenciaFile!=null ) {
			String[] nombreArchivo = TotalEvidenciaFile.getOriginalFilename().split("\\.");
			String nombreFile = TotalEvidencia;
			res =  Utilidades.SubirArchivos(TotalEvidenciaFile, nombreFile);
			if(res.getStatus()!=200) {
				msgErrorArchivos += "No se pudo guardar el archivo de POA.";
			}
		}
		
		
		
		res.setStatus(200);
		res.setMessage("Registro guardado correctamente.");
		res.setTimestamp(new Date().toString());
	
		return res;
	}

}
