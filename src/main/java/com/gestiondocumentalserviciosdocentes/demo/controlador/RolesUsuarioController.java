package com.gestiondocumentalserviciosdocentes.demo.controlador;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseControllerImpl;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.InterfaceRolesUsuarioServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.RolesUsuario;

@RestController
@RequestMapping("api/v1/rolesusuario")
@CrossOrigin("*")
public class RolesUsuarioController extends BaseControllerImpl<RolesUsuario, InterfaceRolesUsuarioServiceImpl> {

	@GetMapping(value = "/roles")
	public RolesUsuario rolesusuario(@RequestParam int usuario){
		return service.rolesUsuario(usuario);
	}
	
	@GetMapping(value = "/deleteroles/{id}")
    public void deleteroles(@PathVariable Integer id) {
        service.deleteroles(id);
    }

    @GetMapping(value = "/selectroles/{id}")
    public RolesUsuario selectroles(@PathVariable Integer id) {
        return service.selectroles(id);
    }
    
    @GetMapping(value = "/setjefefalse/{iduser}")
    public void setjefefalse(@PathVariable Integer iduser) {
        service.setjefefalse(iduser);
    }
}
