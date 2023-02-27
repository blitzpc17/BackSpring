package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.Conexion;
import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseConecctionFactory;
import com.gestiondocumentalserviciosdocentes.demo.modelo.ConsultasDocentes;

public class IConsultaDocentesImpl extends BaseConecctionFactory implements IConsultaDocentes {

	@Override
	public List<ConsultasDocentes> getConsultasDocentes(int filtro, int filtro2) {
		List<ConsultasDocentes> respuesta;
		ConsultasDocentes item;
		 try {
			 String sql ="select d.id_docper,u.id_usuarios,d.id_periodo,d.docper_pdf_horario,d.docper_pdf_liberacionact, d.docper_pdf_reportefinal  ,\r\n"
				 		+ "ifnull(d.docper_estado_reportefinal,0)docper_estado_reportefinal ,ifnull(d.docper_retroalimentacion_reportefinal,\"\")docper_retroalimentacion_reportefinal \r\n"
				 		+ ",u.user_nombre AS nombredocente   \r\n"
				 		+ "from (select * from docentes_periodo where id_Periodo="+filtro2+" ) d right join usuarios u on u.id_usuarios=d.id_usuarios \r\n"
				 		+ "inner join rolesusuario r on u.id_usuarios=r.id_usuarios where  u.id_Departamento="+filtro+" and  r.rol_docente=1";
			System.out.println(sql);
			 respuesta=new ArrayList<>();
			 
			 con=Conexion.getConexion();
			 stmt=con.createStatement();
			 rset=stmt.executeQuery(sql);
			 
			 while (rset.next()) {
				item=new ConsultasDocentes();
				item.setId_docper(rset.getInt("id_docper"));
				item.setId_usuarios(rset.getInt("id_usuarios"));
				item.setId_periodo(rset.getInt("id_periodo"));
				item.setNombredocente(rset.getString("nombredocente"));
				item.setDocper_pdf_horario(rset.getString("docper_pdf_horario"));
				item.setDocper_pdf_liberacionact(rset.getString("docper_pdf_liberacionact"));
				item.setDocper_pdf_reportefinal(rset.getString("docper_pdf_reportefinal"));
				item.setDocper_estado_reportefinal(rset.getInt("docper_estado_reportefinal"));
				item.setDocper_retroalimentacion_reportefinal(rset.getString("docper_retroalimentacion_reportefinal"));
				
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
