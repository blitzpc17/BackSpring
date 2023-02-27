package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.Conexion;
import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseConecctionFactory;
import com.gestiondocumentalserviciosdocentes.demo.modelo.UsuariosQ;

public class IUsuariosQImpl extends BaseConecctionFactory implements IUsuariosQ{

	@Override
	public List<UsuariosQ> getUsuarios(String Filtro) {
		
		List<UsuariosQ> respuesta;
		UsuariosQ item;
		
		try {
			String sql = "select id_Usuarios id_Usuarios, id_Departamento id_Departamento, USER_Nombre user_nombre, USER_Correo user_correo, USER_Password user_password from usuarios where id_Departamento = "+Filtro+";";
			
			respuesta = new ArrayList<>();
			
			con = Conexion.getConexion();
			stmt = con.createStatement();
			rset = stmt.executeQuery(sql);
			
			while(rset.next()) {
				item = new UsuariosQ();
				item.setId_Usuarios(rset.getInt("id_Usuarios"));
				item.setId_Departamento(rset.getInt("id_Departamento"));
				item.setUser_nombre(rset.getString("user_nombre"));
				item.setUser_correo(rset.getString("user_correo"));
				item.setUser_password(rset.getString("user_password"));
				
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
