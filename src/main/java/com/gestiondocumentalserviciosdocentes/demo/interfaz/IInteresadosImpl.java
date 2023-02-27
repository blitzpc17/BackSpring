package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.Conexion;
import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseConecctionFactory;
import com.gestiondocumentalserviciosdocentes.demo.modelo.Interesados;

public class IInteresadosImpl extends BaseConecctionFactory implements IInteresados{

	@Override
	public List<Interesados> getLista(String Filtro) {
		List<Interesados> respuesta;
		Interesados item;
		
		try {
			String sql = "select (SELECT (@a:=@a+1)  FROM (SELECT @a:= 0) T LIMIT 0,19) as secuencia, u.USER_Nombre conv_nombre_user from interes_convocatoria i, usuarios u where id_Convocatoria = "+Filtro+" and i.id_Usuarios = u.id_Usuarios and i.interes = 1;";
			
			respuesta = new ArrayList<>();
			
			con = Conexion.getConexion();
			stmt = con.createStatement();
			rset = stmt.executeQuery(sql);
			
			while(rset.next()) {
				item = new Interesados();
				item.setSecuencia(rset.getInt("secuencia"));
				item.setConv_nombre_user(rset.getString("conv_nombre_user"));
				
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