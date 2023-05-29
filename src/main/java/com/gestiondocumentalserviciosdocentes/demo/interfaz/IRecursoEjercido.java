package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseRepository;
import com.gestiondocumentalserviciosdocentes.demo.modelo.RecursoEjercido;

public interface IRecursoEjercido extends BaseRepository<RecursoEjercido, Integer> {
	
	@Query(value = "SELECT *FROM recurso_ejercido AS ra WHERE ra.id_periodo = :periodoId and ra.id_departamento = :deptoId ", nativeQuery=true)
	RecursoEjercido Obtener(@Param("periodoId") int PeriodoId, @Param("deptoId") int deptoId);

}
