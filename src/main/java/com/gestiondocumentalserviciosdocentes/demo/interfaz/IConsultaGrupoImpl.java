package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;

import com.gestiondocumentalserviciosdocentes.demo.Conexion;
import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseConecctionFactory;
import com.gestiondocumentalserviciosdocentes.demo.modelo.ConsultaGrupo;

public class IConsultaGrupoImpl extends BaseConecctionFactory implements IConsultaGrupo{

	@Override
	public List<ConsultaGrupo> getConsultaGrupo(int filtro, int filtro2) {
		// TODO Auto-generated method stub
		List<ConsultaGrupo> respuesta;
		ConsultaGrupo item;
		 try {
			 String sql ="select g.id_grupo,m.mat_clave as clavemateria, m.mat_nombre as nombre, g.grp_grupo as grupo,u.user_nombre as docente \r\n"
			 		+ "from materias m, grupos_docentes g ,docentes_periodo d, usuarios u \r\n"
			 		+ "where m.id_materia=g.id_materia and g.id_DocPer=d.id_DocPer and u.id_usuarios=d.id_usuarios and m.id_Departamento="+filtro+" and d.id_docper="+filtro2+"";
			System.out.println(sql);
			 respuesta=new ArrayList<>();
			 
			 con=Conexion.getConexion();
			 stmt=con.createStatement();
			 rset=stmt.executeQuery(sql);
			 
			 while (rset.next()) {
				item=new ConsultaGrupo();
				item.setId_grupo(rset.getInt("id_grupo"));
				item.setClavemateria(rset.getString("clavemateria"));
				item.setNombre(rset.getString("nombre"));
				item.setGrupo(rset.getString("grupo"));
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
