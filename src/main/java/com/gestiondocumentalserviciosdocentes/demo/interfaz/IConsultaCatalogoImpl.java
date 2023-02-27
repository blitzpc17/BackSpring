package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.Conexion;
import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseConecctionFactory;
import com.gestiondocumentalserviciosdocentes.demo.modelo.ConsultaCatalogo;

public class IConsultaCatalogoImpl extends BaseConecctionFactory implements IConsultaCatalogo {

	@Override
	public List<ConsultaCatalogo> getConsultaCatalogos(int dep) {
		List<ConsultaCatalogo> respuesta;
		ConsultaCatalogo item;
		
		try {
			String sql="select c.id_Curso,"
					+ "c.id_Departamento,"
					+ "c.id_Usuarios,"
					+ "c.curso_Nombre,"
					+ "c.curso_Tipo,"
					+ "c.curso_Cupo,"
					+ "c.curso_Horas,"
					+ "c.curso_Estado,"
					+ "c.curso_Visualizacion,"
					+ "c.curso_pdf_Temario,"
					+ "u.user_Nombre "
					+ "from catalogo_cursos c join usuarios u "
					+ "on c.id_Usuarios=u.id_Usuarios "
					+ "where c.id_Departamento="+dep+" order by curso_Tipo,user_Nombre,curso_Nombre;" ;
			
			respuesta=new ArrayList<>();
			
			con=Conexion.getConexion();
			stmt=con.createStatement();
			rset=stmt.executeQuery(sql);
			
			while (rset.next()) {
				item=new ConsultaCatalogo();
				item.setId_Curso(rset.getInt("id_Curso"));
				item.setId_Departamento(rset.getInt("id_Departamento"));
				item.setId_Usuarios(rset.getInt("id_Usuarios"));
				item.setCurso_Nombre(rset.getString("curso_Nombre"));
				item.setCurso_Tipo(rset.getString("curso_Tipo"));
				item.setCurso_Cupo(rset.getInt("curso_Cupo"));
				item.setCurso_Horas(rset.getInt("curso_Horas"));
				item.setCurso_Estado(rset.getBoolean("curso_Estado"));
				item.setCurso_Visualizacion(rset.getInt("curso_Visualizacion"));
				item.setCurso_pdf_Temario(rset.getString("curso_pdf_Temario"));
				item.setUser_Nombre(rset.getString("user_Nombre"));
				
				respuesta.add(item);
			}
			
			System.out.println(sql);
			
			return respuesta;

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				
				rset.close();
				stmt.close();
				con.close();
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return null;
	}

}
