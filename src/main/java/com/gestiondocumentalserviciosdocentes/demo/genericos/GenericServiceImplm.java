package com.gestiondocumentalserviciosdocentes.demo.genericos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public abstract class GenericServiceImplm <T, ID extends Serializable> implements GenericService<T, ID>{

	@Override
	public T save(T entidad) {
		// TODO Auto-generated method stub
		return getBaseRepository().save(entidad);
	}

	@Override
	public void delete(ID id) {
		// TODO Auto-generated method stub
		getBaseRepository().deleteById(id);
	}

	@Override
	public T get(ID id) {
		// TODO Auto-generated method stub
		Optional<T> obOptional = getBaseRepository().findById(id);
		if(obOptional.isPresent())
			return obOptional.get();
		
		return null;
	}

	@Override
	public List<T> getAll() {
		// TODO Auto-generated method stub
		List<T> returnList = new ArrayList<>();
		getBaseRepository().findAll().forEach(obj -> returnList.add(obj));
		
		//returnList = (List<T>) getCrudRepository().findAll();
		return returnList;
	}
	
	public abstract BaseRepository<T, ID> getBaseRepository();
	
}
