package com.gestiondocumentalserviciosdocentes.demo.InterfaceService;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.modelo.Cmensajes;

public interface ICmensajeService {
	public List<Cmensajes> getMensajesDep(String filtro);
}
