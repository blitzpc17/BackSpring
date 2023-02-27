package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseRepository;
import com.gestiondocumentalserviciosdocentes.demo.modelo.Persona;

public interface IPersona extends BaseRepository<Persona, Integer>{
	
	@Query(value = "SELECT p FROM Persona p WHERE p.telefono LIKE :filtro% and p.nombre LIKE %:filtro2%")
	List<Persona> search(@Param("filtro") String filtro, @Param("filtro2") String filtro2);
	
	@Query(value = "SELECT p FROM Persona p WHERE p.telefono LIKE :filtro% and p.nombre LIKE %:filtro2%")
	List<Persona> search2(@Param("filtro") String filtro, @Param("filtro2") String filtro2);

}
