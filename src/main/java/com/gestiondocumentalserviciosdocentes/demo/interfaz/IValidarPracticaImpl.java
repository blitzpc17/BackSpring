package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.Conexion;
import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseConecctionFactory;
import com.gestiondocumentalserviciosdocentes.demo.modelo.OcupacionAuxiliar;
import com.gestiondocumentalserviciosdocentes.demo.modelo.ValidarPractica;

public class IValidarPracticaImpl extends BaseConecctionFactory implements IValidarPractica {

	@Override
	public List<ValidarPractica> getValidarPracticas(int filtro, String filtro2) {
		// TODO Auto-generated method stub
		List<ValidarPractica> respuesta;
		ValidarPractica item;
		 try {
			 String sql ="   select  id_ocupacionlaboratorio ,id_gestionlaboratorio ,oculab_titulo ,	oculab_estado,oculab_fechahorainicio ,oculab_fechahoratermino\r\n"
			 		+ "    from ocupacionlaboratorio where id_gestionlaboratorio="+filtro+" and oculab_fechahorainicio like '%"+filtro2+"%' and oculab_estado=2";
			System.out.println(sql);
			 respuesta=new ArrayList<>();
			 
			 con=Conexion.getConexion();
			 stmt=con.createStatement();
			 rset=stmt.executeQuery(sql);
			 
			 while (rset.next()) {
				item=new ValidarPractica();
				item.setId_ocupacionlaboratorio(rset.getInt("id_ocupacionlaboratorio"));
				item.setId_gestionlaboratorio(rset.getInt("id_gestionlaboratorio"));
				item.setOculab_titulo(rset.getString("oculab_titulo"));
				item.setOculab_estado(rset.getInt("oculab_estado"));						
				item.setOculab_fechahorainicio(rset.getString("oculab_fechahorainicio"));
				item.setOculab_fechahoratermino(rset.getString("oculab_fechahoratermino"));
				
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
