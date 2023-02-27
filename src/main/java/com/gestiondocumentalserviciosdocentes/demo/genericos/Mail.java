package com.gestiondocumentalserviciosdocentes.demo.genericos;

import java.io.IOException;
import java.security.InvalidParameterException;
import java.util.*;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Mail {
	
	private Properties properties;
    private Session session;

    public Mail() throws IOException {
        this.properties = new Properties();
        this.properties.setProperty("mail.smtp.host", "smtp.office365.com");
        this.properties.setProperty("mail.smtp.port", "587");
        this.properties.setProperty("mail.smtp.user", "gestionserviciosdocentes@outlook.com");
        this.properties.setProperty("mail.smtp.password", "Docentes1234%");
        this.properties.setProperty("mail.smtp.starttls.enable", "true");
        this.properties.setProperty("mail.smtp.auth", "true");
        
        checkConfig();

        session = Session.getDefaultInstance(properties);
    }
    
    private void checkConfig() throws InvalidParameterException {

        String[] keys = {
            "mail.smtp.host",
            "mail.smtp.port",
            "mail.smtp.user",
            "mail.smtp.password",
            "mail.smtp.starttls.enable",
            "mail.smtp.auth"
        };

        for (int i = 0; i < keys.length; i++) {
            if (this.properties.get(keys[i]) == null) {
                throw new InvalidParameterException("No existe la clave " + keys[i]);
            }
        }

    }
    
    public void enviarEmail(String asunto, String mensaje, String correo) throws MessagingException {

        MimeMessage contenedor = new MimeMessage(session);
        contenedor.setFrom(new InternetAddress((String) this.properties.get("mail.smtp.user")));
        contenedor.addRecipient(Message.RecipientType.TO, new InternetAddress(correo));
        contenedor.setSubject(asunto);
        contenedor.setText(mensaje);
        Transport t = session.getTransport("smtp");
        t.connect((String) this.properties.get("mail.smtp.user"), (String) this.properties.get("mail.smtp.password"));
        t.sendMessage(contenedor, contenedor.getAllRecipients());

    }

}
