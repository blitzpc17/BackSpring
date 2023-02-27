package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseRepository;
import com.gestiondocumentalserviciosdocentes.demo.modelo.MaterialJefatura;

public interface IMaterialJefatura extends BaseRepository<MaterialJefatura, Integer> {
	
	@Query(value = "SELECT m FROM MaterialJefatura m WHERE id_departamento = :id_dep")
	List<MaterialJefatura> materialxdep(@Param("id_dep") int id_dep);

}
