package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.Conexion;
import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseConecctionFactory;
import com.gestiondocumentalserviciosdocentes.demo.modelo.DocumentosGrupos2;

public class IDocumentosGruposImpl extends BaseConecctionFactory implements IDocumentosGrupos2{

	@Override
	public List<DocumentosGrupos2> getDocumentosGrupos(int filtro, int filtro2) {
		List<DocumentosGrupos2> respuesta;
		DocumentosGrupos2 item;
		 try {
			 String sql ="select dg.id_DocumentoGrupo, dg.id_Grupo, f.id_Formato, dg.DOCGRP_pdf_Documento, ifnull(dg.DOCGRP_Comentario,\"\")DOCGRP_Comentario, ifnull(dg.DOCGRP_EstadoComentario, 0) \r\n"
			 		+ "DOCGRP_EstadoComentario, f.FRM_Nombre \r\n"
			 		+ "from( select id_DocumentoGrupo, id_Grupo, id_Formato, DOCGRP_pdf_Documento, DOCGRP_Comentario, DOCGRP_EstadoComentario from documentos_grupos\r\n"
			 		+ "where id_Grupo = "+filtro2+" ) dg \r\n"
			 		+ "right join formatos f on f.id_Formato = dg.id_Formato where f.fmr_tipo=\"academico\" and f.id_departamento="+filtro+"";
			System.out.println(sql);
			 respuesta=new ArrayList<>();
			 
			 con=Conexion.getConexion();
			 stmt=con.createStatement();
			 rset=stmt.executeQuery(sql);
			 
			 while (rset.next()) {
				item=new DocumentosGrupos2();
				item.setId_documentogrupo(rset.getInt("id_documentogrupo"));
				item.setId_grupo(rset.getInt("id_grupo"));
				item.setId_formato(rset.getInt("id_formato"));				
				item.setDocgrp_pdf_documento(rset.getString("docgrp_pdf_documento"));
				item.setDocgrp_comentario(rset.getString("docgrp_comentario"));
				item.setDocgrp_estadocomentario(rset.getInt("docgrp_estadocomentario"));
				item.setFrm_nombre(rset.getString("frm_nombre"));
				
				
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
