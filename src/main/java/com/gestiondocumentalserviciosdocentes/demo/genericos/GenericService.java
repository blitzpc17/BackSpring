package com.gestiondocumentalserviciosdocentes.demo.genericos;

import java.io.Serializable;
import java.util.List;

public interface GenericService <T, ID extends Serializable>{

	T save(T entidad);
	
	void delete(ID id);
	
	T get(ID id);
	
	List<T> getAll();
	
}
