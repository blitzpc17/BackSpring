package com.gestiondocumentalserviciosdocentes.demo.InterfaceService;

import com.gestiondocumentalserviciosdocentes.demo.genericos.GenericService;
import com.gestiondocumentalserviciosdocentes.demo.modelo.RolesUsuario;

public interface InterfaceRolesUsuarioService extends GenericService<RolesUsuario, Integer>{

	RolesUsuario rolesUsuario(int usuario);
	
	void deleteroles(Integer id);

    RolesUsuario selectroles(Integer id);
    
    void setjefefalse(Integer iduser);
}
