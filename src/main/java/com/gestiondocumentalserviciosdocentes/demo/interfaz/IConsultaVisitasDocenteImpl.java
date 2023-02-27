package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.Conexion;
import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseConecctionFactory;
import com.gestiondocumentalserviciosdocentes.demo.modelo.ConsultaVisitasDocente;

public class IConsultaVisitasDocenteImpl extends BaseConecctionFactory implements IConsultaVisitasDocente {

	@Override
	public List<ConsultaVisitasDocente> getConsultaVisitasDocentes(int iddep, int idper, int iduser) {
		List<ConsultaVisitasDocente> respuesta;
		ConsultaVisitasDocente item;
		
		try {
			String sql="select v.id_Visita,"
					+ "v.id_Carrera,"
					+ "v.VST_nombre_empresa,"
					+ "v.VST_tipo_visita from visitas v "
					+ "where v.id_Departamento= " + iddep + " "
					+ "and v.id_Periodo= " + idper + " "
					+ "and v.id_Usuarios= " + iduser + ";" ;
			
			respuesta=new ArrayList<>();
			
			con=Conexion.getConexion();
			stmt=con.createStatement();
			rset=stmt.executeQuery(sql);
			
			while(rset.next()) {
				item=new ConsultaVisitasDocente();
				item.setId_Visita(rset.getInt("id_Visita"));
				item.setId_Carrera(rset.getInt("id_Carrera"));
				item.setVst_nombre_empresa(rset.getString("VST_nombre_empresa"));
				item.setVst_tipo_visita(rset.getString("VST_tipo_visita"));
				
				respuesta.add(item);
			}
			
			System.out.println(sql);
			
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
