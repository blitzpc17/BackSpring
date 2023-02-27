package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.Conexion;
import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseConecctionFactory;
import com.gestiondocumentalserviciosdocentes.demo.modelo.ConsultaLaboratorios;

public class IConsultaLaboratoriosImpl extends BaseConecctionFactory implements IConsultaLaboratorios {

	@Override
	public List<ConsultaLaboratorios> getConsultaLaboratorios(int id_Departamento) {
		List<ConsultaLaboratorios> respuesta;
		ConsultaLaboratorios item;
		
		try {
			String sql="select l.id_Laboratorio,"
					+ "l.id_Usuarios,"
					+ "l.lab_Nombre,"
					+ "l.lab_Clave,"
					+ "l.lab_Capacidad,"
					+ "l.lab_Horario,"
					+ "u.user_Nombre,"
					+ "l.id_Departamento "
					+ "from laboratorios l left join usuarios u "
					+ "on l.id_Usuarios=u.id_Usuarios where l.id_Departamento= "+ id_Departamento +";" ;
			
			respuesta=new ArrayList<>();
			
			con=Conexion.getConexion();
			stmt=con.createStatement();
			rset=stmt.executeQuery(sql);
			
			while (rset.next()) {
				item=new ConsultaLaboratorios();
				item.setId_Laboratorio(rset.getInt("id_Laboratorio"));
				item.setId_Usuarios(rset.getInt("id_Usuarios"));
				item.setLab_Nombre(rset.getString("lab_Nombre"));
				item.setLab_Clave(rset.getString("lab_Clave"));
				item.setLab_Capacidad(rset.getInt("lab_Capacidad"));
				item.setLab_Horario(rset.getString("lab_Horario"));
				item.setUser_Nombre(rset.getString("USER_Nombre"));
				item.setId_Departamento(rset.getInt("id_Departamento"));
				
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
