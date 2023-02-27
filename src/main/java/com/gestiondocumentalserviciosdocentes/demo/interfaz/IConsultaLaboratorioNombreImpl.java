package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.Conexion;
import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseConecctionFactory;
import com.gestiondocumentalserviciosdocentes.demo.modelo.ConsultaLaboratorioNombre;


public class IConsultaLaboratorioNombreImpl extends BaseConecctionFactory implements IConsultaLaboratorioNombre {

	@Override
	public List<ConsultaLaboratorioNombre> getConsultaLaboratorioNombresint(int filtro) {
		List<ConsultaLaboratorioNombre> respuesta;
		ConsultaLaboratorioNombre item;
		 try {
			 String sql ="select l.id_Laboratorio,l.lab_nombre,u.user_nombre \r\n"
			 		+ "from laboratorios l join usuarios u on l.id_Usuarios=u.id_Usuarios  and l.id_laboratorio="+filtro+"";
			System.out.println(sql);
			 respuesta=new ArrayList<>();
			 
			 con=Conexion.getConexion();
			 stmt=con.createStatement();
			 rset=stmt.executeQuery(sql);
			 
			 while (rset.next()) {
				item=new ConsultaLaboratorioNombre();
				item.setId_laboratorio(rset.getInt("id_laboratorio"));
				item.setLab_nombre(rset.getString("lab_nombre"));
				item.setUser_nombre(rset.getString("user_nombre"));
			
				
				
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
