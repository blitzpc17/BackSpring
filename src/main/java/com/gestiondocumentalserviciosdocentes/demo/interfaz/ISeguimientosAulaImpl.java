package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.Conexion;
import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseConecctionFactory;
import com.gestiondocumentalserviciosdocentes.demo.modelo.ActividadesDocencia;
import com.gestiondocumentalserviciosdocentes.demo.modelo.SeguimientosAula;

public class ISeguimientosAulaImpl extends BaseConecctionFactory implements ISeguimientosAula{

	@Override
	public List<SeguimientosAula> getSeguimientosAula(int filtro,int filtro2) {
		List<SeguimientosAula>  respuesta;
		SeguimientosAula item;
		 try {
			 String sql ="  select s.id_seguimiento, s.id_docper, f.id_formato, s.docgrp_pdf_documento , f.frm_nombre as nombreseguimiento\r\n"
			 		+ "from (select id_seguimiento, id_docper, id_formato, docgrp_pdf_documento \r\n"
			 		+ "from segimiento_aula where id_docper="+filtro+" ) s\r\n"
			 		+ "right join formatos f on f.id_Formato = s.id_Formato where f.fmr_tipo=\"Seguimiento al Aula\" and f.id_departamento="+filtro2+" ";
			System.out.println(sql);
			 respuesta=new ArrayList<>();
			 
			 con=Conexion.getConexion();
			 stmt=con.createStatement();
			 rset=stmt.executeQuery(sql);
			 
			 while (rset.next()) {
				item=new SeguimientosAula();
				item.setId_seguimiento(rset.getInt("id_seguimiento"));
				item.setId_docper(rset.getInt("id_docper"));
				item.setId_formato(rset.getInt("id_formato"));
				item.setNombreseguimiento(rset.getString("nombreseguimiento"));
				item.setDocgrp_pdf_documento(rset.getString("docgrp_pdf_documento"));
				
				
				
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
