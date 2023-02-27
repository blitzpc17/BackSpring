package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.Conexion;
import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseConecctionFactory;
import com.gestiondocumentalserviciosdocentes.demo.modelo.QRoles;

public class IQRolesImpl extends BaseConecctionFactory implements IQRoles{

	@Override
	public List<QRoles> getRoles() {
		List<QRoles> respuesta;
		QRoles item;
		
		try {
			
			String sql = "select rv.nombre rol_nombre, uu.id_Usuarios id_usuario, uu.USER_Nombre rol_user_nombre, uu.id_rol_usuario id_rol_usuario, 'rol_jefe_oficina_servicio_social_vinculacion' nombre_rol\r\n"
					+ "from (select u.id_Usuarios, u.USER_Nombre, r.id_rol_usuario, r.rol_desarrollo_academico_departamental\r\n"
					+ "from usuarios u join rolesusuario r on u.id_Usuarios = r.id_Usuarios\r\n"
					+ "where r.rol_jefe_oficina_servicio_social_vinculacion = 1) uu right join rolesvinculacion rv on rv.idrolv = 1 where rv.idrolv = 1\r\n"
					+ "union all\r\n"
					+ "select rv.nombre rol_nombre, uu.id_Usuarios id_usuario, uu.USER_Nombre rol_user_nombre, uu.id_rol_usuario id_rol_usuario, 'rol_jefe_oficina_servicio_externos_vinculacion' nombre_rol\r\n"
					+ "from (select u.id_Usuarios, u.USER_Nombre, r.id_rol_usuario, r.rol_desarrollo_academico_departamental\r\n"
					+ "from usuarios u join rolesusuario r on u.id_Usuarios = r.id_Usuarios\r\n"
					+ "where r.rol_jefe_oficina_servicio_externos_vinculacion = 1) uu right join rolesvinculacion rv on rv.idrolv = 2 where rv.idrolv = 2\r\n"
					+ "union all\r\n"
					+ "select rv.nombre rol_nombre, uu.id_Usuarios id_usuario, uu.USER_Nombre rol_user_nombre, uu.id_rol_usuario id_rol_usuario, 'rol_secretaria_vinculacion' nombre_rol\r\n"
					+ "from (select u.id_Usuarios, u.USER_Nombre, r.id_rol_usuario, r.rol_desarrollo_academico_departamental\r\n"
					+ "from usuarios u join rolesusuario r on u.id_Usuarios = r.id_Usuarios\r\n"
					+ "where r.rol_secretaria_vinculacion = 1) uu right join rolesvinculacion rv on rv.idrolv = 3 where rv.idrolv = 3;";
			
			respuesta = new ArrayList<>();
			
			con = Conexion.getConexion();
			stmt = con.createStatement();
			rset = stmt.executeQuery(sql);
			
			while(rset.next()) {
				item = new QRoles();
				item.setRol_nombre(rset.getString("rol_nombre"));
				item.setId_usuario(rset.getInt("id_usuario"));
				item.setRol_user_nombre(rset.getString("rol_user_nombre"));
				item.setId_rol_usuario(rset.getInt("id_rol_usuario"));
				item.setNombre_rol(rset.getString("nombre_rol"));
				
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
