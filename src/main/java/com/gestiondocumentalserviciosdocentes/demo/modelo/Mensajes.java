package com.gestiondocumentalserviciosdocentes.demo.modelo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mensajes")
public class Mensajes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_Mensajes;
	
	private int id_Departamento;
	private Date men_fecha_envio;  
	private String men_asunto;
	private String men_detalles;
	private String men_respuesta;
	private String men_numero_contacto;
	private String men_correo_contacto;
	private String men_informacion;
	private int men_estado_visto;   
	private int men_estado_envio;
	private int men_tipo_informacion;
	private int men_remitente;
	private int men_destinatario;
	public Mensajes() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Mensajes(int id_Mensajes, int id_Departamento, Date men_fecha_envio, String men_asunto, String men_detalles,
			String men_respuesta, String men_numero_contacto, String men_correo_contacto, String men_informacion,
			int men_estado_visto, int men_estado_envio, int men_tipo_informacion, int men_remitente,
			int men_destinatario) {
		super();
		this.id_Mensajes = id_Mensajes;
		this.id_Departamento = id_Departamento;
		this.men_fecha_envio = men_fecha_envio;
		this.men_asunto = men_asunto;
		this.men_detalles = men_detalles;
		this.men_respuesta = men_respuesta;
		this.men_numero_contacto = men_numero_contacto;
		this.men_correo_contacto = men_correo_contacto;
		this.men_informacion = men_informacion;
		this.men_estado_visto = men_estado_visto;
		this.men_estado_envio = men_estado_envio;
		this.men_tipo_informacion = men_tipo_informacion;
		this.men_remitente = men_remitente;
		this.men_destinatario = men_destinatario;
	}
	public int getId_Mensajes() {
		return id_Mensajes;
	}
	public void setId_Mensajes(int id_Mensajes) {
		this.id_Mensajes = id_Mensajes;
	}
	public int getId_Departamento() {
		return id_Departamento;
	}
	public void setId_Departamento(int id_Departamento) {
		this.id_Departamento = id_Departamento;
	}
	public Date getMen_fecha_envio() {
		return men_fecha_envio;
	}
	public void setMen_fecha_envio(Date men_fecha_envio) {
		this.men_fecha_envio = men_fecha_envio;
	}
	public String getMen_asunto() {
		return men_asunto;
	}
	public void setMen_asunto(String men_asunto) {
		this.men_asunto = men_asunto;
	}
	public String getMen_detalles() {
		return men_detalles;
	}
	public void setMen_detalles(String men_detalles) {
		this.men_detalles = men_detalles;
	}
	public String getMen_respuesta() {
		return men_respuesta;
	}
	public void setMen_respuesta(String men_respuesta) {
		this.men_respuesta = men_respuesta;
	}
	public String getMen_numero_contacto() {
		return men_numero_contacto;
	}
	public void setMen_numero_contacto(String men_numero_contacto) {
		this.men_numero_contacto = men_numero_contacto;
	}
	public String getMen_correo_contacto() {
		return men_correo_contacto;
	}
	public void setMen_correo_contacto(String men_correo_contacto) {
		this.men_correo_contacto = men_correo_contacto;
	}
	public String getMen_informacion() {
		return men_informacion;
	}
	public void setMen_informacion(String men_informacion) {
		this.men_informacion = men_informacion;
	}
	public int getMen_estado_visto() {
		return men_estado_visto;
	}
	public void setMen_estado_visto(int men_estado_visto) {
		this.men_estado_visto = men_estado_visto;
	}
	public int getMen_estado_envio() {
		return men_estado_envio;
	}
	public void setMen_estado_envio(int men_estado_envio) {
		this.men_estado_envio = men_estado_envio;
	}
	public int getMen_tipo_informacion() {
		return men_tipo_informacion;
	}
	public void setMen_tipo_informacion(int men_tipo_informacion) {
		this.men_tipo_informacion = men_tipo_informacion;
	}
	public int getMen_remitente() {
		return men_remitente;
	}
	public void setMen_remitente(int men_remitente) {
		this.men_remitente = men_remitente;
	}
	public int getMen_destinatario() {
		return men_destinatario;
	}
	public void setMen_destinatario(int men_destinatario) {
		this.men_destinatario = men_destinatario;
	}
	@Override
	public String toString() {
		return "Mensajes [id_Mensajes=" + id_Mensajes + ", id_Departamento=" + id_Departamento + ", men_fecha_envio="
				+ men_fecha_envio + ", men_asunto=" + men_asunto + ", men_detalles=" + men_detalles + ", men_respuesta="
				+ men_respuesta + ", men_numero_contacto=" + men_numero_contacto + ", men_correo_contacto="
				+ men_correo_contacto + ", men_informacion=" + men_informacion + ", men_estado_visto="
				+ men_estado_visto + ", men_estado_envio=" + men_estado_envio + ", men_tipo_informacion="
				+ men_tipo_informacion + ", men_remitente=" + men_remitente + ", men_destinatario=" + men_destinatario
				+ "]";
	}
	
	
			
}
