package com.gestiondocumentalserviciosdocentes.demo.InterfaceService;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.genericos.GenericService;
import com.gestiondocumentalserviciosdocentes.demo.modelo.Usuarios;

public interface InterfaceUsuariosService extends GenericService<Usuarios, Integer>{

	Usuarios iniciarSesion(String correo, String pass);
	
	Usuarios encuentraCorreo(String correo);
	
	List<Usuarios> usuariosxdep(int id_dep);
	
	List<Usuarios> docentes(int id_dep);
	
	Usuarios checkcorreo(String correo);
}
