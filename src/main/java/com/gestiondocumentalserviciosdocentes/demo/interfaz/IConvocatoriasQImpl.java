package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.Conexion;
import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseConecctionFactory;
import com.gestiondocumentalserviciosdocentes.demo.modelo.ConvocatoriasQ;

public class IConvocatoriasQImpl extends BaseConecctionFactory implements IConvocatoriasQ{

	@Override
	public List<ConvocatoriasQ> getConvocatorias(String Filtro, String Per) {
		
		List<ConvocatoriasQ> respuesta;
		ConvocatoriasQ item;
		
		try {
			String sql = "select \r\n"
					+ "c.id_Convocatoria id_convocatoria,\r\n"
					+ "c.id_Periodo id_periodo, \r\n"
					+ "c.id_Departamento id_departamento, \r\n"
					+ "c.CONV_Nombre conv_nombre, \r\n"
					+ "(select distinct count(*) from interes_convocatoria i where i.interes = 1 and c.id_Convocatoria = i.id_Convocatoria and id_Departamento = "+Filtro+" group by c.id_Convocatoria ) as conv_cantidad,\r\n"
					+ "(select COUNT(*)  from usuarios where id_Departamento = "+Filtro+") as conv_num_user,\r\n"
					+ "c.CONV_Fecha_Expirar conv_expirar, \r\n"
					+ "c.CONV_Estado conv_estado, \r\n"
					+ "c.CONV_Tipo conv_tipo, \r\n"
					+ "c.CONV_pdf_Informacion conv_informacion\r\n"
					+ "from convocatorias c where id_Departamento = "+Filtro+" and id_Periodo= "+Per+" order by CONV_Fecha_Expirar desc;";
			
			respuesta = new ArrayList<>();
			
			con = Conexion.getConexion();
			stmt = con.createStatement();
			rset = stmt.executeQuery(sql);
			
			while(rset.next()) {
				item = new ConvocatoriasQ();
				item.setId_convocatoria(rset.getInt("id_convocatoria"));
				item.setId_periodo(rset.getInt("id_periodo"));
				item.setId_departamento(rset.getInt("id_departamento"));
				item.setConv_nombre(rset.getString("conv_nombre"));
				item.setConv_cantidad(rset.getInt("conv_cantidad"));
				item.setConv_num_user(rset.getInt("conv_num_user"));
				item.setConv_expirar(rset.getDate("conv_expirar"));
				item.setConv_estado(rset.getInt("conv_estado"));
				item.setConv_tipo(rset.getInt("conv_tipo"));
				item.setConv_informacion(rset.getString("conv_informacion"));
				
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
