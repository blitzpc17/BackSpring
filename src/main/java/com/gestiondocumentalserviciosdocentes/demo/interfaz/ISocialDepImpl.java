package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.Conexion;
import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseConecctionFactory;
import com.gestiondocumentalserviciosdocentes.demo.modelo.SocialDep;

public class ISocialDepImpl extends BaseConecctionFactory implements ISocialDep{

	@Override
	public List<SocialDep> getSocial(String Filtro , String Per) {
		List<SocialDep> respuesta;
		SocialDep item;
		
		try {
			String sql = "select id_Servicio id_Servicio, id_Periodo id_Periodo, id_Usuarios id_Usuarios, id_Departamento id_Departamento, SERV_no_Control serv_no_control, SERV_nombre_Alumno serv_nombre_alumno, SERV_Carrera serv_carrera \r\n"
					+ "from servicio where id_Departamento = "+Filtro+" and id_Periodo = "+Per+";";
			
			respuesta = new ArrayList<>();
			
			con = Conexion.getConexion();
			stmt = con.createStatement();
			rset = stmt.executeQuery(sql);
			
			while(rset.next()) {
				item = new SocialDep();
				item.setId_Servicio(rset.getInt("id_Servicio"));
				item.setId_Periodo(rset.getInt("id_Periodo"));
				item.setId_Usuarios(rset.getInt("id_Usuarios"));
				item.setId_Departamento(rset.getInt("id_Departamento"));
				item.setServ_no_control(rset.getString("serv_no_control"));
				item.setServ_nombre_alumno(rset.getString("serv_nombre_alumno"));
				item.setServ_carrera(rset.getString("serv_carrera"));
				
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
