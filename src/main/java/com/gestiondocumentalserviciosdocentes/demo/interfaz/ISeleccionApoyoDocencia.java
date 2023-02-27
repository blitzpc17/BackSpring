package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseRepository;
import com.gestiondocumentalserviciosdocentes.demo.modelo.SeleccionApoyoDocencia;

public interface ISeleccionApoyoDocencia extends BaseRepository<SeleccionApoyoDocencia, Integer> {

	@Query(value = "SELECT s FROM SeleccionApoyoDocencia s WHERE id_docper = :id_docper and id_actividades_docencia = :id_act")
	SeleccionApoyoDocencia buscaxdepactividad(@Param("id_docper") int id_dep, @Param("id_act") int id_act);
}
