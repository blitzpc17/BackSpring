package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseRepository;
import com.gestiondocumentalserviciosdocentes.demo.modelo.Convocatorias;

public interface IConvocatorias extends BaseRepository<Convocatorias, Integer>{
	
	@Query(value = "select c.id_convocatoria, c.id_periodo, ifnull(ic.interes, 0) conv_estado, ifnull(ic.id_Interes_Convocatoria, 0) id_departamento, c.conv_nombre, c.conv_fecha_expirar, c.conv_pdf_informacion, c.conv_tipo, c.conv_creado_por, c.conv_fecha_creacion, c.conv_actualizado_por, c.conv_fecha_actualizacion \n"
			+ "from convocatorias c left join (select * from interes_convocatoria where id_Usuarios = :id_usuario) ic on c.id_Convocatoria = ic.id_Convocatoria\n"
			+ "join periodos p on c.id_Periodo = p.id_Periodo \n"
			+ "where c.id_Departamento = :id_dep and per_estado = 1 and c.conv_Estado = 1", nativeQuery = true)
	List<Convocatorias> buscarxdep(@Param("id_dep") int id_dep, @Param("id_usuario") int id_usuario);
	
}
