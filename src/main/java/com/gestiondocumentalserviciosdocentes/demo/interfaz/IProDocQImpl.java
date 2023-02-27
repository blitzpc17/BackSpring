package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.Conexion;
import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseConecctionFactory;
import com.gestiondocumentalserviciosdocentes.demo.modelo.ProDocQ;

public class IProDocQImpl extends BaseConecctionFactory implements IProDocQ{

	@Override
	public List<ProDocQ> getDocencia(String Filtro, int idPer) {
		List<ProDocQ> respuesta;
		ProDocQ item;
		
		try {
			String sql="select distinct p.id_DocPer id_producto_doc, u.USER_Nombre nombre_producto_doc, \r\n"
					+ "(select count(*) from productos_docencia where PRODOC_Estado = 1 and PRODOC_Nombre_Producto = 'Residencia' and id_DocPer=p.id_DocPer) as comp_residencia,\r\n"
					+ "(select count(*) from productos_docencia where PRODOC_Estado = 0 and PRODOC_Nombre_Producto = 'Residencia' and id_DocPer=p.id_DocPer) as in_residencia,\r\n"
					+ "(select count(*) from productos_docencia where PRODOC_Estado = 1 and PRODOC_Nombre_Producto = 'Tesis' and id_DocPer=p.id_DocPer) as comp_tesis,\r\n"
					+ "(select count(*) from productos_docencia where PRODOC_Estado = 0 and PRODOC_Nombre_Producto = 'Tesis' and id_DocPer=p.id_DocPer) as in_tesis,\r\n"
					+ "(select count(*) from productos_docencia where PRODOC_Estado = 1 and PRODOC_Nombre_Producto = 'Artículo' and id_DocPer=p.id_DocPer) as comp_articulo,\r\n"
					+ "(select count(*) from productos_docencia where PRODOC_Estado = 0 and PRODOC_Nombre_Producto = 'Artículo' and id_DocPer=p.id_DocPer) as in_articulo,\r\n"
					+ "(select count(*) from productos_docencia where PRODOC_Estado = 1 and PRODOC_Nombre_Producto = 'Prototipo' and id_DocPer=p.id_DocPer) as comp_prototipo,\r\n"
					+ "(select count(*) from productos_docencia where PRODOC_Estado = 0 and PRODOC_Nombre_Producto = 'Prototipo' and id_DocPer=p.id_DocPer) as in_prototipo,\r\n"
					+ "(select count(*) from productos_docencia where PRODOC_Estado = 1 and PRODOC_Nombre_Producto = 'Proyectos de Investigación' and id_DocPer=p.id_DocPer) as comp_investigacion,\r\n"
					+ "(select count(*) from productos_docencia where PRODOC_Estado = 0 and PRODOC_Nombre_Producto = 'Proyectos de Investigación' and id_DocPer=p.id_DocPer) as in_investigacion,\r\n"
					+ "(select count(*) from productos_docencia where PRODOC_Estado = 1 and PRODOC_Nombre_Producto = 'Otro' and id_DocPer=p.id_DocPer) as comp_otro,\r\n"
					+ "(select count(*) from productos_docencia where PRODOC_Estado = 0 and PRODOC_Nombre_Producto = 'Otro' and id_DocPer=p.id_DocPer) as in_otro\r\n"
					+ "from \r\n"
					+ "(select d1.id_DocPer, d1.id_Usuarios, d1.id_periodo from productos_docencia p1 join docentes_periodo d1 on p1.id_DocPer = d1.id_DocPer where id_periodo = " +idPer+ ") p right join ( select * from usuarios where id_Departamento = " +Filtro+ ") u on p.id_Usuarios = u.id_Usuarios group by p.id_DocPer, u.USER_Nombre;" ;
			
			respuesta = new ArrayList<>();
			
			con = Conexion.getConexion();
			stmt = con.createStatement();
			rset = stmt.executeQuery(sql);
			
			while(rset.next()) {
				item = new ProDocQ();
				item.setId_producto_doc(rset.getInt("id_producto_doc"));
				item.setNombre_producto_doc(rset.getString("nombre_producto_doc"));
				item.setComp_residencia(rset.getInt("comp_residencia"));
				item.setIn_residencia(rset.getInt("in_residencia"));
				item.setComp_tesis(rset.getInt("comp_tesis"));
				item.setIn_tesis(rset.getInt("in_tesis"));
				item.setComp_articulo(rset.getInt("comp_articulo"));
				item.setIn_articulo(rset.getInt("in_articulo"));
				item.setComp_prototipo(rset.getInt("comp_prototipo"));
				item.setIn_prototipo(rset.getInt("in_prototipo"));
				item.setComp_investigacion(rset.getInt("comp_investigacion"));
				item.setIn_investigacion(rset.getInt("in_investigacion"));
				item.setComp_otro(rset.getInt("comp_otro"));
				item.setIn_otro(rset.getInt("in_otro"));
				
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
