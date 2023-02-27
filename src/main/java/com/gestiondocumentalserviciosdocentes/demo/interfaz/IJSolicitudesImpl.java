package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.Conexion;
import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseConecctionFactory;
import com.gestiondocumentalserviciosdocentes.demo.modelo.JSolicitudes;


public class IJSolicitudesImpl extends BaseConecctionFactory implements IJSolicitudes{

	@Override
	public List<JSolicitudes> getJSolicitudes(int filtro,String  filtro2,int filtro3) {
		// TODO Auto-generated method stub
				List<JSolicitudes> respuesta;
				JSolicitudes item;
				 try {
					 String sql ="select s.id_solicitud,s.id_gestionlaboratorio,s.soli_fecha,s.soli_asunto,s.soli_estado,s.soli_recibidas,s.soli_atendidas\r\n"
					 		+ "  from solicitudes s, gestionlaboratorio gl where s.id_gestionlaboratorio=gl.id_gestionlaboratorio \r\n"
					 		+ "  and gl.id_gestionlaboratorio="+filtro+" and s.soli_estado="+filtro3+" order by "+filtro2+"";
					System.out.println(sql);
					 respuesta=new ArrayList<>();
					 
					 con=Conexion.getConexion();
					 stmt=con.createStatement();
					 rset=stmt.executeQuery(sql);
					 
					 while (rset.next()) {
						item=new JSolicitudes();
						item.setId_solicitud(rset.getInt("id_solicitud"));
						item.setId_gestionlaboratorio(rset.getInt("id_gestionlaboratorio")); 
						item.setSoli_fecha(rset.getString("soli_fecha"));						
						item.setSoli_asunto(rset.getString("soli_asunto"));
						item.setSoli_estado(rset.getInt("soli_estado"));
						item.setSoli_recibidas(rset.getString("soli_recibidas"));
						item.setSoli_atendidas(rset.getString("soli_atendidas"));
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
