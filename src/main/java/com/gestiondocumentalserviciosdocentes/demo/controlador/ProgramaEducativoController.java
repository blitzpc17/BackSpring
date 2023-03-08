package com.gestiondocumentalserviciosdocentes.demo.controlador;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseControllerImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.FileResponse;
import com.gestiondocumentalserviciosdocentes.demo.genericos.Utilidades;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.InterfaceProgramaEducativoServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.ProgramaEducativo;

@RestController
@RequestMapping("api/v1/programaeducativo")
@CrossOrigin("*")
public class ProgramaEducativoController extends BaseControllerImpl<ProgramaEducativo, InterfaceProgramaEducativoServiceImpl> {
	@GetMapping(value = "/documentos/depto/listar/{deptoId}")
	public List<ProgramaEducativo> ListarDocumentosPorDepto(@PathVariable int deptoId){
		return service.ListarDocumentosPorDepto(deptoId);
	}
	@GetMapping(value = "/documentos/buscar/{deptoId}/{nombredoc}", produces=MediaType.APPLICATION_JSON_VALUE)
	ProgramaEducativo BuscarDocumentoNombre(@PathVariable String nombredoc, @PathVariable int deptoId) {
		return service.BuscarDocumentoNombre(nombredoc, deptoId);
	}
	
	@PostMapping(value="/documentos/guardar")
	public FileResponse Guardar(@RequestParam(required=false, name="id") Integer id, @RequestParam(required=false, name="enlace") String enlace, @RequestParam(name="tipo") String tipo, @RequestParam(name="nombre") String nombre, 
			@RequestParam(name="id_Departamento") int departamentoId, @RequestParam(required=false, name="file") MultipartFile file) {
		
		String nombreArchivo ="";
		FileResponse res;
		ProgramaEducativo entidad;
		
		ProgramaEducativo obj = new ProgramaEducativo();
		
		obj.setEnlace(enlace);
		obj.setTipo(tipo);
		obj.setNombre(nombre);
		obj.setFecha(new Date());
		obj.setRuta_archivo(nombre+".pdf");
		obj.setId_Departamento(departamentoId);
		
		if(id != null) {
			obj.setId(id);
		}
		
		entidad = service.save(obj);
		
		if(file!=null && entidad!=null && entidad.getId()>0) {
			String[] nombreFile = file.getOriginalFilename().split("\\.");
			nombreArchivo= nombre+ "." +nombreFile[nombreFile.length-1];
			res =  Utilidades.SubirArchivos(file, nombreArchivo);
			if(res.getStatus()==200) {
				res = new FileResponse(new Date().toString(), 200, "Registro guardado correctamente.");
			}else {
				return res;
			}
			
		}else {
			res = new FileResponse(new Date().toString(), 501, "Ocurrio un problema al tratar de guardar el registro");
		}
		
		return res;
		
	}
	
	

}
