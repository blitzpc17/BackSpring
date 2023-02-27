package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.ConvocatoriasQService;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IConvocatoriasQ;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IConvocatoriasQImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.ConvocatoriasQ;

public class ConvocatoriasQServiceImpl implements ConvocatoriasQService{

	@Override
	public List<ConvocatoriasQ> getConvocatoriasQ(String Filtro, String Per) {
		IConvocatoriasQ daoConvocatorias;
		List<ConvocatoriasQ> respuestaConvo = new ArrayList<ConvocatoriasQ>();
		try {
			daoConvocatorias = new IConvocatoriasQImpl();
			respuestaConvo = daoConvocatorias.getConvocatorias(Filtro, Per);
			System.out.println("Consulta exitosa");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return respuestaConvo;
	}

}
