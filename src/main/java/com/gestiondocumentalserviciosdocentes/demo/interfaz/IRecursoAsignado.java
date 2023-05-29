package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseRepository;
import com.gestiondocumentalserviciosdocentes.demo.modelo.RecursoAsignado;

public interface IRecursoAsignado extends BaseRepository<RecursoAsignado, Integer>{
	
	@Query(value = "SELECT *FROM recurso_asignado AS ra WHERE ra.id_Periodo = :periodoId and ra.id_Departamento = :deptoId ", nativeQuery=true)
	RecursoAsignado Obtener(@Param("periodoId") int PeriodoId, @Param("deptoId") int deptoId);
	
	
	
}
