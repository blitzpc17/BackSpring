package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.Conexion;
import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseConecctionFactory;
import com.gestiondocumentalserviciosdocentes.demo.modelo.EstadisticoAuxiliar;


public class IEstadisticoAuxiliarImpl extends BaseConecctionFactory implements IEstadisticoAuxiliar {

	@Override
	public List<EstadisticoAuxiliar> getEstadisticoAuxiliar(int filtro) {
		List<EstadisticoAuxiliar> respuesta;
		EstadisticoAuxiliar item;
		 try {
			 String sql =" select 0 as practicas, count(id_ocupacionlaboratorio) as total\r\n"
			 		+ "      from ocupacionlaboratorio  where id_gestionlaboratorio="+filtro+"   \r\n"
			 		+ "       union all\r\n"
			 		+ "       select (OCULAB_Estado) as practicas, count(OCULAB_Estado) as total\r\n"
			 		+ "      from ocupacionlaboratorio  where id_gestionlaboratorio="+filtro+"  group by OCULAB_Estado order by practicas;";
			System.out.println(sql);
			 respuesta=new ArrayList<>();
			 
			 con=Conexion.getConexion();
			 stmt=con.createStatement();
			 rset=stmt.executeQuery(sql);
			 
			 while (rset.next()) {
				item=new EstadisticoAuxiliar();
				item.setPracticas(rset.getInt("practicas"));
				item.setTotal(rset.getInt("total"));
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
