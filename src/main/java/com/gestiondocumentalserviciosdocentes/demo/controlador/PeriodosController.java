package com.gestiondocumentalserviciosdocentes.demo.controlador;



import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseControllerImpl;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.InterfacePeriodosServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.Periodos;


@RestController
@RequestMapping("api/v1/periodos")
@CrossOrigin("*")
public class PeriodosController extends BaseControllerImpl<Periodos, InterfacePeriodosServiceImpl> {
	
	@GetMapping(value = "/searchperiodos")
	public List<Periodos> searchperiodos(){
		return service.searchperiodos();
	}
	
	@GetMapping(value = "/comprobarperiodos/{mesini}/{mesfin}/{year}")
	public Periodos comprobarperiodos(@PathVariable String mesini, @PathVariable String mesfin, @PathVariable String year){
		return service.comprobarperiodos(mesini,mesfin,year);
	}
	
	@GetMapping(value = "/updateperiodos")
	public void updateperiodos(){
		service.updateperiodos();
	}
	
	@GetMapping(value = "/desarrollo/{id_dep}")
	public List<Periodos> periodosdesarrollo(@PathVariable int id_dep){
		return service.periodosdesarrollo(id_dep);
	}

}
