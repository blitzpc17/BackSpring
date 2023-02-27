package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseRepository;
import com.gestiondocumentalserviciosdocentes.demo.modelo.Periodos;



public interface IPeriodos extends BaseRepository<Periodos, Integer> { 
	
	
	@Query(value = "select * from periodos p order by p.per_year desc, p.per_Mes_Inicio asc , p.per_Mes_Fin asc", nativeQuery = true)
	List<Periodos> searchperiodos();
	
	@Query(value = "select * from periodos p where (p.per_Mes_Inicio= :mesini AND p.per_Mes_Fin= :mesfin AND p.per_Year= :year)", nativeQuery = true)
	Periodos comprobarperiodos(@Param("mesini") String mesini, @Param("mesfin") String mesfin, @Param("year") String year);
	
	@Transactional
	@Modifying
	@Query(value = "update periodos set per_Estado=0  where per_Estado=1", nativeQuery = true)
	void updateperiodos();
	
	@Query(value = "select p.id_Periodo, p.per_Mes_Inicio, p.per_Mes_Fin, p.per_Year, p.per_Estado, concat(ifnull(dai.id_Desarrollo_Academico, 0), '-', ifnull(dai.id_Dep_Desa, 0)) per_lbl_Periodo, dai.DESAC_pdf_Programa_Institucional per_creado_por, p.per_fecha_creacion, dai.DEPAC_pdf_Diagnostico_Necesidades per_actualizado_por, p.per_fecha_actualizacion\r\n"
			+ "from periodos p left join (select dai.id_Desarrollo_Academico , dai.DESAC_pdf_Programa_Institucional, dai.id_Periodo, dda.id_Dep_Desa, dda.DEPAC_pdf_Diagnostico_Necesidades\r\n"
			+ "from desarrollo_academico_institucional dai \r\n"
			+ "left join (select * from departamento_desarrollo_academico where id_Departamento = :id_dep) dda on dda.id_Desarrollo_Academico = dai.id_Desarrollo_Academico) dai on p.id_Periodo = dai.id_Periodo", nativeQuery = true)
	List<Periodos> periodosdesarrollo(@Param("id_dep") int id_dep);
	
}
