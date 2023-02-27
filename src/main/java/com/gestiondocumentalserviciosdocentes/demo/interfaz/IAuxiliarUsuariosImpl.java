package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.Conexion;
import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseConecctionFactory;
import com.gestiondocumentalserviciosdocentes.demo.modelo.AuxiliarUsuarios;
import com.gestiondocumentalserviciosdocentes.demo.modelo.CubiculoAuxiliar;

public class IAuxiliarUsuariosImpl extends BaseConecctionFactory implements IAuxiliarUsuarios{

	@Override
	public List<AuxiliarUsuarios> getAuxiliarUsuarios(int filtro) {
		List<AuxiliarUsuarios> respuesta;
		AuxiliarUsuarios item;
		 try {
			 String sql =" select  u.user_nombre as 'name',u.id_usuarios as 'code' from usuarios u where u.id_departamento="+filtro+"";
			System.out.println(sql);
			 respuesta=new ArrayList<>();
			 
			 con=Conexion.getConexion();
			 stmt=con.createStatement();
			 rset=stmt.executeQuery(sql);
			 
			 while (rset.next()) {
				item=new AuxiliarUsuarios();				
				item.setName(rset.getString("name"));
				item.setCode(rset.getInt("code"));
				
				
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
