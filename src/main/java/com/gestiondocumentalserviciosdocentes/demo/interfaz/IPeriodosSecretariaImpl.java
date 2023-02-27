package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.Conexion;
import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseConecctionFactory;
import com.gestiondocumentalserviciosdocentes.demo.modelo.DocentePeriodoSecretaria;
import com.gestiondocumentalserviciosdocentes.demo.modelo.EstadisticasJefeDep;
import com.gestiondocumentalserviciosdocentes.demo.modelo.SeleccionActividadesDocente;

public class IPeriodosSecretariaImpl extends BaseConecctionFactory implements IPeriodosSecretaria {

	@Override
	public List<DocentePeriodoSecretaria> buscarDocentePeriodoSecretarias(int id_periodo, int id_dep) {
		List<DocentePeriodoSecretaria> respuesta;
		DocentePeriodoSecretaria item;
		
		ResultSet rset2 = null;
		Statement stmt2 = null;
		
		 try {
			 String sql ="select ifnull(dp.id_DocPer, 0) id_DocPer, ifnull(u.id_Usuarios,0) id_Usuarios, u.user_Nombre, ifnull(dp.id_Periodo,0) id_Periodo, dp.DOCPER_pdf_Horario, dp.DOCPER_pdf_LiberacionAct, dp.DOCPER_pdf_ReporteFinal, dp.DOCPER_Retroalimentacion_reportefinal, ifnull(dp.DOCPER_Estado_reportefinal, 0) DOCPER_Estado_reportefinal\r\n"
			 		+ "from (select * from docentes_periodo  where id_Periodo = " + id_periodo + ") dp\r\n"
			 		+ "right join (select ut.id_Usuarios, ut.user_Nombre, ut.id_departamento, rt.rol_docente from usuarios ut \r\n"
			 		+ "join rolesusuario rt on ut.id_Usuarios = rt.id_Usuarios \r\n"
			 		+ "where ut.id_departamento = " + id_dep + " and rt.rol_docente = 1) u on u.id_Usuarios = dp.id_Usuarios ";
			 System.out.println(sql);
			 respuesta=new ArrayList<>();
			 
			 con = Conexion.getConexion();
			 stmt=con.createStatement();
			 rset=stmt.executeQuery(sql);
			 
			 while (rset.next()) {
				item=new DocentePeriodoSecretaria();
				int id_docper = rset.getInt("id_DocPer");
				item.setId_docper(id_docper);
				item.setId_usuarios(rset.getInt("id_Usuarios"));
				item.setId_periodo(rset.getInt("id_Periodo"));
				item.setUser_nombre(rset.getString("user_Nombre"));
				item.setDocper_pdf_horario(rset.getString("DOCPER_pdf_Horario"));
				item.setDocper_pdf_liberacionact(rset.getString("DOCPER_pdf_LiberacionAct"));
				item.setDocper_pdf_reportefinal(rset.getString("DOCPER_pdf_ReporteFinal"));
				item.setDocper_retroalimentacion_reportefinal(rset.getString("DOCPER_Retroalimentacion_reportefinal"));
				item.setDocper_estado_reportefinal(rset.getInt("DOCPER_Estado_reportefinal"));
				
				String sql2 ="select sum(izquierda) act, sum(derecha) comp from (select (select (count(*) * (select count(*) from grupos_docentes where id_docper = " + id_docper + ") )  total from formatos where id_departamento = " + id_dep + " and fmr_tipo = 'Académico') izquierda,\r\n"
				 		+ "(select count(*) total from documentos_grupos dg join grupos_docentes g on dg.id_grupo = g.id_grupo where id_docper = " + id_docper + " and docgrp_estadocomentario = 1) derecha\r\n"
				 		+ "union all\r\n"
				 		+ "select (select count(*) total from productos_docencia where id_docper = " + id_docper + ") izquierda,\r\n"
				 		+ "(select count(*) total from productos_docencia where id_docper = " + id_docper + " and prodoc_retroalimentacion =  1) derecha\r\n"
				 		+ "union all\r\n"
				 		+ "select (select count(*) total from productos_des_tecnologico where id_docper = " + id_docper + ") izquierda,\r\n"
				 		+ "(select count(*) total from productos_des_tecnologico where id_docper = " + id_docper + " and prodestec_retroalimentacion =  1) derecha\r\n"
				 		+ "union all\r\n"
				 		+ "select (select count(*) total from seleccion_apoyodocencia where id_docper = " + id_docper + ") izquierda,\r\n"
				 		+ "(select count(*) total from seleccion_apoyodocencia where id_docper = " + id_docper + " and actdoc_estadocomentario =  1) derecha\r\n"
				 		+ "union all\r\n"
				 		+ "select 1 izquierda, case docper_estado_reportefinal when 1 then 1 else 0 end derecha from docentes_periodo where id_docper = " + id_docper + ") liberacion";
				System.out.println(sql2);
				
				stmt2 = con.createStatement();
				rset2 = stmt2.executeQuery(sql2);
				
				if (rset2.next()) {
					if(rset2.getInt("act") == rset2.getInt("comp"))
						item.setLibera(true);
					 else
						 item.setLibera(false);
				}
				
				respuesta.add(item);
			}
			 return respuesta;
			 
		 }catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				rset.close();
				rset2.close();
				stmt2.close();
				stmt.close();
				con.close();
			} catch ( SQLException e) {
				e.printStackTrace(); 
			}
		}
		return null;
	}

	@Override
	public List<SeleccionActividadesDocente> buscarselecionactividades(int id_docper) {
		List<SeleccionActividadesDocente> respuesta;
		SeleccionActividadesDocente item;
		 try {
			 String sql ="select aad.id_ActividadDocentePeriodo, aad.id_DocPer, aad.id_Actividades_Docencia, aad.ACTDOC_pdf_Actividad, aad.ACTDOC_Comentario, ifnull(aad.ACTDOC_EstadoComentario, 0) ACTDOC_EstadoComentario, ap.ACTDOC_Nombre_Actividad \n"
			 		+ "from seleccion_apoyodocencia aad \n"
			 		+ "join act_apoyo_docencia ap on aad.id_actividades_docencia = ap.id_Actividades_Docencia \n"
			 		+ "where aad.id_DocPer = "+id_docper;
			 System.out.println(sql);
			 respuesta=new ArrayList<>();
			 
			 con = Conexion.getConexion();
			 stmt=con.createStatement();
			 rset=stmt.executeQuery(sql);
			 
			 while (rset.next()) {
				item=new SeleccionActividadesDocente();
				item.setId_actividaddocenteperiodo(rset.getInt("id_ActividadDocentePeriodo"));
				item.setId_docper(rset.getInt("id_DocPer"));
				item.setId_actividades_docencia(rset.getInt("id_Actividades_Docencia"));
				item.setActdoc_pdf_actividad(rset.getString("ACTDOC_pdf_Actividad"));
				item.setActdoc_comentario(rset.getString("ACTDOC_Comentario"));
				item.setActdoc_estadocomentario(rset.getInt("ACTDOC_EstadoComentario"));
				item.setActdoc_nombre_actividad(rset.getString("ACTDOC_Nombre_Actividad"));
				
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

	@Override
	public boolean subeLiberacion(int id_dep, int id_docper) {
		try {
			 String sql ="select sum(izquierda) act, sum(derecha) comp from (select (select count(*) total from formatos where id_departamento = " + id_dep + " and fmr_tipo = 'Académico') izquierda,\r\n"
				 		+ "(select count(*) total from documentos_grupos dg join grupos_docentes g on dg.id_grupo = g.id_grupo where id_docper = " + id_docper + " and docgrp_estadocomentario = 1) derecha\r\n"
				 		+ "union all\r\n"
				 		+ "select (select count(*) total from productos_docencia where id_docper = " + id_docper + ") izquierda,\r\n"
				 		+ "(select count(*) total from productos_docencia where id_docper = " + id_docper + " and prodoc_retroalimentacion =  1) derecha\r\n"
				 		+ "union all\r\n"
				 		+ "select (select count(*) total from productos_des_tecnologico where id_docper = " + id_docper + ") izquierda,\r\n"
				 		+ "(select count(*) total from productos_des_tecnologico where id_docper = " + id_docper + " and prodestec_retroalimentacion =  1) derecha\r\n"
				 		+ "union all\r\n"
				 		+ "select (select count(*) total from seleccion_apoyodocencia where id_docper = " + id_docper + ") izquierda,\r\n"
				 		+ "(select count(*) total from seleccion_apoyodocencia where id_docper = " + id_docper + " and actdoc_estadocomentario =  1) derecha\r\n"
				 		+ "union all\r\n"
				 		+ "select 1 izquierda, case docper_estado_reportefinal when 1 then 1 else 0 end derecha from docentes_periodo where id_docper = " + id_docper + ") liberacion";
			 System.out.println(sql);
			 
			 con = Conexion.getConexion();
			 stmt=con.createStatement();
			 rset=stmt.executeQuery(sql);
			 
			 if (rset.next()) {
				 if(rset.getInt("act") == rset.getInt("comp"))
					 return true;
				 else {
					return false;
				}
			}else {
				return false;
			}
			 
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
		return false;
	}

	@Override
	public List<EstadisticasJefeDep> estadisticoJefeDep(int id_dep, int id_per) {
		List<EstadisticasJefeDep> respuesta;
		EstadisticasJefeDep item;
		
		Statement stmt2 = null;
		ResultSet rset2 = null;
		
		 try {
			 String sql ="select u.user_nombre nombreDocente, dp.id_docper, case dp.DOCPER_Estado_reportefinal when 0 then null else 'Subido' end reportefinal, dp.DOCPER_pdf_LiberacionAct liberacion\r\n"
			 		+ "from usuarios u \r\n"
			 		+ "join rolesusuario ru on u.id_usuarios = ru.id_usuarios\r\n"
			 		+ "join docentes_periodo dp on u.id_usuarios = dp.id_usuarios\r\n"
			 		+ "where id_periodo = " + id_per + " and u.id_Departamento = " + id_dep + " and ru.rol_docente = true ";
			 System.out.println(sql);
			 respuesta=new ArrayList<>();
			 
			 con = Conexion.getConexion();
			 stmt=con.createStatement();
			 rset=stmt.executeQuery(sql);
			 
			 String id_docper = "0";
			 while (rset.next()) {
				item=new EstadisticasJefeDep();
				item.setNombreDocente(rset.getString("nombreDocente"));
				item.setLiberacion(rset.getString("liberacion"));
				item.setReporteFinal(rset.getString("reportefinal"));
				id_docper = rset.getString("id_docper");
				
				sql ="select sum(izquierda) act, sum(derecha) comp from (select (select count(*) total from formatos where id_departamento = " + id_dep + " and fmr_tipo = 'Académico') izquierda,\r\n"
				 		+ "(select count(*) total from documentos_grupos dg join grupos_docentes g on dg.id_grupo = g.id_grupo where id_docper = " + id_docper + " and docgrp_estadocomentario = 1) derecha\r\n"
				 		+ "union all\r\n"
				 		+ "select (select count(*) total from productos_docencia where id_docper = " + id_docper + ") izquierda,\r\n"
				 		+ "(select count(*) total from productos_docencia where id_docper = " + id_docper + " and prodoc_retroalimentacion =  1) derecha\r\n"
				 		+ "union all\r\n"
				 		+ "select (select count(*) total from productos_des_tecnologico where id_docper = " + id_docper + ") izquierda,\r\n"
				 		+ "(select count(*) total from productos_des_tecnologico where id_docper = " + id_docper + " and prodestec_retroalimentacion =  1) derecha\r\n"
				 		+ "union all\r\n"
				 		+ "select (select count(*) total from seleccion_apoyodocencia where id_docper = " + id_docper + ") izquierda,\r\n"
				 		+ "(select count(*) total from seleccion_apoyodocencia where id_docper = " + id_docper + " and actdoc_estadocomentario =  1) derecha\r\n"
				 		+ "union all\r\n"
				 		+ "select 1 izquierda, case docper_estado_reportefinal when 1 then 1 else 0 end derecha from docentes_periodo where id_docper = " + id_docper + ") liberacion";
				System.out.println(sql);
				
				stmt2 = con.createStatement();
				rset2=stmt2.executeQuery(sql);
				
				if (rset2.next()) {
					item.setNumDocumentos(rset2.getInt("comp") + "/" + rset2.getInt("act"));
				}else {
					item.setNumDocumentos("N/A");
				}
				
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
