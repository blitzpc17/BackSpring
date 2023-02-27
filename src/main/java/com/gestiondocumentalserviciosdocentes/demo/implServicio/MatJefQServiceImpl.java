package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.MatJefQService;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IMatJefQ;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IMatJefQImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.MatJefQ;

public class MatJefQServiceImpl implements MatJefQService{

	@Override
	public List<MatJefQ> getMaterialQ(String Filtro) {
		IMatJefQ daoMaterial;
		List<MatJefQ> respuestaMaterial = new ArrayList<MatJefQ>();
		try {
			
			daoMaterial = new IMatJefQImpl();
			respuestaMaterial = daoMaterial.getMaterial(Filtro);
			System.out.println("Consulta exitosa");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return respuestaMaterial;
	}

}
