package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.Conexion;
import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseConecctionFactory;
import com.gestiondocumentalserviciosdocentes.demo.modelo.ConsultaDocVisitas;

public class IConsultaDocVisitasImpl extends BaseConecctionFactory implements IConsultaDocVisitas{

	@Override
	public List<ConsultaDocVisitas> getConsultaDocVisitas(int idvis) {
		List<ConsultaDocVisitas> respuesta;
		ConsultaDocVisitas item;
		
		try {
			String sql="select dv.id_Documentos_Visita,"
					+ "dv.id_Visita,"
					+ "dv.docvst_pdf_oficio_solicitud,"
					+ "dv.docvst_pdf_formato_solicitud,"
					+ "dv.docvst_pdf_formato_oficio_solicitud,"
					+ "dv.docvst_pdf_formato_programa,"
					+ "dv.docvst_pdf_carta_agradecimientos,"
					+ "dv.docvst_pdf_resultados_incidencias,"
					+ "dv.docvst_pdf_lista_estudiantes,"
					+ "dv.docvst_pdf_formato_resultados_incidencias,"
					+ "dv.docvst_pdf_formato_lista_estudiantes,"
					+ "dv.docvst_pdf_evidencias,"
					+ "dv.docvst_pdf_oficio_constancia "
					+ "from documentos_visitas dv "
					+ "where id_Visita = " + idvis + " ;";
			
			respuesta=new ArrayList<>();
			
			con=Conexion.getConexion();
			stmt=con.createStatement();
			rset=stmt.executeQuery(sql);
			
			while (rset.next()) {
				item=new ConsultaDocVisitas();
				item.setId_Documentos_Visita(rset.getInt("id_Documentos_Visita"));
				item.setId_Visita(rset.getInt("id_Visita"));
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
