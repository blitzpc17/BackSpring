package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseRepository;
import com.gestiondocumentalserviciosdocentes.demo.modelo.Materias;

public interface IMaterias extends BaseRepository<Materias, Integer> {
	
	@Query(value = "select * from materias m where m.id_Departamento= :id ;", nativeQuery = true)
	List<Materias> searchbyDep(@Param("id") String id);
	
	@Query(value = "select * from materias m where (m.id_Departamento= :id && mat_Clave= :clave );", nativeQuery = true)
	Materias comprobarmaterias( @Param("id") String id, @Param("clave") String clave);
	

}
