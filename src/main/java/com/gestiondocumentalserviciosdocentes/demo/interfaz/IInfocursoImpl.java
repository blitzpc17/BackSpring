package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.Conexion;
import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseConecctionFactory;
import com.gestiondocumentalserviciosdocentes.demo.modelo.Infocurso;

public class IInfocursoImpl extends BaseConecctionFactory implements IInfocurso{

	@Override
	public List<Infocurso> getCurso(String Filtro) {
		List<Infocurso>  respuesta;
		Infocurso item;
		try {
			String sql = "select i.id_Instancia id_Instancia, i.id_Curso id_Curso, i.INST_Empresa inst_Empresa, i.INST_Asistentes inst_Asistentes, i.INST_Periodo inst_Periodo,\r\n"
					+ "    c.CURSO_Nombre inst_Nombre_Curso, c.CURSO_Tipo inst_Tipo, c.CURSO_Cupo inst_Cupo, c.CURSO_Horas inst_Horas, CURSO_pdf_Temario inst_Temario,\r\n"
					+ "    u.USER_Nombre inst_docente_imparte\r\n"
					+ "from intancias_cursos i, catalogo_cursos c, usuarios u\r\n"
					+ "where i.id_Curso = "+Filtro+" and i.id_Curso = c.id_Curso and c.id_Usuarios = u.id_Usuarios;";
			respuesta = new ArrayList<>();
			con = Conexion.getConexion();
			stmt = con.createStatement();
			rset = stmt.executeQuery(sql);
			while(rset.next()) {
				item = new Infocurso();
				item.setId_Instancia(rset.getInt("id_Instancia"));
				item.setId_Curso(rset.getInt("id_Curso"));
				item.setInst_Empresa(rset.getString("inst_Empresa"));
				item.setInst_Asistentes(rset.getInt("inst_Asistentes"));
				item.setInst_Periodo(rset.getString("inst_Periodo"));
				item.setInst_Nombre_Curso(rset.getString("inst_Nombre_Curso"));
				item.setInst_Tipo(rset.getString("inst_Tipo"));
				item.setInst_Cupo(rset.getInt("inst_Cupo"));
				item.setInst_Horas(rset.getInt("inst_Horas"));
				item.setInst_Temario(rset.getString("inst_Temario"));
				item.setInst_docente_imparte(rset.getString("inst_docente_imparte"));
				
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
