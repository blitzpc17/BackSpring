package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseRepository;
import com.gestiondocumentalserviciosdocentes.demo.modelo.RecursoProgramado;

public interface IRecursoProgramado extends BaseRepository<RecursoProgramado, Integer> {
	
	@Query(value = "SELECT *FROM recurso_programado AS ra WHERE ra.id_Periodo = :periodoId and ra.id_Departamento = :deptoId ", nativeQuery=true)
	RecursoProgramado Obtener(@Param("periodoId") int PeriodoId, @Param("deptoId") int deptoId);

}
