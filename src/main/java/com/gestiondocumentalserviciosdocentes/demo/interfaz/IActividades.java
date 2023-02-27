package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseRepository;
import com.gestiondocumentalserviciosdocentes.demo.modelo.Actividades;

public interface IActividades extends BaseRepository<Actividades, Integer>{

	@Query(value = "SELECT a FROM Actividades a WHERE id_Departamento = :id_dep")
	List<Actividades> buscarActividadxDep(@Param("id_dep") int id_dep);
}
