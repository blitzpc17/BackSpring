package com.gestiondocumentalserviciosdocentes.demo.genericos;

import java.io.IOException;

import javax.mail.MessagingException;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestiondocumentalserviciosdocentes.demo.modelo.RequestFormulario;

@RestController
@RequestMapping("api/v1/formcatalogo")
@CrossOrigin("*")
public class MailController {

	@PostMapping(value = "/formulario")
	public String subirArchivo(@RequestBody RequestFormulario req) {
		try {
			String mensajeString = "Datos del Formulario\n\nEmpresa: "+ req.getEmpresa() +
					"\nCorreo Contacto: "+ req.getCorreo()+
					"\nÁrea de Interés: "+ req.getDep_nombre()+
					"\nCurso de Interés: "+ req.getCurso()+
					"\nMensaje: "+ req.getMensaje();
			
			Mail mail = new Mail();
			mail.enviarEmail("Información Catálogo de Cursos", mensajeString, "l17361106@tehuacan.tecnm.mx");
			mail.enviarEmail("Información Catálogo de Cursos", mensajeString, "vinculacion@tehuacan.tecnm.mx");
			mail.enviarEmail("Información Catálogo de Cursos", mensajeString, "l17361144@tehuacan.tecnm.mx");
			mail.enviarEmail("Información Catálogo de Cursos", mensajeString, "xabi1teoti1df@gmail.com");
			mail.enviarEmail("Información Catálogo de Cursos", mensajeString, "joseanz9cx@gmail.com");
			
			return "Enviado Correctamente";
		} catch (IOException e) {
			e.printStackTrace();
		} catch (MessagingException e) {
			e.printStackTrace();
		}
		
		return "error";
	}
}
