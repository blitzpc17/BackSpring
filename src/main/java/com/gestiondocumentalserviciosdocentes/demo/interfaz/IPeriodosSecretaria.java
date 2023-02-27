package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.modelo.DocentePeriodoSecretaria;
import com.gestiondocumentalserviciosdocentes.demo.modelo.EstadisticasJefeDep;
import com.gestiondocumentalserviciosdocentes.demo.modelo.SeleccionActividadesDocente;

public interface IPeriodosSecretaria {

	List<DocentePeriodoSecretaria> buscarDocentePeriodoSecretarias( int id_periodo, int id_dep);
	
	List<SeleccionActividadesDocente> buscarselecionactividades(int id_docper);
	
	boolean subeLiberacion(int id_dep, int id_docper);
	
	List<EstadisticasJefeDep> estadisticoJefeDep(int id_dep, int id_per);
}
