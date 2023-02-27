package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.Conexion;
import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseConecctionFactory;
import com.gestiondocumentalserviciosdocentes.demo.modelo.ConsultaAlumnos;


public class IConsultaAlumnosImpl extends BaseConecctionFactory implements IConsultaAlumnos {

	@Override
	public List<ConsultaAlumnos> getConsultaAlumnos(int iddep, int idper, int idusuario) {
		List<ConsultaAlumnos> respuesta;
		ConsultaAlumnos item;
		
		try {
			String sql="select s.id_Servicio,"
					+ "s.SERV_nombre_Alumno,"
					+ "s.SERV_no_Control,"
					+ "s.SERV_Carrera from servicio s "
					+ "where s.id_Departamento= " + iddep + " "
					+ "and s.id_Periodo= " + idper + " "
					+ "and s.id_Usuarios= " + idusuario + " order by SERV_nombre_Alumno;" ;
			
			respuesta=new ArrayList<>();
			
			con=Conexion.getConexion();
			stmt=con.createStatement();
			rset=stmt.executeQuery(sql);
			
			while(rset.next()) {
				item=new ConsultaAlumnos();
				item.setId_Servicio(rset.getInt("id_Servicio"));
				item.setServ_nombre_Alumno(rset.getString("serv_nombre_Alumno"));
				item.setServ_no_Control(rset.getString("serv_no_Control"));
				item.setServ_Carrera(rset.getString("serv_Carrera"));
				
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
