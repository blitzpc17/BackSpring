package com.gestiondocumentalserviciosdocentes.demo.controlador;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.IPeriodosSecretariaService;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.IPeriodosSecretariaServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.DocentePeriodoSecretaria;
import com.gestiondocumentalserviciosdocentes.demo.modelo.EstadisticasJefeDep;
import com.gestiondocumentalserviciosdocentes.demo.modelo.SeleccionActividadesDocente;

@RestController
@RequestMapping(value = "/api/v1/secretaria")
@CrossOrigin("*")
public class PeriodosSecretariaControlador {
	
	@GetMapping(value="docenteperiodo/{id_periodo}/{id_dep}")
	public ResponseEntity<List<DocentePeriodoSecretaria>> buscarmateriasgrupos(@PathVariable int id_periodo, @PathVariable int id_dep)
	{
		IPeriodosSecretariaService service;
		List<DocentePeriodoSecretaria> response;
		
		service=new IPeriodosSecretariaServiceImpl();
		response = service.buscarDocentePeriodoSecretarias(id_periodo, id_dep);
		
		if(response!=null)
		{
			return new ResponseEntity<List<DocentePeriodoSecretaria>>(response,HttpStatus.OK);
		}else {
			return new ResponseEntity<List<DocentePeriodoSecretaria>>(response,HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping(value="actividades/{id_docper}")
	public ResponseEntity<List<SeleccionActividadesDocente>> buscarselecionactividades(@PathVariable int id_docper)
	{
		IPeriodosSecretariaService service;
		List<SeleccionActividadesDocente> response;
		
		service=new IPeriodosSecretariaServiceImpl();
		response = service.buscarselecionactividades(id_docper);
		
		if(response!=null)
		{
			return new ResponseEntity<List<SeleccionActividadesDocente>>(response,HttpStatus.OK);
		}else {
			return new ResponseEntity<List<SeleccionActividadesDocente>>(response,HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping(value="libera/{id_dep}/{id_docper}")
	public boolean liberacion(@PathVariable int id_dep, @PathVariable int id_docper)
	{
		IPeriodosSecretariaService service;
		boolean response = false;
		
		service=new IPeriodosSecretariaServiceImpl();
		response = service.subeLiberacion(id_dep, id_docper);
		
		return response;
	}
	
	@GetMapping(value="estadistico/{id_per}/{id_dep}")
	public ResponseEntity<List<EstadisticasJefeDep>> estadistico(@PathVariable int id_per, @PathVariable int id_dep)
	{
		IPeriodosSecretariaService service;
		List<EstadisticasJefeDep> response;
		
		service=new IPeriodosSecretariaServiceImpl();
		response = service.estadisticoJefeDep(id_dep, id_per);
		
		if(response!=null)
		{
			return new ResponseEntity<List<EstadisticasJefeDep>>(response,HttpStatus.OK);
		}else {
			return new ResponseEntity<List<EstadisticasJefeDep>>(response,HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
