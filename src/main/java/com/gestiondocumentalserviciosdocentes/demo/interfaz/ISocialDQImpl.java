package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.Conexion;
import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseConecctionFactory;
import com.gestiondocumentalserviciosdocentes.demo.modelo.SocialDQ;

public class ISocialDQImpl extends BaseConecctionFactory implements ISocialDQ{

	@Override
	public List<SocialDQ> getDocumentos(String Filtro) {
		List<SocialDQ> respuesta;
		SocialDQ item;
		try {
			String sql = "select id_Documentos_Servicio id_documentos_servicio, id_Servicio id_servicio, DOCSEV_pdf_Const_extraescolar docsev_pdf_Const_extraescolar, DOCSEV_pdf_vigencia_imss docsev_pdf_vigencia_imss, DOCSEV_pdf_formato_solicitud docsev_pdf_formato_solicitud, DOCSEV_pdf_carta_compromiso docsev_pdf_carta_compromiso, DOCSEV_pdf_carta_presentacion docsev_pdf_carta_presentacion, DOCSEV_pdf_carta_aceptacion docsev_pdf_carta_aceptacion, DOCSEV_pdf_plan_trabajo docsev_pdf_plan_trabajo, DOCSEV_pdf_reporte_bimestral docsev_pdf_reporte_bimestral, DOCSEV_pdf_bimestral_1 docsev_pdf_bimestral_1, DOCSEV_pdf_bimestral_2 docsev_pdf_bimestral_2, DOCSEV_pdf_bimestral_3 docsev_pdf_bimestral_3, DOCSEV_pdf_reporte_final docsev_pdf_reporte_final, DOCSEV_pdf_carta_liberacion docsev_pdf_carta_liberacion, DOCSEV_pdf_tarjeta_control docsev_pdf_tarjeta_control, DOCSEV_pdf_constancia_liberacion  docsev_pdf_constancia_liberacion  from documentos_servicio where id_Servicio = "+Filtro+";";
			
			respuesta = new ArrayList<>();
			
			con = Conexion.getConexion();
			stmt = con.createStatement();
			rset = stmt.executeQuery(sql);
			
			while(rset.next()) {
				item = new SocialDQ();
				item.setId_documentos_servicio(rset.getInt("id_documentos_servicio"));
				item.setId_servicio(rset.getInt("id_servicio"));
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
