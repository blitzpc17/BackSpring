package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.modelo.DocentesPeriodoMenu;
import com.gestiondocumentalserviciosdocentes.demo.modelo.DocumentosCapacitacionesDocentes;
import com.gestiondocumentalserviciosdocentes.demo.modelo.DocumentosGruposDocente;
import com.gestiondocumentalserviciosdocentes.demo.modelo.MateriasGrupos;
import com.gestiondocumentalserviciosdocentes.demo.modelo.Notificaciones;
import com.gestiondocumentalserviciosdocentes.demo.modelo.ParticipantesDocentes;
import com.gestiondocumentalserviciosdocentes.demo.modelo.SeleccionActividadesDocente;

public interface IMateriasGrupos {

	List<MateriasGrupos> buscarmateriasgrupos(int id_usuarios);
	
	List<MateriasGrupos> buscargrupossecretaria(int id_docper);
	
	List<DocumentosGruposDocente> buscarDocumentosGruposDocentes(int id_grupo, int id_departamento);
	
	List<SeleccionActividadesDocente> buscarselecionactividades(int id_usuarios, int id_docper);
	
	DocentesPeriodoMenu buscardocentesperiodos(int id_usuarios, int id_periodo);
	
	List<ParticipantesDocentes> participaciones(int id_usuarios, int id_periodo);
	
	List<Notificaciones> notificaciones(int id_usuarios);
	
	List<DocumentosCapacitacionesDocentes> documentos(int id_capacitacion);
}
