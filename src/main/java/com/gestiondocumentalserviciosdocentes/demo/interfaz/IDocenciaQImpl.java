package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.Conexion;
import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseConecctionFactory;
import com.gestiondocumentalserviciosdocentes.demo.modelo.DocenciaQ;

public class IDocenciaQImpl extends BaseConecctionFactory implements IDocenciaQ{

	@Override
	public List<DocenciaQ> getDocencia(String Filtro) {
		List<DocenciaQ> respuesta;
		DocenciaQ item;
		
		try {
			
			String sql="select distinct \r\n"
                    + "p.id_DocPer id_docper, \r\n"
                    + "p.id_Productos_Docencia id_productos_docencia, \r\n"
                    + "u.USER_Nombre prodoc_nombre_user,\r\n"
                    + "p.PRODOC_Nombre_Producto prodoc_nombre_producto, \r\n"
                    + "p.PRODOC_Procedencia prodoc_procedencia, \r\n"
                    + "p.PRODOC_Estado prodoc_estado, \r\n"
                    + "p.PRODOC_pdf_Producto prodoc_pdf_producto, \r\n"
                    + "p.PRODOC_Comentario prodoc_comentario, \r\n"
                    + "p.PRODOC_Retroalimentacion prodoc_retroalimentacion\r\n"
                    + "from \r\n"
                    + "productos_docencia p join docentes_periodo d join usuarios u on p.id_DocPer = d.id_DocPer where d.id_Usuarios = u.id_Usuarios \r\n"
                    + "and p.id_DocPer = "+Filtro+";";
			
			respuesta = new ArrayList<>();
			
			con = Conexion.getConexion();
			stmt = con.createStatement();
			rset = stmt.executeQuery(sql);
			
			while(rset.next()) {
				item = new DocenciaQ();
				item.setId_docper(rset.getInt("id_docper"));
				item.setId_productos_docencia(rset.getInt("id_productos_docencia"));
				item.setProdoc_nombre_user(rset.getString("prodoc_nombre_user"));
				item.setProdoc_nombre_producto(rset.getString("prodoc_nombre_producto"));
				item.setProdoc_procedencia(rset.getString("prodoc_procedencia"));
				item.setProdoc_estado(rset.getInt("prodoc_estado"));
				item.setProdoc_pdf_producto(rset.getString("prodoc_pdf_producto"));
				item.setProdoc_comentario(rset.getString("prodoc_comentario"));
				item.setProdoc_retroalimentacion(rset.getInt("prodoc_retroalimentacion"));
				
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
