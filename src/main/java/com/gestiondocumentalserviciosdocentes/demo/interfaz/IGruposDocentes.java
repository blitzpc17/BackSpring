package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseRepository;
import com.gestiondocumentalserviciosdocentes.demo.modelo.GruposDocente;

public interface IGruposDocentes extends BaseRepository<GruposDocente, Integer> {

	@Query(value = "select g from GruposDocente g where g.id_materia = :id_mat and g.grp_grupo = :grupo and g.id_docper = :iddocper ")
	GruposDocente comprobarGrupos( @Param("id_mat") int id_mat, @Param("grupo") String grupo, @Param("iddocper") int iddocper);
}
