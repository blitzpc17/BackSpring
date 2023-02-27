package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseRepository;
import com.gestiondocumentalserviciosdocentes.demo.modelo.RolesUsuario;

public interface IRolesUsuario extends BaseRepository<RolesUsuario, Integer> {

	@Query(value = "SELECT roles FROM RolesUsuario roles WHERE id_usuarios = :usuario")
	RolesUsuario rolesUsuario(@Param("usuario") int usuario);
	
	@Transactional
    @Modifying
    @Query(value = "delete from rolesusuario where id_usuario= :id ;", nativeQuery = true)
    void deleteroles(@Param("id") Integer id);

    @Query(value = "select r from RolesUsuario r where id_Usuarios = :id ")
    RolesUsuario selectroles(@Param("id") Integer id);
    
    @Transactional
    @Modifying
    @Query(value = "update rolesusuario set rol_jefe_departamento = 0 where id_Usuarios = :iduser ;", nativeQuery = true)
    void setjefefalse(@Param("iduser") Integer iduser);
}
