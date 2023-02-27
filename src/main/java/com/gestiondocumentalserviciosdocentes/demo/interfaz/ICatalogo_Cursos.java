package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseRepository;
import com.gestiondocumentalserviciosdocentes.demo.modelo.Catalogo_Cursos;

public interface ICatalogo_Cursos extends BaseRepository<Catalogo_Cursos, Integer>{

	/*@Query(value = "select ifnull(cc.id_Curso, 0) id_Curso, d.id_Departamento, ifnull(cc.id_Usuarios,0) id_Usuarios, cc.USER_Nombre CURSO_creado_por, cc.CURSO_Nombre, cc.CURSO_Tipo, ifnull(cc.CURSO_Cupo,0) CURSO_Cupo, ifnull(cc.CURSO_Horas,0) CURSO_Horas, ifnull(cc.CURSO_Estado,0) CURSO_Estado, \r\n"
			+ "ifnull(cc.CURSO_Visualizacion,0) CURSO_Visualizacion, cc.CURSO_pdf_Temario, cc.CURSO_fecha_creacion, d.DEP_nombre CURSO_actualizado_por, cc.CURSO_fecha_actualizacion \r\n"
			+ "from departamento d left join (select c.id_Curso, c.id_Departamento, c.id_Usuarios, u.USER_Nombre, c.CURSO_Nombre, c.CURSO_Tipo, c.CURSO_Cupo, c.CURSO_Horas, c.CURSO_Estado, \r\n"
			+ "c.CURSO_Visualizacion, c.CURSO_pdf_Temario, c.CURSO_fecha_creacion, c.CURSO_actualizado_por, c.CURSO_fecha_actualizacion from catalogo_cursos c join usuarios u on c.id_Usuarios = u.id_Usuarios) cc on d.id_Departamento = cc.id_Departamento\r\n"
			+ "order by cc.id_Departamento desc", nativeQuery = true)
	List<Catalogo_Cursos> catalogocursos();*/
	
	@Query(value = "select c.id_Curso, c.id_Departamento, c.id_Usuarios, u.USER_Nombre CURSO_creado_por, c.CURSO_Nombre , c.CURSO_Tipo, c.CURSO_Cupo, c.CURSO_Horas, c.CURSO_Estado, \r\n"
			+ "c.CURSO_Visualizacion, c.CURSO_pdf_Temario, c.CURSO_fecha_creacion, c.CURSO_actualizado_por, c.CURSO_fecha_actualizacion \r\n"
			+ "from catalogo_cursos c join usuarios u on c.id_Usuarios = u.id_Usuarios where c.id_Departamento = :id_dep and c.curso_Estado = 1 and c.curso_Visualizacion = 1", nativeQuery = true)
	List<Catalogo_Cursos> catalogocursos(@Param("id_dep") int id_dep);
}
