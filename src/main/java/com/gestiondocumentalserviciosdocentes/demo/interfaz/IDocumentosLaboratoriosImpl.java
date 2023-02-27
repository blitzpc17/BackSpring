package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.Conexion;
import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseConecctionFactory;
import com.gestiondocumentalserviciosdocentes.demo.modelo.DocumentosGrupos;
import com.gestiondocumentalserviciosdocentes.demo.modelo.DocumentosLaboratorios;

public class IDocumentosLaboratoriosImpl extends BaseConecctionFactory implements IDocumentosLaboratorios{

	@Override
	public List<DocumentosLaboratorios> getDocumentosLaboratorios(int filtro,int filtro2) {
		// TODO Auto-generated method stub
		List<DocumentosLaboratorios> respuesta;
		DocumentosLaboratorios item;
		 try {
			 String sql ="select dl.id_documentolaboratorio,	 dl.id_gestionlaboratorio,	f.id_formato,dl.doclab_pdf,ifnull(dl.doclab_estado,0)doclab_estado,\r\n"
			 		+ "	dl.doclab_retroalimentacion,f.frm_nombre\r\n"
			 		+ "from(select id_documentolaboratorio,id_gestionlaboratorio,	id_formato,doclab_pdf,doclab_estado,\r\n"
			 		+ "	doclab_retroalimentacion from documentoslaboratorios where id_gestionlaboratorio="+filtro+") dl\r\n"
			 		+ "    right join formatos f on  f.id_Formato = dl.id_Formato where f.fmr_tipo=\"laboratorio\" and f.id_departamento="+filtro2+"";
			System.out.println(sql);
			 respuesta=new ArrayList<>();
			 
			 con=Conexion.getConexion();
			 stmt=con.createStatement();
			 rset=stmt.executeQuery(sql);
			 
			 while (rset.next()) {
				item=new DocumentosLaboratorios();
				item.setId_documentolaboratorio(rset.getInt("id_documentolaboratorio"));
				item.setId_gestionlaboratorio(rset.getInt("id_gestionlaboratorio"));
				item.setId_formato(rset.getInt("id_formato"));
				item.setFrm_nombre(rset.getString("frm_nombre"));						
				item.setDoclab_pdf(rset.getString("doclab_pdf"));
				item.setDoclab_estado(rset.getInt("doclab_estado"));
				item.setDoclab_retroalimentacion(rset.getString("doclab_retroalimentacion"));
			
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
