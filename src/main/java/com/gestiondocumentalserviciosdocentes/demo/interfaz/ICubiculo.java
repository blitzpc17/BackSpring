package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseRepository;
import com.gestiondocumentalserviciosdocentes.demo.modelo.Cubiculo;

public interface ICubiculo extends BaseRepository<Cubiculo, Integer>{

	@Query(value = "SELECT c FROM Cubiculo c WHERE id_Usuarios = :id_usuarios")
	Cubiculo buscarCubiculoxUsuario(@Param("id_usuarios") int id_usuarios);
	
}
