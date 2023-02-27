package com.gestiondocumentalserviciosdocentes.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class Conexion {

	private static Connection con;
	
	public static Connection getConexion()
    {
		con=null;
        try{
        	Properties properties = new Properties();
        	properties.load(Conexion.class.getClassLoader().getResourceAsStream("application.properties"));
        	
            Class.forName(properties.getProperty("driver-class"));
            con=(Connection) DriverManager.getConnection(properties.getProperty("urlDriver"),properties.getProperty("username"),properties.getProperty("password"));
        }catch(Exception e){
            e.printStackTrace();
        } 
       return con;
    }
}
