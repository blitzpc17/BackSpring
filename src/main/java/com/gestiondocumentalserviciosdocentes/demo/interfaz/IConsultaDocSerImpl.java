package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.Conexion;
import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseConecctionFactory;
import com.gestiondocumentalserviciosdocentes.demo.modelo.ConsultaDocSer;

public class IConsultaDocSerImpl extends BaseConecctionFactory implements IConsultaDocSer{

	@Override
	public List<ConsultaDocSer> getConsultaDocSers(int idser) {
		List<ConsultaDocSer> respuesta;
		ConsultaDocSer item;
		
		try {
			String sql="select ds.id_Documentos_Servicio,"
					+ "ds.id_Servicio, "
					+ "ds.docsev_pdf_Const_extraescolar,"
					+ "ds.docsev_pdf_vigencia_imss,"
					+ "ds.docsev_pdf_formato_solicitud,"
					+ "ds.docsev_pdf_carta_compromiso,"
					+ "ds.docsev_pdf_carta_presentacion,"
					+ "ds.docsev_pdf_carta_aceptacion,"
					+ "ds.docsev_pdf_plan_trabajo,"
					+ "ds.docsev_pdf_reporte_bimestral,"
					+ "ds.docsev_pdf_bimestral_1,"
					+ "ds.docsev_pdf_bimestral_2,"
					+ "ds.docsev_pdf_bimestral_3,"
					+ "ds.docsev_pdf_reporte_final,"
					+ "ds.docsev_pdf_carta_liberacion,"
					+ "ds.docsev_pdf_tarjeta_control,"
					+ "ds.docsev_pdf_constancia_liberacion "
					+ "from documentos_servicio ds "
					+ "where id_Servicio= " + idser + ";" ;
			
			respuesta=new ArrayList<>();
			
			con=Conexion.getConexion();
			stmt=con.createStatement();
			rset=stmt.executeQuery(sql);
			
			while (rset.next()) {
				item=new ConsultaDocSer();
				item.setId_Documentos_Servicio(rset.getInt("id_Documentos_Servicio"));
				item.setId_Servicio(rset.getInt("id_Servicio"));
				item.setDocsev_pdf_Const_extraescolar(rset.getString("docsev_pdf_Const_extraescolar"));
				item.setDocsev_pdf_vigencia_imss(rset.getString("docsev_pdf_vigencia_imss"));
				item.setDocsev_pdf_formato_solicitud(rset.getString("docsev_pdf_formato_solicitud"));
				item.setDocsev_pdf_carta_compromiso(rset.getString("docsev_pdf_carta_compromiso"));
				item.setDocsev_pdf_carta_presentacion(rset.getString("docsev_pdf_carta_presentacion"));
				item.setDocsev_pdf_carta_aceptacion(rset.getString("docsev_pdf_carta_aceptacion"));
				item.setDocsev_pdf_plan_trabajo(rset.getString("docsev_pdf_plan_trabajo"));
				item.setDocsev_pdf_reporte_bimestral(rset.getString("docsev_pdf_reporte_bimestral"));
				item.setDocsev_pdf_bimestral_1(rset.getString("docsev_pdf_bimestral_1"));
				item.setDocsev_pdf_bimestral_2(rset.getString("docsev_pdf_bimestral_2"));
				item.setDocsev_pdf_bimestral_3(rset.getString("docsev_pdf_bimestral_3"));
				item.setDocsev_pdf_reporte_final(rset.getString("docsev_pdf_reporte_final"));
				item.setDocsev_pdf_carta_liberacion(rset.getString("docsev_pdf_carta_liberacion"));
				item.setDocsev_pdf_tarjeta_control(rset.getString("docsev_pdf_tarjeta_control"));
				item.setDocsev_pdf_constancia_liberacion(rset.getString("docsev_pdf_constancia_liberacion"));
				
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
