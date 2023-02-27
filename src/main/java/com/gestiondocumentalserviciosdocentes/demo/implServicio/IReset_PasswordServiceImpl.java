package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.IReset_PasswordService;
import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseRepository;
import com.gestiondocumentalserviciosdocentes.demo.genericos.GenericServiceImplm;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IReset_Password;
import com.gestiondocumentalserviciosdocentes.demo.modelo.Reset_Password;

@Service
public class IReset_PasswordServiceImpl extends GenericServiceImplm<Reset_Password, Integer> implements IReset_PasswordService {

	@Autowired
	private IReset_Password iReset_Password;
	
	@Override
	public BaseRepository<Reset_Password, Integer> getBaseRepository() {
		// TODO Auto-generated method stub
		return iReset_Password;
	}

}
