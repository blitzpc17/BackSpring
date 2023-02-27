package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.Conexion;
import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseConecctionFactory;

import com.gestiondocumentalserviciosdocentes.demo.modelo.DocenteCubiculo;

public class IDocenteCubiculoImpl extends BaseConecctionFactory implements IDocenteCubiculo{

	@Override
	public List<DocenteCubiculo> getDocenteCubiculos(int filtro,int filtro2) {
		List<DocenteCubiculo> respuesta;
		DocenteCubiculo item;
		 try {
			 String sql ="select c.id_cubiculo, c.id_usuarios,u.user_nombre,c.cub_nombre,c.cub_estado,c.cub_inventario,c.cub_firmaaceptacion \r\n"
			 		+ "      from cubiculos c, usuarios u where c.id_usuarios=u.id_usuarios  and c.id_usuarios ="+filtro+" and c.cub_estado="+filtro2+"";
			System.out.println(sql);
			 respuesta=new ArrayList<>();
			 
			 con=Conexion.getConexion();
			 stmt=con.createStatement();
			 rset=stmt.executeQuery(sql);
			 
			 while (rset.next()) {
				item=new DocenteCubiculo();
				item.setId_cubiculo(rset.getInt("id_cubiculo"));
				item.setId_usuarios(rset.getInt("id_usuarios"));
				item.setUser_nombre(rset.getString("user_nombre"));
				item.setCub_nombre(rset.getString("cub_nombre"));
				item.setCub_estado(rset.getInt("cub_estado"));
				item.setCub_inventario(rset.getString("cub_inventario"));
				item.setCub_firmaaceptacion(rset.getString("cub_firmaaceptacion"));
				
				
			
				
				
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
