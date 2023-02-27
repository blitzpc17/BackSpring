package com.gestiondocumentalserviciosdocentes.demo.genericos;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BaseConecctionFactory {

	public Connection con = null;
	public PreparedStatement pstmt = null;
	public Statement stmt = null;
	public ResultSet rset = null;
	
}
