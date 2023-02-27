package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseRepository;
import com.gestiondocumentalserviciosdocentes.demo.modelo.DocumentosCapacitaciones;

public interface IDocumentosCapacitaciones extends BaseRepository<DocumentosCapacitaciones, Integer>{

	@Query(value = "select ifnull(dc.id_doc_capacitaciones,0) id_doc_capacitaciones, ifnull(dc.id_capacitacion,0) id_capacitacion, f.id_Formato, concat(f.FRM_Nombre ,'~',ifnull(dc.DOCCAP_pdf_Documento,' ')) doccap_pdf_documento\r\n"
			+ "from( select * from documentos_capacitaciones where id_Capacitacion = :id_capacitacion) dc \r\n"
			+ "right join formatos f on f.id_Formato = dc.id_Formato where f.FMR_Tipo = 'Capacitaciones'", nativeQuery = true)
	List<DocumentosCapacitaciones> documentos(@Param("id_capacitacion") int id_capacitacion);
}
