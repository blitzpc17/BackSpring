package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.modelo.CNombreMateriaDocente;

public interface ICNombreMateriaDocente {
List<CNombreMateriaDocente> getCNombreMateriaDocentes(int filtro,int filtro2, int filtro3);
}
