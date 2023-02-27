package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseRepository;
import com.gestiondocumentalserviciosdocentes.demo.modelo.Capacitaciones;

public interface ICapacitaciones extends BaseRepository<Capacitaciones,Integer>{

	@Query(value = "select c.id_Capacitacion, c.id_Dep_Desa, c.CAP_Nombre_Cap, c.CAP_Nombre_Instructor, c.CAP_Tipo_Instructor, c.CAP_Fecha_Impartir, c.id_instructor, \r\n"
			+ "c.CAP_pdf_Encuesta_Eficacia, c.CAP_pdf_Constancia_Instructor, c.CAP_creado_por, c.CAP_fecha_creacion, c.CAP_actualizado_por, c.CAP_fecha_actualizacion \r\n"
			+ "from capacitaciones c join departamento_desarrollo_academico dda on dda.id_Dep_Desa = c.id_Dep_Desa\r\n"
			+ "join desarrollo_academico_institucional dai on dai.id_Desarrollo_Academico = dda.id_Desarrollo_Academico\r\n"
			+ "where id_instructor = :id_usuario and dai.id_Periodo = :id_Periodo", nativeQuery = true)
	List<Capacitaciones> buscarxusuariodep(@Param("id_Periodo") int id_Periodo, @Param("id_usuario") int id_usuario);
	
	@Query(value = "select c.id_Capacitacion, c.id_Dep_Desa, c.CAP_Nombre_Cap, ifnull(u.user_nombre, c.CAP_Nombre_Instructor) CAP_Nombre_Instructor, c.CAP_Tipo_Instructor, c.CAP_Fecha_Impartir, c.id_instructor,\r\n"
			+ "c.CAP_pdf_Encuesta_Eficacia, c.CAP_pdf_Constancia_Instructor, c.CAP_creado_por, c.CAP_fecha_creacion, c.CAP_actualizado_por, c.CAP_fecha_actualizacion \r\n"
			+ "from capacitaciones c left join usuarios u on u.id_usuarios = c.id_instructor\r\n"
			+ "where c.id_Dep_Desa = :id_depdesa", nativeQuery = true)
	List<Capacitaciones> buscardepdesa(@Param("id_depdesa") int id_depdesa);
}
