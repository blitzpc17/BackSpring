package com.gestiondocumentalserviciosdocentes.demo.genericos;

import java.io.Serializable;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

public interface BaseControllerInterface <T, ID extends Serializable> {

	public List<T> getAllList();
	
	public T getEntityPorId(@PathVariable ID id);
	
	public ResponseEntity<T> save(@RequestBody T entity);
	
	public ResponseEntity<T> delete(@PathVariable ID id);
}
