package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.Conexion;
import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseConecctionFactory;
import com.gestiondocumentalserviciosdocentes.demo.modelo.DateInn;

public class IDateInnImpl extends BaseConecctionFactory implements IDateInn{

	@Override
	public List<DateInn> getDate(String year) {
		List<DateInn> respuesta;
		DateInn item;
		try {
			String sql = "select * from innovacion where INN_año = '"+year+"';";
			respuesta = new ArrayList<>();
			con = Conexion.getConexion();
			stmt = con.createStatement();
			rset = stmt.executeQuery(sql);
			
			while(rset.next()) {
				item = new DateInn();
				item.setId_innovacion(rset.getInt("id_innovacion"));
				item.setId_departamento(rset.getInt("id_departamento"));
				item.setInn_etapa(rset.getString("inn_etapa"));
				item.setInn_año(rset.getInt("inn_año"));
				item.setInn_numero(rset.getInt("inn_numero"));
				item.setInn_folio(rset.getString("inn_folio"));
				item.setInn_proyecto(rset.getString("inn_proyecto"));
				item.setInn_categoria(rset.getString("inn_categoria"));
				item.setInn_semestre(rset.getInt("inn_semestre"));
				item.setInn_autor(rset.getString("inn_autor"));
				item.setInn_no_control(rset.getString("inn_no_control"));
				item.setInn_asesor(rset.getString("inn_asesor"));
				item.setInn_tipo_asesor(rset.getString("inn_tipo_asesor"));
				item.setInn_departamento(rset.getInt("inn_departamento"));
				item.setInn_nombre_departamento(rset.getString("inn_nombre_departamento"));
				
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
		
		return null;
	}

}
