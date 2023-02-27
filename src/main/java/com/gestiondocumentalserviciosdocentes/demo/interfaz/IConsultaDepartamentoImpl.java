package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import com.gestiondocumentalserviciosdocentes.demo.Conexion;
import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseConecctionFactory;
import com.gestiondocumentalserviciosdocentes.demo.modelo.ConsultaDepartamento;
import com.gestiondocumentalserviciosdocentes.demo.modelo.Usuarios;

public class IConsultaDepartamentoImpl extends BaseConecctionFactory implements IConsultaDepartamento{

	@Override
	public List<ConsultaDepartamento> getConsultaDepartamento() {
		List<ConsultaDepartamento> respuesta;
		ConsultaDepartamento item;

		Statement stmt2 = null;
		ResultSet rset2 = null;
		
		try {
			String sql="select d.id_Departamento,"
					+ "d.dep_nombre,"
					+ "ifnull(u.USER_Nombre,\"N/A\") USER_Nombre,"
					+ "ifnull(ru.id_Usuarios,0) id_Usuarios,"
					+ "ifnull(ru.id_rol_usuario,0) id_rol_usuario,"
					+ "ifnull(ru.rol_jefe_departamento,0) rol_jefe_departamento,"
					+ "u.USER_Correo,u.USER_Password "
					+ "from usuarios u join "
					+ "(select id_Usuarios,id_rol_usuario,rol_jefe_departamento "
					+ "from rolesusuario where rol_jefe_departamento=1 ) ru "
					+ "on u.id_Usuarios=ru.id_Usuarios "
					+ "right join departamento d on d.id_Departamento=u.id_Departamento where d.dep_creado_por <> 'QA' or d.dep_creado_por is null ;" ;
			
			respuesta=new ArrayList<>();
			
			con=Conexion.getConexion();
			stmt=con.createStatement();
			rset=stmt.executeQuery(sql);
			
			while (rset.next()) {
				item=new ConsultaDepartamento();
				item.setDep_nombre(rset.getString("dep_nombre"));
				item.setUser_nombre(rset.getString("user_Nombre"));
				item.setId_Usuarios(rset.getInt("id_Usuarios"));
				item.setId_rol_usuario(rset.getInt("id_rol_usuario"));
				item.setRol_jefe_departamento(rset.getBoolean("rol_jefe_departamento"));
				item.setId_Departamento(rset.getInt("id_Departamento"));
				item.setUser_Correo(rset.getString("user_Correo"));
				item.setUser_Password(rset.getString("user_Password"));
				

				stmt2 = con.createStatement();
				rset2 = stmt2.executeQuery("select u.* from usuarios u where id_Departamento = " + rset.getInt("id_Departamento"));
				
				List<Usuarios> objtempList= new ArrayList<>();
				
				while (rset2.next()) {
					Usuarios usTempUsuarios = new Usuarios();
					usTempUsuarios.setId_Usuarios(rset2.getInt("id_Usuarios"));
					usTempUsuarios.setId_Departamento(rset2.getInt("id_Departamento"));
					usTempUsuarios.setUser_Nombre(rset2.getString("user_Nombre"));
					usTempUsuarios.setUser_Correo(rset2.getString("user_Correo"));
					usTempUsuarios.setUser_Password(rset2.getString("user_Password"));
					usTempUsuarios.setUser_creado_por(rset2.getString("user_creado_por"));
					usTempUsuarios.setUser_fecha_creacion(rset2.getDate("user_fecha_creacion"));
					usTempUsuarios.setUser_actualizado_por(rset2.getString("user_actualizado_por"));
					usTempUsuarios.setUser_fecha_actualizacion(rset2.getDate("user_fecha_actualizacion"));
				
					
					objtempList.add(usTempUsuarios);
	
				}
				
				item.setUsuarios(objtempList);
				
				respuesta.add(item);
			
			}
			
			System.out.println(sql);
			
			return respuesta;
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				
				rset.close();
				rset2.close();
				stmt2.close();
				stmt.close();
				con.close();
				rset2.close();
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return null;
	}
	
}
