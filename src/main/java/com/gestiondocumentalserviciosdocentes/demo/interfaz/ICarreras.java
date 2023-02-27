package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseRepository;
import com.gestiondocumentalserviciosdocentes.demo.modelo.Carreras;

public interface ICarreras extends BaseRepository<Carreras, Integer>{
	
	@Query(value = "select * from carreras m where m.id_Departamento= :id order by car_Nombre ;", nativeQuery = true)
	List<Carreras> searchbyDep(@Param("id") String id);
	
	@Query(value = "select * from carreras m where (m.id_Departamento= :id && car_Nombre= :name );", nativeQuery = true)
	Carreras comprobacarrera( @Param("id") String id, @Param("name") String name);

}
