package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseRepository;
import com.gestiondocumentalserviciosdocentes.demo.modelo.Departamento;

public interface IDepartamento extends BaseRepository<Departamento,Integer>{

	@Query(value = "select d.id_Departamento, d.DEP_nombre, dda.id_Dep_Desa DEP_creado_por, d.DEP_fecha_creacion, dda.DEPAC_pdf_Diagnostico_Necesidades DEP_actualizado_por, d.DEP_fecha_actualizacion\r\n"
			+ " from departamento d left join ( select * from departamento_desarrollo_academico where id_Desarrollo_Academico = :id_depaca) dda on d.id_Departamento = dda.id_Departamento\r\n"
			+ " where DEP_creado_por = 'Académico'", nativeQuery = true)
	List<Departamento> depacademicos(@Param("id_depaca") int id_depaca);
	
	@Query(value = "SELECT d FROM Departamento d WHERE DEP_creado_por = 'Vinculación'")
	Departamento traevinculacion();
	
	@Query(value = "SELECT d FROM Departamento d WHERE DEP_creado_por = 'Académico'")
	List<Departamento> traeDepAcademicos();
}
