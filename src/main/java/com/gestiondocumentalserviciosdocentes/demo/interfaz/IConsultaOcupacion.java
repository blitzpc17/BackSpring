package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.modelo.ConsultaOcupacion;

public interface IConsultaOcupacion {
List<ConsultaOcupacion> getOcupaciones(int filtro);
}
