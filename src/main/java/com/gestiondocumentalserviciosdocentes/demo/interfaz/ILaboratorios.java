package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseRepository;
import com.gestiondocumentalserviciosdocentes.demo.modelo.Laboratorios;

public interface ILaboratorios extends BaseRepository<Laboratorios, Integer>{
	
	@Transactional
	@Modifying
	@Query(value = "delete from laboratorios where id_Laboratorio= :id ;", nativeQuery = true)
	void deletelab(@Param("id") int id);

}
