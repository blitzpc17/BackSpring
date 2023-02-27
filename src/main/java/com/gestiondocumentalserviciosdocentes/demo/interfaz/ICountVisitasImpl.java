package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.Conexion;
import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseConecctionFactory;
import com.gestiondocumentalserviciosdocentes.demo.modelo.CountVisitas;

public class ICountVisitasImpl extends BaseConecctionFactory implements ICountVisitas{

	@Override
	public List<CountVisitas> getVisitas(String Filtro, String Per) {
		List<CountVisitas> respuesta;
		CountVisitas item;
		
		try {
			String sql="select distinct id_Usuarios id_Usuarios, USER_Nombre vst_docente, \r\n"
					+ "(select COUNT(*) suma from visitas v where VST_tipo_visita = 'Virtual' and v.id_Usuarios = u.id_Usuarios and id_Periodo = "+Per+") as vst_virtuales, \r\n"
					+ "(select COUNT(*) from visitas v where VST_tipo_visita = 'Presencial'and v.id_Usuarios = u.id_Usuarios and id_Periodo = "+Per+") as vst_presencial \r\n"
					+ "from usuarios u \r\n"
					+ "where id_Departamento = "+Filtro+" ;";
			
			respuesta = new ArrayList<>();
			
			con = Conexion.getConexion();
			stmt = con.createStatement();
			rset = stmt.executeQuery(sql);
			
			while(rset.next()) {
				item = new CountVisitas();
				item.setId_Usuarios(rset.getInt("id_Usuarios"));
				item.setVst_docente(rset.getString("vst_docente"));
				item.setVst_virtuales(rset.getInt("vst_virtuales"));
				item.setVst_presencial(rset.getInt("vst_presencial"));
				
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
