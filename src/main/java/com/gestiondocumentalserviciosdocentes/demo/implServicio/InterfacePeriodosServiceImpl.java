package com.gestiondocumentalserviciosdocentes.demo.implServicio;





import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.InterfacePeriodosService;
import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseRepository;
import com.gestiondocumentalserviciosdocentes.demo.genericos.GenericServiceImplm;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IPeriodos;
import com.gestiondocumentalserviciosdocentes.demo.modelo.Periodos;





@Service
public class InterfacePeriodosServiceImpl extends GenericServiceImplm<Periodos, Integer> implements InterfacePeriodosService{
	
	
	@Autowired
	private IPeriodos iPeriodos;

	@Override
	public BaseRepository<Periodos, Integer> getBaseRepository() {
		// TODO Auto-generated method stub
		return iPeriodos;
	}

	@Override
	public List<Periodos> searchperiodos() {
		// TODO Auto-generated method stub
		List<Periodos> returnList=iPeriodos.searchperiodos();
		
		return returnList;
	}

	@Override
	public Periodos comprobarperiodos(String mesini, String mesfin, String year) {
		// TODO Auto-generated method stub
		
		return iPeriodos.comprobarperiodos(mesini, mesfin, year);
	}	
		
	
	@Override
	public void updateperiodos() {
		// TODO Auto-generated method stub
		iPeriodos.updateperiodos();
		
		
	}

	@Override
	public List<Periodos> periodosdesarrollo(int id_dep) {
		// TODO Auto-generated method stub
		return iPeriodos.periodosdesarrollo(id_dep);
	}



	
	
}
