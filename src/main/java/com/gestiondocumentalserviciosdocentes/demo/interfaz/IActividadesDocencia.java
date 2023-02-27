package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.modelo.ActividadesDocencia;

public interface IActividadesDocencia {

	List<ActividadesDocencia> getActividadesDocencia(int filtro,int filtro2);
}
