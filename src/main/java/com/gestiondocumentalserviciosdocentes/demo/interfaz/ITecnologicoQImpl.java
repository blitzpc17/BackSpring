package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.Conexion;
import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseConecctionFactory;
import com.gestiondocumentalserviciosdocentes.demo.modelo.TecnologicoQ;

public class ITecnologicoQImpl extends BaseConecctionFactory implements ITecnologicoQ{

	@Override
	public List<TecnologicoQ> getTecnologico(String Filtro, int idPer) {
		List<TecnologicoQ> respuesta;
		TecnologicoQ item;
		
		try {
			String sql="select p.id_DocPer id_producto_doc, u.USER_Nombre nombre_producto_doc, \r\n"
					+ "(select count(*) from productos_des_tecnologico where PRODESTEC_Estado = 1 and PRODESTEC_Nombre_Producto = 'Residencia' and id_DocPer=p.id_DocPer) as comp_residencia,\r\n"
					+ "(select count(*) from productos_des_tecnologico where PRODESTEC_Estado = 0 and PRODESTEC_Nombre_Producto = 'Residencia' and id_DocPer=p.id_DocPer) as in_residencia,\r\n"
					+ "(select count(*) from productos_des_tecnologico where PRODESTEC_Estado = 1 and PRODESTEC_Nombre_Producto = 'Tesis' and id_DocPer=p.id_DocPer) as comp_tesis,\r\n"
					+ "(select count(*) from productos_des_tecnologico where PRODESTEC_Estado = 0 and PRODESTEC_Nombre_Producto = 'Tesis' and id_DocPer=p.id_DocPer) as in_tesis,\r\n"
					+ "(select count(*) from productos_des_tecnologico where PRODESTEC_Estado = 1 and PRODESTEC_Nombre_Producto = 'Artículo' and id_DocPer=p.id_DocPer) as comp_articulo,\r\n"
					+ "(select count(*) from productos_des_tecnologico where PRODESTEC_Estado = 0 and PRODESTEC_Nombre_Producto = 'Artículo' and id_DocPer=p.id_DocPer) as in_articulo,\r\n"
					+ "(select count(*) from productos_des_tecnologico where PRODESTEC_Estado = 1 and PRODESTEC_Nombre_Producto = 'Proyectos de Investigación' and id_DocPer=p.id_DocPer) as comp_investigacion,\r\n"
					+ "(select count(*) from productos_des_tecnologico where PRODESTEC_Estado = 0 and PRODESTEC_Nombre_Producto = 'Proyectos de Investigación' and id_DocPer=p.id_DocPer) as in_investigacion,\r\n"
					+ "(select count(*) from productos_des_tecnologico where PRODESTEC_Estado = 1 and PRODESTEC_Nombre_Producto = 'Programa de Cómputo' and id_DocPer=p.id_DocPer) as comp_computo,\r\n"
					+ "(select count(*) from productos_des_tecnologico where PRODESTEC_Estado = 0 and PRODESTEC_Nombre_Producto = 'Programa de Cómputo' and id_DocPer=p.id_DocPer) as in_computo\r\n"
					+ "from \r\n"
					+ "(select d1.id_DocPer, d1.id_Usuarios, d1.id_periodo from productos_des_tecnologico p1 join docentes_periodo d1 on p1.id_DocPer = d1.id_DocPer where id_periodo = " +idPer+ ") p right join ( select * from usuarios where id_Departamento = " +Filtro+ ") u on p.id_Usuarios = u.id_Usuarios group by p.id_DocPer, u.USER_Nombre;";
			

			respuesta = new ArrayList<>();
			
			con = Conexion.getConexion();
			stmt = con.createStatement();
			rset = stmt.executeQuery(sql);
			
			while(rset.next()) {
				item = new TecnologicoQ();
				
				item.setId_producto_doc(rset.getInt("id_producto_doc"));
				item.setNombre_producto_doc(rset.getString("nombre_producto_doc"));
				item.setComp_residencia(rset.getInt("comp_residencia"));
				item.setIn_residencia(rset.getInt("in_residencia"));
				item.setComp_tesis(rset.getInt("comp_tesis"));
				item.setIn_tesis(rset.getInt("in_tesis"));
				item.setComp_articulo(rset.getInt("comp_articulo"));
				item.setIn_articulo(rset.getInt("in_articulo"));
				item.setComp_investigacion(rset.getInt("comp_investigacion"));
				item.setIn_investigacion(rset.getInt("in_investigacion"));
				item.setComp_computo(rset.getInt("comp_computo"));
				item.setIn_computo(rset.getInt("in_computo"));
				
				respuesta.add(item);
			}
			
			return respuesta;
		}catch(Exception e) {
			e.printStackTrace();			
		}finally {
			try {
				rset.close();
				stmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		// TODO Auto-generated method stub
		return null;
	}

}
