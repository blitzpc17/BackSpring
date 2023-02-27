package com.gestiondocumentalserviciosdocentes.demo.InterfaceService;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.modelo.DateInn;

public interface DateInnService {
	public List<DateInn> getDateInn(String year);
}
