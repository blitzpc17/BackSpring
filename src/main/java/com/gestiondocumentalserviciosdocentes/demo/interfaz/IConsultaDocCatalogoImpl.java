package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.Conexion;
import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseConecctionFactory;
import com.gestiondocumentalserviciosdocentes.demo.modelo.ConsultaDocCatalogo;

public class IConsultaDocCatalogoImpl extends BaseConecctionFactory implements IConsultaDocCatalogo {

	@Override
	public List<ConsultaDocCatalogo> getConsultaDocCatalogos(int iddep) {
		List<ConsultaDocCatalogo> respuesta;
		ConsultaDocCatalogo item;
		
		try {
			String sql="SELECT u.user_Nombre,"
					+ "u.id_Usuarios "
					+ "from rolesusuario ru "
					+ "join (select * from usuarios where id_Departamento="+iddep+") u "
					+ "on u.id_Usuarios=ru.id_Usuarios "
					+ "where ru.rol_docente =1;" ;
			
			respuesta= new ArrayList<>();
			
			con=Conexion.getConexion();
			stmt=con.createStatement();
			rset=stmt.executeQuery(sql);
			
			while(rset.next()) {
				item=new ConsultaDocCatalogo();
				item.setId_Usuarios(rset.getInt("id_Usuarios"));
				item.setUser_Nombre(rset.getString("user_Nombre"));
				
				respuesta.add(item);
			}System.out.println(sql);
			
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
