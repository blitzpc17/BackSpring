package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.QRolesService;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IQRoles;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IQRolesImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.QRoles;

public class QRolesServiceImpl implements QRolesService{

	@Override
	public List<QRoles> getRolesQ() {
		IQRoles daoRoles;
		List<QRoles> respuestaRoles = new ArrayList<QRoles>();
		try {
			daoRoles = new IQRolesImpl();
			respuestaRoles = daoRoles.getRoles();
			System.out.println("Consulta exitosa");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return respuestaRoles;
	}

}
