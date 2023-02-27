package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.Conexion;
import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseConecctionFactory;
import com.gestiondocumentalserviciosdocentes.demo.modelo.CursoCount;

public class ICursoCountImpl extends BaseConecctionFactory implements ICursoCount {

	@Override
	public List<CursoCount> getCurso(String Filtro) {
		List<CursoCount> respuesta;
		CursoCount item;
		try {
			String sql = "select c.id_Curso id_Curso, c.CURSO_Nombre curso_Nombre_Curso, c.CURSO_Tipo curso_Tipo, c.CURSO_Estado curso_Estado, CURSO_pdf_Temario inst_Temario, c.CURSO_Visualizacion curso_Visualizacion,(select COUNT(*) suma from intancias_cursos i where  i.id_Curso = c.id_Curso) as curso_cantidad_instancia from catalogo_cursos c where c.id_Departamento = "+Filtro+";";
			respuesta = new ArrayList<>();
			con = Conexion.getConexion();
			stmt = con.createStatement();
			rset = stmt.executeQuery(sql);
			while(rset.next()) {
				item = new CursoCount();
				item.setId_Curso(rset.getInt("id_Curso"));
				item.setCurso_Nombre_Curso(rset.getString("curso_Nombre_Curso"));
				item.setCurso_Tipo(rset.getString("curso_Tipo"));
				item.setCurso_Estado(rset.getInt("curso_Estado"));
				item.setInst_Temario(rset.getString("inst_Temario"));
				item.setCurso_Visualizacion(rset.getInt("curso_Visualizacion"));
				item.setCurso_cantidad_instancia(rset.getInt("curso_cantidad_instancia"));				
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
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		// TODO Auto-generated method stub
		return null;
	}

}
