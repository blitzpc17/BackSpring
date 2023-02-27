package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.Conexion;
import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseConecctionFactory;
import com.gestiondocumentalserviciosdocentes.demo.modelo.ConsultaUsuarios;

public class IConsultaUsuariosImpl extends BaseConecctionFactory implements IConsultaUsuarios{

	@Override
	public List<ConsultaUsuarios> getConsultaUsuarios(int iddep){
		List<ConsultaUsuarios> respuesta;
		ConsultaUsuarios item;
		
		try {
			String sql="select u.id_Usuarios,"
					+ "u.id_Departamento,"
					+ "u.USER_Nombre,"
					+ "u.USER_Correo,"
					+ "u.USER_Password,"
					+ "u.user_tipo_maestro,"
					+ "u.user_horas,"
					+ "r.id_rol_usuario,"
					+ "r.rol_desarrollo_academico_departamental,"
					+ "r.rol_docente,"
					+ "r.rol_jefe_departamento,"
					+ "r.rol_jefe_desarrollo_academico,"
					+ "r.rol_jefe_laboratorio,"
					+ "r.rol_jefe_oficina_servicio_externos_vinculacion,"
					+ "r.rol_jefe_oficina_servicio_social_vinculacion,"
					+ "r.rol_jefe_vinculacion,"
					+ "r.rol_secretaria_departamento,"
					+ "r.rol_secretaria_vinculacion,"
					+ "r.rol_jefe_proyectos_docencia,"
					+ "r.rol_auxiliar_laboratorio,"
					+ "r.rol_coordinador_vinculacion "
					+ "from usuarios u join rolesusuario r "
					+ "on u.id_Usuarios=r.id_Usuarios where id_Departamento="+ iddep +";";
			
			respuesta=new ArrayList<>();
			
			con=Conexion.getConexion();
			stmt=con.createStatement();
			rset=stmt.executeQuery(sql);
			
			while(rset.next()) {
				item=new ConsultaUsuarios();
				item.setId_Usuarios(rset.getInt("id_Usuarios"));
				item.setId_Departamento(rset.getInt("id_Departamento"));
				item.setUser_Nombre(rset.getString("user_Nombre"));
				item.setUser_Correo(rset.getString("user_Correo"));
				item.setUser_Password(rset.getString("user_Password"));
				item.setId_rol_usuario(rset.getInt("id_rol_usuario"));
				item.setRol_desarrollo_academico_departamental(rset.getBoolean("rol_desarrollo_academico_departamental"));
				item.setRol_docente(rset.getBoolean("rol_docente"));
				item.setRol_jefe_departamento(rset.getBoolean("rol_jefe_departamento"));
				item.setRol_jefe_desarrollo_academico(rset.getBoolean("rol_jefe_desarrollo_academico"));
				item.setRol_jefe_laboratorio(rset.getBoolean("rol_jefe_laboratorio"));
				item.setRol_jefe_oficina_servicio_externos_vinculacion(rset.getBoolean("rol_jefe_oficina_servicio_externos_vinculacion"));
				item.setRol_jefe_oficina_servicio_social_vinculacion(rset.getBoolean("rol_jefe_oficina_servicio_social_vinculacion"));
				item.setRol_jefe_vinculacion(rset.getBoolean("rol_jefe_vinculacion"));
				item.setRol_secretaria_departamento(rset.getBoolean("rol_secretaria_departamento"));
				item.setRol_secretaria_vinculacion(rset.getBoolean("rol_secretaria_vinculacion"));
				item.setRol_jefe_proyectos_docencia(rset.getBoolean("rol_jefe_proyectos_docencia"));
				item.setRol_auxiliar_laboratorio(rset.getBoolean("rol_auxiliar_laboratorio"));
				item.setRol_coordinador_vinculacion(rset.getBoolean("rol_coordinador_vinculacion"));
				item.setUser_tipo_maestro(rset.getInt("user_tipo_maestro"));
				item.setUser_horas(rset.getInt("user_horas"));
				
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
