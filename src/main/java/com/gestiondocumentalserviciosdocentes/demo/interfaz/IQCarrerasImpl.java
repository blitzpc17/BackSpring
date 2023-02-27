package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.Conexion;
import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseConecctionFactory;
import com.gestiondocumentalserviciosdocentes.demo.modelo.QCarreras;

public class IQCarrerasImpl extends BaseConecctionFactory implements IQCarreras{

	@Override
	public List<QCarreras> getCarreras(String Filtro) {
		List<QCarreras> respuesta;
		QCarreras item;
		try {
			
			String sql = "select id_Carrera id_carrera, id_Departamento id_departamento, CAR_Nombre car_nombre from carreras where id_Departamento = "+Filtro+";";
			
			respuesta = new ArrayList<>();
			
			con = Conexion.getConexion();
			stmt = con.createStatement();
			rset = stmt.executeQuery(sql);
			
			while(rset.next()) {
				item = new QCarreras();
				item.setId_carrera(rset.getInt("id_carrera"));
				item.setId_departamento(rset.getInt("id_departamento"));
				item.setCar_nombre(rset.getString("car_nombre"));
				
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
