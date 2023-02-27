package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseRepository;
import com.gestiondocumentalserviciosdocentes.demo.modelo.Productos_Docencia;

public interface IProductos_Docencia extends BaseRepository<Productos_Docencia, Integer> {

	@Query(value = "select \r\n"
			+ "id_productos_docencia,\r\n"
			+ "dp.id_docper,\r\n"
			+ "prodoc_nombre_producto,\r\n"
			+ "prodoc_procedencia,\r\n"
			+ "prodoc_estado,\r\n"
			+ "prodoc_pdf_producto,\r\n"
			+ "prodoc_comentario,\r\n"
			+ "prodoc_retroalimentacion,\r\n"
			+ "pd.notify\r\n"
			+ "from productos_docencia pd\r\n"
			+ "join docentes_periodo dp on dp.id_docper = pd.id_docper\r\n"
			+ "where dp.id_docper = :id_docper or (pd.prodoc_estado = 0 and dp.id_usuarios = :id_usuario)", nativeQuery = true)
	List<Productos_Docencia> buscarProductos_Docencia(@Param("id_docper") int id_docper, @Param("id_usuario") int id_usuario);
	
}
