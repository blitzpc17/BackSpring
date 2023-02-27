package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseRepository;
import com.gestiondocumentalserviciosdocentes.demo.modelo.Usuarios;

public interface IUsuarios extends BaseRepository<Usuarios, Integer> {

	@Query(value = "SELECT u FROM Usuarios u WHERE user_Correo = :correo and user_Password = :pass")
	Usuarios iniciarSesion(@Param("correo") String correo, @Param("pass") String pass);
	
	@Query(value = "SELECT u FROM Usuarios u WHERE user_Correo = :correo")
	Usuarios encuentraCorreo(@Param("correo") String correo);
	
	@Query(value = "SELECT u FROM Usuarios u WHERE id_Departamento = :id_dep")
	List<Usuarios> usuariosxdep(@Param("id_dep") int id_dep);
	
	@Query(value = "SELECT * FROM usuarios u join rolesusuario r on u.id_usuarios = r.id_usuarios "
			+ " WHERE u.id_departamento = :id_dep and r.rol_docente = 1", nativeQuery = true)
	List<Usuarios> docentes(@Param("id_dep") int id_dep);
	
	@Query(value = "select * from usuarios where user_Correo = :correo ;", nativeQuery = true)
	Usuarios checkcorreo(@Param("correo") String correo);
}
