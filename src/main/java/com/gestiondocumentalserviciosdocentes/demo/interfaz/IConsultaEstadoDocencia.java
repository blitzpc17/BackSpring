package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.modelo.ConsultaEstadoDocencia;

public interface IConsultaEstadoDocencia {
List<ConsultaEstadoDocencia> getConsultaEstadoDocencias(int filtro,int filtro2);
}
