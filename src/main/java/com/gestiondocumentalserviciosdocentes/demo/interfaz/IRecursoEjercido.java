package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseRepository;
import com.gestiondocumentalserviciosdocentes.demo.modelo.RecursoEjercido;

public interface IRecursoEjercido extends BaseRepository<RecursoEjercido, Integer> {
	
	@Query(value = "SELECT *FROM recurso_asignado AS ra WHERE ra.periodoId = :periodoId and ra.DepartamentoId = :deptoId ", nativeQuery=true)
	RecursoEjercido Obtener(@Param("periodoId") int PeriodoId, @Param("deptoId") int deptoId);

}
