package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.Conexion;
import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseConecctionFactory;
import com.gestiondocumentalserviciosdocentes.demo.modelo.ConsultaVisitas;

public class IConsultaVisitasImpl extends BaseConecctionFactory implements IConsultaVisitas {

	@Override
	public List<ConsultaVisitas> getConsultaVisitas(int iddep, int idper) {
		List<ConsultaVisitas> respuesta;
		ConsultaVisitas item;
		
		try {
			String sql=" select u.user_Nombre,"
					+ "v.id_Usuarios,"
					+ "sum(case VST_tipo_visita when \"Presencial\" then 1 else 0 end) visitasp,"
					+ " sum(case VST_tipo_visita when \"Virtual\" then 1 else 0 end) visitasv "
					+ " from visitas v join usuarios u "
					+ "on u.id_Usuarios=v.id_Usuarios "
					+ "where v.id_Departamento= " + iddep + " "
					+ "and v.id_Periodo= " + idper + " "
					+ "group by v.id_Usuarios;" ;
			
			respuesta=new ArrayList<>();
			
			con=Conexion.getConexion();
			stmt=con.createStatement();
			rset=stmt.executeQuery(sql);
			
			while(rset.next()) {
				item=new ConsultaVisitas();
				item.setUser_Nombre(rset.getString("user_Nombre"));
				item.setId_Usuarios(rset.getInt("id_Usuarios"));
				item.setVisitasp(rset.getInt("visitasp"));
				item.setVisitasv(rset.getInt("visitasv"));
				
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
