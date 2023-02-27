package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.Conexion;
import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseConecctionFactory;
import com.gestiondocumentalserviciosdocentes.demo.modelo.ConsultaPeriodosDoc;

public class IConsultaPeriodosDocImpl extends BaseConecctionFactory implements IConsultaPeriodosDoc{

	@Override
	public List<ConsultaPeriodosDoc> getConsultaPeriodosDoc(int idlab) {
		List<ConsultaPeriodosDoc> respuesta;
		ConsultaPeriodosDoc item;
		
		try {
			String sql="select p.id_Periodo,"
					+ "p.per_Mes_Inicio,"
					+ "p.per_Mes_Fin,"
					+ "p.per_Year,"
					+ "p.per_Estado,"
					+ "ifnull(gl.id_GestionLaboratorio,0)id_GestionLaboratorio,"
					+ "gl.id_Laboratorio "
					+ "from periodos p left join  "
					+ "(select * from gestionlaboratorio "
					+ "where id_Laboratorio= "+ idlab +" ) gl "
					+ "on p.id_Periodo=gl.id_Periodo order by p.per_Year desc;" ;
			
			respuesta=new ArrayList<>();
			
			con=Conexion.getConexion();
			stmt=con.createStatement();
			rset=stmt.executeQuery(sql);
			
			while (rset.next()) {
				item=new ConsultaPeriodosDoc();
				item.setId_Periodo(rset.getInt("id_Periodo"));
				item.setPer_Mes_Inicio(rset.getInt("per_Mes_Inicio"));
				item.setPer_Mes_Fin(rset.getInt("per_Mes_Fin"));
				item.setPer_Year(rset.getInt("per_Year"));
				item.setPer_Estado(rset.getBoolean("per_Estado"));
				item.setId_gestionlaboratorio(rset.getInt("id_GestionLaboratorio"));
				item.setId_Laboratorio(rset.getInt("id_Laboratorio"));
			
				
				respuesta.add(item);
			}
			
			System.out.println(sql);
			
			return respuesta;
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
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
