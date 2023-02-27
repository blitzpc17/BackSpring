package com.gestiondocumentalserviciosdocentes.demo.InterfaceService;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.modelo.DocenteCubiculo;

public interface IDocenteCubiculoService {
	List<DocenteCubiculo> getDocenteCubiculos(int filtro,int filtro2);
}
