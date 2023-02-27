package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.InterfaceRolesUsuarioService;
import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseRepository;
import com.gestiondocumentalserviciosdocentes.demo.genericos.GenericServiceImplm;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IRolesUsuario;
import com.gestiondocumentalserviciosdocentes.demo.modelo.RolesUsuario;

@Service
public class InterfaceRolesUsuarioServiceImpl extends GenericServiceImplm<RolesUsuario, Integer> implements InterfaceRolesUsuarioService{

	@Autowired
	private IRolesUsuario iRolesUsuario;
	
	@Override
	public BaseRepository<RolesUsuario, Integer> getBaseRepository() {
		// TODO Auto-generated method stub
		return iRolesUsuario;
	}

	@Override
	public RolesUsuario rolesUsuario(int usuario) {
		// TODO Auto-generated method stub
		return iRolesUsuario.rolesUsuario(usuario);
	}

	@Override
    public void deleteroles(Integer id) {
        // TODO Auto-generated method stub
        iRolesUsuario.deleteroles(id);
    }
 
    @Override
    public RolesUsuario selectroles(Integer id) {
        // TODO Auto-generated method stub;
        return iRolesUsuario.selectroles(id);
    }
    
    @Override
    public void setjefefalse(Integer iduser) {
        // TODO Auto-generated method stub
        iRolesUsuario.setjefefalse(iduser);
    }
}
