package com.gestiondocumentalserviciosdocentes.demo.controlador;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.IActividadesDocenciaService;
import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.ICNombreDocenteService;
import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.IConsultaDocentesService;
import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.IConsultaEstadoDocenciaService;
import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.IConsultaEstadoGrupoService;
import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.IConsultaGrupoService;
import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.IDocumentosGruposService2;
import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.ISeguimientosAulaService;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.IActividadesDocenciaServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.ICNombreDocenteServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.ICNombreMateriaDocenteServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.IConsultaDocentesServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.IConsultaEstadoDocenciaServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.IConsultaEstadoGrupoServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.IConsultaGrupoServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.IDocumentosGruposServiceImpl2;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.ISeguimientosAulaServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.ActividadesDocencia;
import com.gestiondocumentalserviciosdocentes.demo.modelo.CNombreDocente;
import com.gestiondocumentalserviciosdocentes.demo.modelo.CNombreMateriaDocente;
import com.gestiondocumentalserviciosdocentes.demo.modelo.ConsultaEstadoDocencia;
import com.gestiondocumentalserviciosdocentes.demo.modelo.ConsultaEstadoGrupo;
import com.gestiondocumentalserviciosdocentes.demo.modelo.ConsultaGrupo;
import com.gestiondocumentalserviciosdocentes.demo.modelo.ConsultasDocentes;
import com.gestiondocumentalserviciosdocentes.demo.modelo.DocumentosGrupos2;
import com.gestiondocumentalserviciosdocentes.demo.modelo.SeguimientosAula;

@RestController
@RequestMapping(value = "/api/v1/proyectosdocencia")
@CrossOrigin("*")
public class ProyectosDocenciaController {
	
	@GetMapping(value="depadocentes/{filtro}/{filtro2}")
	public ResponseEntity<List<ConsultasDocentes>> depadocentes(@PathVariable int filtro,@PathVariable int filtro2)
	{
	IConsultaDocentesService service;
	List<ConsultasDocentes> response;
	
	service=new IConsultaDocentesServiceImpl();
	response=service.getConsultasDocentes(filtro, filtro2);
	
	if(response!=null)
	{
		return new ResponseEntity<List<ConsultasDocentes>>(response,HttpStatus.OK);
	}else {
		return new ResponseEntity<List<ConsultasDocentes>>(response,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	}
	
	@GetMapping(value="documentogrupo/{filtro}/{filtro2}")
	public ResponseEntity<List<DocumentosGrupos2>> documentogrupo(@PathVariable int filtro,@PathVariable int filtro2)
	{
	IDocumentosGruposService2 service;
	List<DocumentosGrupos2> response;
	
	service=new IDocumentosGruposServiceImpl2();
	response=service.getDocumentosGrupos(filtro, filtro2);
	
	if(response!=null)
	{
		return new ResponseEntity<List<DocumentosGrupos2>>(response,HttpStatus.OK);
	}else {
		return new ResponseEntity<List<DocumentosGrupos2>>(response,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	}

	@GetMapping(value="seguimientodocente/{filtro}/{filtro2}")
	public ResponseEntity<List<SeguimientosAula>> seguimientodocente(@PathVariable int filtro,@PathVariable int filtro2)
	{
	ISeguimientosAulaService service;
	List<SeguimientosAula> response;
	
	service=new ISeguimientosAulaServiceImpl();
	response=service.getSeguimientosAula(filtro,filtro2);
	
	if(response!=null)
	{
		return new ResponseEntity<List<SeguimientosAula>>(response,HttpStatus.OK);
	}else {
		return new ResponseEntity<List<SeguimientosAula>>(response,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	}
	
	@GetMapping(value="docenteactividad/{filtro}/{filtro2}")
	public ResponseEntity<List<ActividadesDocencia>> docenteactividad(@PathVariable int filtro,@PathVariable int filtro2)
	{
	IActividadesDocenciaService service;
	List<ActividadesDocencia> response;
	
	service=new IActividadesDocenciaServiceImpl();
	response=service.getActividadesDocencia(filtro, filtro2);
	
	if(response!=null)
	{
		return new ResponseEntity<List<ActividadesDocencia>>(response,HttpStatus.OK);
	}else {
		return new ResponseEntity<List<ActividadesDocencia>>(response,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	}
	
	@GetMapping(value="gruposdocentes/{filtro}/{filtro2}")
	public ResponseEntity<List<ConsultaGrupo>> gruposdocentes(@PathVariable int filtro,@PathVariable int filtro2)
	{
	IConsultaGrupoService service;
	List<ConsultaGrupo> response;
	
	service=new IConsultaGrupoServiceImpl();
	response=service.getConsultaGrupo(filtro, filtro2);
	
	if(response!=null)
	{
		return new ResponseEntity<List<ConsultaGrupo>>(response,HttpStatus.OK);
	}else {
		return new ResponseEntity<List<ConsultaGrupo>>(response,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	}
	
	@GetMapping(value="estadodocencia/{filtro}/{filtro2}")
	public ResponseEntity<List<ConsultaEstadoDocencia>> estadodocencia(@PathVariable int filtro,@PathVariable int filtro2)
	{
		
	IConsultaEstadoDocenciaService service;
	List<ConsultaEstadoDocencia> response;
	
	service=new IConsultaEstadoDocenciaServiceImpl();
	response=service.getConsultaEstadoDocencias(filtro, filtro2);
	
	if(response!=null)
	{
		return new ResponseEntity<List<ConsultaEstadoDocencia>>(response,HttpStatus.OK);
	}else {
		return new ResponseEntity<List<ConsultaEstadoDocencia>>(response,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	}
	
	@GetMapping(value="estadogrupo/{filtro}/{filtro2}")
	public ResponseEntity<List<ConsultaEstadoGrupo>> estadogrupo(@PathVariable int filtro,@PathVariable int filtro2)
	{
	IConsultaEstadoGrupoService service;
	List<ConsultaEstadoGrupo> response;
	
	service=new IConsultaEstadoGrupoServiceImpl();
	response=service.getConsultaEstadoGrupos(filtro, filtro2);
	
	if(response!=null)
	{
		return new ResponseEntity<List<ConsultaEstadoGrupo>>(response,HttpStatus.OK);
	}else {
		return new ResponseEntity<List<ConsultaEstadoGrupo>>(response,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	}
	
	@GetMapping(value="cnombremateriadocente/{filtro}/{filtro2}/{filtro3}")
	public ResponseEntity<List<CNombreMateriaDocente>> cnombremateriadocente(@PathVariable int filtro,@PathVariable int filtro2,@PathVariable int filtro3)
	{
	ICNombreMateriaDocenteServiceImpl service;
	List<CNombreMateriaDocente> response;
	
	service=new ICNombreMateriaDocenteServiceImpl ();
	response=service.getCNombreMateriaDocentes(filtro, filtro2,filtro3);
	
	if(response!=null)
	{
		return new ResponseEntity<List<CNombreMateriaDocente>>(response,HttpStatus.OK);
	}else {
		return new ResponseEntity<List<CNombreMateriaDocente>>(response,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	}
	
	@GetMapping(value="cnombredocente/{filtro}")
	public ResponseEntity<List<CNombreDocente>> cnombredocente(@PathVariable int filtro)
	{
	ICNombreDocenteService service;
	List<CNombreDocente> response;
	
	service=new ICNombreDocenteServiceImpl();
	response=service.getCNombreDocentes(filtro);
	
	if(response!=null)
	{
		return new ResponseEntity<List<CNombreDocente>>(response,HttpStatus.OK);
	}else {
		return new ResponseEntity<List<CNombreDocente>>(response,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	}
}
