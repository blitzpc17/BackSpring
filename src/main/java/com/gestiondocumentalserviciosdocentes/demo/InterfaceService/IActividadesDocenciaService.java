package com.gestiondocumentalserviciosdocentes.demo.InterfaceService;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.modelo.ActividadesDocencia;

public interface IActividadesDocenciaService {

	List<ActividadesDocencia> getActividadesDocencia(int filtro,int filtro2);
}
