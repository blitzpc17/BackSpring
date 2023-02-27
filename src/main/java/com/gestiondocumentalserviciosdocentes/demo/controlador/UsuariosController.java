package com.gestiondocumentalserviciosdocentes.demo.controlador;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseControllerImpl;
import com.gestiondocumentalserviciosdocentes.demo.genericos.Mail;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.InterfaceUsuariosServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IReset_Password;
import com.gestiondocumentalserviciosdocentes.demo.modelo.Reset_Password;
import com.gestiondocumentalserviciosdocentes.demo.modelo.Usuarios;


@RestController
@RequestMapping("api/v1/usuarios")
@CrossOrigin("*")
public class UsuariosController extends BaseControllerImpl<Usuarios, InterfaceUsuariosServiceImpl>{

	@Autowired
	private IReset_Password iReset_Password;
	
	@GetMapping(value = "/login")
	public Usuarios iniciarSesion(@RequestParam String correo, @RequestParam String pass){
		return service.iniciarSesion(correo,pass);
	}
	
	@GetMapping(value = "/usuariosdep/{id_dep}")
	public List<Usuarios> usuariosxdep(@PathVariable int id_dep){
		return service.usuariosxdep(id_dep);
	}
	
	@GetMapping(value = "/docentes/{id_dep}")
	public List<Usuarios> docentes(@PathVariable int id_dep){
		return service.docentes(id_dep);
	}
	
	@GetMapping(value = "/getusuariosbydep/{id}")
	public List<Usuarios> getusuariosbydep(@PathVariable int id){
		return service.usuariosxdep(id);
	}
	
	@GetMapping(value = "/recuperacontra")
	public Usuarios encuentraCorreo(@RequestParam String correo){
		Usuarios usuario = service.encuentraCorreo(correo);
		
		if(usuario != null) {
			try {
				Reset_Password nuevoReset = new Reset_Password();
				nuevoReset.setUser_Correo(usuario.getUser_Correo());
				nuevoReset.setFecha_reset(new Date().toString());
				nuevoReset.setId_usuario(usuario.getId_Usuarios());
				
				Reset_Password reset_Pass = iReset_Password.save(nuevoReset);
				
				if(reset_Pass != null){
					
					String mensajeString = "¡Hola "+ usuario.getUser_Nombre() +"!\n"
							+ "Recibe este email porque se solicitó un reestablecimiento de contraseña para su cuenta.\n\n"
							+ "http://vin.ittehuacan.edu.mx:99/reestablecercontra/"+ reset_Pass.getId_reset()
							+ "\n\nEste enlace de reestablecimiento de contraseña expirará en 60 minutos.\n"
							+ "\n"
							+ "Si no realizó esta petición, puede ignorar este correo y no pasará nada.\n"
							+ "\n"
							+ "Saludos";
					
					Mail mail = new Mail();
					mail.enviarEmail("Reestablecer Contraseña", mensajeString, usuario.getUser_Correo());
				}
			} catch (IOException e) {
				e.printStackTrace();
			} catch (MessagingException e) {
				e.printStackTrace();
			}
		}
		
		return usuario;
	}
	
	@GetMapping(value = "/checkcorreo/{correo}")
	public Usuarios checkcorreo(@PathVariable String correo) {
		return service.checkcorreo(correo);
	}
}
