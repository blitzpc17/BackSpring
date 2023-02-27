package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseRepository;
import com.gestiondocumentalserviciosdocentes.demo.modelo.DesarrolloAcademicoInst;

public interface IDesarrolloAcademicoInst extends BaseRepository<DesarrolloAcademicoInst,Integer>{

	@Query(value = "SELECT d FROM DesarrolloAcademicoInst d WHERE id_Periodo = :id_periodo")
	DesarrolloAcademicoInst depxperiodo(@Param("id_periodo") int id_periodo);
}
