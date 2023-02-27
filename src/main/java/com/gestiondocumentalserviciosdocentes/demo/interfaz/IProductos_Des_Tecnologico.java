package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseRepository;
import com.gestiondocumentalserviciosdocentes.demo.modelo.Productos_Des_Tecnologico;

public interface IProductos_Des_Tecnologico extends BaseRepository<Productos_Des_Tecnologico, Integer> {

	@Query(value = "select \r\n"
			+ "id_productos_desa_tec,\r\n"
			+ "dp.id_docper,\r\n"
			+ "prodestec_nombre_producto,\r\n"
			+ "prodestec_procedencia,\r\n"
			+ "prodestec_estado,\r\n"
			+ "prodestec_pdf_producto,\r\n"
			+ "prodestec_comentario,\r\n"
			+ "prodestec_retroalimentacion, pdt.notify\r\n"
			+ "from productos_des_tecnologico pdt \r\n"
			+ "join docentes_periodo dp on dp.id_docper = pdt.id_docper\r\n"
			+ "where dp.id_docper = :id_docper or (pdt.prodestec_estado = 0 and dp.id_usuarios = :id_usuario)", nativeQuery = true)
	List<Productos_Des_Tecnologico> buscarProductos_Des_Tec(@Param("id_docper") int id_docper, @Param("id_usuario") int id_usuario);
	
}
