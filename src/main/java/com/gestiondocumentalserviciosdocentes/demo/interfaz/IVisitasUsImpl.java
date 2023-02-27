package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.Conexion;
import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseConecctionFactory;
import com.gestiondocumentalserviciosdocentes.demo.modelo.VisitasUs;

public class IVisitasUsImpl extends BaseConecctionFactory implements IVisitasUs{

	@Override
	public List<VisitasUs> getVisitas(String Filtro) {
		
		List<VisitasUs> respuesta;
		VisitasUs item;
		
		try {
			String sql= "select v.id_Visita id_visita, v.id_Usuarios id_usuario, c.CAR_Nombre vst_carrera, v.VST_nombre_empresa vst_empresa, v.VST_tipo_visita vst_tipo_visita  from visitas v, carreras c where v.id_Carrera = c.id_Carrera and id_Usuarios = "+Filtro+";";
			
			respuesta = new ArrayList<>();
			
			con = Conexion.getConexion();
			stmt = con.createStatement();
			rset = stmt.executeQuery(sql);
			
			while(rset.next()) {
				item = new VisitasUs();
				item.setId_visita(rset.getInt("id_visita"));
				item.setId_usuario(rset.getInt("id_usuario"));
				item.setVst_carrera(rset.getString("vst_carrera"));
				item.setVst_empresa(rset.getString("vst_empresa"));
				item.setVst_tipo_visita(rset.getString("vst_tipo_visita"));
				
				respuesta.add(item);
			}
			
			return respuesta;
		}
		catch(Exception e) {
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
