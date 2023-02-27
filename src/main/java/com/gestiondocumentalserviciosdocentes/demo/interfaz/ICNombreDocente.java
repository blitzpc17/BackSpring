package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.modelo.CNombreDocente;

public interface ICNombreDocente {
List<CNombreDocente> getCNombreDocentes(int filtro);
}
