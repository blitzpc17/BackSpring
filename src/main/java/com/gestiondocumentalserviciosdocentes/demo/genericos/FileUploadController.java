package com.gestiondocumentalserviciosdocentes.demo.genericos;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.gestiondocumentalserviciosdocentes.demo.modelo.FileResponse;

@RestController
@RequestMapping("api/v1/file")
@CrossOrigin("*")
public class FileUploadController {

	@PostMapping(value = "/upload")
	public FileResponse subirArchivo(@RequestParam("file") MultipartFile file, @RequestParam("ruta") String ruta, @RequestParam("nombrearch") String nombrearch) {
		ruta = ruta.replace("\\", File.separator);	
		
		FileResponse response;
		
		if(file == null || file.isEmpty()) {
			response = new FileResponse(new Date().toString(), 501, "No se ha Seleccionado un Archivo");
			return response;
		}
		
		StringBuilder builder = new StringBuilder();
		builder.append(File.separator);
		builder.append("home");
		builder.append(File.separator);
		builder.append("depgv-server");
		builder.append(File.separator);
		builder.append("Escritorio");
		builder.append(File.separator);
		builder.append("Plataforma_Gestion_Docentes");
		builder.append(File.separator);
		builder.append("plataforma-de-gestion-documental-de-servicios-docentes");
		builder.append(File.separator);
		builder.append("public");
		builder.append(File.separator);
		builder.append("Documentos");
		builder.append(File.separator);
		builder.append(ruta);
		
		File directorio = new File(builder.toString());
		
        if (!directorio.exists()) {
            if (directorio.mkdirs()) {
                System.out.println("Directorio creado");
            } else {
            	response = new FileResponse(new Date().toString(), 501, "Error al Crear Directorio");
    			return response;
            }
        }
		
		builder.append(File.separator);
		builder.append(nombrearch);
		
		byte[] fileBytes;
		
		try {
			
			fileBytes = file.getBytes();
			Path path = Paths.get(builder.toString());
			Files.write(path, fileBytes);
			
		} catch (IOException e) {
			response = new FileResponse(new Date().toString(), 501, "Error al Obtener los Bytes del Archivo");
			return response;
		}
		
		response = new FileResponse(new Date().toString(), 200, File.separator + "Documentos" + File.separator + ruta + File.separator + nombrearch);
		
		return response;
	}
	
	@GetMapping(value = "/delete")
	public FileResponse eliminarArchivo(@RequestParam("nombrearch") String nombrearch) {
		
		FileResponse response;
		
		if(nombrearch.trim().equals("") || nombrearch == null) {
			response = new FileResponse(new Date().toString(), 501, "El nombre del Archivo está vacío");
			return response;
		}
		
		StringBuilder builder = new StringBuilder();
		builder.append(File.separator);
		builder.append("home");
		builder.append(File.separator);
		builder.append("depgv-server");
		builder.append(File.separator);
		builder.append("Escritorio");
		builder.append(File.separator);
		builder.append("Plataforma_Gestion_Docentes");
		builder.append(File.separator);
		builder.append("plataforma-de-gestion-documental-de-servicios-docentes");
		builder.append(File.separator);
		builder.append("public");
		builder.append(nombrearch);
		
		File directorio = new File(builder.toString());
		
        if (directorio.exists()) {
            if (directorio.delete()) {
            	response = new FileResponse(new Date().toString(), 200, "Archivo eliminado correctamente");
    			return response;
            } else {
            	response = new FileResponse(new Date().toString(), 501, "Error al eliminar Archivo");
    			return response;
            }
        }else {
        	response = new FileResponse(new Date().toString(), 501, "El Archivo a eliminar no existe");
			return response;
        }
	}
}

/*
builder.append(File.separator);
		builder.append("home");
		builder.append(File.separator);
		builder.append("depgv-server");
		builder.append(File.separator);
		builder.append("Escritorio");
		builder.append(File.separator);
		builder.append("Plataforma_Gestion_Docentes");
		builder.append(File.separator);
		builder.append("plataforma-de-gestion-documental-de-servicios-docentes");
		
		builder.append("C:");
		builder.append(File.separator);
		builder.append("xampp");
		builder.append(File.separator);
		builder.append("htdocs");
		builder.append(File.separator);
		builder.append("plataforma-servicios-departamentales");
*/