package com.gestiondocumentalserviciosdocentes.demo.controlador;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.IMateriasGruposService;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.IMateriasGruposServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.DocentesPeriodoMenu;
import com.gestiondocumentalserviciosdocentes.demo.modelo.DocumentosCapacitacionesDocentes;
import com.gestiondocumentalserviciosdocentes.demo.modelo.DocumentosGruposDocente;
import com.gestiondocumentalserviciosdocentes.demo.modelo.MateriasGrupos;
import com.gestiondocumentalserviciosdocentes.demo.modelo.Notificaciones;
import com.gestiondocumentalserviciosdocentes.demo.modelo.ParticipantesDocentes;
import com.gestiondocumentalserviciosdocentes.demo.modelo.SeleccionActividadesDocente;

@RestController
@RequestMapping(value = "/api/v1/materiasgrupos")
@CrossOrigin("*")
public class MateriasGruposController {
	
	@GetMapping(value="/{id_usuarios}")
	public ResponseEntity<List<MateriasGrupos>> buscarmateriasgrupos(@PathVariable int id_usuarios)
	{
		IMateriasGruposService service;
		List<MateriasGrupos> response;
		
		service=new IMateriasGruposServiceImpl();
		response = service.buscarmateriasgrupos(id_usuarios);
		
		if(response!=null)
		{
			return new ResponseEntity<List<MateriasGrupos>>(response,HttpStatus.OK);
		}else {
			return new ResponseEntity<List<MateriasGrupos>>(response,HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping(value="capacitaciones/{id_capacitacion}")
	public ResponseEntity<List<DocumentosCapacitacionesDocentes>> documentos(@PathVariable int id_capacitacion)
	{
		IMateriasGruposService service;
		List<DocumentosCapacitacionesDocentes> response;
		
		service=new IMateriasGruposServiceImpl();
		response = service.documentos(id_capacitacion);
		
		if(response!=null)
		{
			return new ResponseEntity<List<DocumentosCapacitacionesDocentes>>(response,HttpStatus.OK);
		}else {
			return new ResponseEntity<List<DocumentosCapacitacionesDocentes>>(response,HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping(value="notificaciones/{id_usuarios}")
	public ResponseEntity<List<Notificaciones>> notificaciones(@PathVariable int id_usuarios)
	{
		IMateriasGruposService service;
		List<Notificaciones> response;
		
		service=new IMateriasGruposServiceImpl();
		response = service.notificaciones(id_usuarios);
		
		if(response!=null)
		{
			return new ResponseEntity<List<Notificaciones>>(response,HttpStatus.OK);
		}else {
			return new ResponseEntity<List<Notificaciones>>(response,HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping(value="secretaria/{id_docper}")
	public ResponseEntity<List<MateriasGrupos>> buscargrupossecretaria(@PathVariable int id_docper)
	{
		IMateriasGruposService service;
		List<MateriasGrupos> response;
		
		service=new IMateriasGruposServiceImpl();
		response = service.buscargrupossecretaria(id_docper);
		
		if(response!=null)
		{
			return new ResponseEntity<List<MateriasGrupos>>(response,HttpStatus.OK);
		}else {
			return new ResponseEntity<List<MateriasGrupos>>(response,HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping(value="documentos/{id_grupo}/{id_departamento}")
	public ResponseEntity<List<DocumentosGruposDocente>> buscarDocumentosGruposDocentes(@PathVariable int id_grupo, @PathVariable int id_departamento)
	{
		IMateriasGruposService service;
		List<DocumentosGruposDocente> response;
		
		service=new IMateriasGruposServiceImpl();
		response = service.buscarDocumentosGruposDocentes(id_grupo, id_departamento);
		
		if(response!=null)
		{
			return new ResponseEntity<List<DocumentosGruposDocente>>(response,HttpStatus.OK);
		}else {
			return new ResponseEntity<List<DocumentosGruposDocente>>(response,HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping(value="actividades/{id_usuarios}/{id_docper}")
	public ResponseEntity<List<SeleccionActividadesDocente>> buscarselecionactividades(@PathVariable int id_usuarios,@PathVariable int id_docper)
	{
		IMateriasGruposService service;
		List<SeleccionActividadesDocente> response;
		
		service=new IMateriasGruposServiceImpl();
		response = service.buscarselecionactividades(id_usuarios, id_docper);
		
		if(response!=null)
		{
			return new ResponseEntity<List<SeleccionActividadesDocente>>(response,HttpStatus.OK);
		}else {
			return new ResponseEntity<List<SeleccionActividadesDocente>>(response,HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping(value="docentesperiodos/{id_usuarios}/{id_periodo}")
	public ResponseEntity<DocentesPeriodoMenu> buscardocentesperiodos(@PathVariable int id_usuarios, @PathVariable int id_periodo)
	{
		IMateriasGruposService service;
		DocentesPeriodoMenu response;
		
		service=new IMateriasGruposServiceImpl();
		response = service.buscardocentesperiodos(id_usuarios, id_periodo);
		
		if(response!=null)
		{
			return new ResponseEntity<DocentesPeriodoMenu>(response,HttpStatus.OK);
		}else {
			return new ResponseEntity<DocentesPeriodoMenu>(response,HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping(value="participaciones/{id_usuarios}/{id_periodo}")
	public ResponseEntity<List<ParticipantesDocentes>> participaciones(@PathVariable int id_usuarios, @PathVariable int id_periodo)
	{
		IMateriasGruposService service;
		List<ParticipantesDocentes> response;
		
		service=new IMateriasGruposServiceImpl();
		response = service.participaciones(id_usuarios, id_periodo);
		
		if(response!=null)
		{
			return new ResponseEntity<List<ParticipantesDocentes>>(response,HttpStatus.OK);
		}else {
			return new ResponseEntity<List<ParticipantesDocentes>>(response,HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
