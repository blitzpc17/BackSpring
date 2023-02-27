package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;

import com.gestiondocumentalserviciosdocentes.demo.Conexion;
import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseConecctionFactory;
import com.gestiondocumentalserviciosdocentes.demo.modelo.ActividadesDocencia;


public class IActividadesDocenciaImpl extends BaseConecctionFactory implements IActividadesDocencia{

	@Override
	public List<ActividadesDocencia> getActividadesDocencia(int filtro, int filtro2) {
		List<ActividadesDocencia> respuesta;
		ActividadesDocencia item;
		 try {
			 String sql ="select s.id_actividaddocenteperiodo,s.id_docper,s.id_actividades_docencia,a.actdoc_nombre_actividad as nombreactividad, s.actdoc_estadocomentario ,ifnull(s.actdoc_comentario,\"\")actdoc_comentario,\r\n"
			 		+ " s.actdoc_pdf_actividad,u.user_nombre as docente \r\n"
			 		+ " from act_apoyo_docencia a, seleccion_apoyodocencia s , docentes_periodo d,usuarios u\r\n"
			 		+ " where a.id_Actividades_Docencia=s.id_Actividades_Docencia and s.id_docper=d.id_docper and u.id_usuarios=d.id_usuarios \r\n"
			 		+ "  and a.id_Departamento="+filtro+" and s.id_docper="+filtro2+"";
			System.out.println(sql);
			 respuesta=new ArrayList<>();
			 
			 con=Conexion.getConexion();
			 stmt=con.createStatement();
			 rset=stmt.executeQuery(sql);
			 
			 while (rset.next()) {
				item=new ActividadesDocencia();
				item.setId_actividaddocenteperiodo(rset.getInt("id_actividaddocenteperiodo"));
				item.setId_docper(rset.getInt("id_docper"));	
				item.setId_actividades_docencia(rset.getInt("id_actividades_docencia"));				
				item.setNombreactividad(rset.getString("nombreactividad"));
				item.setActdoc_estadocomentario(rset.getInt("actdoc_estadocomentario"));							
				item.setActdoc_comentario(rset.getString("actdoc_comentario"));
				item.setActdoc_pdf_actividad(rset.getString("actdoc_pdf_actividad"));
				item.setDocente(rset.getString("docente"));
				
				
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
