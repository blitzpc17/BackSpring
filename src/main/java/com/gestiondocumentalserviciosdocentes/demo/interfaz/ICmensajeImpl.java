package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.Conexion;
import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseConecctionFactory;
import com.gestiondocumentalserviciosdocentes.demo.modelo.Cmensajes;

public class ICmensajeImpl extends BaseConecctionFactory implements ICmensaje{
	
	@Override
	public List<Cmensajes> getMensajes(String filtro) {
		List<Cmensajes> respuesta;
		Cmensajes item;
		try {
			String sql = "select e.id_Mensajes id_Mensajes, e.id_Departamento id_Departamento, e.MEN_asunto men_asunto, e.MEN_fecha_envio men_fecha_envio, e.MEN_detalles men_detalles, e.MEN_numero_contacto men_numero_contacto, e.MEN_correo_contacto men_correo_contacto, e.MEN_informacion men_informacion, e.MEN_estado_visto men_estado_visto, e.MEN_estado_envio men_estado_envio, e.MEN_tipo_informacion men_tipo_informacion, d.DEP_nombre men_nombre_departamento , e.MEN_remitente men_remitente, e.MEN_destinatario men_destinatario from mensajes e, departamento d where e.id_Departamento = d.id_Departamento and e.id_Departamento ="+ filtro +" and e.MEN_remitente ="+filtro+";";
			
			respuesta = new ArrayList<>();
			
			con = Conexion.getConexion();
			stmt = con.createStatement();
			rset = stmt.executeQuery(sql);
			
			while(rset.next()) {
				item = new Cmensajes();
				item.setId_Mensajes(rset.getInt("id_Mensajes"));
				item.setId_Departamento(rset.getInt("id_Departamento"));
				item.setMen_asunto(rset.getString("men_asunto"));
				item.setMen_fecha_envio(rset.getDate("men_fecha_envio"));
				item.setMen_detalles(rset.getString("men_detalles"));
				item.setMen_numero_contacto(rset.getString("men_numero_contacto"));
				item.setMen_correo_contacto(rset.getString("men_correo_contacto"));
				item.setMen_informacion(rset.getString("men_informacion"));
				item.setMen_estado_visto(rset.getInt("men_estado_visto"));
				item.setMen_estado_envio(rset.getInt("men_estado_envio"));
				item.setMen_tipo_informacion(rset.getInt("men_tipo_informacion"));
				item.setMen_nombre_departamento(rset.getString("men_nombre_departamento"));	
				item.setMen_remitente(rset.getInt("men_remitente"));
				item.setMen_destinatario(rset.getInt("men_destinatario"));
				
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
		
		return null;
	}
}
