package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.Conexion;
import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseConecctionFactory;
import com.gestiondocumentalserviciosdocentes.demo.modelo.Enviados;

public class IEnviadosImpl extends BaseConecctionFactory implements IEnviados{

	@Override
	public List<Enviados> getEnviados(String rem, String dest) {
		List<Enviados> respuesta;
		Enviados item;
		try {
			String sql = "select id_Mensajes id_Mensajes, id_Departamento id_Departamento, MEN_asunto men_asunto, MEN_fecha_envio men_fecha_envio, MEN_detalles men_detalles, MEN_numero_contacto men_numero_contacto, MEN_correo_contacto men_correo_contacto, MEN_informacion men_informacion, MEN_estado_visto men_estado_visto, MEN_estado_envio men_estado_envio, MEN_tipo_informacion men_tipo_informacion, MEN_remitente men_remitente, MEN_destinatario men_destinatario, MEN_respuesta men_respuesta from mensajes where id_Departamento = "+rem+" and MEN_remitente = "+ rem +" and MEN_destinatario = "+dest+";";
			respuesta = new ArrayList<>();
			
			con = Conexion.getConexion();
			stmt = con.createStatement();
			rset = stmt.executeQuery(sql);
			
			while(rset.next()) {
				item = new Enviados();
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
				item.setMen_remitente(rset.getInt("men_remitente"));
				item.setMen_destinatario(rset.getInt("men_destinatario"));
				item.setMen_respuesta(rset.getString("men_respuesta"));
				
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
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

}
