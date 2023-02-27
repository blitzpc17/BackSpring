package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.Conexion;
import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseConecctionFactory;
import com.gestiondocumentalserviciosdocentes.demo.modelo.TecnologicosUs;

public class ITecnologicosUsImpl extends BaseConecctionFactory implements ITecnologicosUs{

	@Override
	public List<TecnologicosUs> getTecnologicos(String Filtro) {
		List<TecnologicosUs> respuesta;
		TecnologicosUs item;
		
		try {
			String sql ="select distinct \r\n"
					+ "p.id_DocPer id_docper, \r\n"
					+ "p.id_Productos_Desa_Tec id_productos_tecnologico, \r\n"
					+ "u.USER_Nombre prodestec_nombre_user,\r\n"
					+ "p.PRODESTEC_Nombre_Producto prodestec_nombre_producto, \r\n"
					+ "p.PRODESTEC_Procedencia prodestec_procedencia, \r\n"
					+ "p.PRODESTEC_Estado prodestec_estado, \r\n"
					+ "p.PRODESTEC_pdf_Producto prodestec_pdf_producto, \r\n"
					+ "p.PRODESTEC_Comentario prodestec_comentario, \r\n"
					+ "p.PRODESTEC_Retroalimentacion prodestec_retroalimentacion\r\n"
					+ "from productos_des_tecnologico p join docentes_periodo d join usuarios u on p.id_DocPer = d.id_DocPer \r\n"
					+ "where d.id_Usuarios = u.id_Usuarios and p.id_DocPer = "+Filtro+";";
			

			respuesta = new ArrayList<>();
			
			con = Conexion.getConexion();
			stmt = con.createStatement();
			rset = stmt.executeQuery(sql);
			
			while(rset.next()) {
				item = new TecnologicosUs();
				item.setId_docper(rset.getInt("id_docper"));
				item.setId_productos_tecnologico(rset.getInt("id_productos_tecnologico"));
				item.setProdestec_nombre_user(rset.getString("prodestec_nombre_user"));
				item.setProdestec_nombre_producto(rset.getString("prodestec_nombre_producto"));
				item.setProdestec_procedencia(rset.getString("prodestec_procedencia"));
				item.setProdestec_estado(rset.getInt("prodestec_estado"));
				item.setProdestec_pdf_producto(rset.getString("prodestec_pdf_producto"));
				item.setProdestec_comentario(rset.getString("prodestec_comentario"));
				item.setProdestec_retroalimentacion(rset.getInt("prodestec_retroalimentacion"));
				
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
