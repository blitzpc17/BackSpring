package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.Conexion;
import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseConecctionFactory;
import com.gestiondocumentalserviciosdocentes.demo.modelo.ConsultaDocLab;

public class IConsultaDocLabImpl extends BaseConecctionFactory implements IConsultaDocLab{

	@Override
	public List<ConsultaDocLab> getConsultaDocLab(int idgestion, int iddep) {
		List<ConsultaDocLab> respuesta;
		ConsultaDocLab item;
		
		try {
			String sql="select f.FRM_Nombre, "
					+ "dl.id_DocumentoLaboratorio,"
					+ "dl.id_GestionLaboratorio,"
					+ "dl.id_Formato,"
					+ "ifnull(dl.DOCLAB_Estado,0) DOCLAB_Estado,"
					+ "ifnull(dl.DOCLAB_Retroalimentacion,\"\") DOCLAB_Retroalimentacion, "
					+ "dl.DOCLAB_pdf "
					+ "from "
					+ "(select * from documentoslaboratorios "
					+ "where id_GestionLaboratorio="+ idgestion +") dl "
					+ "right join formatos f "
					+ "on f.id_Formato=dl.id_Formato "
					+ "where f.fmr_tipo='Laboratorio' "
					+ "and f.id_Departamento ="+ iddep +";" ;
			
			respuesta= new ArrayList<>();
			
			con=Conexion.getConexion();
			stmt=con.createStatement();
			rset=stmt.executeQuery(sql);
			
			while(rset.next()) {
				item=new ConsultaDocLab();
				item.setFrm_Nombre(rset.getString("FRM_Nombre"));
				item.setId_documentolaboratorio(rset.getInt("id_DocumentoLaboratorio"));
				item.setId_gestionlaboratorio(rset.getInt("id_GestionLaboratorio"));
				item.setId_Formato(rset.getInt("id_Formato"));
				item.setDoclab_Estado(rset.getInt("DOCLAB_Estado"));
				item.setDoclab_Retroalimentacion(rset.getString("DOCLAB_Retroalimentacion"));
				item.setDoclab_pdf(rset.getString("DOCLAB_pdf"));
				
				respuesta.add(item);
			}System.out.println(sql);
			
			return respuesta;
	
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
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
