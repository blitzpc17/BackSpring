package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseRepository;
import com.gestiondocumentalserviciosdocentes.demo.modelo.ProgramaEducativo;

public interface IProgramaEducativo extends BaseRepository<ProgramaEducativo, Integer> {
	
	@Query(value = "select * from programa_educativo m where m.id_departamento = :deptoIds order by m.nombre ;", nativeQuery = true)
	List<ProgramaEducativo>ListarDocumentosPorDepto(@Param("deptoIds") int deptoIds);
	
	@Query(value="select *from programa_educativo pro where pro.id_departamento = :deptoId AND pro.nombre = :nombredoc limit 1", nativeQuery = true)
	ProgramaEducativo BuscarDocumentoNombre( @Param("nombredoc") String nombredoc, @Param("deptoId") int deptoId);	
	

}
