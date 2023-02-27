package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.modelo.ConsultaGrupo;

public interface IConsultaGrupo {
 List<ConsultaGrupo> getConsultaGrupo(int filtro, int filtro2);
}
