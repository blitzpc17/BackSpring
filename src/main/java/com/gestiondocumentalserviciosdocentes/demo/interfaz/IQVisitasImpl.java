package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.Conexion;
import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseConecctionFactory;
import com.gestiondocumentalserviciosdocentes.demo.modelo.QVisitas;

public class IQVisitasImpl extends BaseConecctionFactory implements IQVisitas{

	@Override
	public List<QVisitas> getVisitas(String Filtro) {
		List<QVisitas> respuesta;
		QVisitas item;
		
		try {
			
			String sql = "select id_Documentos_Visita id_documentos, id_Visita id_visita, docvst_pdf_oficio_solicitud, docvst_pdf_formato_solicitud, docvst_pdf_formato_oficio_solicitud, docvst_pdf_formato_programa, docvst_pdf_carta_agradecimientos, docvst_pdf_resultados_incidencias, docvst_pdf_lista_estudiantes, docvst_pdf_formato_resultados_incidencias, docvst_pdf_formato_lista_estudiantes, docvst_pdf_evidencias, docvst_pdf_oficio_constancia from documentos_visitas where id_Visita = "+Filtro+";";
			
			respuesta = new ArrayList<>();
			
			con = Conexion.getConexion();
			stmt = con.createStatement();
			rset = stmt.executeQuery(sql);
			
			while(rset.next()) {
				
				item = new QVisitas();
				item.setId_documentos(rset.getInt("id_documentos"));
				item.setId_visita(rset.getInt("id_visita"));
				item.setDocvst_pdf_oficio_solicitud(rset.getString("docvst_pdf_oficio_solicitud"));
				item.setDocvst_pdf_formato_solicitud(rset.getString("docvst_pdf_formato_solicitud"));
				item.setDocvst_pdf_formato_oficio_solicitud(rset.getString("docvst_pdf_formato_oficio_solicitud"));
				item.setDocvst_pdf_formato_programa(rset.getString("docvst_pdf_formato_programa"));
				item.setDocvst_pdf_carta_agradecimientos(rset.getString("docvst_pdf_carta_agradecimientos"));
				item.setDocvst_pdf_resultados_incidencias(rset.getString("docvst_pdf_resultados_incidencias"));
				item.setDocvst_pdf_lista_estudiantes(rset.getString("docvst_pdf_lista_estudiantes"));
				item.setDocvst_pdf_formato_resultados_incidencias(rset.getString("docvst_pdf_formato_resultados_incidencias"));
				item.setDocvst_pdf_formato_lista_estudiantes(rset.getString("docvst_pdf_formato_lista_estudiantes"));
				item.setDocvst_pdf_evidencias(rset.getString("docvst_pdf_evidencias"));
				item.setDocvst_pdf_oficio_constancia(rset.getString("docvst_pdf_oficio_constancia"));
				
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
