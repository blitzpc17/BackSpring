package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseRepository;
import com.gestiondocumentalserviciosdocentes.demo.modelo.Formatos;

public interface IFormatos extends BaseRepository<Formatos, Integer> {

	@Query(value = "SELECT f FROM Formatos f WHERE id_departamento = :id_dep")
	List<Formatos> formatosxdep(@Param("id_dep") int id_dep);
}
