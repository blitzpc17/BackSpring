package com.gestiondocumentalserviciosdocentes.demo.interfaz;


import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.Conexion;
import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseConecctionFactory;
import com.gestiondocumentalserviciosdocentes.demo.modelo.ConsultaCubiculos;

public class IConsultaCubiculosImpl extends BaseConecctionFactory implements IConsultaCubiculos {

	@Override
	public List<ConsultaCubiculos> getConsultaCubiculos(int iddep) {
		List<ConsultaCubiculos> respuesta;
		ConsultaCubiculos item;
		
		try {
			String sql="select c.id_Cubiculo,"
					+ "c.id_Usuarios,"
					+ "c.CUB_Nombre,"
					+ "c.CUB_Estado,"
					+ "c.CUB_Inventario,"
					+ "c.CUB_FirmaAceptacion,"
					+ "u.USER_Nombre "
					+ "from cubiculos c join usuarios u "
					+ "on c.id_Usuarios=u.id_Usuarios where u.id_Departamento = " + iddep + " order by CUB_Estado ;";
			
			respuesta=new ArrayList<>();
			
			con=Conexion.getConexion();
			stmt=con.createStatement();
			rset=stmt.executeQuery(sql);
			
			while(rset.next()) {
				item=new ConsultaCubiculos();
				item.setId_Cubiculo(rset.getInt("id_Cubiculo"));
				item.setId_Usuarios(rset.getInt("id_Usuarios"));
				item.setCub_Nombre(rset.getString("CUB_Nombre"));
				item.setCub_Estado(rset.getInt("CUB_Estado"));
				item.setCub_Inventario(rset.getString("CUB_Inventario"));
				item.setCub_firmaaceptacion(rset.getString("CUB_firmaaceptacion"));
				item.setUser_Nombre(rset.getString("USER_Nombre"));
				
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
