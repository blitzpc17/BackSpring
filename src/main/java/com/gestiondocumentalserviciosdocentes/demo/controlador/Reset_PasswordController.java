package com.gestiondocumentalserviciosdocentes.demo.controlador;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseControllerImpl;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.IReset_PasswordServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.Reset_Password;

@RestController
@RequestMapping("api/v1/resetpass")
@CrossOrigin("*")
public class Reset_PasswordController extends BaseControllerImpl<Reset_Password, IReset_PasswordServiceImpl> {

}
