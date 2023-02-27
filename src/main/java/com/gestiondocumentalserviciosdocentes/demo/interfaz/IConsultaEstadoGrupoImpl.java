package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.Conexion;
import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseConecctionFactory;
import com.gestiondocumentalserviciosdocentes.demo.modelo.ConsultaEstadoGrupo;
import com.gestiondocumentalserviciosdocentes.demo.modelo.OcupacionAuxiliar;

public class IConsultaEstadoGrupoImpl extends BaseConecctionFactory implements IConsultaEstadoGrupo{

	@Override
	public List<ConsultaEstadoGrupo> getConsultaEstadoGrupos(int filtro, int filtro2) {
		// TODO Auto-generated method stub
		List<ConsultaEstadoGrupo> respuesta;
		ConsultaEstadoGrupo item;
		 try {
			 String sql ="  select d.id_docper,u.id_usuarios,u.user_nombre AS nombredocente ,d.id_periodo ,g.DOCGRP_EstadoComentario\r\n"
			 		+ "from usuarios u ,rolesusuario r,docentes_periodo d,documentos_grupos g,grupos_docentes gd\r\n"
			 		+ "where u.id_usuarios=r.id_usuarios  and u.id_usuarios=d.id_usuarios and gd.id_docper=d.id_docper  and g.id_grupo=gd.id_grupo \r\n"
			 		+ " and u.id_Departamento="+filtro+"  and rol_docente=1 and d.id_periodo="+filtro2+"";
			System.out.println(sql);
			 respuesta=new ArrayList<>();
			 
			 con=Conexion.getConexion();
			 stmt=con.createStatement();
			 rset=stmt.executeQuery(sql);
			 
			 while (rset.next()) {
				item=new ConsultaEstadoGrupo();
				item.setId_docper(rset.getInt("id_docper"));
				item.setId_usuarios(rset.getInt("id_usuarios"));
				item.setNombredocente(rset.getString("nombredocente"));
				item.setId_periodo(rset.getInt("id_periodo"));				
				item.setDocgrp_estadocomentario(rset.getInt("docgrp_estadocomentario"));				
				
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
