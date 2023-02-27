package com.gestiondocumentalserviciosdocentes.demo.InterfaceService;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.modelo.Ucursos;

public interface IUcursosService {
	public List<Ucursos> getCursosUsuario(String filtro);
}
