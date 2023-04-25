package com.gestiondocumentalserviciosdocentes.demo.controlador;

import java.util.Date;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseControllerImpl;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.RecursoProgramadoServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.FileResponse;
import com.gestiondocumentalserviciosdocentes.demo.modelo.RecursoProgramado;


@RestController
@RequestMapping("api/v1/rp")
@CrossOrigin("*")
public class RecursoProgramadoController extends BaseControllerImpl<RecursoProgramado, RecursoProgramadoServiceImpl>{
	
	@PostMapping(value="/guardar")
	public FileResponse  InsertarRecursoProgramado(@RequestParam(required=true, name="DepartamentoId") int DepartamentoId,
			@RequestParam(required=true, name="PeriodoId") int PeriodoId, @RequestParam(required=true, name="CapDos") double CapDos,
			@RequestParam(required=false, name="CapDosEvidencia") MultipartFile CapDosEvidencia, @RequestParam(required=false, name="CapDosP") double CapDosP, 
			@RequestParam(required=true, name="CapTres") double CapTres,
			@RequestParam(required=false, name="CapTresEvidencia") MultipartFile CapTresEvidencia, @RequestParam(required=false, name="CapTresP") double CapTresP,
			@RequestParam(required=true, name="CapCuatro") double CapCuatro,
			@RequestParam(required=false, name="CapCuatroEvidencia") MultipartFile CapCuatroEvidencia, @RequestParam(required=false, name="CapCuatroP") double CapCuatroP,
			@RequestParam(required=true, name="CapCinco") double CapCinco,
			@RequestParam(required=false, name="CapCincoEvidencia") MultipartFile CapCincoEvidencia, @RequestParam(required=false, name="CapCincoP") double CapCincoP, 
			@RequestParam(required=true, name="Otros") double Otros,
			@RequestParam(required=false, name="OtrosEvidencia") MultipartFile OtrosEvidencia, @RequestParam(required=false, name="OtrosP") double OtrosP,
			@RequestParam(required=true, name="Total") double Total,
			@RequestParam(required=false, name="TotalEvidencia") MultipartFile TotalEvidencia, @RequestParam(required=false, name="TotalP") double TotalP
			) {
		
		FileResponse res = new FileResponse();
		RecursoProgramado obj = new RecursoProgramado();
		
		obj.setId_departamento(DepartamentoId);
		obj.setId_periodo(PeriodoId);
		obj.setCap_dos(CapDos);
		obj.setCap_dos_p(CapDosP);
		obj.setCap_dos_ev("evidencia2.pdf");
		obj.setCap_tres(CapTres);
		obj.setCap_tres_p(CapTresP);
		obj.setCap_tres_ev("evidencia3.pdf");
		obj.setCap_cuatro(CapCuatro);
		obj.setCap_cuatro_p(CapCuatroP);
		obj.setCap_cuatro_ev("evidencia4.pdf");
		obj.setCap_cinco(CapCinco);
		obj.setCap_cinco_p(CapCincoP);
		obj.setCap_cinco_ev("evidencia5.pdf");
		obj.setOtros(Otros);
		obj.setOtros_p(OtrosP);
		obj.setOtros_ev("evidencia6.pdf");
		obj.setTotal(TotalP);
		obj.setTotal_p(TotalP);
		obj.setTotal_ev("total.pdf");
		
		service.save(obj);
		
		
		
		res.setStatus(200);
		res.setMessage("Registro guardado correctamente.");
		res.setTimestamp(new Date().toString());
	
		return res;
	}

}
