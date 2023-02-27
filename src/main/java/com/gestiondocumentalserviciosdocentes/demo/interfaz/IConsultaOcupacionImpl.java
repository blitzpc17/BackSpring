package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.Conexion;
import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseConecctionFactory;
import com.gestiondocumentalserviciosdocentes.demo.modelo.ConsultaOcupacion;
import com.gestiondocumentalserviciosdocentes.demo.modelo.CubiculoAuxiliar;

public class IConsultaOcupacionImpl extends BaseConecctionFactory implements IConsultaOcupacion  {

	@Override
	public List<ConsultaOcupacion> getOcupaciones(int filtro) {
		List<ConsultaOcupacion> respuesta;
		ConsultaOcupacion item;
		 try {
			 String sql ="select distinct  substr(oculab_fechahorainicio,1,4) as año,substr(oculab_fechahorainicio,6,2) as mes,substr(oculab_fechahorainicio,9,2) as dia\r\n"
			 		+ "    from ocupacionlaboratorio where id_gestionlaboratorio="+filtro+"  and oculab_estado=2";
			System.out.println(sql);
			 respuesta=new ArrayList<>();
			 
			 con=Conexion.getConexion();
			 stmt=con.createStatement();
			 rset=stmt.executeQuery(sql);
			 
			 while (rset.next()) {
				item=new ConsultaOcupacion();
				item.setAño(rset.getInt("año"));
				item.setMes(rset.getInt("mes"));
				item.setDia(rset.getInt("dia"));
			
				
				
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
