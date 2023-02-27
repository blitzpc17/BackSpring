package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.Conexion;
import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseConecctionFactory;
import com.gestiondocumentalserviciosdocentes.demo.modelo.DatosCurso;

public class IDatosCursoImpl extends BaseConecctionFactory implements IDatosCurso{

	@Override
	public List<DatosCurso> getCurso(String Filtro) {
		List<DatosCurso> respuesta;
		DatosCurso item;
		
		try {
			String sql="select \r\n"
					+ "u.USER_Nombre usuario, \r\n"
					+ "c.CURSO_Nombre curso, \r\n"
					+ "c.CURSO_Tipo tipo, \r\n"
					+ "c.CURSO_Cupo cupo, \r\n"
					+ "c.CURSO_Horas  horas,  \r\n"
					+ "c.CURSO_pdf_Temario temario\r\n"
					+ "from catalogo_cursos c, usuarios u where c.id_Usuarios = u.id_Usuarios and c.id_Curso = "+Filtro+";";
			
			respuesta = new ArrayList<>();
			
			con = Conexion.getConexion();
			stmt = con.createStatement();
			rset = stmt.executeQuery(sql);
			
			while(rset.next()) {
				item = new DatosCurso();
				item.setUsuario(rset.getString("usuario"));
				item.setCurso(rset.getString("curso"));
				item.setTipo(rset.getString("tipo"));
				item.setCupo(rset.getInt("cupo"));
				item.setHoras(rset.getInt("horas"));
				item.setTemario(rset.getString("temario"));
				
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
