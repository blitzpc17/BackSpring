package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseRepository;
import com.gestiondocumentalserviciosdocentes.demo.modelo.DepartamentoAcademico;

public interface IDepartamentoAcademico extends BaseRepository<DepartamentoAcademico,Integer>{

	@Query(value = "SELECT d FROM DepartamentoAcademico d WHERE d.id_desarrollo_academico = :id_desarrollo_academico and d.id_departamento = :id_departamento ")
	DepartamentoAcademico depacademicos(@Param("id_desarrollo_academico") int id_desarrollo_academico, @Param("id_departamento") int id_departamento);
}
