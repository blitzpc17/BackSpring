package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.Conexion;
import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseConecctionFactory;
import com.gestiondocumentalserviciosdocentes.demo.modelo.ConsultaPeriodo1;

public class IConsultaPeriodo1Impl extends BaseConecctionFactory implements IConsultaPeriodo1{

	@Override
	public List<ConsultaPeriodo1> getConsultaPeriodo1() {
		List<ConsultaPeriodo1> respuesta;
		ConsultaPeriodo1 item;
		
		try {
			String sql = "select * from periodos order by per_year desc, per_Mes_Inicio asc , per_Mes_Fin asc";
			
			respuesta = new ArrayList<>();
			
			con = Conexion.getConexion();
			stmt = con.createStatement();
			rset = stmt.executeQuery(sql);
			
			while(rset.next()) {
				item = new ConsultaPeriodo1();
				item.setId_Periodo(rset.getInt("id_Periodo"));
				item.setPer_Mes_Inicio(rset.getByte("per_Mes_Inicio"));
				item.setPer_Mes_Fin(rset.getByte("per_Mes_Fin"));
				item.setPer_Year(rset.getShort("per_Year"));
				item.setPer_Estado(rset.getBoolean("per_Estado"));
				item.setPer_lbl_Periodo(rset.getString("per_lbl_Periodo"));
				item.setPer_creado_por(rset.getString("per_creado_por"));
				item.setPer_fecha_creacion(rset.getDate("per_fecha_creacion"));
				item.setPer_actualizado_por(rset.getString("per_actualizado_por"));
				item.setPer_fecha_actualizacion(rset.getDate("per_fecha_actualizacion"));
				
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
				
			} catch (Exception e) {

				e.printStackTrace();
				
			}
			
		}
		
		
		return null;
	}

}
