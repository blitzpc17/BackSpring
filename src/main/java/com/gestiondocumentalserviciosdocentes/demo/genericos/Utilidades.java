package com.gestiondocumentalserviciosdocentes.demo.genericos;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;

import org.springframework.web.multipart.MultipartFile;
import com.gestiondocumentalserviciosdocentes.demo.modelo.FileResponse;

public class Utilidades {
	
	private static FileResponse response;
	private static byte[] fileBytes;
	
	
	public static FileResponse SubirArchivos(MultipartFile file, String nombreArchivo) {
		StringBuilder builder = new StringBuilder();
		String ruta="C:\\Users\\USER\\Downloads\\Plataforma_Gestion_Docentes\\Plataforma_Gestion_Docentes\\FrontReact\\public\\Documentos\\Prueba\\";
		
		File directorio = new File(ruta);
		
		if(!directorio.exists()) {
			if(directorio.mkdir()) {
				System.out.print("Directorio creado");
			}else {
				response = new FileResponse(new Date().toString(), 501, "No se pudo crear el directorio.");
				return response;
			}
		}
		
		try {
			fileBytes = file.getBytes();
			Path path = Paths.get(ruta+"\\"+nombreArchivo);
			System.out.print(path);
			Files.write(path, fileBytes);
			response = new FileResponse(new Date().toString(), 200, "Archivo creado correctamente");
		}catch(IOException e) {
			System.out.print(e.toString());
			response = new FileResponse(new Date().toString(), 501, "Error al copiar el archivo");
		}
			
		return response;
			
		
	}

}
