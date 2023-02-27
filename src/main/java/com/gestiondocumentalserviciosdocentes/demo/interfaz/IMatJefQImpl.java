package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.Conexion;
import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseConecctionFactory;
import com.gestiondocumentalserviciosdocentes.demo.modelo.MatJefQ;

public class IMatJefQImpl extends BaseConecctionFactory implements IMatJefQ{

	@Override
	public List<MatJefQ> getMaterial(String Filtro) {
		List<MatJefQ> respuesta;
		MatJefQ item;
		
		try {
			
			String sql="select\r\n"
					+ "id_Material id_material, \r\n"
					+ "id_Departamento id_departamento, \r\n"
					+ "MTR_Nombre mtr_nombre, \r\n"
					+ "MTR_Enlace mtr_enlace\r\n"
					+ "from mat_jefatura where id_Departamento = "+Filtro+";";
			
			respuesta = new ArrayList<>();
			
			con = Conexion.getConexion();
			stmt = con.createStatement();
			rset = stmt.executeQuery(sql);
			
			while(rset.next()) {
				item = new MatJefQ();
				item.setId_material(rset.getInt("id_material"));
				item.setId_departamento(rset.getInt("id_departamento"));
				item.setMtr_nombre(rset.getString("mtr_nombre"));
				item.setMtr_enlace(rset.getString("mtr_enlace"));
				
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
