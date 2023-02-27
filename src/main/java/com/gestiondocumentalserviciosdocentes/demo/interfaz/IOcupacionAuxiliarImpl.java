package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.Conexion;
import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseConecctionFactory;
import com.gestiondocumentalserviciosdocentes.demo.modelo.DocumentosLaboratorios;
import com.gestiondocumentalserviciosdocentes.demo.modelo.OcupacionAuxiliar;

public class IOcupacionAuxiliarImpl extends BaseConecctionFactory implements IOcupacionAuxiliar{

	@Override
	public List<OcupacionAuxiliar> getocuOcupacionAuxiliar(int filtro) {
		// TODO Auto-generated method stub
				List<OcupacionAuxiliar> respuesta;
				OcupacionAuxiliar item;
				 try {
					 String sql ="  select  id_ocupacionlaboratorio as id,oculab_titulo as title ,concat(substr(oculab_fechahorainicio,1,10),'T',substr(oculab_fechahorainicio,12))  as 'start' ,\r\n"
					 		+ "    concat(substr(oculab_fechahoratermino,1,10),'T',substr(oculab_fechahoratermino,12))  as 'end'\r\n"
					 		+ "    from ocupacionlaboratorio where id_gestionlaboratorio="+filtro+"";
					System.out.println(sql);
					 respuesta=new ArrayList<>();
					 
					 con=Conexion.getConexion();
					 stmt=con.createStatement();
					 rset=stmt.executeQuery(sql);
					 
					 while (rset.next()) {
						item=new OcupacionAuxiliar();
						item.setId(rset.getInt("id"));
						item.setTitle(rset.getString("title"));
						item.setStart(rset.getString("start"));
						item.setEnd(rset.getString("end"));						
						
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
