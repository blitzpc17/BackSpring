package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.modelo.clsReportesLaboratorios;

public interface IConsultaReportesLaboratorio {
	List<clsReportesLaboratorios>ListarReportesLaboratoriosDepto(int deptoId);
}
