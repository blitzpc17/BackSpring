package com.gestiondocumentalserviciosdocentes.demo.implServicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.IMaterialJefaturaService;
import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseRepository;
import com.gestiondocumentalserviciosdocentes.demo.genericos.GenericServiceImplm;
import com.gestiondocumentalserviciosdocentes.demo.interfaz.IMaterialJefatura;
import com.gestiondocumentalserviciosdocentes.demo.modelo.MaterialJefatura;

@Service
public class IMaterialJefaturaServiceImpl extends GenericServiceImplm<MaterialJefatura, Integer> implements IMaterialJefaturaService {

	@Autowired
	private IMaterialJefatura iMaterialJefatura;
	
	@Override
	public BaseRepository<MaterialJefatura, Integer> getBaseRepository() {
		// TODO Auto-generated method stub
		return iMaterialJefatura;
	}

	@Override
	public List<MaterialJefatura> materialxdep(int id_dep) {
		// TODO Auto-generated method stub
		return iMaterialJefatura.materialxdep(id_dep);
	}

}
