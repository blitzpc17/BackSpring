package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.Conexion;
import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseConecctionFactory;
import com.gestiondocumentalserviciosdocentes.demo.modelo.CNombreDocente;

public class ICNombreDocenteImpl extends BaseConecctionFactory implements ICNombreDocente{

	@Override
	public List<CNombreDocente> getCNombreDocentes(int filtro) {
		List<CNombreDocente> respuesta;
		CNombreDocente item;
		 try {
			 String sql ="select d.id_docper,u.id_usuarios,u.user_nombre AS docente ,d.id_periodo\r\n"
			 		+ "from usuarios u ,docentes_periodo d\r\n"
			 		+ "where   u.id_usuarios=d.id_usuarios and d.id_docper="+filtro+"";
			System.out.println(sql);
			 respuesta=new ArrayList<>();
			 
			 con=Conexion.getConexion();
			 stmt=con.createStatement();
			 rset=stmt.executeQuery(sql);
			 
			 while (rset.next()) {
				item=new CNombreDocente();				
				item.setId_docper(rset.getInt("id_docper"));	
				item.setId_usuarios(rset.getInt("id_usuarios"));				
				item.setDocente(rset.getString("docente"));
				item.setId_periodo(rset.getInt("id_periodo"));							
				
				
				respuesta.add(item);
			}
			 return respuesta;
			 
		 }catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				rset.close();
				stmt.close();
				con.close();
			} catch ( SQLException e) {
				e.printStackTrace(); 
			}
		}
		return null;
	}

}
