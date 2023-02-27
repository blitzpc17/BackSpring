package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.Conexion;
import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseConecctionFactory;
import com.gestiondocumentalserviciosdocentes.demo.modelo.GestionesLaboratorios;

public class IGestionesLaboratoriosImpl extends BaseConecctionFactory implements IGestionesLaboratorios{

	@Override
	public List<GestionesLaboratorios> getGestionesLaboratorios(int filtro, int filtro2) {
		List<GestionesLaboratorios> respuesta;
		GestionesLaboratorios item;
		 try {
			 String sql ="   select gl.id_GestionLaboratorio,gl.id_Periodo,l.id_Laboratorio,l.id_usuarios,gl.GESLAB_InventarioInicial,gl.GESLAB_InventarioFinal,\r\n"
			 		+ "ifnull(gl.GESLAB_Inventarioinicialestado,0)GESLAB_Inventarioinicialestado,ifnull(gl.GESLAB_Inventarioinicialcomentario,\"\")GESLAB_Inventarioinicialcomentario,\r\n"
			 		+ "ifnull(gl.GESLAB_Inventariofinalestado,0)GESLAB_Inventariofinalestado,ifnull(gl.GESLAB_Inventariofinalcomentario,\"\")GESLAB_Inventariofinalcomentario,l.lab_nombre,u.user_nombre ,\r\n"
			 		+ "l.lab_clave,l.lab_capacidad,l.lab_horario \r\n"
			 		+ "from laboratorios l left join (select * from gestionlaboratorio where id_Periodo="+filtro2+") gl on l.id_Laboratorio=gl.id_Laboratorio\r\n"
			 		+ "join usuarios u on l.id_Usuarios=u.id_Usuarios where  l.id_Usuarios="+filtro+"";
			System.out.println(sql);
			 respuesta=new ArrayList<>();
			 
			 con=Conexion.getConexion();
			 stmt=con.createStatement();
			 rset=stmt.executeQuery(sql);
			 
			 while (rset.next()) {
				item=new GestionesLaboratorios();
				item.setId_gestionlaboratorio(rset.getInt("id_gestionlaboratorio"));
				item.setId_periodo(rset.getInt("id_periodo"));
				item.setId_laboratorio(rset.getInt("id_laboratorio"));
				item.setId_usuarios(rset.getInt("id_usuarios"));
				item.setLab_nombre(rset.getString("lab_nombre"));
				item.setUser_nombre(rset.getString("user_nombre"));
				item.setLab_clave(rset.getString("lab_clave"));
				item.setLab_capacidad (rset.getString("lab_capacidad"));
				item.setLab_horario(rset.getString("lab_horario"));
				item.setGeslab_inventarioinicial(rset.getString("geslab_inventarioinicial"));
				item.setGeslab_inventariofinal(rset.getString("geslab_inventariofinal"));
				item.setGeslab_inventarioinicialestado(rset.getInt("geslab_inventarioinicialestado"));
				item.setGeslab_inventarioinicialcomentario(rset.getString("geslab_inventarioinicialcomentario"));
				item.setGeslab_inventariofinalestado(rset.getInt("geslab_inventariofinalestado"));
				item.setGeslab_inventariofinalcomentario(rset.getString("geslab_inventariofinalcomentario"));
				
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
