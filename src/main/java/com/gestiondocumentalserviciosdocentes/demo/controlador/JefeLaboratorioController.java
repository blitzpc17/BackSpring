package com.gestiondocumentalserviciosdocentes.demo.controlador;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.IConsultaLaboratorioNombreService;
import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.IDocumentosLaboratoriosService;
import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.IGestionesLaboratoriosService;
import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.IJSolicitudesService;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.IConsultaLaboratorioNombreServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.IDocumentosGruposServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.IDocumentosLaboratoriosServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.IGestionesLaboratoriosServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.IJSolicitudesServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.ISeguimientosAulaServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IDocumentosLaboratorios;
import com.gestiondocumentalserviciosdocentes.demo.modelo.ConsultaLaboratorioNombre;
import com.gestiondocumentalserviciosdocentes.demo.modelo.DocumentosLaboratorios;
import com.gestiondocumentalserviciosdocentes.demo.modelo.GestionesLaboratorios;
import com.gestiondocumentalserviciosdocentes.demo.modelo.JSolicitudes;


@RestController
@RequestMapping(value = "/api/v1/jefelaboratorio")
@CrossOrigin("*")
public class JefeLaboratorioController {
	@GetMapping(value="gestioneslaboratorios/{filtro}/{filtro2}")
	public ResponseEntity<List<GestionesLaboratorios>> gestioneslaboratorios(@PathVariable int filtro,@PathVariable int filtro2)
	{
	IGestionesLaboratoriosService service;
	List<GestionesLaboratorios> response;
	
	service=new IGestionesLaboratoriosServiceImpl();
	response=service.getGestionesLaboratorios(filtro, filtro2);
	
	if(response!=null)
	{
		return new ResponseEntity<List<GestionesLaboratorios>>(response,HttpStatus.OK);
	}else {
		return new ResponseEntity<List<GestionesLaboratorios>>(response,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	}
	
	@GetMapping(value="gestionsolicitudes/{filtro}/{filtro2}/{filtro3}")
	public ResponseEntity<List<JSolicitudes>> gestionsolicitudes(@PathVariable int filtro,@PathVariable String filtro2,@PathVariable int filtro3)
	{
	IJSolicitudesService service;
	List<JSolicitudes> response;
	
	service=new IJSolicitudesServiceImpl();
	response=service.getJSolicitudes(filtro,filtro2,filtro3);
	
	if(response!=null)
	{
		return new ResponseEntity<List<JSolicitudes>>(response,HttpStatus.OK);
	}else {
		return new ResponseEntity<List<JSolicitudes>>(response,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	}
	
	@GetMapping(value="documentoslaboratorios/{filtro}/{filtro2}")
	public ResponseEntity<List<DocumentosLaboratorios>> documentoslaboratorios(@PathVariable int filtro,@PathVariable int filtro2)
	{
	IDocumentosLaboratoriosService service;
	List<DocumentosLaboratorios> response;
	
	service= new IDocumentosLaboratoriosServiceImpl();
	response=service.getDocumentosLaboratorios(filtro,filtro2);
	
	if(response!=null)
	{
		return new ResponseEntity<List<DocumentosLaboratorios>>(response,HttpStatus.OK);
	}else {
		return new ResponseEntity<List<DocumentosLaboratorios>>(response,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	}
	
	@GetMapping(value="nombrelabuser/{filtro}")
	public ResponseEntity<List<ConsultaLaboratorioNombre>> nombrelabuser(@PathVariable int filtro)
	{
	IConsultaLaboratorioNombreService service;
	List<ConsultaLaboratorioNombre> response;
	
	service= new IConsultaLaboratorioNombreServiceImpl();
	response=service.getConsultaLaboratorioNombresint(filtro);
	
	if(response!=null)
	{
		return new ResponseEntity<List<ConsultaLaboratorioNombre>>(response,HttpStatus.OK);
	}else {
		return new ResponseEntity<List<ConsultaLaboratorioNombre>>(response,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	}
}
