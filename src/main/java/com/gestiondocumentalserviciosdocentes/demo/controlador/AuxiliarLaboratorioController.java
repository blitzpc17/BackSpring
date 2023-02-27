package com.gestiondocumentalserviciosdocentes.demo.controlador;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.IAuxiliarUsuariosService;
import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.IConsultaOcupacionService;
import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.ICubiculoAuxiliarService;
import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.IDocenteCubiculoService;
import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.IEstadisticoAuxiliarService;
import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.IGestionAuxiliarService;
import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.IOcupacionAuxiliarService;
import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.IValidarPracticaService;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.IAuxiliarUsuariosServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.IConsultaOcupacionServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.ICubiculoAuxiliarServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.IDocenteCubiculoServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.IEstadisticoAuxiliarServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.IGestionAuxiliarServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.IOcupacionAuxiliarServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.IValidarPracticaServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.AuxiliarUsuarios;
import com.gestiondocumentalserviciosdocentes.demo.modelo.ConsultaOcupacion;
import com.gestiondocumentalserviciosdocentes.demo.modelo.CubiculoAuxiliar;
import com.gestiondocumentalserviciosdocentes.demo.modelo.DocenteCubiculo;
import com.gestiondocumentalserviciosdocentes.demo.modelo.EstadisticoAuxiliar;
import com.gestiondocumentalserviciosdocentes.demo.modelo.GestionAuxiliar;
import com.gestiondocumentalserviciosdocentes.demo.modelo.OcupacionAuxiliar;
import com.gestiondocumentalserviciosdocentes.demo.modelo.ValidarPractica;

@RestController
@RequestMapping(value = "/api/v1/auxiliarlaboratorio")
@CrossOrigin("*")
public class AuxiliarLaboratorioController {
	
	@GetMapping(value="gestionauxiliar/{filtro}/{filtro2}")
	public ResponseEntity<List<GestionAuxiliar>> gestionauxiliar(@PathVariable int filtro,@PathVariable int filtro2)
	{
	IGestionAuxiliarService service;
	List<GestionAuxiliar> response;
	
	service=new IGestionAuxiliarServiceImpl();
	response=service.getGestionAuxiliar(filtro,filtro2);
	
	if(response!=null)
	{
		return new ResponseEntity<List<GestionAuxiliar>>(response,HttpStatus.OK);
	}else {
		return new ResponseEntity<List<GestionAuxiliar>>(response,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	}
	
	@GetMapping(value="estadisticoauxiliar/{filtro}")
	public ResponseEntity<List<EstadisticoAuxiliar>> estadisticoauxiliar(@PathVariable int filtro)
	{
	IEstadisticoAuxiliarService service;
	List<EstadisticoAuxiliar> response;
	
	service=new IEstadisticoAuxiliarServiceImpl();
	response=service.getEstadisticoAuxiliar(filtro);
	
	if(response!=null)
	{
		return new ResponseEntity<List<EstadisticoAuxiliar>>(response,HttpStatus.OK);
	}else {
		return new ResponseEntity<List<EstadisticoAuxiliar>>(response,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	}
	
	@GetMapping(value="cubiculosauxiliar/{filtro}")
	public ResponseEntity<List<CubiculoAuxiliar>> cubiculosauxiliar(@PathVariable int filtro)
	{
	ICubiculoAuxiliarService service;
	List<CubiculoAuxiliar> response;
	
	service=new ICubiculoAuxiliarServiceImpl();
	response=service.getCubiculoAuxiliar(filtro);
	
	if(response!=null)
	{
		return new ResponseEntity<List<CubiculoAuxiliar>>(response,HttpStatus.OK);
	}else {
		return new ResponseEntity<List<CubiculoAuxiliar>>(response,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	}
	
	@GetMapping(value="auxiliarusuarios/{filtro}")
	public ResponseEntity<List<AuxiliarUsuarios>> auxiliarusuarios(@PathVariable int filtro)
	{
	IAuxiliarUsuariosService service;
	List<AuxiliarUsuarios> response;
	
	service=new IAuxiliarUsuariosServiceImpl();
	response=service.getAuxiliarUsuarios(filtro);
	
	if(response!=null)
	{
		return new ResponseEntity<List<AuxiliarUsuarios>>(response,HttpStatus.OK);
	}else {
		return new ResponseEntity<List<AuxiliarUsuarios>>(response,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	}
	
	@GetMapping(value="ocupacionauxiliar/{filtro}")
	public ResponseEntity<List<OcupacionAuxiliar>> ocupacionauxiliar(@PathVariable int filtro)
	{
	IOcupacionAuxiliarService service;
	List<OcupacionAuxiliar> response;
	
	service=new IOcupacionAuxiliarServiceImpl();
	response=service.getocuOcupacionAuxiliar(filtro);
	
	if(response!=null)
	{
		return new ResponseEntity<List<OcupacionAuxiliar>>(response,HttpStatus.OK);
	}else {
		return new ResponseEntity<List<OcupacionAuxiliar>>(response,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	}
	
	@GetMapping(value="validarpractica/{filtro}/{filtro2}")
	public ResponseEntity<List<ValidarPractica>> validarpractica(@PathVariable int filtro,@PathVariable String filtro2)
	{
	IValidarPracticaService service;
	List<ValidarPractica> response;
	
	service=new IValidarPracticaServiceImpl();
	response=service.getValidarPracticas(filtro,filtro2);
	
	if(response!=null)
	{
		return new ResponseEntity<List<ValidarPractica>>(response,HttpStatus.OK);
	}else {
		return new ResponseEntity<List<ValidarPractica>>(response,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	}
	
	@GetMapping(value="ocupaciones/{filtro}")
	public ResponseEntity<List<ConsultaOcupacion>> ocupaciones(@PathVariable int filtro)
	{
	IConsultaOcupacionService service;
	List<ConsultaOcupacion> response;
	
	service=new IConsultaOcupacionServiceImpl();
	response=service.getOcupaciones(filtro);
	
	if(response!=null)
	{
		return new ResponseEntity<List<ConsultaOcupacion>>(response,HttpStatus.OK);
	}else {
		return new ResponseEntity<List<ConsultaOcupacion>>(response,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	}
	
	@GetMapping(value="docentecubiculo/{filtro}/{filtro2}")
	public ResponseEntity<List<DocenteCubiculo>> docentecubiculo(@PathVariable int filtro,@PathVariable int filtro2)
	{
	IDocenteCubiculoService service;
	List<DocenteCubiculo> response;
	
	service=new IDocenteCubiculoServiceImpl();
	response=service.getDocenteCubiculos(filtro, filtro2);
	
	if(response!=null)
	{
		return new ResponseEntity<List<DocenteCubiculo>>(response,HttpStatus.OK);
	}else {
		return new ResponseEntity<List<DocenteCubiculo>>(response,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	}
}
