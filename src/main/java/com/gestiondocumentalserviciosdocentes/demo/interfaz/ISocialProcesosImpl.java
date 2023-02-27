package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.Conexion;
import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseConecctionFactory;
import com.gestiondocumentalserviciosdocentes.demo.modelo.SocialProcesos;

public class ISocialProcesosImpl extends BaseConecctionFactory implements ISocialProcesos{

	@Override
	public List<SocialProcesos> getSocial(String Filtro) {
		List<SocialProcesos> respuesta;
		SocialProcesos item;
		
		try {
			String sql = "select DISTINCT \r\n"
					+ "d.id_Departamento id_Departamento, \r\n"
					+ "d.DEP_nombre serv_nombre_departamento, \r\n"
					+ "(select COUNT(*)  from servicio s where  s.id_Departamento = d.id_Departamento and  s.id_Periodo = "+Filtro+") as serv_prosesos from departamento d where DEP_creado_por = 'Académico';";
			
			respuesta = new ArrayList<>();
			
			con = Conexion.getConexion();
			stmt = con.createStatement();
			rset = stmt.executeQuery(sql);
			
			while(rset.next()) {
				item = new SocialProcesos();
				item.setId_Departamento(rset.getInt("id_Departamento"));
				item.setServ_nombre_departamento(rset.getString("serv_nombre_departamento"));
				item.setServ_prosesos(rset.getInt("serv_prosesos"));
				
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
