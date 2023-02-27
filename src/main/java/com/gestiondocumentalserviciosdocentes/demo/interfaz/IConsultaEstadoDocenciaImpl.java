package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.Conexion;
import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseConecctionFactory;
import com.gestiondocumentalserviciosdocentes.demo.modelo.ConsultaEstadoDocencia;
import com.gestiondocumentalserviciosdocentes.demo.modelo.ConsultasDocentes;

public class IConsultaEstadoDocenciaImpl extends BaseConecctionFactory implements IConsultaEstadoDocencia {

	@Override
	public List<ConsultaEstadoDocencia> getConsultaEstadoDocencias(int filtro, int filtro2) {
		List<ConsultaEstadoDocencia> respuesta;
		ConsultaEstadoDocencia item;
		 try {
			 String sql ="select d.id_docper,u.id_usuarios,u.user_nombre AS nombredocente ,d.id_periodo ,s.actdoc_estadocomentario\r\n"
			 		+ "from usuarios u ,rolesusuario r,docentes_periodo d,seleccion_apoyodocencia s\r\n"
			 		+ "where u.id_usuarios=r.id_usuarios  and u.id_usuarios=d.id_usuarios and s.id_docper=d.id_docper \r\n"
			 		+ " and u.id_Departamento="+filtro+"  and rol_docente=1 and d.id_periodo="+filtro2+"";
			System.out.println(sql);
			 respuesta=new ArrayList<>();
			 
			 con=Conexion.getConexion();
			 stmt=con.createStatement();
			 rset=stmt.executeQuery(sql);
			 
			 while (rset.next()) {
				item=new ConsultaEstadoDocencia();
				item.setId_docper(rset.getInt("id_docper"));
				item.setId_usuarios(rset.getInt("id_usuarios"));
				item.setNombredocente(rset.getString("nombredocente"));
				item.setId_periodo(rset.getInt("id_periodo"));				
				item.setActdoc_estadocomentario(rset.getInt("actdoc_estadocomentario"));
				
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
