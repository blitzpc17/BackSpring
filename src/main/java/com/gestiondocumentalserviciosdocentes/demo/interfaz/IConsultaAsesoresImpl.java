package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.Conexion;
import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseConecctionFactory;
import com.gestiondocumentalserviciosdocentes.demo.modelo.ConsultaAsesores;

public class IConsultaAsesoresImpl extends BaseConecctionFactory implements IConsultaAsesores {

	@Override
	public List<ConsultaAsesores> getConsultaAsesores(int iddep, int iddper) {
		List<ConsultaAsesores> respuesta;
		ConsultaAsesores item;
		
		
		try {
			String sql="select s.id_Periodo,"
					+ "s.id_Usuarios,"
					+ "u.user_Nombre,"
					+ "count(*) as asesorados "
					+ "from servicio s  join usuarios u "
					+ "on s.id_Usuarios=u.id_Usuarios  "
					+ "where s.id_Departamento="+ iddep +" "
					+ "and s.id_Periodo="+ iddper +" "
					+ "group by id_Usuarios order by user_Nombre;";
			
			respuesta=new ArrayList<>();
			
			con=Conexion.getConexion();
			stmt=con.createStatement();
			rset=stmt.executeQuery(sql);
			
			while(rset.next()) {
				item=new ConsultaAsesores();
				item.setId_Periodo(rset.getInt("id_Periodo"));
				item.setId_Usuarios(rset.getInt("id_Usuarios"));
				item.setUser_Nombre(rset.getString("user_Nombre"));
				item.setAsesorados(rset.getInt("asesorados"));
				
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
