package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.InterfaceUsuariosService;
import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseRepository;
import com.gestiondocumentalserviciosdocentes.demo.genericos.GenericServiceImplm;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IUsuarios;
import com.gestiondocumentalserviciosdocentes.demo.modelo.Usuarios;

@Service
public class InterfaceUsuariosServiceImpl extends GenericServiceImplm<Usuarios, Integer> implements InterfaceUsuariosService{

	@Autowired
	private IUsuarios iUsuarios;
	
	@Override
	public BaseRepository<Usuarios, Integer> getBaseRepository() {
		// TODO Auto-generated method stub
		return iUsuarios;
	}

	@Override
	public Usuarios iniciarSesion(String correo, String pass) {
		// TODO Auto-generated method stub
		return iUsuarios.iniciarSesion(correo, pass);
	}

	@Override
	public Usuarios encuentraCorreo(String correo) {
		// TODO Auto-generated method stub
		return iUsuarios.encuentraCorreo(correo);
	}

	@Override
	public List<Usuarios> usuariosxdep(int id_dep) {
		// TODO Auto-generated method stub
		return iUsuarios.usuariosxdep(id_dep);
	}

	@Override
	public List<Usuarios> docentes(int id_dep) {
		// TODO Auto-generated method stub
		return iUsuarios.docentes(id_dep);
	}
	
	@Override
	public Usuarios checkcorreo(String correo) {
		// TODO Auto-generated method stub
		return iUsuarios.checkcorreo(correo);
	}

}
