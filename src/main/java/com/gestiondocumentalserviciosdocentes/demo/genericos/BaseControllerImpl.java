package com.gestiondocumentalserviciosdocentes.demo.genericos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public abstract class BaseControllerImpl <T, S extends GenericServiceImplm<T, Integer>> implements BaseControllerInterface<T, Integer>{

	@Autowired
	protected S service;
	
	@GetMapping(value = "/all")
	public List<T> getAllList(){
		return service.getAll();
	}
	
	@GetMapping(value = "/find/{id}")
	public T getEntityPorId(@PathVariable Integer id) {
		return service.get(id);
	}
	
	@PostMapping(value = "/save")
	public ResponseEntity<T> save (@RequestBody T entidad){
		T objeto = service.save(entidad);
		return new ResponseEntity<T>(objeto, HttpStatus.OK);
	}
	
	@GetMapping(value =  "/delete/{id}")
	public ResponseEntity<T> delete (@PathVariable Integer id){
		T entidad = service.get(id);
		
		if(entidad!=null) {
			service.delete(id);
		}else {
			return new ResponseEntity<T>(entidad, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		return new ResponseEntity<T>(entidad, HttpStatus.OK);
	}
}
