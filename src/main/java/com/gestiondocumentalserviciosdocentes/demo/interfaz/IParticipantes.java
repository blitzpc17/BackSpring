package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseRepository;
import com.gestiondocumentalserviciosdocentes.demo.modelo.Participantes;

public interface IParticipantes extends BaseRepository<Participantes,Integer>{

	@Query(value = "select p.id_Participante, p.id_Capacitacion, p.id_Usuarios, p.PART_pdf_Encuesta, concat(u.USER_Nombre, '~', ifnull(p.PART_pdf_Constancia, ' ')) PART_pdf_Constancia\r\n"
			+ "from participantes p join usuarios u on u.id_Usuarios = p.id_Usuarios\r\n"
			+ "where p.id_Capacitacion = :id_capacitacion", nativeQuery = true)
	List<Participantes> buscarParticipantes(@Param("id_capacitacion") int id_capacitacion);
}
