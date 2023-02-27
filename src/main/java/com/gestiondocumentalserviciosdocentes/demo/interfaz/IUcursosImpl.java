package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.Conexion;
import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseConecctionFactory;
import com.gestiondocumentalserviciosdocentes.demo.modelo.Ucursos;

public class IUcursosImpl extends BaseConecctionFactory implements IUcursos{

	@Override
	public List<Ucursos> grtCursos(String Filtro) {
		List<Ucursos> respuesta;
		Ucursos item;
		try {
			String sql="select c.id_Curso id_Curso, c.id_Departamento id_Departamento, c.id_Usuarios id_Usuarios, u.USER_Nombre curso_nombre_usuario, c.CURSO_Nombre curso_Nombre, 	c.CURSO_Tipo curso_Tipo, c.CURSO_Cupo curso_Cupo, c.CURSO_Horas curso_Horas, c.CURSO_Estado curso_Estado, c.CURSO_Visualizacion curso_Visualizacion, c.CURSO_pdf_Temario curso_pdf_Temario,	c.CURSO_fecha_creacion curso_fecha_creacion	 from catalogo_cursos c, usuarios u where u.id_Usuarios = c.id_Usuarios and c.id_Departamento= "+Filtro+" order by c.id_Curso;";
			respuesta = new ArrayList<>();
			
			con = Conexion.getConexion();
			stmt = con.createStatement();
			rset = stmt.executeQuery(sql);
			
			while(rset.next()) {
				item = new Ucursos();
				item.setId_Curso(rset.getInt("id_Curso"));
				item.setId_Departamento(rset.getInt("id_Departamento"));
				item.setId_Usuarios(rset.getInt("id_Usuarios"));
				item.setCurso_nombre_usuario(rset.getString("curso_nombre_usuario"));
				item.setCurso_Nombre(rset.getString("curso_Nombre"));
				item.setCurso_Tipo(rset.getString("curso_Tipo"));
				item.setCurso_Cupo(rset.getInt("curso_Cupo"));	
				item.setCurso_Horas(rset.getInt("curso_Horas"));
				item.setCurso_Estado(rset.getInt("curso_Estado"));
				item.setCurso_Visualizacion(rset.getInt("curso_visualizacion"));
				item.setCurso_pdf_Temario(rset.getString("curso_pdf_Temario"));
				item.setCurso_fecha_creacion(rset.getDate("curso_fecha_creacion"));
				
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
		return null;
	}

}
